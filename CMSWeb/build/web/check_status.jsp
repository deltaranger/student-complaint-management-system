<!DOCTYPE html>
<html>
<head>
	<title>Status</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>	
	<style type="text/css">
		
	</style>
		
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color:white;" >
    
   
<% 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Progma", "no-cache");
    response.setHeader("Expires", "0");
      if( session.getAttribute("id")==null)
          response.sendRedirect("index.jsp");;
%>
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
            <li><a href="logout.jsp" >Logout</a></li>
        </ul>
              <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="ComplaintRegister.jsp">RegisterComplaint</a></li>
        </ul>
            <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="check_status.jsp">CheckStatus</a></li>
        </ul>
   			
		</div>	
	</div>
</nav>

	

<!-- Complaint registration Form  is here-->

<div class="container" style="padding-top: 100px; float: left;">
     
   

    <div class="container col-md-10">
   		<div class="col-md-offset-4 col-md-10">
    	  <h2>Check Your Current Status</h2><br>
  		</div>
   
        <form action="Sstatus" mathod="post" class="form-horizontal control-form col-md-12" >
    
   
      <div class="form-group ">
        <label for="name" class="control-label col-md-4">Complaint ID:</label>
       <div class="col-md-6"><input  id="name" type="text" class="form-control" name="com_id" >
        </div>
    </div>

      
						
						
      <div class="form-group">
				<div class="col-md-offset-4 col-md-10">
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
