<%-- 
    Document   : usuario
    Created on : 08/04/2016, 10:56:36 AM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                        <div class="col-lg-12">
                            <h1 class="page-header text-center text-danger">USUARIOS</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <div class="row">
                        <div class="col-lg-12">

                            <a href="goUsuarioCreate" class="" >
                                <button type="button"  class="btn btn-primary btn-circle btn-lg">
                                    <i class="fa fa-plus"></i>
                                </button>  Registrar Usuario
                            </a> 
                        </div>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="alert alert-${tipoMensaje}">
                                <p>${msg}</p>
                            </div>

                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <label>Lista de Usuarios</label>
                                </div>
                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="dataTable_wrapper">
                                        <table class="table table-striped table-responsive  table-bordered table-hover" id="dataTables-example">
                                            <thead>
                                                <tr>
                                                    <th class="text-center">Nombre</th>
                                                    <th class="text-center">Apellidos</th>
                                                    <th class="text-center">Pago Mensual</th>
                                                    <th class="text-center">Fecha Inicio</th>
                                                    <th class="text-center">Telefono</th>
                                                    <th class="text-center">Dirección</th>
                                                    <th class="text-center">Opciones</th>
                                                </tr>

                                            </thead>

                                            <tbody>
                                                <c:forEach items="${lista}" var="item">
                                                    <tr class="odd gradeX">
                                                    <td>${item.nombre}</td>
                                                    <td>${item.apellido}</td>
                                                    <td>40</td>
                                                    <td>16-07/2016</td>
                                                    <td>${item.telefono}</td>
                                                    <td>${item.direccion}</td>
                                                    <td><a href="/SISWISP/usuario/update/${item.id}"><span class="glyphicon glyphicon-upload"></a></span>
                                                        <a href="/SISWISP/usuario/delete/${item.id}"> <span class="glyphicon glyphicon-trash"></span></a></td>
                                                </tr>
                                                </c:forEach>
                                                
                                               

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.container-fluid -->
                </div>
                <!-- /#page-wrapper -->

           <%@include  file="footer.jsp" %>   

           
           
            <spring:url value="/resources/bower_components/datatables/media/js/jquery.dataTables.min.js" var="dataTablejs"/> 
            <spring:url value="/resources/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js" var="dataTablebootstrapjs"/> 
            
            
            <script src="${dataTablejs}"></script>
            <script src="${dataTablebootstrapjs}"></script>

            <script>
                $(document).ready(function () {
                    $('#dataTables-example').DataTable({
                        responsive: true
                    });
                });
            </script>
    </body>

</html>

