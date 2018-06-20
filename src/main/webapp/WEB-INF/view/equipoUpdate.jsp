<%-- 
    Document   : equipoUpdate
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
                        <h1 class="page-header text-center text-danger">EQUIPOS</h1>
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
                        <label>FORMULARIO: ACTUALIZAR EQUIPO</label>
                    </div>
                    <sp:form  role="form" modelAttribute="equipo" action="/SISWISP/equipo/update" >
                        <div class="panel-body">  
                           
                               <h2>Datos del Equipo</h2> 
                            
                            <div class="row">
                               
                                    <div class="col-lg-6">
                                        
                                        <div class="form-group hide">
                                            <label class="">ID:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                                                <sp:input path="id" type="text" value="${equipo.id}" class="form-control disabled" placeholder="Ejm: 00:A2:BC:34:12:8C" /> 
                                            </div>
                                        </div>
                                        <div class="form-group hide">
                                            <label class="">ID:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                                                <sp:input path="id" type="text" value="${equipo.usuario}" class="form-control disabled" placeholder="Ejm: 00:A2:BC:34:12:8C" /> 
                                            </div>
                                        </div> 
                                        
                                        <div class="form-group">
                                            <label class="">Equipo:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-tablet"></i></span>
                                                <sp:select path="nombre" class="form-control">
                                                    <sp:option value="">--Seleccione--</sp:option>
                                                    <sp:option value="NanoStation M5">NanoStation M5</sp:option>
                                                    <sp:option value="NanoStation M5 Loco">NanoStation M5 Loco</sp:option>
                                                    <sp:option value="AirGrid">AirGrid</sp:option>
                                                    <sp:option value="LiteBean ">LiteBean </sp:option>
                                                    <sp:option value="PowerBean">PowerBean</sp:option>
                                                    
                                                </sp:select>
                                                
                                            </div>
                                        </div>   
                                        
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="">Direccion IP:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-android"></i></span>
                                                <sp:input path="ip" type="text"  value="${equipo.ip}" class="form-control " placeholder="Ejem: 192.168.1.123" /> 
                                            </div>
                                        </div> 
                                        <div class="form-group">
                                            <label class="">MAC:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-maxcdn"></i></span>
                                                <sp:input path="mac" type="text" value="${equipo.mac}" class="form-control " placeholder="Ejm: 00:A2:BC:34:12:8C" /> 
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
