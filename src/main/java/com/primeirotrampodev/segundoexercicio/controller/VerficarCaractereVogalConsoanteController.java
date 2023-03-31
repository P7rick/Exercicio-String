package com.primeirotrampodev.segundoexercicio.controller;

import com.primeirotrampodev.segundoexercicio.service.VerifiCarcaractereVogalConsoanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verificar-vogal-consoante")
public class VerficarCaractereVogalConsoanteController {

    @Autowired
    private VerifiCarcaractereVogalConsoanteService verifiCarcaractereVogalConsoanteService;

    @GetMapping("/vogal-consoante")
    public String vogalEConsoante(@RequestParam("caractere") Character caractere) {

        return verifiCarcaractereVogalConsoanteService.vogalEConsoante(caractere);
    }
}
