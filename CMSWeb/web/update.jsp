<%-- 
    Document   : update
    Created on : Mar 27, 2018, 10:43:50 AM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Update</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>	
	<style type="text/css">
		
	</style>
		
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color: white;" >
     <%   


String al=(String)request.getAttribute("al");

if(al!=null){
if(al.equals("Yes")){
                    out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'Your profile update successfully' ,''  , 'success' );");
                
                   out.println("});");
                   out.println("</script>");
                 
}else if(al.equals("Wrong")){
                     out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'You entered wrong password' ,''  , 'error' );");
                
                   out.println("});");
                   out.println("</script>");
}else if(al.equals("Not")){
                 out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'New password and confirm password are not same' ,''  , 'error' );");
                
                   out.println("});");
                   out.println("</script>");
}
}
al=null;
  

%>  
   <% 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Progma", "no-cache");
    response.setHeader("Expires", "0");
      if( session.getAttribute("id")==null)
          response.sendRedirect("index.jsp");
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
          <li><a href="logout.jsp">Logout</a></li>
        </ul>
       <!--  <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="update.jsp">Update profile</a></li>
        </ul> -->    
   			
		</div>	
	</div>
</nav>

	

<!-- Complaint registration Form  is here-->

<div class="container" style="padding-top: 100px; float: left;">       
    <div class="col-md-10"> 
      <div class="col-md-offset-3 col-md-10">
      <h2><strong>Update your profile</strong> </h2><br>
      </div>
   
    <form action="UdatePass" method="post" class="form-horizontal control-form col-md-12"data-toggle="validator" role="form">
        
      <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> Old Password:</label>
        <div class="col-md-6"><input  id="Password" type="Password" class="form-control" name="oldpass" required >
        </div>
      </div>

      <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> New Password:</label>
        <div class="col-md-6"><input  id="Password" type="Password" class="form-control" name="newpass" required >
        </div>
      </div>

      <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> Confirm Password:</label>
        <div class="col-md-6"><input  id="Password" type="Password" class="form-control" name="conpass" required >
        </div>
      </div>
        
         <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> Questions:</label>
         <div class="col-md-6">
                                <select class="form-control" name="que" required >
                                        <option value="">Select Question</option>    
                                        <option>What is your mother tonuge</option>
                                        <option>What is you pet name</option>
                                        <option>Your frist school name</option>
                                        <option>Your favourite colour </option>
                                       
                                        </select> 
        </div>
      </div>

       <div class="form-group">
        <label for="intputPassword" class="control-label col-md-5"> Your Answer:</label>
        <div class="col-md-6"><input  id="Password" class="form-control" name="ans" required >
        </div>
      </div>
                    
        <div class="form-group">
          <div class="col-md-offset-5 col-md-10">
            <button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-3" style="background-color: #0d47a1;">Submit</button>
            </div>
        </div>
                                                
                                             
   </form> 
    </div>  
   		
        
</div>	 
        
</div>

<br><br><br><br><br>


</body>
</html 
