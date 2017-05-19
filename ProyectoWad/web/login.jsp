<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" href="estilo.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div class="container">
            
            <div id="icons">	
                <div id="IPN" class="logo"> <img src="images/ipnLogo.png">  </div>
                <div id="Escom" class="logo"> <img src="images/escomLogo.png">  </div> 
                <h1> Generador de Funciones </h1>
                <h2> Web Aplication Development </h2> 
            </div>
            <label class="control-label">Iniciar Sesion </label>
            
            <s:form action = "Login" id="loginForm" method="post">
            <s:textfield name="nombre" key="Usuario"/>
            <s:password name ="password" key="Password"/>
            <s:submit value="Login" />
            <s:actionerror  />
               <!-- <fieldset id="login">

                    <div class="formu">
                        <label for="username" class="control-label">Usuario: </label>
                        <input type="text" class="in"  name="nombre" placeholder="Tu usuario" pattern="[a-zA-Z]+[0-9a-zA-Z]{1,25}" required/>
                    </div>

                    <div class="formu">
                        <label for="password" class="control-label">Password: </label>
                        <input type="password" class="in" name="password" placeholder="Tu password"  pattern="[a-zA-Z_0-9]{4,20}" required/>
                    </div>

                    <div class="formu" id="sel">
                        <label class="control-label">Tipo de usuario: </label>
                        <select class="selectpicker" name="tipoUser" required/>
                            <option>Alumno</option>
                            <option>Profesor</option>
                            <option>Administrador</option>
                        </select>
                    </div>

                    <div class="formu" id="btnIngresar">						
                        <input type="submit" name="ingreso" class="boton" value="Ingresar"> 

                    </div>
                </fieldset> -->
            </s:form>
         
        </div> 
        
    </body>
</html>