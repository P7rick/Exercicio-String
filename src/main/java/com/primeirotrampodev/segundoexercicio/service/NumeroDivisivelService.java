package com.primeirotrampodev.segundoexercicio.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroDivisivelService {

    public String numeroDivisivel(Integer numero, Integer numero1) {

        if(numero % numero1 == 0) {
            return " numero X é divisível por X ";

        }else {
            return "numero X não é divisível por X";
        }
    }
}
