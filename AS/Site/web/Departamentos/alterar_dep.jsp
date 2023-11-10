<%@page import="model.Departamento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alteração de departamento</title>
    </head>
    <body>
        <%
            Departamento dep = (Departamento)request.getAttribute("dep");
        %>
        <form id="formDep" method="post" action="ControleDepartamento">
            <input type="hidden" name="flag" value="alt">
            <p>
                <label for="id">Sigla do Departamento *</label>
                <input id="id" type="text" name="idDep" value="<%= dep.getIdDep()%>" maxlength="10" required>
            </p>
            <p>
                <label>Nome do Departamento *</label>
                <input id="nom" type="text" name="nomeDep" value="<%= dep.getNomeDep()%>" maxlength="70" required>
            </p>
            <p>
                <label>telefone do Departamento</label>
                <input id="tel" type="tel" name="telefoneDep" value="<%= dep.getTelefoneDep()%>" maxlength="15">
            </p>
            <p>
                <input type="submit" value="Salvar alterações">
            </p>
        </form>
    </body>
</html>
