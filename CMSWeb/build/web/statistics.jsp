<%-- 
    Document   : statistics.jsp
    Created on : Mar 9, 2018, 6:09:02 PM
    Author     : harpreet
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="MyPack.MyDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
  <title>My first bootstrap</title>
  <link rel="stylesheet" href="bootstrap.css">
  <script  src="jquery.js"></script>
  <script  src="bootstrap.js"></script> 
  
  <%              
         MyDB db=new MyDB();
            Connection con=db.getCon();
            
         try{  
             Statement stmt=con.createStatement();
             
             Statement st=con.createStatement();
//String strQuery = "SELECT COUNT(*) FROM students_data";
//ResultSet rs = st.executeQuery(strQuery);
//String Countrow="";
//while(rs.next()){
//Countrow = rs.getString(1);
//out.println("Total Row :" +Countrow);
             String strQuery = "select count(Dept) from complainttable ;";
             ResultSet rs1=stmt.executeQuery(strQuery);
             String N="";
              int n;
             if( rs1.next()){
                N=rs1.getString(1);
         out.println("Total Row :" +N);
         
         String Q1="select count(Dept) from complainttable where Dept='CIVIL' ;";
          ResultSet r1=stmt.executeQuery(Q1);
            String n1="";
            if(r1.next()){
                n1=r1.getString(1);
                 out.println("CIVIL :" +n1);
             
                n=Integer.parseInt(N);
                 out.println("number:" +n);   
            }
                %>
                
  <style type="text/css">
     #myBar {
  width: 10%;
  height: 30px;
  background-color: #4CAF50;
  text-align: center;
  line-height: 30px;
  color: white;
}
  </style>
    
</head>  
 
<body data-spy="scroll" data-target=".navbar" style="background-color: white;" >
    

    
<!-- Navbar is here-->
  <!--<nav class="navbar navbar-inverse  navbar-fixed-top" >
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

<div class="container" style="padding-top: 100px; float: left";>
    
    
  
    <div class="col-md-9" style="float:right;">
         <h3 style="color: #0d47a1;"><strong>Complaints Statistics (Department Wise)</strong></h3>
         <br>

        <br>

        <div><h5><strong>CSE</strong></h5> </div>
  <div class="progress">
      <div id="myBar"><%out.println(N);%>%</div>
  </div>


   <div> CSE</div>
  <div class="progress">
    <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width:50%">
      50% Complete (info)
    </div>
  </div>

   <div> CSE</div>
  <div class="progress">
    <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width:60%">
      60% Complete (warning)
    </div>
  </div>

  <div class="progress">
    <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100" style="width:70%">
      70% Complete (danger)
    </div>
  </div>   
         
      
    </div>   

</div>

  <% }else
                 out.println("preet");
             
      } catch (Exception e) {
           out.print("hello");
        }
  
%>  
 
 
    
<br>
<br><br><br><br><br>

<script>
#myBar{
  var elem = document.getElementById("myBar");   
  var width = 10;
  var id = setInterval(frame, 10);
  function frame() {
    if (width >= 100) {
      clearInterval(id);
    } else {
      width++; 
      elem.style.width = width + '%'; 
      elem.innerHTML = width * 1  + '%';
    }
  }
}
</script>


</body>
</html 
