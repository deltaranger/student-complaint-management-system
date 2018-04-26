package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>My first bootstrap</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\t\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t\n");
      out.write("\t</style>\n");
      out.write("\t\t\n");
      out.write("</head>  \n");
      out.write(" \n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color: #e0e0e0;\">\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" >\n");
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
      out.write("        \t\t\tCMS MNNIT\n");
      out.write("    \t\t\t</span>\n");
      out.write("    \t</div>\n");
      out.write("    \t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("    \t\t<ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("\t\t\t\t<li><a href=\"beauty.html\">Admin Login</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("    \n");
      out.write("    \t\t\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!-- Login Form Design here-->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px;\">\n");
      out.write("<div class=\"col-md-6\" style=\"float: right;\">\n");
      out.write("    <div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\" style=\"text-align: center; background-color: #eeeeee;\">\n");
      out.write("\t\t\t\t<h2>Student Login</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("  \t\t\t<div class=\"panel-body panel-height\" style=\"background-color: #eeeeee;height: 300px;\">\n");
      out.write("                            <form action=\"login\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("  \t\t\t\t\t<div class=\"form-group\" >\n");
      out.write("    \t\t\t\t\t<div><label for=\"name\" class=\"control-label col-md-1\"><h4><strong>Student_ID</strong> </h4></label></div>\n");
      out.write("                                        <div class=\"col-md-12\" ><input type=\"text\" name=\"stu\" class=\"form-control\" placeholder=\"Enter email\"></div>\n");
      out.write("  \t\t\t\t\t</div>\n");
      out.write("  \t\t\t\t\n");
      out.write("  \t\t<div class=\"form-group\">\n");
      out.write("    \t\t<label for=\"exampleInputPassword1\" class=\"control-label col-md-1\"><h4><strong>Password</strong> </h4></label>\n");
      out.write("                <div class=\"col-md-12\"><input type=\"password\" name=\"pass\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("    \t\t</div>\n");
      out.write("  \t\t</div>\n");
      out.write("                                <button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-5\" style=\"background-color: #0d47a1; \">Login</button>\n");
      out.write("</form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- text on left side-->\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<br>\n");
      out.write("\t<h1 style=\"color: #0097a7;\"><strong>\n");
      out.write("\t\tUse A Valid User Name And <br><br>\n");
      out.write("\t\tPassword To Gain Access To  <br> <br>\n");
      out.write("\t\tUser Home Page.</strong> \n");
      out.write("\t</h1>\n");
      out.write("\t<img src=\"key1.png\" width=\"250\" height=\"250\" alt=\"\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--footer exist here-->\n");
      out.write("  <footer class=\"navbar navbar-default navbar-fixed-bottom\">\n");
      out.write("  \t<div class=\"container\">\n");
      out.write("  \t\t<p class=\"text-center\" style=\"padding: 10px\">@ 2018 Copyright: Delta_Ranger</p>\n");
      out.write("  \t</div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html ");
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
