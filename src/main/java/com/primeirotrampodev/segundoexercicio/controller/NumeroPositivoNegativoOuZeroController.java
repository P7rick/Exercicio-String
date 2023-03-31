package com.primeirotrampodev.segundoexercicio.controller;

import com.primeirotrampodev.segundoexercicio.service.NumeroPositivoNegativoOuZeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodo-verificar")
public class NumeroPositivoNegativoOuZeroController {

    @Autowired
    private NumeroPositivoNegativoOuZeroService numeroPositivoNegativoOuZeroService;

    @GetMapping("/positivo-negativo-zero")
    public String positivoNegativoOuZero(@RequestParam("numero") Integer numero) {

      return numeroPositivoNegativoOuZeroService.numerosPositivoOuNegativoOuZero(numero);
    }
}

