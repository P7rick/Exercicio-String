package com.primeirotrampodev.segundoexercicio.service;

import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class VerifiCarcaractereVogalConsoanteService {

    public String vogalEConsoante(Character caracter) {


        if (caracter == 'a' || caracter == 'A' || caracter == 'e' || caracter == 'E'
                || caracter == 'i'|| caracter =='I' || caracter == 'o' || caracter =='O'
                || caracter == 'u'|| caracter =='U') {
            return " Esse caractere e uma vogal ";

        } else{
            return " E uma consoante ";

        }
    }

}
