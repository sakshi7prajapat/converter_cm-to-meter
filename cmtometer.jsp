<%-- 
    Document   : converter1
    Created on : 5 Apr, 2021, 12:23:47 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="cmtometer" method="post">
            <input type="text" name="numD" placeholder="enter value"/>
            <br>
            <input type="submit" name="btnsubmit" value="cm"/>
            <input type="submit" name="btnsubmit1" value="meter"/>
        </form>
        <p>
         <%
           if(request.getParameter("q")!=null)
           {
             out.print(request.getParameter("q"));  
           }
         %>  
        </p>
    </body>
</html>

