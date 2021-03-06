package com.tienda.controller;

import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ahora utilizamos MVC");
        var articulos=articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        
        /*Cliente articulo = new Cliente ("Anthony" , "Aguilera" , "anthonyag7@hotmail.com" , "85839617");
        Cliente articulo2 = new Cliente ("Pandolfo" , "Ramos" , "anthonyag7@hotmail.com" , "85839617");
        var articulos = Arrays.asList(articulo,articulo2);
        model.addAttribute("articulos",articulos);*/
        return "index";
    }
    
    
}
