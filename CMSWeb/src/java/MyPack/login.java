/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author harpreet
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String id = request.getParameter("stu");
            String pass = request.getParameter("pass");
            
            String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
		System.out.println(gRecaptchaResponse);
		boolean verify = VerifyRecaptcha.verify(gRecaptchaResponse);
                if(true){
                    
                    out.println("verify seccussfull");
           
            MyDB db = new MyDB();
           Connection con = db.getCon();
            try {
                Statement stmt = con.createStatement();
                
                
               
               
               
               ResultSet rs1= stmt.executeQuery("select Stu_id,Pass from STUDENT where Stu_id = '"+id+"'and Pass = '"+pass+"'");
               
               HttpSession session=request.getSession();
                   session.setAttribute("id",id );
               if(rs1.next()){
                   
                response.sendRedirect("ComplaintRegister.jsp");
                
              
               
               
               }else{
                   
                   //out.println("<script src='sweetalert2.all.js'></script>");
                   //out.println("<script src='jquery.min.js'></script>"); 
                    out.println("<script type=\"text/javascript\">");
                     out.println("alert('User or password incorrect');");
   
                  
                  // out.println("$(document).ready(function(){");
                   //out.println("swal ( 'Your Complaint Has Been Loaded Successfully' ,'Complaint ID :'  , 'success' );");
                
                   //out.println("});");
                   
   out.println("location='index.jsp';");
   out.println("</script>");
                
               
        
                
               }
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                out.println("ceptcha fail");
                }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
