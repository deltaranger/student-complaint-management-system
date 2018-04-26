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
	<title>View Complaint</title>
	<link rel="stylesheet" href="bootstrap.css">
	<script  src="jquery.js"></script>
	<script  src="bootstrap.js"></script>	
	<style type="text/css">
		
	</style>
		
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color: white;" >
    
    
    <%   
  
String com= (String)request.getParameter("com");
out.print(com);   
//session.getAttribute("com");
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
</nav>-->

	

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
             ResultSet rs1=stmt.executeQuery("select Com_msg,Com_date,Reply,Reply_date from complainttable where Com_id='"+com+"' ;" );
             if( rs1.next()){
                 String comR = (String) rs1.getString("Reply");
                 
                    String comM = rs1.getString("Com_msg");
                    String Rdate = rs1.getString("Reply_date");
                     String comD = rs1.getString("Com_date");
         
                %>
       <div class="container" style="padding-top: 100px; float: right;">
           
           <div class="container col-md-offset-2 col-md-10" >
           <div class="col-md-10">
               <h2 style="color: #0097a7;">Current status of Complaint </h2><br>
          </div>
           <form  >
                <div class="form-group col-md-10 ">
                    <label for="name" class="control-label col-md-3" >Complaint ID</label> <span for="name" class="control-label col-md-8"><strong>:</strong> <% out.print(com);%></span>
                 </div>
           
                                
                 <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Complaint</label> <span for="name" class="control-label col-md-8"><strong>:</strong> <% out.print(comM);%></span>
                 </div>
                 
                 <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Complaint Date</label> <span for="name" class="control-label col-md-8"><strong>:</strong> <% out.print(comD);%></span>
                 </div>
                 
                 <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Response</label> <span for="name" class="control-label col-md-8"><strong>:</strong> <% out.print(comR);%></span>
                 </div>
                  <div class="form-group col-md-10">
                 <label for="name" class="control-label col-md-3">Date</label> <span for="name" class="control-label col-md-8"><strong>:</strong> <% out.print(Rdate);%></span>
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

