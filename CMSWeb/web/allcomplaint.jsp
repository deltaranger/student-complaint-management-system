<%-- 
    Document   : allcomplaint
    Created on : Feb 23, 2018, 5:44:46 PM
    Author     : harpreet
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="MyPack.MyDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>Complaints</title>
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
          <li><a href="update.jsp">Update profile</a></li>
        </ul>     
   			
		</div>	
	</div>
</nav>

	

<!-- Complaint registration Form  is here-->

<div class="container" style="padding-top: 100px; float: left;">
	
      	
	<div  style="float: left;">
            <h4 style="padding-left: 40px;"><strong>categories</strong></h4>
		<ul class=" nav nav-pills nav-stacked flex-column">
			<li><a href="newAdmin.jsp">ADD</a></li>
                        <li><a href="allcomplaint.jsp?com=ALL" >ALL</a></li>
                        
                        <li><a href="allcomplaint.jsp?com=APPLIED MECHANICS" >APPLIED MECHANICS</a></li>
                        <li><a href="allcomplaint.jsp?com=BIOTECHNOLOGY" >BIOTECHNOLOGY</a></li>
                        
                        <li><a href="allcomplaint.jsp?com=CHEMICAL ENGG" >CHEMICAL ENGG</a></li>
                         <li><a href="allcomplaint.jsp?com=CHIEF PROCTOR" >CHIEF PROCTOR</a></li>
                        <li><a href="allcomplaint.jsp?com=CIVIL ENGG" >CIVIL ENGG</a></li>
                        <li><a href="allcomplaint.jsp?com=COMPUTER">COMPUTER SCI & ENGG</a></li>
                        <li><a href="allcomplaint.jsp?com=DEAN ACADEMIC" >DEAN ACADEMIC</a></li>
                        <li><a href="allcomplaint.jsp?com=DEAN STU WELFARE" >DEAN STU WELFARE</a></li>
                        <li><a href="allcomplaint.jsp?com=ELECTRICAL ENGG" >ELECTRICAL ENGG</a></li>
                        <li><a href="allcomplaint.jsp?com=MECHANICAL ENGG" >MECHANICAL ENGG</a></li>
                        <li><a href="allcomplaint.jsp?com=MGMT STUDIES" >MGMT STUDIES</a></li>
			
		</ul>
           
<br><br><br><br><br>
	</div>

    
    
         <%   
  
    String com= (String)request.getParameter("com");
    //out.println(com);   
       //session.setAttribute("com",com);
%>  
    
	
	<div class="col-md-9" style="float:right;">
            
            <div class="col-md-8" style="float:right">
                <h3 style="color:#0d47a1;"><strong>Compliants list</strong></h3> 
            </div>
            <br>
            <br>
            
            <table class="table table-hover" style="float: right;">
     		<thead>
			<tr>
                                <th>#</th>
			        <th>Complaint_ID</th>
				<th>Stu_ID</th>
                                <th>Phone</th>
				
				<th>Course</th>
                                <th>Subject</th>
                               
				<th>Date</th>
			</tr>
                </thead>
                        <%   
                           try{
                       // String com=(String)session.getAttribute("id");  
           // out.print(com)
                    MyDB db=new MyDB();
                    Connection con=db.getCon();
                    int n=0;
                        
             Statement stmt=con.createStatement();
             ResultSet rs1;
             if(com.equals("ALL")){
                   rs1=stmt.executeQuery("select Com_id,Stu_id,Cont,Dept,Course,Com_sub,Com_date from complainttable  order by S_no desc ;" );
             }else if(com.equals("COMPUTER")){
                 com="COMPUTER SCI & ENGG";
                  rs1=stmt.executeQuery("select Com_id,Stu_id,Cont,Dept,Course,Com_sub,Com_date from complainttable where Dept='"+com+"' order by S_no desc ;" );
             }
             else{
                  rs1=stmt.executeQuery("select Com_id,Stu_id,Cont,Dept,Course,Com_sub,Com_date from complainttable where Dept='"+com+"' order by S_no desc ;" );
             }
            
             while( rs1.next()){
                 n++;
                 String num=Integer.toString(n);
                 String comId = (String) rs1.getString("Com_id");
                 String id = rs1.getString("Stu_id");
                 String contact = (String) rs1.getString("Cont");
                
                   String comD = rs1.getString("Com_date");
                    String comS = rs1.getString("Com_sub");
                     String course = rs1.getString("Course");
                 
                %>
			
                            <tr>
                                <td><strong><%out.print(num);%></strong></td>
                                <td><%out.print(comId);%></td>
                                <td><%out.print(id);%></td>
                                <td><%out.print(contact);%></td>
                               
                                <td><%out.print(course);%></td>
                                <td><%out.print(comS);%></td>
                                <td><%out.print(comD);%></td>
                             
                               <td><a href="view.jsp?com=<%out.print(comId);%>">View</a></td>
                             
                            </tr><%
           
          }
         }catch(Exception e){}
        
        %>
        </table>		
        
        </div>	 
        
</div>

<br><br><br><br><br>


</body>
</html 
