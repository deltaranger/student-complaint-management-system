<%-- 
    Document   : adminlogin
    Created on : Feb 23, 2018, 12:45:01 AM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>Admin Login</title>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>	
	<style type="text/css">
		
	</style>
		
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color: white;" >
<!-- Navbar is here-->
	<nav class="navbar navbar-inverse  navbar-fixed-top" >
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
          <li><a href="index.jsp">Logout</a></li>
        </ul>
   			
		</div>	
	</div>
</nav>

	

<!-- Complaint registration Form  is here-->


<div class="container" style="padding-top: 100px; float: left;">
  

    <div class="col-md-10"> 
      <div class="col-md-offset-3 col-md-10">
      <h2><strong>User Login Here</strong> </h2><br>
      </div>
   
    <form action="Admin" method="post" class="form-horizontal control-form col-md-12"data-toggle="validator" role="form">
       
    
    	<div class="form-group">
        <label for="Confrim Password" class="control-label col-md-5">Department:</label>
       <div class="col-md-6">
                                <select class="form-control" name="dep" required >
                                        <option value="">Select Department</option>    
					<option>ADMIN</option>
                                        <option>APPLIED MECHANICS</option>
                                        <option>BIOTECHNOLOGY</option>
                                        <option>CHEMICAL ENGG</option>
                                         <option>CHIEF PROCTOR</option>
                                        <option>CIVIL ENGG</option>
                                        <option>DEAN ACADEMIC</option>
                                        <option>DEAN STU WELFARE</option>
                                        <option>COMPUTER SCI & ENGG</option>
                                        <option>ELECTRICAL ENGG</option>
                                        <option>MECHANICAL ENGG</option>
                                        <option>MGMT STUDIES</option>
                                        </select>	
				</div>
      </div>


         <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> User ID:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="log" required >
        </div>
      </div>
        
      <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> User Password:</label>
        <div class="col-md-6"><input  id="Password" type="Password" class="form-control" name="pass" required >
        </div>
       </div>
        
        
        <div class="form-group">
            
        <div class="control-label col-md-7"><a href="forgotpass.jsp">Forgot Password</a></div>
        </div>
        
                    
        <div class="form-group">
          <div class="col-md-offset-5 col-md-10">
            <button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-3" style="background-color: #0d47a1; ">Submit</button>
            </div>
        </div>
                                                
                                             
   </form> 
    </div>  
  </div>

<br>
<br><br><br><br><br>


</body>
</html 
