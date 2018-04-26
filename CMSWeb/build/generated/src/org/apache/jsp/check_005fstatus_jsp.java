package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_005fstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>My first bootstrap</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\r\n");
      out.write("\t<script  src=\"jquery.js\"></script>\r\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\t\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\t\r\n");
      out.write("</head>  \r\n");
      out.write(" \r\n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color:white;\" >\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Progma", "no-cache");
    response.setHeader("Expires", "0");
      if( session.getAttribute("id")==null)
          response.sendRedirect("index.jsp");;

      out.write("\r\n");
      out.write("<!-- Navbar is here-->\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse  navbar-fixed-top\" >\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t \t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("       \t\t\t\t <span class=\"icon-bar\"></span>\r\n");
      out.write("        \t\t\t<span class=\"icon-bar\"></span> \r\n");
      out.write("      \t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px;color: white;\">\r\n");
      out.write("    \t\t\t\t<img src=\"mnnit.png\" width=\"50\" height=\"50\" alt=\"\">\r\n");
      out.write("        \t\t\tComplaint Management System\r\n");
      out.write("    \t\t\t</span>\r\n");
      out.write("    \t</div>\r\n");
      out.write("    \t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\r\n");
      out.write("            <li><a href=\"logout.jsp\" >Logout</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("              <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\r\n");
      out.write("          <li><a href=\"ComplaintRegister.jsp\">RegisterComplaint</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\r\n");
      out.write("          <li><a href=\"check_status.jsp\">CheckStatus</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("   \t\t\t\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<!-- Complaint registration Form  is here-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px; float: left;\">\r\n");
      out.write("     \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    <div class=\"container col-md-10\">\r\n");
      out.write("   \t\t<div class=\"col-md-offset-3 col-md-10\">\r\n");
      out.write("    \t  <h2>Check Your Current Status</h2><br>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("   \r\n");
      out.write("        <form action=\"Sstatus\" mathod=\"post\" class=\"form-horizontal control-form col-md-12\" >\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("      <div class=\"form-group \">\r\n");
      out.write("        <label for=\"name\" class=\"control-label col-md-4\">Complaint ID:</label>\r\n");
      out.write("       <div class=\"col-md-6\"><input  id=\"name\" type=\"text\" class=\"form-control\" name=\"com_id\" >\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-offset-4 col-md-10\">\r\n");
      out.write("\t\t\t      \t<button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-3\" style=\"background-color: #0d47a1; \">Submit</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("    </form> \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("<br>\r\n");
      out.write("<br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html \r\n");
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
