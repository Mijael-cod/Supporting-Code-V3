
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author mijael
 */

@Controller
public class HomeController {
    
    @GetMapping()
    public String index(){
    return "index";
    }
    
}