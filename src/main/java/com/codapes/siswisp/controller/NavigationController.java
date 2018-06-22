package com.codapes.siswisp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/navigator")
public class NavigationController {

   

    @RequestMapping(value = "/index")
    public String goForm() {

      return "index";
    }

   


   

   }
