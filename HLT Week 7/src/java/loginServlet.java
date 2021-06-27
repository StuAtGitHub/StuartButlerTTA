
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Statement;// to execute query
import java.sql.ResultSet;
import java.util.HashSet;
/**
 *
 * @author rach2
 */
public class loginServlet extends HttpServlet {
String uname,upass;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        //first get request parameters
            uname=request.getParameter("uname");
            upass=request.getParameter("upass");
            
            //here we would validate by database comparison
            String URL="jdbc:mysql://localhost:3306/tta?useSSL=false";// db location
            String user="root"; // db user name
            String pwd="MYSQLjw7090!";// db password
           
            Connection con;
            
            try{// connect to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, user, pwd);
            
            if (con!=null)
                    {
                    //out.print("Connection OK - somehow :)");
                    
                    Statement stmt = con.createStatement();
                    String qry = "select * from student where username='"+uname +"' and password='"+upass+"'";
                    ResultSet rs = stmt.executeQuery(qry);
                    
                    if (rs.isBeforeFirst())
                    {rs.next();
                        //out.print("user found");
                        //out.print(rs.getString(2));
                        HttpSession se = request.getSession();
                        // set current user data in session so we can display
                        se.setAttribute("myuser", rs.getString("firstName")+" "+rs.getString("lastName"));
                        se.setAttribute("myuserscore",rs.getString("score"));

                        //out.print("Welcome to "+uname);
                        request.getRequestDispatcher("profile.jsp").include(request, response);
            
                    }
                    else
                    {
                        out.print("<center><p class='errortext'>USER NAME OR PASSWORD INCORRECT</b></center><br/>");
                        request.getRequestDispatcher("login.jsp").include(request, response);
                    }
                    
                    }// endif
            else
                    {
                    out.print("Connection Not OK");
                    }// end else
            }
            catch(Exception ex)
                    {
                    out.print("Problem "+ex);
                    }
                    
            
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
