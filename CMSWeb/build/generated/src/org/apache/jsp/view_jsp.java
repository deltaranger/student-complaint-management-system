package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import MyPack.MyDB;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("       <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color: white;\" >\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
   
  
String com= (String)request.getParameter("com");
//out.print(com);   
session.getAttribute("com");

      out.write("  \n");
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
      out.write("\t\t\t\t<span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px;color: white;\">\n");
      out.write("    \t\t\t\t<img src=\"mnnit.png\" width=\"50\" height=\"50\" alt=\"\">\n");
      out.write("        \t\t\tComplaint Management System\n");
      out.write("    \t\t\t</span>\n");
      out.write("    \t</div>\n");
      out.write("    \t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("   \t\t\t\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</nav>-->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!-- Complaint registration Form  is here-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("   <!--<form class=\"form-horizontal control-form col-md-12\">-->\n");
      out.write("    \n");
      out.write("    ");
   
      
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
         
                
      out.write("\n");
      out.write("       <div class=\"container\" style=\"padding-top: 100px; float: right;\">\n");
      out.write("           \n");
      out.write("           <div class=\"container col-md-offset-2 col-md-10\" >\n");
      out.write("           <div class=\"col-md-10\">\n");
      out.write("               <h2 style=\"color: #0097a7;\">Current status of Complaint </h2><br>\n");
      out.write("          </div>\n");
      out.write("           <form  >\n");
      out.write("                <div class=\"form-group col-md-10 \">\n");
      out.write("                    <label for=\"name\" class=\"control-label col-md-3\" >Complaint ID</label> <span for=\"name\" class=\"control-label col-md-8\"><strong>:</strong> ");
 out.print(com);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("           \n");
      out.write("                                \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Complaint</label> <span for=\"name\" class=\"control-label col-md-8\"><strong>:</strong> ");
 out.print(comM);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Complaint Date</label> <span for=\"name\" class=\"control-label col-md-8\"><strong>:</strong> ");
 out.print(comD);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Response</label> <span for=\"name\" class=\"control-label col-md-8\"><strong>:</strong> ");
 out.print(comR);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                  <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Date</label> <span for=\"name\" class=\"control-label col-md-8\"><strong>:</strong> ");
 out.print(Rdate);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                      \n");
      out.write("                 <div class=\"from-group col-md-10\">\n");
      out.write("                 <br>\n");
      out.write("                 <br>\n");
      out.write("                 <br>\n");
      out.write("                 <br>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("    </form>\n");
      out.write(" \n");
      out.write("       </div>\n");
      out.write("                 </div>\n");
      out.write("\n");
      out.write("            ");
 }else
                 out.println("preet");
             
      } catch (Exception e) {
           out.print("hello");
        }
  

      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<footer class=\"navbar navbar-default navbar-fixed-bottom\">\n");
      out.write("  \t<div class=\"container\">\n");
      out.write("  \t\t<p class=\"text-center\" style=\"padding: 10px\">@ 2018 Copyright: Delta_Ranger</p>\n");
      out.write("  \t</div>\n");
      out.write("  </footer>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html \n");
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
