package com.tran.andrew.relationships.relationshipdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tran.andrew.relationships.relationshipdemo.models.License;
import com.tran.andrew.relationships.relationshipdemo.models.Person;
import com.tran.andrew.relationships.relationshipdemo.services.LicenseService;
import com.tran.andrew.relationships.relationshipdemo.services.PersonService;

import jakarta.validation.Valid;

@Controller
public class PersonController {
    @GetMapping("/persons/{person_id}")
    public String showPerson(@PathVariable Long person_id, Model model) {

        Person someAwesomePerson = PersonService.findById(person_id);
        model.addAttribute("person", someAwesomePerson);

        return "showPerson.jsp";
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("person", new Person());
        return "showPerson.jsp";
    }

    @PostMapping("/licenses")
    public String licenses(@Valid @ModelAttribute("license") License license) {
        // error handling with binding result omitted
        LicenseService.create(license); // Already has the person!

        return "redirect:/persons";
    }
}
