
package com.tta.controller;

import com.tta.model.Issue;
import com.tta.model.IssueQuery;
import com.tta.model.MyConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IssueBook extends HttpServlet {

    
       
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           //get the parameter for the book, get the number of books in library
           int bookID = Integer.parseInt(request.getParameter("BookID"));
           int memberID = Integer.parseInt(request.getParameter("MemberID"));
           int books_currently_in;
           int books_currently_out;
           //out.print("Book:"+bookID+" Member:"+memberID); 
           
           //get a connection and a resultset
           Connection con = MyConnection.connect();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from books where BookID="+bookID);
           
           // check if their are copies available to checkout
           rs.next();
           books_currently_in = rs.getInt(4);//bookcopiesin
           books_currently_out=rs.getInt(5);//bookcopies out
           
           //out.print(" books in:"+books_currently_in);
           
           if(books_currently_in>0)// is there a book available to issue
            {
               {
                //deduct 1 book from books in and add to books out
                books_currently_in--;
                books_currently_out++;
                st.executeUpdate("update books set BookCopiesIn="+books_currently_in+", BookCopiesOut="+books_currently_out+" where BookID="+bookID);
               // out.print("update books set BookCopiesIn="+books_currently_in+", BookCopiesOut="+books_currently_out+" where BookID="+bookID);
            
               //insert a new record into issues containg member and book id
               
               int r=st.executeUpdate("insert into issues (BookIssued,IssuedTo) values ("+ bookID+","+memberID+")");
                       
               
            }  
           response.sendRedirect("Books/Issue.jsp");
                
           }
           
           
           
           
        }
        catch (Exception ex) {
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
