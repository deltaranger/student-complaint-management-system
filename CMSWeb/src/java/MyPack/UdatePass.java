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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "UdatePass", urlPatterns = {"/UdatePass"})
public class UdatePass extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String oldpass=  request.getParameter("oldpass");
             String newpass =  request.getParameter("newpass");
              String conpass= (String) request.getParameter("conpass");
               String que= (String) request.getParameter("que");
                String ans= (String) request.getParameter("ans");
              /*  out.println(oldpass);
                 out.println(newpass);
                  out.println(conpass);
                   out.println(que); out.println(ans);*/
                     HttpSession session=request.getSession();
                     String dep = (String) session.getAttribute("id");
                   //  out.println(dep);
                     
                  MyDB db=new MyDB();
                   Connection con=db.getCon();
                   try{
                       Statement stmt=con.createStatement();
                       ResultSet rs=stmt.executeQuery("select Dep, Pass from admin where Dep='"+dep+"' and Pass='"+oldpass+"'"  );
                       
                       if(rs.next()){
                           if(newpass.equals(conpass)){
                           String sql=" update admin set Pass ='"+newpass+"', Ques='"+que+"',Ans='"+ans+"' where Dep='"+dep+"'";
                         
                           PreparedStatement pst = con.prepareStatement(sql);
                           pst.executeUpdate();
                         request.setAttribute("al", "Yes");
                         request.getRequestDispatcher("update.jsp").forward(request, response);
                           }else{ 
                          request.setAttribute("al", "Not");
                         request.getRequestDispatcher("update.jsp").forward(request, response);
                           }
                       }else{
                         request.setAttribute("al", "Wrong");
                         request.getRequestDispatcher("update.jsp").forward(request, response);  
                         
                       }
                   }catch (SQLException ex) {
                Logger.getLogger(UdatePass.class.getName()).log(Level.SEVERE, null, ex);
            }
                   
                   
                  
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UdatePass.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UdatePass.class.getName()).log(Level.SEVERE, null, ex);
        }
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
