<%-- 
    Document   : cuentaUsuarioUpdate
    Created on : 26/04/2016, 09:22:32 PM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
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
                        <h1 class="page-header text-center text-danger">CUENTAS DE USUARIOS</h1>
                    </div>
                    <!-- /.col-lg-6 -->
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="alert alert-${tipoMensaje}">
                            <p>${msg}</p>
                        </div>

                    </div>
                </div>

                <div class="row">
                    <div role="form" class="panel panel-green">
                        <div class="panel-heading">
                            <label>FORMULARIO: ACTUALIZAR CUENTA USUARIO</label>
                        </div>
                        <sp:form  role="form" modelAttribute="cuentaUsuario" action="/SISWISP/cuentaUsuario/update">
                            <div class="panel-body">  

                                <h2>Datos de la cuenta de Usuario</h2> 

                                <div class="row">

                                    <div class="col-lg-6">
                                        <div class="form-group hide">
                                            <label class="">Usuario</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                                    <sp:input path="id" value="${cuentaUsuario.id}" type="text" class="form-control "/> 
                                                    <sp:input path="usuario" value="${cuentaUsuario.usuario}" type="text" class="form-control " /> 
                                            </div>
                                        </div> 
                                         
                                        <div class="form-group">
                                            <label class="">Usuario</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                                    <sp:input path="user" value="${cuentaUsuario.user}" type="text" class="form-control " placeholder="Ingrese el  nombre de su usuario" /> 
                                            </div>
                                        </div>   
                                        <div class="form-group">
                                            <label class="">Contraseña</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                                    <sp:input path="password" value="${cuentaUsuario.password}" type="password" class="form-control " placeholder="Ingrese su contraseña" /> 
                                            </div>
                                        </div> 
                                        <div class="form-group">
                                            <label class="">Confirmar contraseña</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                                <input  type="password" value="" class="form-control " placeholder="Ingrese su contraseña nuevamente" /> 
                                            </div>
                                        </div> 
                                        <div class="form-group">
                                            <label class="">Velocidad:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-signal"></i></span>
                                                    <sp:select path="velocidad" class="form-control">
                                                        <sp:option value="1 MB">1 MB</sp:option>
                                                        <sp:option value="2 MB">2 MB</sp:option>
                                                        <sp:option value="3 MB">3 MB</sp:option>
                                                        <sp:option value="4 MB">4 MB</sp:option>
                                                        <sp:option value="5 MB">5 MB</sp:option>
                                                </sp:select>
                                            </div>
                                        </div>

                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="">Pago Mensual:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                                                    <sp:input path="pagoMensual" value="${cuentaUsuario.pagoMensual}" type="number" class="form-control "/> 
                                            </div>
                                        </div> 
                                        <div class="form-group">
                                            <label class="">Fecha de Inicio:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                    <sp:input path="fechaInicio"   placeholder="Ejem: 16/07/1993" class="form-control "/>

                                            </div>
                                        </div> 
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col-xs-3 col-xs-offset-3 col-lg-offset-3">
                                        <button type="submit" class="btn btn-circle btn-lg btn-info">
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
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->


        <%@include file="footer.jsp" %>
    </body>
</html>
