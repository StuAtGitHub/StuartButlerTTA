
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student results site</title>
        <link rel="stylesheet" type="text/css" href="layout1.css">
    </head>
    <body>
        
        
        <%
          // get current session
          HttpSession se =request.getSession(false);
          //out.print(se);
          //check if session is new or current
          if(se.getAttribute("myuser")==null)
          {
              
              
              request.getRequestDispatcher("login.jsp").include(request,response);
              
              out.print("<center><p class='errortext'>Please Log in</p></center>");
          }
          else
          {
          %>
          <h1>Welcome <%out.print(se.getAttribute("myuser"));%></h1>
                <hr/>
                <p>Your score on the exam was: <% out.print(se.getAttribute("myuserscore"));%></p>
                
                <hr/>
                <form action="logout">
                    <input type="submit" class="mybutton" value="logout"/>
                
                
           <% 
            }
           %>
        
    </body>
</html>
