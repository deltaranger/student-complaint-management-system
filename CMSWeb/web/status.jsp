<%-- 
    Document   : status
    Created on : Feb 22, 2018, 2:07:31 AM
    Author     : harpreet
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="MyPack.MyDB"%>
<%@page import="MyPack.login"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Status</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>	
	<style type="text/css">
         .panel-primary .panel-body:hover {
            color: black;
            background:#eeeeee;
            border-color: #dddddd;
        }	
	</style>
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color:white;">
    
    
 <%   
  
String stu=(String)session.getAttribute("id");  
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
					
				<span class="navbar-text white-text" id="New" style="font-size: 30px;color: white;">
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

<!-- code for data display is start here-->
 <div class="container" style="padding-top: 100px;">
           
          <div class="container col-md-offset-5 col-md-10" >
           <h3 style="color: #0277bd;"><STRONG>Your Current Status</STRONG> </h3>
            </div>
  <%   
      
          String com=(String)session.getAttribute("com");  
           // out.print(com);
            
            MyDB db=new MyDB();
            Connection con=db.getCon();
            
         try{   
          //String sname ;
             Statement stmt=con.createStatement();
             ResultSet rs1=stmt.executeQuery("select Stu_id,Sname,Cont,Dept,Com_msg,Com_date,Reply,Reply_date from complainttable where Com_id='"+com+"' ;" );
             if( rs1.next()){
                 String sname = (String) rs1.getString("Sname");
                 String id = rs1.getString("Stu_id");
                 String contact = (String) rs1.getString("Cont");
                  String department= rs1.getString("Dept");
                   String comD = rs1.getString("Com_date");
                    String comM = rs1.getString("Com_msg");
              String comR = rs1.getString("Reply");
                 String Rdate = rs1.getString("Reply_date");
                %>
      
           
           
            <div class="container col-md-12">
           <div class="panel panel-primary" style="max-width:800px;margin-left:auto;margin-right:auto;">
      <div class="panel-heading">
        <h4>Complaint ID : <% out.print(com);%></h4>
      </div>
      <div class="panel-body" ">
        <p style="color: #0277bd;padding-top:0px; font-size: 15px;"> <strong>Compliant Details</strong> </p>
        <p><% out.print(comM);%></p>
        <p style="color: #0277bd;padding-top:0px; font-size: 15px;"> <strong>Submission Date :</strong> <% out.print(comD);%></p>
      </div>

      <div class="panel-body">
        <p style="color: #0277bd;padding-top:0px; font-size: 15px;"> <strong>Reply From Admin </strong> </p>
        <p><% out.print(comR);%></p>
        <p style="color: #0277bd;padding-top:0px; font-size: 15px;"> <strong>Reply Date :</strong> <% out.print(Rdate);%></p>
      </div>
           </div>
      
      </div>
             <!--   <div class="form-group col-md-10 ">
                    <label for="name" class="control-label col-md-3" >Complaint ID :</label> <span for="name" class="control-label col-md-8"><% out.print(com);%></span>
                 </div>
           
                <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Student ID:</label> <span for="name" class="control-label col-md-8"><% out.print(id);%></span>
                 </div>
                 
                 <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Student Name:</label> <span for="name" class="control-label col-md-8"><% out.print(sname);%></span>
                 </div>
                 
                 <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Contact:</label> <span for="name" class="control-label col-md-8"><% out.print(contact);%></span>
                 </div>
                 
                 <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Date of Receipt:</label> <span for="name" class="control-label col-md-8"><% out.print(comD);%></span>
                 </div>
                 
                 <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Complaint:</label> <span for="name" class="control-label col-md-8"><% out.print(comM);%></span>
                 </div>
                 
                  <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Reply Date:</label> <span for="name" class="control-label col-md-8"><% out.print(Rdate);%></span>
                 </div>
                 
                 <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Reply:</label> <span for="name" class="control-label col-md-8"><% out.print(comR);%></span>
                 </div>-->
              
  
 
       </div>

            <% }else
                 out.println("preet");
             
      } catch (Exception e) {
           out.print("hello");
        }
  
%>  

<!-- Form start here-->

<div class="container" style="padding-top: 100px; float: left;">






</div>



</body>
</html 