<%-- 
    Document   : usuarioUpdate
    Created on : 08/04/2016, 04:36:42 PM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
       


        <!-- Bootstrap Core CSS -->
        <link href="${bowerComponent}" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="${metisMenu}" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${adminsb}" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${font}" rel="stylesheet" type="text/css">
     
    

    </head>

    <body>

        <%@include file="header.jsp" %>
        <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-6 col-xs-6 col-xs-offset-2">
                        <h1 class="page-header text-center text-success">USUARIOS</h1>
                    </div>
                    <!-- /.col-lg-6 -->
                </div>
                <div class="row">
                    <div role="form" class="panel panel-green">
                        <div class="panel-heading">
                            <label>FORMULARIO: ACTUALIZAR USUARIO</label>
                        </div>
                        <sp:form  role="form" modelAttribute="usuario" action="/SISWISP/usuario/update" >
                            <div class="panel-body">  
                                <div class="row">
                                    <h2 class="text-danger text-center">Datos Personales</h2>
                                    <div class="col-lg-6">
                                        <div class="form-group hide">
                                            <label class="">ID:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                                                <sp:input path="id" type="text" value="${usuario.id}" class="form-control disabled" placeholder="Ejm: 00:A2:BC:34:12:8C" /> 
                                            </div>
                                        </div> 
                                        <div class="form-group">
                                            <label class="">Nombres</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><b>N</b></span>
                                                <sp:input path="nombre" value="${usuario.nombre}" type="text" class="form-control " placeholder="Ingrese el  nombre" /> 
                                            </div>
                                        </div>      
                                        <div class="form-group">
                                            <label class="">Apellidos</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-font"></i></span>
                                                    <sp:input path="apellido" value="${usuario.apellido}" type="text" class="form-control " placeholder="Ingrese su apellido" /> 
                                            </div>
                                        </div>


                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="">Celular</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-phone"></i></span>
                                                    <sp:input path="telefono" value="${usuario.telefono}" type="tel" class="form-control " placeholder="Ejm: 981973093" /> 
                                            </div>
                                        </div> 
                                        <div class="form-group">
                                            <label class="">Dirección</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-home"></i></span>
                                                    <sp:input path="direccion" value="${usuario.direccion}" type="text" class="form-control " placeholder="Ejm: Av. Circunvalación N° 601" /> 
                                            </div>
                                        </div>  

                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col-xs-3 col-xs-offset-3 col-lg-offset-3">
                                        <button type="submit" class="btn btn-circle btn-lg btn-info" id="boton-submit">
                                            <i class="fa fa-check"></i>
                                        </button>
                                    </div>
                                    <div class="col-xs-3 ">
                                        <button type="reset" class="btn btn-circle btn-lg btn-danger">
                                            <i class="fa fa-close"></i>
                                        </button>
                                    </div>
                                </div>

                            </sp:form> 
                        </div>
                    </div>
                </div>


                <!-- /.row -->

                <!-- /.container-fluid -->
            </div>
            <!-- /#page-wrapper -->
            <%@include  file="footer.jsp" %>   

    </body>

</html>

