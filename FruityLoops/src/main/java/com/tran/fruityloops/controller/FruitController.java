package com.tran.fruityloops.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tran.fruityloops.Fruits;

@Controller
public class FruitController {
	    @RequestMapping("/home")
	    public String index(Model model) {
	        
	        Fruits.add(new Fruits("Kiwi", 1.5));
	        Fruits.add(new Fruits("Mango", 2.0));
	        Fruits.add(new Fruits("Goji Berries", 4.0));
	        Fruits.add(new Fruits("Guava", .75));
	        // Add fruits your view model here
	        @RequestMapping("/")
	            model.addAttribute("name", "price");
	            return "index.jsp";
	    }
	}

