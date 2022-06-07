package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tienda.domain.Cliente;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("Ahora utilizamos MVC");
        
        var clientes=clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        
        /*Cliente cliente = new Cliente ("Anthony" , "Aguilera" , "anthonyag7@hotmail.com" , "85839617");
        Cliente cliente2 = new Cliente ("Pandolfo" , "Ramos" , "anthonyag7@hotmail.com" , "85839617");
        var clientes = Arrays.asList(cliente,cliente2);
        model.addAttribute("clientes",clientes);*/
        return "index";
    }
}
