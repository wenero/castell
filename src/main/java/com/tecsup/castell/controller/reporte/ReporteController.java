package com.tecsup.castell.controller.reporte;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("reporte")
public class ReporteController {
    
    @RequestMapping("excel")
    public String excel(Model model){
        Map<String, String> notas = new HashMap<String, String>();
        notas.put("Pablo", "12");
        notas.put("Maria", "14");
        notas.put("Suley", "20");
        notas.put("Jackeline", "18");
        notas.put("Eduardo", "19");
        notas.put("Williams", "17");
        notas.put("Liam", "20");
        notas.put("Alejandro", "16");
        notas.put("Sofia", "18");
        notas.put("Robin", "16");
        
        model.addAttribute("reporteNotas", notas);
        return "reporteExcel";
    }
    
    @RequestMapping("pdf")
    public String pdf(Model model){
        Map<String, String> notas = new HashMap<String, String>();
        notas.put("Pablo", "12");
        notas.put("Maria", "14");
        notas.put("Suley", "20");
        notas.put("Jackeline", "18");
        notas.put("Eduardo", "19");
        notas.put("Williams", "17");
        notas.put("Liam", "20");
        notas.put("Alejandro", "16");
        notas.put("Sofia", "18");
        notas.put("Robin", "16");
        
        model.addAttribute("reporteNotas", notas);
        return "reportePdf";
    }
}
