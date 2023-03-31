package com.primeirotrampodev.segundoexercicio.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class NumeroParOuImpaService {

    public String numeroParOuImpa(Integer numero){

        if(numero % 2 == 0) {
            return " E um numero par ";
        } else  {
            return " E um numero impa ";
        }
    }

}

