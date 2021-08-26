
package com.tta.controller;

import com.tta.model.Issue;
import com.tta.model.IssueQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IssueBook extends HttpServlet {

    
    int BookIssued;
    int IssuedTo;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            BookIssued = Integer.parseInt(request.getParameter("BookIssued"));
            IssuedTo = Integer.parseInt(request.getParameter("IssuedTo"));
            
            Issue i = new Issue(BookIssued,IssuedTo);
            
            int ib = IssueQuery.issueBook(i); 
            
            if(ib == 1){
                
                //Increase BookCopiesOut by 1
                
                
                //Decrease BookCopiesIn by 1

                
                //out.print("Issue record saved");
                //request.getRequestDispatcher("display.jsp").forward(request, response);
                response.sendRedirect("Books/Issue.jsp"); //reload same page so data is added to table on  the same page
                
            }//if ends
            else{
                
                out.print("Something wrong. Can not save record");
                
            }//else ends
            
            
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
