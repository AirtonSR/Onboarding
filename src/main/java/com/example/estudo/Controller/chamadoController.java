package com.example.estudo.Controller;

import com.example.estudo.Entity.chamadoEntity;
import com.example.estudo.chamadoBO;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/chamados")
public class chamadoController {
    public List<chamadoEntity> chamados = new ArrayList<>();
    chamadoBO chamadoBO = new chamadoBO();

    @PostMapping
    public chamadoEntity addChamado(@RequestBody chamadoEntity chamado) {
        chamado = chamadoBO.prepararChamado(chamado);
        chamados.add(chamado);
        return chamado;
    }

    @GetMapping
    public List<chamadoEntity> getChamados() {
        return chamados;
    }
}
