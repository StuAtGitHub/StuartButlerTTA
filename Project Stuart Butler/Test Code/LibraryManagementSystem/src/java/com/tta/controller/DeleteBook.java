/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tta.controller;

import com.tta.model.MyConnection;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rach2
 */
public class DeleteBook extends HttpServlet {

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
            
        // get connection
        Connection con= MyConnection.connect();
        // get the parameter of the book we are working with
        String IdToDelete = request.getParameter("bid");
              
        //create a resultset to check if any books are issued
        Statement myStmt=con.createStatement();
        ResultSet rs = myStmt.executeQuery("select * from books where BookID="+IdToDelete);     
        //System.out.println(myStmt);   
        
        rs.next();
        if (rs.getInt(5)<1)
        {
        String qry="delete from books where BookID="+IdToDelete;    
        myStmt.executeUpdate(qry);   
        qry=request.getServletContext().getRealPath("")+"\\images\\bookImages\\BookImageForBID"+IdToDelete+".jpg";
        File temp = new File(qry);
        // delete an image if one exists
        temp.delete();
        }
        /*
        
         
         //out.println(qry);
        //qry="C:/Users/rach2/Desktop/TTA/Project stuff/LibraryManagementSystem/web/images/bookimages/BookImageForBID"+IdToDelete+".jpg";
        
        
        
        }*/ // end of if
         //out.println(qry);
         response.sendRedirect("Books/ViewBooks.jsp");
         //request.getRequestDispatcher("Books/ViewBooks.jsp").forward(request, response);
        }
        catch(Exception ex)
        {
        
        System.out.println("Delete error :"+ex);
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
