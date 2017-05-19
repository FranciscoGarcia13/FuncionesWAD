<%-- 
    Document   : InsetarUser
    Created on : 12/05/2017, 03:28:24 PM
    Author     : Enrique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Administrador</title>
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
            
            <fieldset id="admin">
                <label class="control-label">Editar Usuario </label>
                <s:iterator value="result">
                <s:form action="actualizar" >
                    <s:textfield name="idUsr" key="id:" readonly="true"/> 
                    
                    <s:textfield name="nombre" key="User:" /> 
                    <s:textfield name="password" key="password:" />      
                    <s:textfield name="correo" key="Correo:" /> 
                    <s:textfield name="tipoUsr" key="tipo de  usuario:" />  
                    <s:submit value="Actualizar" />
                    <s:actionmessage  />
                </s:form>
                </s:iterator> 
               <div>
                    <a href="Administrador.jsp" > Back </a>
               </div> 
            </fieldset>
    </div> 
        
    </body>
</html>
