<%-- 
    Document   : calculoFuncion
    Created on : 9/06/2017, 10:24:28 AM
    Author     : Enrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            /* optenemos los valores numericos */
            String numS1 =request.getParameter("num1");
            String numS2 =request.getParameter("num2");
            String numS3 =request.getParameter("num3");
            /* optenemos los operadores */
            String ope1 = request.getParameter("op1");
            String ope2 = request.getParameter("op2");
            String ope3 = request.getParameter("op3");
            /* convertimos a entero */
            Integer numero1 = Integer.parseInt(numS1);
            Integer numero2 = Integer.parseInt(numS2);
            Integer numero3 = Integer.parseInt(numS3);
            
           String dato =" f(x)= "+ope1;
        %>
        
        <%= dato %>
    </body>
</html>
