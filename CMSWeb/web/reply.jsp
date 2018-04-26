<%-- 
    Document   : reply
    Created on : Feb 23, 2018, 9:46:58 AM
    Author     : harpreet
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="MyPack.MyDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        
       <!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Reply</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>	
	<style type="text/css">
		
	</style>
		
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color: white;" >
    
    <%   
  
String com= (String)request.getParameter("com");
//out.print(com);   
session.setAttribute("com",com);
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
   			
		</div>	
	</div>
</nav>

	

<!-- Complaint registration Form  is here-->



   
   <!--<form class="form-horizontal control-form col-md-12">-->
    
    <%   
      
          //String com=(String)session.getAttribute("com");  
           // out.print(com);
            
            MyDB db=new MyDB();
            Connection con=db.getCon();
            
         try{   
          //String sname ;
             Statement stmt=con.createStatement();
             ResultSet rs1=stmt.executeQuery("select Stu_id,Sname,Cont,Dept,Com_msg,Com_date,Reply from complainttable where Com_id='"+com+"' ;" );
             if( rs1.next()){
                 String sname = (String) rs1.getString("Sname");
                 String id = rs1.getString("Stu_id");
                 String contact = (String) rs1.getString("Cont");
                  String department= rs1.getString("Dept");
                   String comD = rs1.getString("Com_date");
                    String comM = rs1.getString("Com_msg");
                    String comR = rs1.getString("Reply");
                    request.setAttribute("comR", comR);
                    
                    if(!comR.equals("Not Replied")){
                     out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'You Have Replied' ,'You can reply only once'  , 'error' );");
                
                   out.println("});");
                   out.println("</script>");
                    }
                    
         
                %>
       <div class="container" style="padding-top: 100px; float: right;">
           <div class="container col-md-offset-1 col-md-10" >
           
           <div class="col-md-10">
               <h2 style="color: #0097a7;">We Feel Happy To Reply Your Complaint</h2><br>
          </div>
           <form  action="Reply" method="post" data-toggle="validator" role="form">
                <div class="form-group col-md-10 ">
                    <label for="name" class="control-label col-md-3" >Complaint ID :</label>
                    <span for="name" class="control-label col-md-8"><% out.print(com);%></span>
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
                   <label for="inputName" class="control-label col-md-3">Reply Msg:</label>
                    <div class="col-md-8">
                        <textarea  id="inputName" class="form-control"  rows="10" name="msg" placeholder="Write your reply here.." required></textarea>
                    </div>
                </div>
              
        
        
                <div class="from-group col-md-10">
                    <div class="col-md-offset-3 col-md-8">
			<button type="submit" onclick="loadFrame(this)" class="btn btn-success col-md-4" style="background-color: #0d47a1; ">Submit</button>
               	    </div>
                </div>
                      
                 <div class="from-group col-md-10">
                 <br>
                 <br>
                 <br>
                 <br>
                 </div>
                 
    </form>
 
       </div>
       </div>             
            <% }else
                 out.println("preet");
             
      } catch (Exception e) {
           out.print("hello");
        }
  
%>  


<!--<footer class="navbar navbar-default navbar-fixed-bottom">
  	<div class="container">
  		<p class="text-center" style="padding: 10px">@ 2018 Copyright: Delta_Ranger</p>
  	</div>
  </footer>-->


      



</body>
</html 

