<%@page import="it.entity.Calciatore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Calciatore</title>
</head>
<body>
<%Calciatore c = (Calciatore)request.getAttribute("calciatore"); %>

<form method="post" action="/ProgettoCalcetto/gestione/calciatore/aggiorna">
Nome Calciatore:<input type="text" value="<%=c.getNome()%>" name="nome"><br>
Cognome Calciatore:<input type="text" value="<%=c.getCognome()%>" name="cognome"><br>
Ruolo Calciatore:<input type="text" value="<%=c.getRuolo()%>" name="ruolo"><br>

<input type="hidden" value="<%=c.getidCalciatore()%>" name="idCalciatore">
<input type="submit" value="modifica">
</form>
</body>
</html>