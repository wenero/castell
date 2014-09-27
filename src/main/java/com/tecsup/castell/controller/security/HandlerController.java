package com.tecsup.castell.controller.security;

import com.tecsup.castell.helper.CastellException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class HandlerController {
    
    @ExceptionHandler(CastellException.class)
    public ModelAndView handlerCastellException(HttpServletRequest rq, Exception ex){
        ModelAndView VistaError = new ModelAndView();
        VistaError.setViewName("helper/error");
        VistaError.addObject("titulo", "Error de Proceso");
        VistaError.addObject("mensaje", ex.getMessage());
        return VistaError;
    }
    
    @ExceptionHandler(Exception.class)
    public ModelAndView handlerException(HttpServletRequest rq, Exception ex){
        ModelAndView VistaError = new ModelAndView();
        VistaError.setViewName("helper/error");
        VistaError.addObject("titulo", "Error crítico");
        VistaError.addObject("mensaje", ex.getMessage());
        return VistaError;
    }
    
}
