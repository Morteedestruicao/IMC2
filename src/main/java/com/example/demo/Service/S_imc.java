package com.example.demo.Service;

import com.example.demo.Model.M_resposta;

public class S_imc {

    public static M_resposta calcularIMC(double peso, double altura) {
        altura = altura/100;
        double imc = peso / (altura*altura);
        String MensagemRetorno = "";

        if(imc < 18.5){
            MensagemRetorno += "Abaixo do peso";
        }
        else if(imc >= 18.5 && imc < 24.9){
            MensagemRetorno += "Peso ideal";
        }
        else if(imc >= 25 && imc < 30){
            MensagemRetorno += "Sobrepeso";
        }
        else if(imc >= 30 && imc < 34.9){
            MensagemRetorno += "Obesidade grau 1";
        }
        else if(imc >= 35 && imc < 40){
            MensagemRetorno += "Obesidade grau 2";
        }
        else{
            MensagemRetorno += "Obesidade grau 3";
        }
        M_resposta m_resposta = new M_resposta(imc, MensagemRetorno);
        return m_resposta;
    }
}
