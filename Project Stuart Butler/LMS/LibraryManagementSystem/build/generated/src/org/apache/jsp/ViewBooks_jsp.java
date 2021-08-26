package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import com.tta.model.MyConnection;

public final class ViewBooks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Library Management System</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"is-preload\">\n");
      out.write("        <div id=\"page-wrapper\">\n");
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
      out.write("                        <li class=\"current\"><a href=\"ViewBooks.jsp\">View Books</a></li>\n");
      out.write("                        <li><a href=\"issue.jsp\">Issue Book</a></li>\n");
      out.write("                        <li><a href=\"return.jsp\">Return Book</a></li>\n");
      out.write("                        <li><a href=\"Member/display.jsp\">Members</a></li>\n");
      out.write("                        <li><form action=\"/logout\" method=\"post\"><input type=\"submit\" value=\"Logout\" id=\"logout-button\"/></form></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Main -->\n");
      out.write("            <section class=\"wrapper style1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div id=\"content\">\n");
      out.write("                        <!-- Content --> \n");
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <header>\n");
      out.write("                                <h2>Current Library</h2>\n");
      out.write("                            </header>\n");
      out.write("                            <!--Database code to display all records-->\n");
      out.write("                            ");

                                try {

                                    Connection con = MyConnection.connect();//get connection
                                    Statement stmt = con.createStatement();//create statement
                                    String qry = "select * from Books";//select query to display all records
                                    ResultSet rs = stmt.executeQuery(qry);//execute query
                            
      out.write("   \n");
      out.write("                            <table id=\"table-style\">\n");
      out.write("                                <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>ID</th>\n");
      out.write("                                    <th>Title</th>\n");
      out.write("                                    <th>Author</th>   \n");
      out.write("                                    <th>Copies held</th>\n");
      out.write("                                    <th>Copies issued</th>\n");
      out.write("                                    <th>Cover</th>\n");
      out.write("                                </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                ");

                                    //get one by one record from ResultSet
                                    while (rs.next()) {
                                
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print( rs.getInt(1));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getString(3));
      out.write("</td> \n");
      out.write("                                    <td>");
      out.print( rs.getInt(5));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( rs.getInt(6));
      out.write("</td>\n");
      out.write("                                    <td><img alt=\"No image on file\" src=\"images/bookimages/BookImageForBID");
      out.print(rs.getInt(1));
      out.write(".jpg\" height=\"100px\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                                ");


                                    }//while ends
                                
      out.write("\n");
      out.write("                            </table>        \n");
      out.write("                            ");

                                }//try ends
                                catch (Exception ex) {
                                    out.println("Display error :" + ex);
                                }//catch ends

                            
      out.write("\n");
      out.write("                        </center>\n");
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
