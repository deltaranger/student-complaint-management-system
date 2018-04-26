<%-- 
    Document   : Login
    Created on : Feb 8, 2018, 5:33:41 PM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>
        <script src='https://www.google.com/recaptcha/api.js'></script>
        
</head>  


 
<body data-spy="scroll" data-target=".navbar" style="background-color: white;">

	<nav class="navbar navbar-inverse navbar-fixed-top" >
		<div class="container">
			<div class="navbar-header">
		 		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        			<span class="icon-bar"></span>
       				 <span class="icon-bar"></span>
        			<span class="icon-bar"></span> 
      			</button>
					
				<span class="navbar-text white-text" id="New" style="font-size: 30px;color: white;">
    				<img src="mnnit.png" width="50" height="50" alt="">
        			Complaint Management System
    			</span>
    	</div>
    	<div class="collapse navbar-collapse" id="myNavbar">
    		<ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
				<li><a href="adminlogin.jsp">Admin Login</a></li>
			</ul>
		</div>
    
    		
		
	</div>

</nav>

	

<!-- Login Form Design here-->

<div class="container" style="padding-top: 100px;">
<div class="col-md-6" style="float: right;">
    <div class="panel panel-default">
				<div class="panel-heading" style="text-align: center; background-color: #0d47a1;">
                                    <h3 style="color: white;"><strong> Student Login</strong></h3>
			</div>

  			<div class="panel-body panel-height" style="background-color: #eeeeee;height: 350px;">
                            
                            
                            <form action="login" method="post" class="form-horizontal" data-toggle="validator" role="form" >
  			
                            
                        <div class="form-group">
                            <label for="inputName" class="control-label col-md-1"><h4><strong> Name</strong></h4></label>
                        <div class="col-md-12"><input type="text" class="form-control" id="inputName" name="stu" placeholder="student ID" required></div>
                        </div>
                                
                        <div class="form-group">
                            <label for="inputPassword" class="control-label col-md-1"><h4><strong>Password</strong></h4></label>
                        <div class="col-md-12"><input type="Password" class="form-control" id="inputPassword" name="pass" placeholder="Password" required></div>
                        </div>        
                             <div class="form-group">    
                                  <div class="col-md-12"> <div class="g-recaptcha" data-sitekey="6Lc8wUsUAAAAAH7PgEh7VZWWjbQzBwQNjBjrNoyD"></div>     
                               </div>
                              </div>
                                
                                <button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-5" style="background-color: #0d47a1; ">Login</button>
</form>
  </div>
</div>
</div>

<!-- text on left side-->
<div class="container">
	<br>
	<h1 style="color: #0097a7;"><strong>
		Use A Valid User Name And <br><br>
		Password To Gain Access To  <br> <br>
		User Home Page.</strong> 
	</h1>
	<img src="key1.png" width="250" height="250" alt="">
</div>


  <!--footer exist here-->
  <footer class="navbar navbar-default navbar-fixed-bottom">
  	<div class="container">
  		<p class="text-center" style="padding: 10px">@ 2018 Copyright: The Rebellion Rider</p>
  	</div>
  </footer>

</body>
</html 