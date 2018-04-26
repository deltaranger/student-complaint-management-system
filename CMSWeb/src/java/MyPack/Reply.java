/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "Reply", urlPatterns = {"/Reply"})
public class Reply extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
           
            String msg=request.getParameter("msg");
            String rep=(String)request.getAttribute("comR");
           HttpSession session=request.getSession();
           String comId=(String) session.getAttribute("com");
           
            Date date = new Date();  
             SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
              String strDate= formatter.format(date); 
            /*out.println(comId);
            out.println(msg);
           out.println(rep);*/
           
           MyDB db=new MyDB();
           try{
            Connection con=db.getCon();
               PreparedStatement pst;
               
               pst=con.prepareStatement(" update complainttable set Reply='"+msg+"' ,Reply_date='"+strDate+"' where Com_id='"+comId+"' and Reply='Not Replied' ");
               pst.executeUpdate();
             
                   response.sendRedirect("departmentComplaint.jsp");
               
              
                
           }catch (SQLException ex) {
            //Logger.getLogger(Reply.class.getName()).log(Level.SEVERE, null, ex);
            out.println("Data will not modify");
        }
                
        }    }

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
