<%-- 
    Document   : pagoCreate
    Created on : 20/12/2016, 05:10:47 PM
    Author     : Christian
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
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
            <div class="row">
                <div class="col-lg-12">
                    <div class="alert alert-${tipoMensaje}">
                        <p>${msg}</p>
                    </div>

                </div>
            </div>
            <div class="container-fluid">
              
                <div class="row">
                    <div class="col-lg-6 col-xs-6 col-xs-offset-2">
                        <h1 class="page-header text-center text-danger">REGISTRO DE PAGOS</h1>
                    </div>
                    <!-- /.col-lg-6 -->
                </div>
                
                <div class="row">
                    <div role="form" class="panel panel-green">
                    <div class="panel-heading">
                        <label>FORMULARIO: REGISTRAR PAGO</label>
                    </div>
                    <sp:form  role="form" modelAttribute="pago" action="create" >
                        <div class="panel-body">  
                              <div class="row">
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="">Usuario:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-users"></i></span>
                                                <sp:select path="usuario" class="form-control">
                                                    <c:forEach var="item" items="${usuarios}">
                                                        <sp:option value="${item.id}"> ${item.nombre}  ${item.apellido} </sp:option>
                                                    </c:forEach>
                                                </sp:select>
                                                
                                            </div>
                                        </div>   
                                        <div class="form-group">
                                            <label class="">Monto:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-dollar"></i></span>
                                                <sp:input path="monto" type="number" class="form-control " placeholder="Ejm: 00:A2:BC:34:12:8C" /> 
                                            </div>
                                        </div> 
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form-group">
                                            <label class="">Concepto:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="fa fa-comments"></i></span>
                                                <sp:textarea rows="3" path="conceptoPago" type="text" class="form-control " placeholder="Ejem: Mensualidad de Internet" /> 
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
        <!-- /#page-wrapper -->

    </div>
        <!-- /#page-wrapper -->
       
        <%@include  file="footer.jsp" %>    
    </body>

</html>
