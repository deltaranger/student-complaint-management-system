package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import MyPack.MyDB;

public final class reply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</nav>\n");
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
   
      
          String com=(String)session.getAttribute("com");  
           // out.print(com);
            
            MyDB db=new MyDB();
            Connection con=db.getCon();
            
         try{   
          //String sname ;
             Statement stmt=con.createStatement();
             ResultSet rs1=stmt.executeQuery("select Stu_id,Sname,Cont,Dept,Com_msg,Com_date,Reply from complainttable where Com_id='"+com+"' ;" );
             if( rs1.next()){
                 String sname = (String) rs1.getString("Sname");
                 String id = rs1.getString("Stu_id");
                 String contact = (String) rs1.getString("Cont");
                  String department= rs1.getString("Dept");
                   String comD = rs1.getString("Com_date");
                    String comM = rs1.getString("Com_msg");
                    String comR = rs1.getString("Reply");
                    request.setAttribute("comR", comR);
                    
                    if(!comR.equals("Not Replied")){
                     out.println("<script src='sweetalert2.all.js'></script>");
                   out.println("<script src='jquery.min.js'></script>"); 
                   out.println("<script >");
                   out.println("$(document).ready(function(){");
                   out.println("swal ( 'You Have Replied' ,'You can reply only once'  , 'error' );");
                
                   out.println("});");
                   out.println("</script>");
                    }
                    
         
                
      out.write("\n");
      out.write("       <div class=\"container\" style=\"padding-top: 100px; float: right;\">\n");
      out.write("           <div class=\"container col-md-offset-1 col-md-10\" >\n");
      out.write("           \n");
      out.write("           <div class=\"col-md-10\">\n");
      out.write("               <h2 style=\"color: #0097a7;\">We Feel Happy To Reply Your Complaint</h2><br>\n");
      out.write("          </div>\n");
      out.write("           <form  action=\"Reply\" method=\"post\" data-toggle=\"validator\" role=\"form\">\n");
      out.write("                <div class=\"form-group col-md-10 \">\n");
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
      out.write("                 \n");
      out.write("               \n");
      out.write("                 \n");
      out.write("                 <div class=\"form-group col-md-10\">\n");
      out.write("                   <label for=\"inputName\" class=\"control-label col-md-3\">Reply Msg:</label>\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        <textarea  id=\"inputName\" class=\"form-control\"  rows=\"10\" name=\"msg\" placeholder=\"Write your reply here..\" required></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                <div class=\"from-group col-md-10\">\n");
      out.write("                    <div class=\"col-md-offset-3 col-md-8\">\n");
      out.write("\t\t\t<button type=\"submit\" onclick=\"loadFrame(this)\" class=\"btn btn-success col-md-4\" style=\"background-color: #0d47a1; \">Submit</button>\n");
      out.write("               \t    </div>\n");
      out.write("                </div>\n");
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
      out.write("       </div>             \n");
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
