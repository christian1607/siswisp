</div>
<!-- /#wrapper -->

<!-- jQuery -->

<spring:url value="/resources/bower_components/jquery/dist/jquery.min.js" var="jquery"/> 
<spring:url value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js" var="bootstrapjs"/> 
<spring:url value="/resources/bower_components/metisMenu/dist/metisMenu.min.js" var="metisjs"/> 
<spring:url value="/resources/js/sb-admin-2.js" var="adminjs"/> 
<spring:url value="/resources/js/app.js" var="app"/> 
<spring:url value="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js" var="validator"/>       
                   
   

<script src="${jquery}"></script>

<!-- Bootstrap Core JavaScript -->

<script src="${bootstrapjs}"></script>
<!-- Metis Menu Plugin JavaScript -->

<script src="${metisjs}"></script>
<!-- Custom Theme JavaScript -->

<script src="${adminjs}"></script>
<script src="${validator}"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>

<script src="${app}" ></script>      