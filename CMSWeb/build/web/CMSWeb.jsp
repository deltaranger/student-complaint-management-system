<%-- 
    Document   : home
    Created on : Mar 10, 2018, 3:57:51 AM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="bootstrap.css">
  <script  src="jquery.js"></script>
  <script  src="bootstrap.js"></script> 
	<style >
		section{
			width: 100vw;
			height: 100vh;
			padding: 50Px;
		}
		.cl_white{
			color: white;
		}
		img {
			width: 300px;
			transtion:opacity 1s ease-in-out; 
		}
		img:hover {
			opacity: .5;
		}
		.col-text{
			-webkit-column-count:3;
		}

	</style>
</head>  
 
<body data-spy="scroll" data-target=".navbar">
	<nav class="navbar navbar-inverse  navbar-fixed-bottom">
		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
       				 <span class="icon-bar"></span>
        			<span class="icon-bar"></span> 
      			</button>
      	<div class="collapse navbar-collapse" id="myNavbar">
		<ul class="nav navbar-nav" >
			<li><a href="#home">Home</a></li>
			<li><a href="#about">About us</a></li>
			<li><a href="#contact">Contact us</a></li>
		</ul>		
	</div>
	</nav> 

	<div>
	<section id="home" style="background: url(image1.jpg ); background-size: 100% 100%" class="cl_white text-center"> 
		<h1 style="font-size: 70px;"><STRONG>Complaint Management System.</STRONG></h1>
		<p class="lead"><strong>To Write Complaint Click On Proceed Button!</strong> </p>
		<a href="index.jsp"><button class="btn btn-default" style="font-size: 30px;">Proceed Here</button></a> 
	</section>
	</div>

	<section  id="about" class="container">
		<h1 class="text-center" style=""><STRONG>About Us!</STRONG> </h1>
		<div class="col-text">
			We all of the Student of Motilal Nehru National Institute Of Technology Allahabad. 
                        We are pursing the Master Of Computer Application program in this Institute.
                        This project is  a college compliant management system .
                        This project have been completed under the guidance of Assistant Professor Dr. ANOJ KUMAR.
		</div>
	</section>
	<div>
	<section id="contact" class="" style="background-color: black;">
		<div class="page-header">
			<h1 class="text-center" style="color: white;"><STRONG>Contact Us!</STRONG> </h1>
		</div>
		<form class="col-md-5 col-md-offset-5 ">
			<div class="form-group">
				<h2 style="color: white;"> Diksha Bharti </h2>
			</div>
			<div class="form-group">
				<h2 style="color: white;"> Dilip Kumar Yadav </h2>
			</div>
			
			<div class="form-group">
				<h2 style="color: white;"> Faiz Mohammed </h2>
			</div>
			<div class="form-group">
				<h2 style="color: white;"> Gyayak Jain </h2>
			</div>
			<div class="form-group">
				<h2 style="color: white;"> Harpreet singh</h2> 
			</div>
			<br>
			<br>
			<br>
			<br>
			

			<div class="">
				<h5 style="color: white;">@ 2018 Copyright :The Rebellion rider</h5>
			</div>
			
		</form>

		
	</section>
</div>
</body>
</html
