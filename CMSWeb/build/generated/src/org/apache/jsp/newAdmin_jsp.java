package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Add admin</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\t\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t\n");
      out.write("\t</style>\n");
      out.write("\t\t\n");
      out.write("</head>  \n");
      out.write(" \n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color: white;\" >\n");
      out.write("    \n");
      out.write("    ");
 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Progma", "no-cache");
    response.setHeader("Expires", "0");
      if( session.getAttribute("id")==null)
          response.sendRedirect("index.jsp");

      out.write("\n");
      out.write("   ");
   
  
    String id= (String)session.getAttribute("id");
    out.println(id);   
       //session.setAttribute("com",com);

      out.write("  \n");
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
      out.write("\t\t\t\t<span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px\">\n");
      out.write("    \t\t\t\t<img src=\"mnnit.png\" width=\"50\" height=\"50\" alt=\"\">\n");
      out.write("        \t\t\tComplaint Management System\n");
      out.write("    \t\t\t</span>\n");
      out.write("    \t</div>\n");
      out.write("    \t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("         <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"update.jsp?id=");
out.println(id);
      out.write("\">Update profile</a></li>\n");
      out.write("        </ul>    \n");
      out.write("   \t\t\t\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!-- Complaint registration Form  is here-->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("\t\n");
      out.write("      \t\n");
      out.write("\t<div  style=\"float: left;\">\n");
      out.write("             <h4 style=\"padding-left: 40px;\"><strong>categories</strong></h4>\n");
      out.write("\t\t<ul class=\" nav nav-pills nav-stacked nav-pills-fixed-top\">\n");
      out.write("\t\t\t<li><a href=\"newAdmin.jsp\">ADD</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=ALL\" >ALL</a></li>\n");
      out.write("                        \n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=APPLIED MECHANICS\" >APPLIED MECHANICS</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=BIOTECHNOLOGY\" >BIOTECHNOLOGY</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=CHEMICAL ENGG\" >CHEMICAL ENGG</a></li>\n");
      out.write("                      <li><a href=\"allcomplaint.jsp?com=CHIEF PROCTOR\" >CHIEF PROCTOR</a></li>\n");
      out.write("\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=CIVIL ENGG\" >CIVIL ENGG</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=COMPUTER\" >COMPUTER SCI & ENGG</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=DEAN ACADEMIC\" >DEAN ACADEMIC</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=DEAN STU WELFARE\" >DEAN STU WELFARE</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=ELECTRICAL ENGG\" >ELECTRICAL ENGG</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=MECHANICAL ENGG\" >MECHANICAL ENGG</a></li>\n");
      out.write("                        <li><a href=\"allcomplaint.jsp?com=MGMT STUDIES\" >MGMT STUDIES</a></li>\n");
      out.write("                      \n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"col-md-9\" style=\"float:right;\">\n");
      out.write("      \t\t<div class=\"col-md-9\">\n");
      out.write("   \t\t   <h2 style=\"float: right;\"><strong>Add New User</strong> </h2><br>\n");
      out.write("  \t</div>\n");
      out.write("\n");
      out.write("            <form class=\"form-horizontal\" action=\"Addadmin\" method=\"post\"data-toggle=\"validator\" role=\"form\">\n");
      out.write("\n");
      out.write("\t\t\t    <div class=\"form-group\">\n");
      out.write("\t\t\t        <label for=\"Confrim Password\" class=\"control-label col-md-5\">Department:</label>\n");
      out.write("\t\t\t               <div class=\"col-md-5\">\n");
      out.write("                                           <select class=\"form-control\" name=\"dep\" required>\n");
      out.write("                                               <option value=\"\">Select Department</option> \n");
      out.write("\t\t\t\t\t\t\t\t<option>APPLIED MECHANICS</option>\n");
      out.write("                                                                    <option>BIOTECHNOLOGY</option>\n");
      out.write("                                                                    <option>CHEMICAL ENGG</option>\n");
      out.write("                                                                    <option>CIVIL ENGG</option>\n");
      out.write("                                                                    <option>DEAN ACADEMIC</option>\n");
      out.write("                                                                    <option>DEAN STU WELFARE</option>\n");
      out.write("                                                                    <option>COMPUTER SCI & ENGG</option>\n");
      out.write("                                                                    <option>ELECTRICAL ENGG</option>\n");
      out.write("                                                                    <option>MECHANICAL ENGG</option>\n");
      out.write("                                                                    <option>MGMT STUDIES</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t    <div class=\"form-group \">\n");
      out.write("\t\t\t        <label for=\"inputName\" class=\"control-label col-md-5\">User ID:</label>\n");
      out.write("\t\t\t        <div class=\"col-md-5\"><input  id=\"inputName\" type=\"text\" class=\"form-control\" name=\"user\" required >\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t    <div class=\"form-group\">\n");
      out.write("\t\t\t        <label for=\"inputPassword\" class=\"control-label col-md-5\"> User Passwor:</label>\n");
      out.write("\t\t\t        <div class=\"col-md-5\"><input  id=\"inputPassword\" type=\"Password\" class=\"form-control\" name=\"pass\" required>\n");
      out.write("\t\t\t        </div>\n");
      out.write("\t\t\t    </div>\n");
      out.write("                \n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                              <label for=\"intputPassword\" class=\"control-label col-md-5\"> Questions:</label>\n");
      out.write("                               <div class=\"col-md-5\">\n");
      out.write("                                <select class=\"form-control\" name=\"Que\" required >\n");
      out.write("                                        <option value=\"\">Select Question</option>    \n");
      out.write("                                        <option>What is your mother tonuge</option>\n");
      out.write("                                        <option>What is you pet name</option>\n");
      out.write("                                        <option>Your frist school name</option>\n");
      out.write("                                        <option>Your favourite colour </option>\n");
      out.write("                      \n");
      out.write("                                        </select> \n");
      out.write("                                 </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                             <div class=\"form-group\">\n");
      out.write("                            <label for=\"intputPassword\" class=\"control-label col-md-5\"> Your Answer:</label>\n");
      out.write("                            <div class=\"col-md-5\"><input  id=\"Password\" type=\"\" class=\"form-control\" name=\"Ans\" required >\n");
      out.write("                            </div>\n");
      out.write("                            </div>\n");
      out.write("    \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t     <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-offset-5 col-md-10\">\n");
      out.write("                                                    <button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-3\" style=\"background-color: #0d47a1; \">Submit</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div> \n");
      out.write("\t\t\t         \n");
      out.write("</form>\n");
      out.write("</div>\t \n");
      out.write("</div>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("\t\t\n");
      out.write("<br>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html \n");
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
