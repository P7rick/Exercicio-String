package com.primeirotrampodev.segundoexercicio.service;

import org.springframework.stereotype.Service;

@Service
public class VerficarIdadeVotarService {

    public String idadeVotar(Integer idade) {

        if (idade >= 16) {
            return " Essa pessoa pode votar ";
        } else {
            return " Essa pessoa nao pode votar ";
        }
    }
}
