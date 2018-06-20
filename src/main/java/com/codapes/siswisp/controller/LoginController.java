
package com.codapes.siswisp.controller ;


import com.codapes.siswisp.entity.Admin;
import com.codapes.siswisp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/login")
public class LoginController {
    
   @Autowired
   private LoginService loginService;
    
  
   
    
    @RequestMapping(value = "/goLogin")
    public ModelAndView goLogin() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        Admin admin = new Admin();
        mav.addObject("admin", admin);
        return mav;

    }
    
    
    @RequestMapping (value = "/login")
    public ModelAndView login(@ModelAttribute("admin") Admin admin){
    
        ModelAndView mav = new ModelAndView();
        Admin a;
        try {
            a=loginService.login(admin);
            if(a==null){
                mav.addObject("msg","Usuario o Contraseña inconrrectos.");
                mav.addObject("tipomensaje","danger");
                mav.setViewName("login");
            }
            else{
                mav.setViewName("form");
            }
          
        } catch (Exception e) {
           
        }
        
        return mav;
    }
    
}
