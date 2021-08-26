
package com.tta.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Login extends HttpServlet {

   String Uname;
   String password;
   String usertype;
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String URL = "jdbc:mysql://localhost:3306/libraryprojectdb?autoReconnect=true&useSSL=false"; //DB Location
            String user = "root";
            String pwd = "250602J#b";
            
            Connection con = DriverManager.getConnection(URL, user , pwd);
            
            Statement stmt = con.createStatement();
            
            Uname = request.getParameter("username");
            password = request.getParameter("pass");
            usertype = request.getParameter("usertype");
            
            if (usertype.equals("Admin")) {
                
                //check from admin table
                String qry = "select * from administrators where AdminUname='"+Uname+"' and Adminpassword='"+password+"'";
               
                ResultSet rs1 = stmt.executeQuery(qry);

                if (rs1.next()) {
                    HttpSession se = request.getSession();

                    se.setAttribute("Myuser", Uname);

                    out.print("Welcome " + Uname);
                    response.sendRedirect("Librarian/admin.jsp");
                    //request.getRequestDispatcher("Librarian/admin.jsp").include(request, response);

                } else 
                {
                    out.print("Sorry..can not login");
                    //out.print("<br/>");
                    //out.print("Try again");
                    response.sendRedirect("Login/login.jsp");
                   // request.getRequestDispatcher("Login/login.jsp").include(request, response);
                }
            } 
            else 
            {
                //check from the librarian table
                  String qry = "select * from librarians where LibrarianUName= '"+Uname+"' and LibrarianPassword ='"+password+"'";
                ResultSet rs1 = stmt.executeQuery(qry);

                if (rs1.next()) {
                    HttpSession se = request.getSession();

                    se.setAttribute("Myuser", Uname);

                    out.print("Welcome " + Uname);
                    response.sendRedirect("Books/home.jsp");
                    //request.getRequestDispatcher("Books/home.jsp").include(request, response);

                } else {
                    out.print("Sorry..can not login");
                    //out.print("<br/>");
                    //out.print("Try again");
                    response.sendRedirect("Login/login.jsp");
                    //request.getRequestDispatcher("Login/login.jsp").include(request, response);
                }
            }
            
            
            
            
        }//try ends
        catch(Exception ex){
            System.out.println("DB error :"+ex);
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
