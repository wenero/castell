<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vendedor</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <%@include file="/public/topbar.jsp" %>
        <div class="container-fluid">
            <div class="row">
                <%@include file="/public/menu.jsp" %>

                <!-- CONTENIDO -->
                <section class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

                    <h1 class="page-header">Nuevo Vendedor</h1>

                    <form:form method="POST" commandName="persona" action="/adm/vendedor/save"  class="form-horizontal">
                        
                         <form:input type="hidden" path="id" name="id"/>
                        
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Paterno</label>

                            <div class="col-sm-10">
                                <form:input type="text" name="paterno" cssClass="form-control" path="paterno"/>
                                <form:errors path="paterno" cssClass="text-danger" />
                            </div>
                            
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">Materno</label>

                            <div class="col-sm-10">
                                <form:input type="text" name="materno" cssClass="form-control" path="materno"/>
                                <form:errors path="materno" cssClass="text-danger" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">Nombres</label>

                            <div class="col-sm-10">
                                <form:input type="text" name="nombres" cssClass="form-control" path="nombres"/>
                                <form:errors path="nombres" cssClass="text-danger" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">Email</label>

                            <div class="col-sm-10">
                                <form:input type="email" name="email" cssClass="form-control" path="email"/>
                                <form:errors path="email" cssClass="text-danger" />
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-primary">Guardar</button>
                                <a class="btn btn-link" href="<%=request.getContextPath()%>/adm/vendedor"> Cancelar</a>
                            </div>
                        </div>
                    </form:form>

                </section>
                <!-- CONTENIDO -->
            </div>
        </div>
    </body>
    <%@include file="/public/footer.jsp" %>
</html>