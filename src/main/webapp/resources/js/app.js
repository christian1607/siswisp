

$(document).ready(function () {

    $("#txtPassword2").on("change", function () {
        var pass2 = $("#txtPassword2").val();
        var pass1 = $("#txtPassword1").val();

        $("#msgResultadoValidacionPass").remove();

        if (pass1 == pass2) {
            $("#resultadoContrasenia").append("<p id='msgResultadoValidacionPass' class='text-success'>Validacion contrasenia correcta.</p>");
        } else {
            $("#resultadoContrasenia").append("<p  id='msgResultadoValidacionPass' class='text-danger'>Contrasenias no coinciden.</p>");
        }

    });

    $("#txtPassword1").on("change", function () {
        var pass2 = $("#txtPassword2").val();
        var pass1 = $("#txtPassword1").val();

        $("#msgResultadoValidacionPass").remove();

        if (pass1 == pass2) {
            $("#resultadoContrasenia").append("<p id='msgResultadoValidacionPass' class='text-success'>Validacion contrasenia correcta.</p>");
        } else {
            $("#resultadoContrasenia").append("<p  id='msgResultadoValidacionPass' class='text-danger'>Contrasenias no coinciden.</p>");
        }

    });


    $("#txtPagoMensual").on("change", function () {
        var montoPagar = $("#txtPagoMensual").val();

        $("#msgResultadoValidacionPago").remove();

        if (montoPagar < 0) {
            $("#resultadoPago").append("<p id='msgResultadoValidacionPago' class='text-danger'>El monto a pagar no puede ser negativo.</p>");
        }

    });


    $("#boton-submit").on("click", function () {

        console.log("Presionaste Button");
    });




});


