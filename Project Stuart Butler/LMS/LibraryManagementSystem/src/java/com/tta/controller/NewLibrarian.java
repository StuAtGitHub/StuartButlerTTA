
package com.tta.controller;

import com.tta.model.MyConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 16177215)
public class NewLibrarian extends HttpServlet {

private static final int BUFFER_SIZE = 4096;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int LibrarianID = Integer.parseInt(request.getParameter("LibrarianID"));
            String LibrarianFName = request.getParameter("LibrarianFName");
            String LibrarianSName = request.getParameter("LibrarianSName");

            String LibrarianUName = request.getParameter("LibrarianUName");
            String LibrarianPassword = request.getParameter("LibrarianPassword");

            InputStream inputStream = null;

            Part filePart = request.getPart("LibrarianImage");
            if (filePart != null) {
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());

                inputStream = filePart.getInputStream();
            }//if ends

            Connection con = null;
            String message = null;
            try {

                con = MyConnection.connect();
                String qry = "insert into Librarians(LibrarianID,LibrarianFName,LibrarianSName,LibrarianImage,LibrarianUName,LibrarianPassword) values(?,?,?,?,?,?)";
                PreparedStatement stmt = con.prepareStatement(qry);

                stmt.setInt(1, LibrarianID);
                stmt.setString(2, LibrarianFName);
                stmt.setString(3, LibrarianSName);
                stmt.setString(5, LibrarianUName);
                stmt.setString(6, LibrarianPassword);

                if (inputStream != null) {

                    stmt.setBlob(4, inputStream);

                }//if ends

                int row = stmt.executeUpdate();
                if (row > 0) {
                    out.print("File uploaded and saved into database");
                   // request.getRequestDispatcher("Librarian/display.jsp").forward(request, response);
                   response.sendRedirect("Librarian/display.jsp");
                }//if ends

            }//try ends
            catch (SQLException ex) {
                message = "ERROR: " + ex.getMessage();
                ex.printStackTrace();
            } finally {
                if (con != null) {
                    try {
                        con.close();
                    }//try ends
                    catch (SQLException ex) {

                    }//catch ends
                }//if ends

            }//finally ends
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
