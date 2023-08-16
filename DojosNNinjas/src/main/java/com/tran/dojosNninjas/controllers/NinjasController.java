package com.tran.dojosNninjas.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tran.dojosNninjas.models.Dojo;
import com.tran.dojosNninjas.models.Ninja;
import com.tran.dojosNninjas.services.DojoService;
import com.tran.dojosNninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjasController {
	private final NinjaService ninjaService;
	private final DojoService dojoService;

	public NinjasController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}

	@RequestMapping("/ninjas/new")
	public String newNinja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}

	@RequestMapping(value = "/ninjas", method = RequestMethod.POST)
	public String create(Model model, @RequestParam(value = "dojo_id") Long dojo_id,
			@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "newNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			Ninja n = this.ninjaService.findNinja(ninja.getId());
			Dojo d = this.dojoService.findDojo(dojo_id);
			ninjaService.addNinjaToDojo(n, d);
			return "redirect:/";
		}
	}
}