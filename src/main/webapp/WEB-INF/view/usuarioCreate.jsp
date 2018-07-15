<%-- 
    Document   : usuarioCreate
    Created on : 08/04/2016, 04:36:42 PM
    Author     : Christian
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <c:if test="${msg !=null}">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="alert alert-${tipoMensaje}">
                                <p>${msg}</p>
                            </div>

                        </div>
                    </div>
                </c:if>
                <div class="row">
                    <div role="form" class="panel panel-green">
                        <div class="panel-heading">
                            <label>FORMULARIO: REGISTRAR USUARIO</label>
                        </div>
                        <sp:form  id="formCreateUser" role="form" modelAttribute="usuarioModel" action="/SISWISP/usuario/create" >
                            <div class="panel-body">  
                                <div class="row">
                                    <div class="col-lg-6">
                                        <h2 class="text-danger">Datos Personales</h2>
                                        <div class="form-group">
                                            <label class="">Nombres</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><b>N</b></span>
                                                <sp:input path="nombreUsuario" type="text" class="form-control " required="true"   placeholder="Ingrese el  nombre" /> 
                                            </div>
                                        </div>      
                                        <div class="form-group">
                                            <label class="">Apellidos</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-font"></i></span>
                                                    <sp:input path="apellido" type="text" class="form-control " required="true" placeholder="Ingrese su apellido" /> 
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="">Celular</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-phone"></i></span>
                                                    <sp:input path="telefono" 
                                                              id="txtCelular"
                                                              name="txtCelular"
                                                              class="form-control "
                                                              required="true"
                                                              placeholder="Ejm: 981973093" /> 
                                            </div>
                                        </div>  
                                        <div class="form-group">
                                            <label class="">Dirección:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-home"></i></span>
                                                    <sp:input path="direccion" type="text" class="form-control " required="true" placeholder="Ejm: Av. Circunvalación N° 601" /> 
                                            </div>
                                        </div>  
                                        <h2 class="text-danger">Equipo</h2>
                                        <div class="form-group">
                                            <label class="">Equipos Disponibles:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-tablet"></i></span>
                                                    <sp:select path="equipo" class="form-control">
                                                        <c:forEach var="item" items="${listaEquipo}">
                                                            <sp:option value="${item.id}">${item.nombre} - ${item.ip}</sp:option>
                                                    </c:forEach>
                                                </sp:select>
                                            </div>
                                        </div>   

                                    </div>
                                    <div class="col-lg-6">
                                        <h2 class="text-danger">Datos de la Cuenta</h2>
                                        <div class="form-group">
                                            <label class="">Usuario</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                                    <sp:input path="user" type="text" class="form-control " required="true" placeholder="Ingrese el  nombre de su usuario" /> 
                                            </div>
                                        </div>   
                                        <div class="form-group">
                                            <label class="">Contraseña</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                                    <sp:input id="txtPassword1"  path="password" type="password" class="form-control " required="true" placeholder="Ingrese su contraseña" /> 
                                            </div>
                                        </div> 
                                        <div class="form-group" id="resultadoContrasenia">
                                            <label class="">Confirmar contraseña</label>
                                            <div class="input-group" >
                                                <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                                <input id="txtPassword2"  type="password" class="form-control " required="true" placeholder="Ingrese su contraseña nuevamente" /> 
                                            </div>

                                        </div> 
                                        <div class="form-group">
                                            <label class="">Velocidad:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-signal"></i></span>
                                                    <sp:select path="velocidad" required="true"   class="form-control">
                                                        <sp:option value="">--Seleccione--</sp:option>
                                                    <sp:option value="1 MB">1 MB</sp:option>
                                                    <sp:option value="2 MB">2 MB</sp:option>
                                                    <sp:option value="3 MB">3 MB</sp:option>
                                                    <sp:option value="4 MB">4 MB</sp:option>
                                                    <sp:option value="5 MB">5 MB</sp:option>
                                                </sp:select>
                                            </div>
                                        </div>
                                        <div class="form-group" id="resultadoPago">
                                            <label class="">Pago Mensual:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                                                    <sp:input path="pagoMensual" 
                                                              required="true"
                                                              type="number"
                                                              class="form-control"
                                                              id="txtPagoMensual"/> 
                                            </div>
                                        </div> 
                                        <div class="form-group">
                                            <label class="">Fecha de Inicio:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
                                                <input name="fechaInicio" required="true"  type="date" placeholder="Ejem: 16/07/1993" class="form-control "/>

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


                    <!-- /.row -->

                    <!-- /.container-fluid -->
                </div>
                <!-- /#page-wrapper -->
                <%@include  file="footer.jsp" %>   

                </body>

                </html>

