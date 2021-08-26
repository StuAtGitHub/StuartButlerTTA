
package com.tta.controller;

import com.tta.model.LibrarianQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateLibrarian extends HttpServlet {

    int LibrarianID;
    String LibrarianUName;
    String LibrarianPassword;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            LibrarianID = Integer.parseInt(request.getParameter("LibrarianID"));
            LibrarianUName = request.getParameter("LibrarianUName");
            LibrarianPassword = request.getParameter("LibrarianPassword");
            
            int ul = LibrarianQuery.update(LibrarianUName, LibrarianPassword, LibrarianID);
            
           if(ul == 1){
                out.print("Record updated");
                response.sendRedirect("Librarian/display.jsp");
            }
            else{
                out.print("Something went wrong. Can not update record");
                //request.getRequestDispatcher("update.jsp").forward(request, response);
                response.sendRedirect("Librarian/update.jsp");
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
