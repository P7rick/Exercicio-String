package com.primeirotrampodev.segundoexercicio.controller;

import com.primeirotrampodev.segundoexercicio.service.NumeroDivisivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numero-divisivel")
public class NumeroDivisivelController {

    @Autowired
    private NumeroDivisivelService numeroDivisivelService;

    @GetMapping("/divisivel")
    public String numeroDivisivel(@RequestParam("numero") Integer numero, @RequestParam("numero1") Integer numero1) {

        return numeroDivisivelService.numeroDivisivel(numero, numero1);
    }
}
