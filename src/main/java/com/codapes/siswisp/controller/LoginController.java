
package com.codapes.siswisp.controller ;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/login")
public class LoginController {
    
     private static final Logger LOG=Logger.getLogger(LoginController.class);

     
    @RequestMapping()
    public String goLogin() {
        return "login";
    }
    
    
   
}
