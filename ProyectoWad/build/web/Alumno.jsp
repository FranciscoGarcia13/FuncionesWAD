<%-- 
    Document   : Alumno
    Created on : 12/05/2017, 11:46:41 AM
    Author     : Enrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Alumno</title>
        <link rel="stylesheet" href="estilo.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container">
            <div id="icons">	
                <div id="IPN" class="logo"> <img src="images/ipnLogo.png"> </div>
                <div id="Escom" class="logo">  <img src="images/escomLogo.png">  </div> 
                <h1> Generador de Funciones </h1>
                <h2> Web Aplication Development </h2> 
            </div>
            
        <h1> Bienvendo Alumno </h1>
        <div>
            <a href="login.jsp" > Cerrar Sesion </a>
        </div>
        
        <!-- Generador de funciones -->
        <%
            String numS1 ;
            String numS2 ;
            String numS3 ;
            String dato =" ";
            // optenemos los operadores 
            String ope1 ;
            String ope2 ;
            String ope3 ;
            //valor del value
            int valor1=0;
            int valor2=0;
            int valor3=0;
            String operador1="";
            String operador2="";
            String operador3="";
            
        %>
        <div id="generador">
            <div id="funcion">
                <%
                    if(request.getParameter("cal")!= null){
                        // optenemos los valores numericos 
                        numS1 =request.getParameter("num1");
                        numS2 =request.getParameter("num2");
                        numS3 =request.getParameter("num3");
                       // optenemos los operadores 
                        ope1 = request.getParameter("op1");
                        ope2 = request.getParameter("op2");
                        ope3 = request.getParameter("op3");
                        
                        dato =" f(x)= X"+ope1+numS1+" "+ope2+numS2+" "+ope3+numS3+" ";
                        
                        valor1=Integer.parseInt(request.getParameter("num1"));
                        valor2=Integer.parseInt(request.getParameter("num2"));
                        valor3=Integer.parseInt(request.getParameter("num3"));
                        
                        operador1=request.getParameter("op1");
                        operador2=request.getParameter("op2");
                        operador3=request.getParameter("op3");
                        
                   // convertimos a entero 
                  /*  int numero1 = Integer.parseInt(numS1);
                    int numero2 = Integer.parseInt(numS2);
                    int numero3 = Integer.parseInt(numS3);*/
                        }
                %>
                <form action="Alumno.jsp" method="post">
                    <label>Evaluar : </label>
                    <input id="evaluar" name="evaluar">

                    <label> Y = </label>
                    <select class="operador" id="op1" name="op1" >
                        <option> <%= operador1 %> </option>
                        <option> + </option>
                        <option> - </option>
                        <option> * </option>
                        <option> / </option>
                    </select>
                    <input class="numero" id="num1" name="num1" type="number" min="1" max="99" value=<%= valor1 %>>

                    <select class="operador" id="op2" name="op2">
                        <option> <%= operador2 %> </option>
                        <option> + </option>
                        <option> - </option>
                        <option> * </option>
                        <option> / </option>
                    </select>
                    <input class="numero" id="num2" name="num2" type="number" min="1" max="99" value=<%= valor2 %>>

                    <select class="operador" id="op3" name="op3">
                        <option> <%= operador3 %> </option>
                        <option> + </option>
                        <option> - </option>
                        <option> * </option>
                        <option> / </option>
                    </select>
                    <input class="numero" id="num3" name="num3" type="number" min="1" max="99" value=<%= valor3 %>>

                    <input type="submit" value="Evaluar Funcion " name="cal"> 
                    <input type="reset" value="Restaurar">
                    
               </form>
               <div id="resultado">
                   <h1>
                       <%= dato %>
                   </h1>
               </div>
            </div>
        </div>
        
        </div>
    </body>
</html>
