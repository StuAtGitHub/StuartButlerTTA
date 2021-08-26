/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tta.controller;

import com.tta.model.MyConnection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author rach2
 */
@MultipartConfig
public class NewBook extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) 
{//try with resources start
            
          
            // get a connection
            Connection con = MyConnection.connect();
            
            //build a prepared statement
            String qry = "insert into Books(BookID,BookTitle,BookAuthor,BookCopiesIn,BookCopiesOut) values(?,?,?,?,?)";
            //String qry = "insert into Books(BookID,BookTitle,BookAuthor,BookCopiesIn,BookCopiesOut,BookImage) values(?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(qry);//query getting pre-compile
            
            //get our variables and set them to the prepared statement
            stmt.setInt(1,Integer.parseInt(request.getParameter("bid")));
            stmt.setString(2,request.getParameter("btitle"));
            stmt.setString(3,request.getParameter("bauthor"));
            stmt.setInt(4,Integer.parseInt(request.getParameter("bcopies")));
            stmt.setInt(5,0);
            
            // try the photo part here as this is where things go wrong
            
            InputStream inputStream = null; 
            Part filePart = request.getPart("photo");
            if (filePart != null)
            {
                inputStream = filePart.getInputStream();
            }
            if (inputStream != null)
            {
                // not saving to database
                //stmt.setBlob(6, inputStream);
                
                // create our filename
                //String uploadPath = "C:/Users/rach2/Desktop/TTA/Project stuff/LibraryManagementSystem/web/images/bookimages/";
                
                
                //String fullFileName=uploadPath+"BookImageForBID"+request.getParameter("bid")+".jpg";
                String uploadPath = request.getServletContext().getRealPath("")+"\\images\\bookImages\\BookImageForBID"+request.getParameter("bid")+".jpg";
                
                
                
                //get an outputstream to our filename
                FileOutputStream fileout = new FileOutputStream(uploadPath);
                
                //write the data
                byte[] data = new byte[inputStream.available()];
                inputStream.read(data);
                fileout.write(data);
                fileout.close();//
                
                //System.out.println(uploadPath);
                
     }
        
     
        /// end of the part where i expect it to go wrong
            
            
          
            //exeute the query
            int r = stmt.executeUpdate();
            
            
            //if it worked then show the book display page else print an error
            if(r==1)
                {
                //response.sendRedirect("Books/ViewBooks.jsp");
               request.getRequestDispatcher("Books/ViewBooks.jsp").include(request, response); 
                }//if ends
        else    {
                out.print("Something wrong. Can not save record");
                }//else ends 
            
            
}   
        catch(Exception ex)
                {
            System.out.println("Insert error :"+ex);//print error on server logs
            }//catch ends
        
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
