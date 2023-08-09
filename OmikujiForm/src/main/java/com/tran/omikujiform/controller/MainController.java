package com.tran.omikujiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }

    @RequestMapping(value = "/show", method = RequestMethod.POST)
    public String submitForm(HttpServletRequest request) {
        HttpSession session = request.getSession();
        // Get the form data from the request
        String number = request.getParameter("number");
        String city = request.getParameter("city");
        String person = request.getParameter("person");
        String hobby = request.getParameter("hobby");
        String thing = request.getParameter("thing");
        String nice = request.getParameter("nice");
        // Save the form data in session
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("thing", thing);
        session.setAttribute("nice", nice);
        // Redirect to the confirmation page
        return "show.jsp";
    }
}