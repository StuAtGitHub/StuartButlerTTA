package org.apache.jsp.Books;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import com.tta.model.MyConnection;

public final class viewBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Library Management System</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body  class=\"is-preload\">\n");
      out.write("         <div id=\"page-wrapper\">\n");
      out.write("            <!-- Header -->\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <h1>\n");
      out.write("                    <a href=\"home.jsp\" id=\"logo\">Library <em>Management System</em></a>\n");
      out.write("                </h1>\n");
      out.write("\n");
      out.write("                <!-- Nav -->\n");
      out.write("                <nav id=\"nav\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"AddBook.jsp\">Add Book</a></li>\n");
      out.write("                        <li class=\"current\"><a href=\"viewBook.jsp\">View Books 1</a></li>\n");
      out.write("                        <li><a href=\"ViewBooks.jsp\">View Books 2</a></li>\n");
      out.write("                        <li><a href=\"DeleteBook.jsp\">Delete Book</a></li>\n");
      out.write("                        <li><a href=\"Issue.jsp\">Issue Book</a></li>\n");
      out.write("                        <li><a href=\"Return.jsp\">Return Book</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Member/displaymembers.jsp\">Members</a></li>\n");
      out.write("                        <li><form action=\"");
      out.print(request.getContextPath());
      out.write("/logout\" method=\"post\"><input type=\"submit\" value=\"Logout\" id=\"logout-button\"/></form></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("                     <!-- Main -->\n");
      out.write("            <section class=\"wrapper style1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div id=\"content\">\n");
      out.write("                        <!-- Content --> \n");
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <header>\n");
      out.write("                                <h2>Current Library</h2>\n");
      out.write("                            </header>\n");
      out.write("                    \n");
      out.write("        ");

            try{
        Connection con = MyConnection.connect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from books");
        
                int bookID,bookIn,bookOut;
                String bookName,bookAuthor;
                
                int count =0;
                
            while(rs.next())
            {
                
                String filepath = "C://Users//yoliv//Desktop//TechTalent//LMS//LibraryManagementSystem//web//images//bookimages//FromDb"+count+".jpg";

                
                Blob blob = rs.getBlob("BookImage");
                InputStream inputStream1 = blob.getBinaryStream();//blob-> binary stream
                
                OutputStream outputStream = new FileOutputStream(new File(filepath));
                int bytesRead = -1;
                byte[] buffer = new byte[4096];
                while ((bytesRead = inputStream1.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                }   
                    
                inputStream1.close();
                outputStream.close();
                    
                bookID = Integer.parseInt(rs.getString(1));
                bookName = rs.getString(2);
                bookAuthor =rs.getString(3);
                bookIn = Integer.parseInt(rs.getString(5));
                bookOut = Integer.parseInt(rs.getString(6));
                
                
      out.write("\n");
      out.write("                \n");
      out.write("        <form action=\"");
      out.print(request.getContextPath());
      out.write("/book\">\n");
      out.write("\n");
      out.write("        <table border=\"1\">           \n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td><input type=\"text\" name=\"bookID\" value=");
      out.print( bookID);
      out.write("></td>\n");
      out.write("                    <td>");
      out.print( bookName);
      out.write("</td>\n");
      out.write("                    <td><img  width=\"200px\" height=\"200px\" src=\"FromDb");
      out.print( count);
      out.write(".jpg\"></td>\n");
      out.write("                    <td>");
      out.print( bookAuthor);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( bookIn);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( bookOut);
      out.write("</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"ir\" value=\"issue\"/>Issue Book</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"ir\" value=\"return\"/>Return Book</td>   \n");
      out.write("                    <td><input type=\"submit\" value=\"Update\"/></td>\n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("                ");

               count++; 
            }//while ends
            }//try ends
            catch(Exception ex)
            {
            System.out.println("book error: "+ex);
            }
            
      out.write("\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- Copyright -->\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li>&copy; Untitled. All rights reserved</li>\n");
      out.write("                    <li>Design: <a href=\"http://html5up.net\">HTML5 UP</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Scripts -->\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.dropotron.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/browser.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/breakpoints.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/util.js\"></script>\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
