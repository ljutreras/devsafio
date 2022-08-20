<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
            <!DOCTYPE html>
            <html lang="es">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Cliente</title>
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
            </head>

            <body>
                <div class="container">
                    
                    <form:form action="/fecha/guardar" method="post" modelAttribute="fecha">

                        <form:input path="anio" type="number" placeholder="Ingrese el año" />
                        <form:label path="anio">Año</form:label>
                        <br>
                        <form:input path="feriados" type="number" placeholder="Cantidad de feriados" />
                        <form:label path="feriados">Feriados</form:label>
                        <br>
                                                
                        <button type="submit" class="btn btn-primary">Guardar</button>
                    </form:form>

                </div>

            </body>

            </html>