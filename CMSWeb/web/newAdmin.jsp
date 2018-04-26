<%-- 
    Document   : newAdmin
    Created on : Feb 23, 2018, 5:33:01 PM
    Author     : harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>Add admin</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>	
	<style type="text/css">
		
	</style>
		
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color: white;" >
    
    <% 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Progma", "no-cache");
    response.setHeader("Expires", "0");
      if( session.getAttribute("id")==null)
          response.sendRedirect("index.jsp");
%>
   <%   
  
    String id= (String)session.getAttribute("id");
    out.println(id);   
       //session.setAttribute("com",com);
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
					
				<span class="navbar-text white-text" id="New" style="font-size: 30px">
    				<img src="mnnit.png" width="50" height="50" alt="">
        			Complaint Management System
    			</span>
    	</div>
    	<div class="collapse navbar-collapse" id="myNavbar">
        <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="logout.jsp">Logout</a></li>
        </ul>
         <ul class="nav navbar-nav navbar-right" style="font-size: 20px;text-align: center;padding: 15px;" id="preet">
          <li><a href="update.jsp?id=<%out.println(id);%>">Update profile</a></li>
        </ul>    
   			
		</div>	
	</div>
</nav>

	

<!-- Complaint registration Form  is here-->

<div class="container" style="padding-top: 100px; float: left;">
	
      	
	<div  style="float: left;">
             <h4 style="padding-left: 40px;"><strong>categories</strong></h4>
		<ul class=" nav nav-pills nav-stacked nav-pills-fixed-top">
			<li><a href="newAdmin.jsp">ADD</a></li>
                        <li><a href="allcomplaint.jsp?com=ALL" >ALL</a></li>
                        
                        <li><a href="allcomplaint.jsp?com=APPLIED MECHANICS" >APPLIED MECHANICS</a></li>
                        <li><a href="allcomplaint.jsp?com=BIOTECHNOLOGY" >BIOTECHNOLOGY</a></li>
                        <li><a href="allcomplaint.jsp?com=CHEMICAL ENGG" >CHEMICAL ENGG</a></li>
                      <li><a href="allcomplaint.jsp?com=CHIEF PROCTOR" >CHIEF PROCTOR</a></li>

                        <li><a href="allcomplaint.jsp?com=CIVIL ENGG" >CIVIL ENGG</a></li>
                        <li><a href="allcomplaint.jsp?com=COMPUTER" >COMPUTER SCI & ENGG</a></li>
                        <li><a href="allcomplaint.jsp?com=DEAN ACADEMIC" >DEAN ACADEMIC</a></li>
                        <li><a href="allcomplaint.jsp?com=DEAN STU WELFARE" >DEAN STU WELFARE</a></li>
                        <li><a href="allcomplaint.jsp?com=ELECTRICAL ENGG" >ELECTRICAL ENGG</a></li>
                        <li><a href="allcomplaint.jsp?com=MECHANICAL ENGG" >MECHANICAL ENGG</a></li>
                        <li><a href="allcomplaint.jsp?com=MGMT STUDIES" >MGMT STUDIES</a></li>
                      
		</ul>
	</div>

	
	<div class="col-md-9" style="float:right;">
      		<div class="col-md-9">
   		   <h2 style="float: right;"><strong>Add New User</strong> </h2><br>
  	</div>

            <form class="form-horizontal" action="Addadmin" method="post"data-toggle="validator" role="form">

			    <div class="form-group">
			        <label for="Confrim Password" class="control-label col-md-5">Department:</label>
			               <div class="col-md-5">
                                           <select class="form-control" name="dep" required>
                                               <option value="">Select Department</option> 
								<option>APPLIED MECHANICS</option>
                                                                    <option>BIOTECHNOLOGY</option>
                                                                    <option>CHEMICAL ENGG</option>
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

			    <div class="form-group ">
			        <label for="inputName" class="control-label col-md-5">User ID:</label>
			        <div class="col-md-5"><input  id="inputName" type="text" class="form-control" name="user" required >
			        </div>
			    </div>

			    <div class="form-group">
			        <label for="inputPassword" class="control-label col-md-5"> User Passwor:</label>
			        <div class="col-md-5"><input  id="inputPassword" type="Password" class="form-control" name="pass" required>
			        </div>
			    </div>
                
                             <div class="form-group">
                              <label for="intputPassword" class="control-label col-md-5"> Questions:</label>
                               <div class="col-md-5">
                                <select class="form-control" name="Que" required >
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
                            <div class="col-md-5"><input  id="Password" type="" class="form-control" name="Ans" required >
                            </div>
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
