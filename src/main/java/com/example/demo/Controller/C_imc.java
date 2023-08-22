package com.example.demo.Controller;

import com.example.demo.Service.S_imc;
import com.example.demo.Model.M_resposta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_imc {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/")
        public String getDados(@RequestParam("altura") int altura,
        @RequestParam("peso") int peso, Model model) {
        M_resposta massaCorporal = S_imc.calcularIMC(peso, altura);
        String numeroArredondado = String.format("%.2f", massaCorporal.getImc());

        model.addAttribute("numeroArrendondado", numeroArredondado);
        model.addAttribute("MensagemRetorno", massaCorporal.getResposta());
        return "index";
    }

}
