
$(document).ready(function (){
    
    $("#txtPassword2").on("change",function (){
            var pass2=$("#txtPassword2").val();
            var pass1=$("#txtPassword1").val();
            
            if(pass1==pass2){
                $("#resultadoContrasenia").html("<p>sjdkjfdkfjd</p>");
            }
            else{
               $("#resultadoContrasenia").html("<p>sdssds</p>");
            }
            
    });
      
  
    $("#boton-submit").on("click",function (){
        
            console.log("Presionaste Button");
    });
    
});
    
