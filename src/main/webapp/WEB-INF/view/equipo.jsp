<%-- 
    Document   : equipo
    Created on : 08/04/2016, 11:03:02 AM
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="sp" uri="http://www.springframework.org/tags/form" %>
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
                    <div class="col-lg-12">
                        <h1 class="page-header">EQUIPOS</h1>
                    </div>
                <div class="row">
                    <div class="col-lg-12">

                        <a href="/SISWISP/equipo/create" class="" >
                            <button type="button"  class="btn btn-primary btn-circle btn-lg">
                                <i class="fa fa-plus"></i>
                            </button>  Agregar Equipo
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
                    <div class="panel panel-yellow">
                        <div class="panel-heading">
                            <label>Lista de Equipos</label>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table  table-responsive table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr class="success">
                                            <th class="text-center">Nombre</th>
                                            <th class="text-center">MAC</th>
                                            <th class="text-center">IP</th>
                                            <th class="text-center">Usuario</th>
                                            
                                            <th class="text-center">Opciones</th>
                                        </tr>
                                        
                                    </thead>
                                    
                                    <tbody>
                                        <c:forEach items="${lista}" var="item">
                                         <tr class="odd gradeX ">
                                            
                                            <td>${item.nombre}</td>
                                            <td>${item.mac}</td>
                                            <td>${item.ip}</td>
                                            <td>${item.usuario.nombre}</td>
                                            
                                            <td class="center"><a href="/SISWISP/equipo/update/${item.id}"><span class="glyphicon glyphicon-refresh"></a></span>
                                               <a href="/SISWISP/equipo/delete/${item.id}"> <span class="glyphicon glyphicon-trash"></span></a></td>
                                        </tr>   
                                            
                                        </c:forEach> 
                                    
                                         
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                        
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->


        <%@include  file="footer.jsp" %>    
    
        </body>

</html>

