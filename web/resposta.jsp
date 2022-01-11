<%-- 
    Document   : resposta
    Created on : 11/01/2022, 16:55:30
    Author     : Guilherme Gomes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Palavra Traduzida</title>
    </head>
    <body>
        <h1>A palavra ${param.palavra} traduzida para o português é:</h1>
        <h3>${palavra}</h3>
    </body>
</html>
