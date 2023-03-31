package com.primeirotrampodev.segundoexercicio.controller;

import com.primeirotrampodev.segundoexercicio.service.NumeroParOuImpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Verificar-par-impa")
public class NumeroParOuImpaController {

    @Autowired
    private NumeroParOuImpaService numeroParOuImpaService;

    @GetMapping("/numero-par-impa")
    public String numeroParOuImpa(@RequestParam("numero") Integer numero) {

        return numeroParOuImpaService.numeroParOuImpa(numero);
    }
}
