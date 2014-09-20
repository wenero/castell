package com.tecsup.castell.controller.campain;

import com.tecsup.castell.model.Campain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("campain")
@RequestMapping("campain")
public class CampainController {
    
    @Autowired
    CampainService service;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("campains", service.all());
        return "campain/index";
    }
    
    @RequestMapping("create")
    public String create(Model model) {
        model.addAttribute("campain", new Campain());
        return "campain/formulario";
    }

    @RequestMapping("update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        Campain campain = service.find(id);
        if(campain==null){
            return  "redirect:/campain";
        }
        model.addAttribute("campain", campain);
        return "campain/formulario";
    }

    @RequestMapping("save")
    public String save(@ModelAttribute Campain campain, Model model) {
        try {
            service.save(campain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/campain";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);
        return "redirect:/campain";
    }
    
}
