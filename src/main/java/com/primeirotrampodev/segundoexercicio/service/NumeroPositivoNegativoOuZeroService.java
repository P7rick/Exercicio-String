package com.primeirotrampodev.segundoexercicio.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class NumeroPositivoNegativoOuZeroService {

    public String numerosPositivoOuNegativoOuZero(Integer numero) {

        if (numero > 0) {
            return " É um numero e positivo ";
        }else if (numero < 0) {
            return " É um numero e negativo ";
        }else {
            return " zero ";
        }

    }
}
