package com.example.estudo.Controller;

import com.example.estudo.Entity.InformacoesPessoais;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagerController {
    @GetMapping("/mensagem")
    public String Mensager(){
        return "Testando";
    }
    @GetMapping("/mensagem/{nome}")
    public String exibirMensagemPersonalizada(@PathVariable String nome) {
        return "Olá, " + nome + "!";
    }
    @GetMapping("/informacoes/{nome}/{cpf}/{telefone}")
    public InformacoesPessoais getInformacoesPessoais(
            @PathVariable String nome,
            @PathVariable String cpf,
            @PathVariable String telefone) {

        return new InformacoesPessoais(nome, cpf, telefone);
    }
}
