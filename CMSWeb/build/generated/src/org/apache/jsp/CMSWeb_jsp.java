package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CMSWeb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Home</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("  <script  src=\"jquery.js\"></script>\n");
      out.write("  <script  src=\"bootstrap.js\"></script> \n");
      out.write("\t<style >\n");
      out.write("\t\tsection{\n");
      out.write("\t\t\twidth: 100vw;\n");
      out.write("\t\t\theight: 100vh;\n");
      out.write("\t\t\tpadding: 50Px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.cl_white{\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\t\timg {\n");
      out.write("\t\t\twidth: 300px;\n");
      out.write("\t\t\ttranstion:opacity 1s ease-in-out; \n");
      out.write("\t\t}\n");
      out.write("\t\timg:hover {\n");
      out.write("\t\t\topacity: .5;\n");
      out.write("\t\t}\n");
      out.write("\t\t.col-text{\n");
      out.write("\t\t\t-webkit-column-count:3;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("</head>  \n");
      out.write(" \n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\">\n");
      out.write("\t<nav class=\"navbar navbar-inverse  navbar-fixed-bottom\">\n");
      out.write("\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("       \t\t\t\t <span class=\"icon-bar\"></span>\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span> \n");
      out.write("      \t\t\t</button>\n");
      out.write("      \t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("\t\t<ul class=\"nav navbar-nav\" >\n");
      out.write("\t\t\t<li><a href=\"#home\">Home</a></li>\n");
      out.write("\t\t\t<li><a href=\"#about\">About us</a></li>\n");
      out.write("\t\t\t<li><a href=\"#contact\">Contact us</a></li>\n");
      out.write("\t\t</ul>\t\t\n");
      out.write("\t</div>\n");
      out.write("\t</nav> \n");
      out.write("\n");
      out.write("\t<div>\n");
      out.write("\t<section id=\"home\" style=\"background: url(image1.jpg ); background-size: 100% 100%\" class=\"cl_white text-center\"> \n");
      out.write("\t\t<h1 style=\"font-size: 70px;\"><STRONG>Complaint Management System.</STRONG></h1>\n");
      out.write("\t\t<p class=\"lead\"><strong>To Write Complaint Click On Proceed Button!</strong> </p>\n");
      out.write("\t\t<a href=\"index.jsp\"><button class=\"btn btn-default\" style=\"font-size: 30px;\">Proceed Here</button></a> \n");
      out.write("\t</section>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<section  id=\"about\" class=\"container\">\n");
      out.write("\t\t<h1 class=\"text-center\" style=\"\"><STRONG>About Us!</STRONG> </h1>\n");
      out.write("\t\t<div class=\"col-text\">\n");
      out.write("\t\t\tWe all of the Student of Motilal Nehru National Institute Of Technology Allahabad. \n");
      out.write("                        We are pursing the Master Of Computer Application program in this Institute.\n");
      out.write("                        This project is  a college compliant management system .\n");
      out.write("                        This project have been completed under the guidance of Assistant Professor Dr. ANOJ KUMAR.\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<div>\n");
      out.write("\t<section id=\"contact\" class=\"\" style=\"background-color: black;\">\n");
      out.write("\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t<h1 class=\"text-center\" style=\"color: white;\"><STRONG>Contact Us!</STRONG> </h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<form class=\"col-md-5 col-md-offset-5 \">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<h2 style=\"color: white;\"> Diksha Bharti </h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<h2 style=\"color: white;\"> Dilip Kumar Yadav </h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<h2 style=\"color: white;\"> Faiz Mohammed </h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<h2 style=\"color: white;\"> Gyayak Jain </h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<h2 style=\"color: white;\"> Harpreet singh</h2> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<h5 style=\"color: white;\">@ 2018 Copyright :The Rebellion rider</h5>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t</section>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html\n");
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
