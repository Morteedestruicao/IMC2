package com.example.demo.Model;

public class M_resposta {
    private double imc;
    private String resposta;

    public M_resposta(double imc, String resposta) {
        this.imc = imc;
        this.resposta = resposta;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }


}
