package com.primeirotrampodev.segundoexercicio.controller;

import com.primeirotrampodev.segundoexercicio.service.VerficarIdadeVotarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verificar-idade")
public class VerificarIdadeVotarController {

    @Autowired
    private VerficarIdadeVotarService verficarIdadeVotarService;

    @GetMapping("/idade-votar")
    public String idadeVotar(@RequestParam("idade") Integer numero) {

        return verficarIdadeVotarService.idadeVotar(numero);
    }
}
