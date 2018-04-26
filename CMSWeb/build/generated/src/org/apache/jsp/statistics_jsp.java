package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import MyPack.MyDB;

public final class statistics_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>My first bootstrap</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("  <script  src=\"jquery.js\"></script>\n");
      out.write("  <script  src=\"bootstrap.js\"></script> \n");
      out.write("  \n");
      out.write("  ");
              
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
                
      out.write("\n");
      out.write("                \n");
      out.write("  <style type=\"text/css\">\n");
      out.write("     #myBar {\n");
      out.write("  width: 10%;\n");
      out.write("  height: 30px;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  text-align: center;\n");
      out.write("  line-height: 30px;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("    \n");
      out.write("</head>  \n");
      out.write(" \n");
      out.write("<body data-spy=\"scroll\" data-target=\".navbar\" style=\"background-color: white;\" >\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("<!-- Navbar is here-->\n");
      out.write("  <!--<nav class=\"navbar navbar-inverse  navbar-fixed-top\" >\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("               <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span> \n");
      out.write("            </button>\n");
      out.write("          \n");
      out.write("        <span class=\"navbar-text white-text\" id=\"New\" style=\"font-size: 30px;color: white;\">\n");
      out.write("            <img src=\"mnnit.png\" width=\"50\" height=\"50\" alt=\"\">\n");
      out.write("              Complaint Management System\n");
      out.write("          </span>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\" style=\"font-size: 20px;text-align: center;padding: 15px;\" id=\"preet\">\n");
      out.write("          <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("    </div>  \n");
      out.write("  </div>\n");
      out.write("</nav>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<!-- Complaint registration Form  is here-->\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"padding-top: 100px; float: left\";>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  \n");
      out.write("    <div class=\"col-md-9\" style=\"float:right;\">\n");
      out.write("         <h3 style=\"color: #0d47a1;\"><strong>Complaints Statistics (Department Wise)</strong></h3>\n");
      out.write("         <br>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div><h5><strong>CSE</strong></h5> </div>\n");
      out.write("  <div class=\"progress\">\n");
      out.write("      <div id=\"myBar\">");
out.println(N);
      out.write("%</div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   <div> CSE</div>\n");
      out.write("  <div class=\"progress\">\n");
      out.write("    <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"50\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:50%\">\n");
      out.write("      50% Complete (info)\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("   <div> CSE</div>\n");
      out.write("  <div class=\"progress\">\n");
      out.write("    <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:60%\">\n");
      out.write("      60% Complete (warning)\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"progress\">\n");
      out.write("    <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"70\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width:70%\">\n");
      out.write("      70% Complete (danger)\n");
      out.write("    </div>\n");
      out.write("  </div>   \n");
      out.write("         \n");
      out.write("      \n");
      out.write("    </div>   \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("  ");
 }else
                 out.println("preet");
             
      } catch (Exception e) {
           out.print("hello");
        }
  

      out.write("  \n");
      out.write(" \n");
      out.write(" \n");
      out.write("    \n");
      out.write("<br>\n");
      out.write("<br><br><br><br><br>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("#myBar{\n");
      out.write("  var elem = document.getElementById(\"myBar\");   \n");
      out.write("  var width = 10;\n");
      out.write("  var id = setInterval(frame, 10);\n");
      out.write("  function frame() {\n");
      out.write("    if (width >= 100) {\n");
      out.write("      clearInterval(id);\n");
      out.write("    } else {\n");
      out.write("      width++; \n");
      out.write("      elem.style.width = width + '%'; \n");
      out.write("      elem.innerHTML = width * 1  + '%';\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
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
