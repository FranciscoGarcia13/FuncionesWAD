<%-- 
    Document   : listado
    Created on : 11/05/2017, 11:13:05 PM
    Author     : Enrique
--%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <label class="control-label">Usuarios Registrados </label>
        <table class="info">
            <th> idUser </th>
            <th> Nombre </th>
            <th> Password </th>
            <th> correo </th>
            <th> tipoUser </th>
            <th> Eliminar </th>
            <th> Modificar </th>
            <s:iterator value="result">
            <tr>
                <td> <s:property value="idUsr" /> </td>
                <td> <s:property value="nombre" /> </td>
                <td> <s:property value="password" /> </td>
                <td> <s:property value="correo" /> </td>
                <td> <s:property value="tipoUsr" />  </td>
                <td> <s:url action="delete.action" var="url">
                        <s:param name="id">
                        <s:property value="idUsr" />
                        </s:param>
                     </s:url>
                    <a href="<s:property value="#url" />"> Down </a>
                </td>
                <td><s:url action="upuser.action" var="url2"> 
                        <s:param name="id">
                        <s:property value="idUsr" />
                        </s:param>
                     </s:url>
                     <a href="<s:property value="#url2" />">Modificar</a>
                </td>
            </tr> 
            </s:iterator>
        </table>     
        <div>
             <a href="Administrador.jsp" > Back </a>
        </div>
                </fieldset>
</body>
</html>
