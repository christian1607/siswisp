<%-- 
    Document   : login
    Created on : 07/04/2016, 09:45:00 PM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SISWISP</title>

        <spring:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" var="bowerComponent"/> 
        <spring:url value="/resources/bower_components/metisMenu/dist/metisMenu.min.css" var="metisMenu"/> 
        <spring:url value="/resources/css/sb-admin-2.css" var="adminsb"/> 
        <spring:url value="/resources/bower_components/font-awesome/css/font-awesome.min.css" var="font"/> 
        <spring:url value="/resources/css/style.css" var="style"/>


        <!-- Bootstrap Core CSS -->
        <link href="${bowerComponent}" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="${metisMenu}" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${adminsb}" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${font}" rel="stylesheet" type="text/css">

        <link href="${style}" rel="stylesheet" type="text/css">


    </head>

    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <h2 class="text-justify">SISTEMA DE CONTROL DE PROVEEDORES DE INTERNET - SISWISP</h2>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-7">

                    <div class="login-panel panel panel-red">
                        <div class="panel-heading">
                            <h3 class="panel-title text-center">Registrarse</h3>
                        </div>
                        <div class="panel-body">

                            <sp:form method="POST" 
                                     action="${pageContext.request.contextPath}/login-auth">
                                <fieldset>
                                    <div class="form-group input-group">
                                        <span class="input-group-addon">
                                            <i class="fa fa-user"></i>
                                        </span> 
                                        <input class="form-control"  placeholder="Usuario" name="username" type="text"/>
                                    </div>
                                    <div class="form-group input-group">
                                        <span class="input-group-addon">
                                            <i class="fa fa-key"></i>
                                        </span> 
                                        <input type="password" class="form-control" placeholder="Password" name="password"/>
                                    </div>
                                    <c:if test="${param.error !=null}">
                                        <div class="row">
                                            <div class="col-lg-12">
                                                <div class="alert alert-danger">
                                                    <p>Usuario o Contrasenia incorrectos</p>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>

                                    <div class="checkbox">
                                        <label>
                                            <input name="remember" type="checkbox" value="Guardar Datos">Recuerdame
                                        </label>
                                    </div>
                                    <input type="submit" class="btn btn-success btn-lg btn-block" value="Login"/>
                                </fieldset>
                            </sp:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <%@include file="footer.jsp" %>

    </body>

</html>
