
package  com.codapes.siswisp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/reporte")
public class ReporteController {
 
    @RequestMapping(value = "/goReportes")
    public ModelAndView goReportes() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("reporte");
        return mav;
    }
}
