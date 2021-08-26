
package com.tta.controller;

import com.tta.model.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BookServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
             int bookId = Integer.parseInt(request.getParameter("bookID"));
            String actionName = request.getParameter("ir");
            System.out.println(actionName);
            System.out.println(bookId);
            
            int totalBook=0;
            int returnBook =0;
            
            Connection con = MyConnection.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from books where BookID="+bookId);
            if(rs.next())
            {
                totalBook = rs.getInt(5);//bookcopiesin
                returnBook= rs.getInt(6);//bookcpoiesout
            }
            
            if(actionName.equals("issue"))
            {
                if(totalBook > 0)
                {
                    totalBook--;
                    returnBook++;
                    st.executeUpdate("update books set BookCopiesIn="+totalBook+", BookCopiesOut="+returnBook+" where BookID="+bookId);
                }
                else{
                    out.print("Can not issue book");
                }
                
                
            }
            else
            {
                totalBook++;
                returnBook--;
                st.executeUpdate("update books set BookCopiesIn="+totalBook+", BookCopiesOut="+returnBook+" where BookID="+bookId);
            }
            
            
            response.sendRedirect("Books/viewBook.jsp");
            //request.getRequestDispatcher("viewBook.jsp").include(request, response);
        } catch (SQLException ex) {
            System.out.println(ex);
            
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
