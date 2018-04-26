<%-- 
    Document   : ComplaintRegister
    Created on : Feb 8, 2018, 6:05:43 PM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
	<title>Complaint Register</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>
        
        
       <!--<script src='sweetalert2.all.js'></script>
                 <script src='jquery.min.js'></script>
              <script>
                   $(document).ready(function(){
                  swal ( 'Oops' , 'Something went wrong!' , 'error' );
                  });
                  </script>-->
        
       
               		
</head>  
 

    <%   
String stu=(String)session.getAttribute("id"); 

String myid=(String)request.getAttribute("comId");

String name="har";
if(myid!=null){
 out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'Your Complaint Has Been Loaded Successfully' ,'Complaint ID : "+myid+"'  , 'success' );");
                
                   out.println("});");
                   out.println("</script>");
                   
}
//out.print(msg);
//out.print(myid);
myid=null;
//out.print(stu);   

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
					
				<span class="navbar-text white-text" id="New" style="font-size: 30px ;color: white;">
    				<img src="mnnit.png" width="50" height="50" alt="">
        			Complaint Management System
    			</span>
    	</div>
    	<div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="logout.jsp">Logout</a></li>
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
  <!-- <div class="btn-group-vertical" style="float: left;">
    
    <button class="btn btn-info"  style="background-color: #0097a7;" onclick="window.location.href='ComplaintRegister.jsp'"><h4>Complaint Form</h4></button>
    <button class="btn btn-info"  style="background-color: #0097a7;" onclick="window.location.href='check_status.jsp'"><h4>Check Status</h4></button>
  </div>  --> 
   

    <div class="col-md-10"> 
      <div class="col-md-offset-3 col-md-10">
      <h2><strong>Let Us Know Your  Complaints</strong> </h2><br>
      </div>
   
    <form action="complaint" method="post" class="form-horizontal control-form col-md-12" data-toggle="validator" role="form">
       
    
         <div class="form-group">
        <label for="Confrim Password" class="control-label col-md-5">Complaint type:</label>
       <div class="col-md-6">
          <select class="form-control" name="type" required  >
          <option value="">Select Complaint type</option>
          <option>FAST TRACK</option>
          <option>NORMAL</option>
         
        </select> 
         <div class="help-block">Only Chief Proctor complaint is Under Fast Track Categories.</div>
        </div>
      </div>        

        <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Contact Number:</label>
        <div class="col-md-6">
            <div class="input-group">
            <span class="input-group-addon" id="sizing-addon1">+91</span>
            <input  id="inputName" type="text" class="form-control" name="mob" placeholder="A Valid Contact Number" required  >
            </div>
        </div>
      </div>
        
        
       
        

     <!-- <div class="form-group">
    <label for="inputName" class="control-label col-md-1">Name</label>
    <div class="col-md-12"><input type="text" class="form-control" id="inputName" name="stu" placeholder="student ID" required></div>
  </div>-->

        
      <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Student Name:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="name" placeholder="Student Name" required  >
        </div>
      </div>
    
      <div class="form-group">
        <label for="Confrim Password" class="control-label col-md-5">Department:</label>
       <div class="col-md-6">
          <select class="form-control" name="dep" required  >
          <option value="">Select Department</option>
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
        <label for="Confrim Password" class="control-label col-md-5">Course:</label>
               <div class="col-md-6">
                   <select class="form-control" name="cour" required >
                    <option value="">Select Course</option>

          <option>B_Tech AM</option>
          <option>B_Tech BIO</option>
          <option>B_Tech CHE</option>
          <option>B_Tech CIVIL</option>
          <option>B_Tech CS</option>
          <option>B_Tech EC</option>
          <option>B_Tech IT</option>
          <option>B_Tech ME</option>
          <option>MBA</option>
          <option>MCA</option>
          <option>MSc</option>
          <option>MSW</option>
          <option>M_Tech AM</option>
          <option>M_Tech BIO</option>
          <option>M_Tech CHE</option>
          <option>M_Tech CIVIL</option>
          <option>M_Tech CS</option>
          <option>M_Tech EC</option>
          <option>M_Tech IT</option>
          <option>M_Tech ME</option>
        </select> 
        </div>
      </div>


      <div class="form-group">
        <label for="inputName" class="control-label col-md-5"> Problem Subject:</label>
        <div class="col-md-6"><input  id="inputName" type="text" class="form-control" name="prob" placeholder="Problem Subject" required  >
        </div>
      </div>

      <div class="form-group">
          <label for="inputName" class="control-label col-md-5"> Complaint:</label>
        <div class="col-md-6">
            <textarea  id="inputName"  class="form-control" rows="10" name="msg"placeholder="Write your message here..." required></textarea>
        </div>
      </div>
      
      <p style="margin-left:500px; "  id="demo"></p>
  <script>
  document.getElementById("demo").innerHTML = Date();
  </script>
    
      
      <div class="form-group">
        <div class="col-md-offset-5 col-md-10">
              <button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-3" style="background-color: #0d47a1; ">Submit</button>
        </div>
      </div>
                                                
                                             
<br>
<br>
<br>
<br>
<br>
<br>
    </form>
    </div>  
  </div>





