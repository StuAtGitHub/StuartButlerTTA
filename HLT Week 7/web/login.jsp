

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="layout1.css">
        <title>Login Page</title>
    </head>
    <body>
    <center>
        
        <h1>Welcome Student - Please log in</h1>
            
        <hr/>    
        <form method="post" action="loginServlet">
            
            <table>
                
                    <tr>
                        <td>User name</td>
                        <td><input type="text"name="uname" value=""></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password"name="upass" value=""></td>
                    </tr>
                    <tr>
                        <td><input class="mybutton" type="submit" value="Login"</td>
                        <td><input class="mybutton" type="reset" value="Reset"</td>
                    </tr>
                
            </table>

        </form>
        
    </center>
    </body>
</html>
