<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Clientes</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">
</head>
<body>
<div class="container">

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">ID</th>
            <th scope="col">Año</th>
            <th scope="col">Cantidad Feriados</th>
            <th scope="col">Dias Totales</th>
            <th scope="col">Dias laborales</th>
        </tr>
        </thead>
        <c:forEach var="fecha" items="${listaFecha}" >
            <tr>
                <th>id</th>
                <th scope="row">${fecha.id}</th>
                <td>${fecha.anio}</td>
                <td>${fecha.feriados}</td>
                <td>${fecha.diasTotales}</td>
                <td>${fecha.diasLaborales}</td>
                <td><a class="btn btn-danger" href="/fecha/eliminar/${fecha.id}" role="button">Eliminar</a></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>