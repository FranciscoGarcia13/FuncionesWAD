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
                <label class="control-label">Agregar Nuevo Usuario </label>
                <s:form action="Insertar" >
                    <%--<s:textfield name="idUsr" key="id:" /> --%>
                    <s:textfield name="nombre" key="User " /> 
                    <s:textfield name="password" key="Password " />      
                    <s:textfield name="correo" key="Correo " /> 
                    <s:combobox name="tipoUsr" key="Tipo de usuario " headerKey="1" headerValue="--- Selecione tipo ---"
                                list="{'Alumno','Profesor','Administrador'}"  />
                    <s:submit value="Insertar" />
                    <s:actionmessage  />
                </s:form>
               <div>
                    <a href="Administrador.jsp" > Back </a>
               </div> 
            </fieldset>
    </div> 
        
    </body>
</html>

