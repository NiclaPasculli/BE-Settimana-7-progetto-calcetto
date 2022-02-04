<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Inserisci dati calciatore</h2>

<form method="post" action="/ProgettoCalcetto/gestione/calciatore/inserisci">
Nome Calciatore:<input type="text"  name="nome"><br>
Cognome Calciatore:<input type="text"  name="cognome"><br>
Ruolo Calciatore:<input type="text"  name="ruolo"><br>


<input type="submit" value="inserisci">
</form>

</body>
</html>