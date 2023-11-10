<%-- 
    Document   : cadfun
    Created on : 10 de nov. de 2023, 10:23:41
    Author     : joao.vmatulis
--%>

<%@page import="java.util.List"%>
<%@page import="model.Departamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            List<Departamento> listaDepartamentos = (List<Departamento>)request.getAttribute("listaDepartamentos");
        %>
        <form id="formFun" method="post" action="ControleFuncionario">
            <input type="hidden" name="flag" value="cad">
            <p>
                <label for="eml">Email *</label>
                <input id="eml" type="text" name="email" size="45" maxlength="45" required>
            </p>
            <p>
                <label for="nom">Nome *</label>
                <input id="nom" type="text" name="nome" size="70" maxlength="70" required>
            </p>
            <p>
                <label for="tel">Telefone</label>
                <input id="tel" type="tel" name="telefone" size="15" maxlength="15">
            </p>
            <p>
                <label for="car">Cargo</label>
                <input id="car" type="text" name="cargo" size="45"  maxlength="45">
            </p>
            <p>
                <label for="sal">Salario</label>
                <input id="sal" type="number" step="0.1" name="salario">
            </p>
            <p>
                <label for="idDep">Departamento</label>
                <select id="idDep" name="cargo">
                    <%
                        for(Departamento dep: listaDepartamentos){
                    %>
                    <option value="<%= dep.getIdDep()%>"><%= dep.getNomeDep()%></option>
                    <%
                        }
                    %>
                </select>
            </p>
            <p>
                <input type="submit" value="Cadastrar">
            </p>
        </form> 
    </body>
</html>
