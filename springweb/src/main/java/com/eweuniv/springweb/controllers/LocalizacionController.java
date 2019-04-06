package com.eweuniv.springweb.controllers;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping("/loc")
public class LocalizacionController {

    private MessageSource messageSource;

    public LocalizacionController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping
    public String loc(Model model, Locale locale) {

        String mensaje = messageSource.getMessage("hola", null, locale);

        model.addAttribute("mensaje", mensaje);

        return "loc";
    }
}
