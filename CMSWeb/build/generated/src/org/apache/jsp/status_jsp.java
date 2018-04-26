package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import MyPack.MyDB;
import MyPack.login;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;

public final class status_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>My first bootstrap</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("\t<script  src=\"jquery.js\"></script>\n");
      out.write("\t<script  src=\"bootstrap.js\"></script>\t\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("         .panel-primary .panel-body:hover {\n");
      out.write("            color: black;\n");
      out.write("            background:#eeeeee;\n");
      out.write("            border-color: #dddddd;\n");
      out.write("        }\t\n");
      out.write("\t</style>\n");
      out.write("</head>  \n");
      out.write(" \n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color:white;\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write(" ");
   
  
String stu=(String)session.getAttribute("id");  
//out.print(stu);  
  

      out.write("  \n");
 
   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
   response.setHeader("Progma", "no-cache");
    response.setHeader("Expires", "0");
      if( session.getAttribute("id")==null)
          response.sendRedirect("index.jsp");

      out.write("\n");
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
      out.write("              <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"ComplaintRegister.jsp\">RegisterComplaint</a></li>\n");
      out.write("        </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"check_status.jsp\">CheckStatus</a></li>\n");
      out.write("        </ul>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<!-- code for data display is start here-->\n");
      out.write(" <div class=\"container\" style=\"padding-top: 100px;\">\n");
      out.write("           \n");
      out.write("          <div class=\"container col-md-offset-5 col-md-10\" >\n");
      out.write("           <h3 style=\"color: #0277bd;\"><STRONG>Your Current Status</STRONG> </h3>\n");
      out.write("            </div>\n");
      out.write("  ");
   
      
          String com=(String)session.getAttribute("com");  
           // out.print(com);
            
            MyDB db=new MyDB();
            Connection con=db.getCon();
            
         try{   
          //String sname ;
             Statement stmt=con.createStatement();
             ResultSet rs1=stmt.executeQuery("select Stu_id,Sname,Cont,Dept,Com_msg,Com_date,Reply,Reply_date from complainttable where Com_id='"+com+"' ;" );
             if( rs1.next()){
                 String sname = (String) rs1.getString("Sname");
                 String id = rs1.getString("Stu_id");
                 String contact = (String) rs1.getString("Cont");
                  String department= rs1.getString("Dept");
                   String comD = rs1.getString("Com_date");
                    String comM = rs1.getString("Com_msg");
              String comR = rs1.getString("Reply");
                 String Rdate = rs1.getString("Reply_date");
                
      out.write("\n");
      out.write("      \n");
      out.write("           \n");
      out.write("           \n");
      out.write("            <div class=\"container col-md-12\">\n");
      out.write("           <div class=\"panel panel-primary\" style=\"max-width:800px;margin-left:auto;margin-right:auto;\">\n");
      out.write("      <div class=\"panel-heading\">\n");
      out.write("        <h4>Complaint ID : ");
 out.print(com);
      out.write("</h4>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"panel-body\" \">\n");
      out.write("        <p style=\"color: #0277bd;padding-top:0px; font-size: 15px;\"> <strong>Compliant Details</strong> </p>\n");
      out.write("        <p>");
 out.print(comM);
      out.write("</p>\n");
      out.write("        <p style=\"color: #0277bd;padding-top:0px; font-size: 15px;\"> <strong>Submission Date :</strong> ");
 out.print(comD);
      out.write("</p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"panel-body\">\n");
      out.write("        <p style=\"color: #0277bd;padding-top:0px; font-size: 15px;\"> <strong>Reply From Admin </strong> </p>\n");
      out.write("        <p>");
 out.print(comR);
      out.write("</p>\n");
      out.write("        <p style=\"color: #0277bd;padding-top:0px; font-size: 15px;\"> <strong>Reply Date :</strong> ");
 out.print(Rdate);
      out.write("</p>\n");
      out.write("      </div>\n");
      out.write("           </div>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("             <!--   <div class=\"form-group col-md-10 \">\n");
      out.write("                    <label for=\"name\" class=\"control-label col-md-3\" >Complaint ID :</label> <span for=\"name\" class=\"control-label col-md-8\">");
 out.print(com);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("           \n");
      out.write("                <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Student ID:</label> <span for=\"name\" class=\"control-label col-md-8\">");
 out.print(id);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Student Name:</label> <span for=\"name\" class=\"control-label col-md-8\">");
 out.print(sname);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Contact:</label> <span for=\"name\" class=\"control-label col-md-8\">");
 out.print(contact);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Date of Receipt:</label> <span for=\"name\" class=\"control-label col-md-8\">");
 out.print(comD);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Complaint:</label> <span for=\"name\" class=\"control-label col-md-8\">");
 out.print(comM);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                  <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Reply Date:</label> <span for=\"name\" class=\"control-label col-md-8\">");
 out.print(Rdate);
      out.write("</span>\n");
      out.write("                 </div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                 <label for=\"name\" class=\"control-label col-md-3\">Reply:</label> <span for=\"name\" class=\"control-label col-md-8\">");
 out.print(comR);
      out.write("</span>\n");
      out.write("                 </div>-->\n");
      out.write("              \n");
      out.write("  \n");
      out.write(" \n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("            ");
 }else
                 out.println("preet");
             
      } catch (Exception e) {
           out.print("hello");
        }
  

      out.write("  \n");
      out.write("\n");
      out.write("<!-- Form start here-->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px; float: left;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
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
