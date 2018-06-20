package com.celmam.siswisp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/navigator")
public class NavigationController {

   

    @RequestMapping(value = "/goForm")
    public ModelAndView goForm() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("form");
        return mav;

    }

   


   

    //Usuario

    

     //Equipo
   

}
