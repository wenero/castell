<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Campaña</title>
        <%@include file="/public/header.jsp" %>
        <script type="text/javascript">
            $(function () {
                $('#datepicker').datepicker({
                    format: 'mm/dd/yyyy'
                });
            });
        </script>
    </head>
    <body>
        <%@include file="/public/topbar.jsp" %>
        <div class="container-fluid">
            <div class="row">
                <%@include file="/public/menu.jsp" %>

                <!-- CONTENIDO -->
                <section class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

                    <h1 class="page-header">Nueva Campaña</h1>

                    <form method="post" action="<%=request.getContextPath()%>/campain/save" class="form-horizontal">

                        <input type="hidden" value="${campain.id}" name="id">

                        <div class="form-group">
                            <label class="col-sm-2 control-label">Nombres</label>

                            <div class="col-sm-10">
                                <input type="text" name="nombre" class="form-control" value="${campain.nombre}" >
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Fecha inicio</label>

                            <div class="col-sm-10">
                                <input type="text" name="fechaInicio" class="form-control" value="${campain.fechaInicio}">
                            </div>
                        </div>
                            
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Fecha fin</label>

                            <div class="col-sm-10">
                                <input type="text" name="fechaFin" class="form-control" value="${campain.fechaFin}" >
                            </div>
                        </div>
                        
                        <form:errors path="*" cssClass="errorblock" element="div" />

                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-primary">Guardar</button>
                                <a class="btn btn-link" href="<%=request.getContextPath()%>/campain"> Cancelar</a>
                            </div>
                        </div>
                    </form>

                </section>
                <!-- CONTENIDO -->
            </div>
        </div>
    </body>
    <%@include file="/public/footer.jsp" %>
</html>
