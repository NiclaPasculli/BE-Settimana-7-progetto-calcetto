<%@page import="it.entity.Calciatore"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elenco calciatori</title>
</head>
<body>

<h3>Lista Calciatori</h3>
<a href="/ProgettoCalcetto">Torna alla Home</a><br>
<a href="/ProgettoCalcetto/gestione/calciatore/add">Aggiungi un altro calciatore</a><br><br>
<%List<Calciatore> listaCalciatori = (List<Calciatore>)request.getAttribute("listaCalciatori"); %> 
<table>
<tr>
<th>Nome<th>Cognome<th>Ruolo<th>
</tr>
 <% for(Calciatore c : listaCalciatori) {%>
 <tr>
 <td><%=c.getNome() %>
 <td><%=c.getCognome() %>
 <td><%=c.getRuolo()%>
 <td><a href="/ProgettoCalcetto/gestione/calciatore/edit?id_calciatore=<%=c.getidCalciatore() %>">Modifica</a> | 
 	<a href="/ProgettoCalcetto/gestione/calciatore/delete?id_calciatore=<%=c.getidCalciatore() %>">Elimina</a>
 </tr>
 <%} %>
</table>
</body>
</html>