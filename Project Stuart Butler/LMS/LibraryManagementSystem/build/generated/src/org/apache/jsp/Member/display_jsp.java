package org.apache.jsp.Member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.tta.model.MyConnection;
import java.sql.Connection;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("        Arcana by HTML5 UP\n");
      out.write("        html5up.net | @ajlkn\n");
      out.write("        Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Library Management System</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta\n");
      out.write("            name=\"viewport\"\n");
      out.write("            content=\"width=device-width, initial-scale=1, user-scalable=no\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" />\n");
      out.write("    </head>\n");
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
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Books/home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Books/AddBook.jsp\">Add Book</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Books/ViewBooks.jsp\">View Books</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Books/Issue.jsp\">Issue Book</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Books/Return.jsp\">Return Book</a></li>\n");
      out.write("                        <li class=\"current\"><a href=\"display.jsp\">Members</a></li>\n");
      out.write("                        <li><form action=\"");
      out.print(request.getContextPath());
      out.write("/logout\" method=\"post\"><input type=\"submit\" value=\"Logout\" id=\"logout-button\"/></form></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Main -->\n");
      out.write("            <section class=\"wrapper style1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div id=\"content\">\n");
      out.write("                        <!-- Content -->\n");
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <header>\n");
      out.write("                                <h2>VIEW ALL MEMBERS</h2>\n");
      out.write("                            </header>\n");
      out.write("                            <!--DB code to display all records-->\n");
      out.write("                            ");

                                try {

                                    Connection con = MyConnection.connect();//get connection
                                    Statement stmt = con.createStatement();//create statement
                                    String qry = "Select * from Members";//select query to display all records
                                    ResultSet rs = stmt.executeQuery(qry);//execute query
                            
      out.write("\n");
      out.write("                            <table id=\"table-style\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Member ID</th>\n");
      out.write("                                        <th>First Name</th>\n");
      out.write("                                        <th>Second Name</th>\n");
      out.write("                                        <th>Profile Picture</th>\n");
      out.write("                                        <th>User Name</th>\n");
      out.write("                                        <th>Password</th>\n");
      out.write("                                        <th>Contact Number</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                \n");
      out.write("                                ");

                                    //get one by one record from Result
                                    while (rs.next()) {
                                
      out.write(" \n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>");
      out.print( rs.getInt(1));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getBlob(4));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getString(6));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print( rs.getInt(7));
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                                ");

                                    }//while ends
                                
      out.write("       \n");
      out.write("                            </table>        \n");
      out.write("                            ");

                                }//try ends
                                catch (Exception ex) {
                                    System.out.println("Display error :" + ex);
                                }//catch ends

                            
      out.write("\n");
      out.write("                            <header>\n");
      out.write("                                <h2>ADD MEMBER</h2>\n");
      out.write("                            </header>\n");
      out.write("                            <form name=\"fileform\" action=\"");
      out.print(request.getContextPath());
      out.write("/AddMember\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                <table border=\"1\" cellpadding=\"15\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Member ID: <input type=\"text\" name=\"MemberID\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>First Name: <input type=\"text\" name=\"MemberFName\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td >Second Name: <input type=\"text\" name=\"MemberSName\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td >Profile Picture: \n");
      out.write("                                            <input type=\"file\" size=\"50\" name=\"MemberImage\" id=\"custom-upload\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>User Name<input type=\"text\" name=\"MemberUName\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Password<input type=\"password\" name=\"MemberPassword\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Contact Number<input type=\"number\" name=\"MemberContact\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><input type=\"submit\" value=\"Add\"/></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                           \n");
      out.write("                        </center>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
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
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.dropotron.min.js\"></script>\n");
      out.write("        <script src=\"js/browser.min.js\"></script>\n");
      out.write("        <script src=\"js/breakpoints.min.js\"></script>\n");
      out.write("        <script src=\"js/util.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
