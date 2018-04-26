package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ComplaintRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>My first bootstrap</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <!--<script src='sweetalert2.all.js'></script>\n");
      out.write("                 <script src='jquery.min.js'></script>\n");
      out.write("              <script>\n");
      out.write("                   $(document).ready(function(){\n");
      out.write("                  swal ( 'Oops' , 'Something went wrong!' , 'error' );\n");
      out.write("                  });\n");
      out.write("                  </script>-->\n");
      out.write("        \n");
      out.write("       \n");
      out.write("               \t\t\n");
      out.write("</head>  \n");
      out.write(" \n");
      out.write("\n");
      out.write("    ");
   
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


      out.write("  \n");
 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Progma", "no-cache");
    response.setHeader("Expires", "0");
      if( session.getAttribute("id")==null)
          response.sendRedirect("index.jsp");

      out.write("\n");
      out.write("       \n");
      out.write("     \n");
      out.write("\n");
      out.write("<!-- Navbar is here-->\n");
      out.write("\t<nav class=\"navbar navbar-inverse  navbar-fixed-top\" >\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t \t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("       \t\t\t\t <span class=\"icon-bar\"></span>\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span> \n");
      out.write("      \t\t\t</button>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t<span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px ;color: white;\">\n");
      out.write("    \t\t\t\t<img src=\"mnnit.png\" width=\"50\" height=\"50\" alt=\"\">\n");
      out.write("        \t\t\tComplaint Management System\n");
      out.write("    \t\t\t</span>\n");
      out.write("    \t</div>\n");
      out.write("    \t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"ComplaintRegister.jsp\">RegisterComplaint</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"check_status.jsp\">CheckStatus</a></li>\n");
      out.write("        </ul>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<!-- Complaint registration Form  is here-->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("  <!-- <div class=\"btn-group-vertical\" style=\"float: left;\">\n");
      out.write("    \n");
      out.write("    <button class=\"btn btn-info\"  style=\"background-color: #0097a7;\" onclick=\"window.location.href='ComplaintRegister.jsp'\"><h4>Complaint Form</h4></button>\n");
      out.write("    <button class=\"btn btn-info\"  style=\"background-color: #0097a7;\" onclick=\"window.location.href='check_status.jsp'\"><h4>Check Status</h4></button>\n");
      out.write("  </div>  --> \n");
      out.write("   \n");
      out.write("\n");
      out.write("    <div class=\"col-md-10\"> \n");
      out.write("      <div class=\"col-md-offset-3 col-md-10\">\n");
      out.write("      <h2><strong>Let Us Know Your  Complaints</strong> </h2><br>\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("    <form action=\"complaint\" method=\"post\" class=\"form-horizontal control-form col-md-12\" data-toggle=\"validator\" role=\"form\">\n");
      out.write("       \n");
      out.write("    \n");
      out.write("         <div class=\"form-group\">\n");
      out.write("        <label for=\"Confrim Password\" class=\"control-label col-md-5\">Complaint type:</label>\n");
      out.write("       <div class=\"col-md-6\">\n");
      out.write("          <select class=\"form-control\" name=\"type\" required  >\n");
      out.write("          <option value=\"\">Select Complaint type</option>\n");
      out.write("          <option>FAST TRACK</option>\n");
      out.write("          <option>NORMAL</option>\n");
      out.write("         \n");
      out.write("        </select> \n");
      out.write("         <div class=\"help-block\">Only Chief Proctor complaint is Under Fast Track Categories.</div>\n");
      out.write("        </div>\n");
      out.write("      </div>        \n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Contact Number:</label>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("            <span class=\"input-group-addon\" id=\"sizing-addon1\">+91</span>\n");
      out.write("            <input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"mob\" placeholder=\"A Valid Contact Number\" required  >\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("\n");
      out.write("     <!-- <div class=\"form-group\">\n");
      out.write("    <label for=\"inputName\" class=\"control-label col-md-1\">Name</label>\n");
      out.write("    <div class=\"col-md-12\"><input type=\"text\" class=\"form-control\" id=\"inputName\" name=\"stu\" placeholder=\"student ID\" required></div>\n");
      out.write("  </div>-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Student Name:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"Student Name\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"Confrim Password\" class=\"control-label col-md-5\">Department:</label>\n");
      out.write("       <div class=\"col-md-6\">\n");
      out.write("          <select class=\"form-control\" name=\"dep\" required  >\n");
      out.write("          <option value=\"\">Select Department</option>\n");
      out.write("          <option>APPLIED MECHANICS</option>\n");
      out.write("          <option>BIOTECHNOLOGY</option>\n");
      out.write("          <option>CHEMICAL ENGG</option>\n");
      out.write("           <option>CHIEF PROCTOR</option>\n");
      out.write("          <option>CIVIL ENGG</option>\n");
      out.write("          <option>DEAN ACADEMIC</option>\n");
      out.write("          <option>DEAN STU WELFARE</option>\n");
      out.write("          <option>COMPUTER SCI & ENGG</option>\n");
      out.write("          <option>ELECTRICAL ENGG</option>\n");
      out.write("          <option>MECHANICAL ENGG</option>\n");
      out.write("          <option>MGMT STUDIES</option>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("         \n");
      out.write("        </select> \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("            \n");
      out.write("      \n");
      out.write(" \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"Confrim Password\" class=\"control-label col-md-5\">Course:</label>\n");
      out.write("               <div class=\"col-md-6\">\n");
      out.write("                   <select class=\"form-control\" name=\"cour\" required >\n");
      out.write("                    <option value=\"\">Select Course</option>\n");
      out.write("\n");
      out.write("          <option>B_Tech AM</option>\n");
      out.write("          <option>B_Tech BIO</option>\n");
      out.write("          <option>B_Tech CHE</option>\n");
      out.write("          <option>B_Tech CIVIL</option>\n");
      out.write("          <option>B_Tech CS</option>\n");
      out.write("          <option>B_Tech EC</option>\n");
      out.write("          <option>B_Tech IT</option>\n");
      out.write("          <option>B_Tech ME</option>\n");
      out.write("          <option>MBA</option>\n");
      out.write("          <option>MCA</option>\n");
      out.write("          <option>MSc</option>\n");
      out.write("          <option>MSW</option>\n");
      out.write("          <option>M_Tech AM</option>\n");
      out.write("          <option>M_Tech BIO</option>\n");
      out.write("          <option>M_Tech CHE</option>\n");
      out.write("          <option>M_Tech CIVIL</option>\n");
      out.write("          <option>M_Tech CS</option>\n");
      out.write("          <option>M_Tech EC</option>\n");
      out.write("          <option>M_Tech IT</option>\n");
      out.write("          <option>M_Tech ME</option>\n");
      out.write("        </select> \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <label for=\"inputName\" class=\"control-label col-md-5\"> Problem Subject:</label>\n");
      out.write("        <div class=\"col-md-6\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"prob\" placeholder=\"Problem Subject\" required  >\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("          <label for=\"inputName\" class=\"control-label col-md-5\"> Complaint:</label>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <textarea  id=\"inputName\"  class=\"form-control\" rows=\"10\" name=\"msg\"placeholder=\"Write your message here...\" required></textarea>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <p style=\"margin-left:500px; \"  id=\"demo\"></p>\n");
      out.write("  <script>\n");
      out.write("  document.getElementById(\"demo\").innerHTML = Date();\n");
      out.write("  </script>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("      <div class=\"form-group\">\n");
      out.write("        <div class=\"col-md-offset-5 col-md-10\">\n");
      out.write("              <button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-3\" style=\"background-color: #0d47a1; \">Submit</button>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("                                                \n");
      out.write("                                             \n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("    </form>\n");
      out.write("    </div>  \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
