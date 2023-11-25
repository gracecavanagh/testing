<!DOCTYPE html>
<html lang="en">
<head>
<title> Java Testing Grounds </title>
<!-- link to css stylesheet -->
<link rel="stylesheet" href="css/a3web.css">
<link rel="stylesheet" href="leaflet/leaflet.css" />
<!-- link to leaflet java script -->
<script src="leaflet/leaflet.js"></script>
</head>
<body>

<!-- div container that allows buttons to be horizontal instead of vertical -->
<div id="container"> 
  <!-- two seperate buttons pointing to two different images, each shown upon left click -->
	<button id="buttonbefore" onclick="document.getElementById('myImage').src='images/sea-before.png'">Before</button> 
	<button id="buttonafter" onclick="document.getElementById('myImage').src='images/sea-after.png'">After</button>
</div>

<!-- div container with actual image location on the web page, that .getElementById alters to show different images. 
The original image is the before image as that is what is first shown on the web page. -->
<div class="img">
	<img id="myImage" src="images/sea-before.png">
</div>

<div id="javaText">
	<p> Hover over for before and after satellite images of the Red Sea, 1967 to 2000. </p>
</div>

<div class="img">
<!-- simple HTML event (onmouseover/out) that allows user to hover over original image to view a secondary photo -->
	<div id="imagehover">
		<img src='images/sea-before.png' 
			onmouseover="this.src='images/sea-after.png';" 
			onmouseout="this.src='images/sea-before.png';" />
	</div>
</div>

<div id="javaText">
	<p> An interactable map, centered on London, England. </p>
</div>

<!-- ATTENTION: img{} tag in CSS will alter Leaflet map tiles as they are individually considered images.
  use #id and .class for modifying images. -->
<!-- div container initializing map --> 
<div id="map">
	<!-- script initializing Leaflet map using Leaflet library -->
  <script>
		var map = L.map('map').setView([51.505, -0.09], 13);
		L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
		maxZoom: 16,
		attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
		}).addTo(map);
	</script>
</div>

</body>
</html>
