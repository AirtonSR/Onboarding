package com.example.estudo;

import com.example.estudo.Entity.chamadoEntity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class chamadoBO {
    private int proximoID = 1;

    public chamadoEntity prepararChamado(chamadoEntity chamado) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy", new Locale("pt", "BR"));
        String dateFormate = formatter.format(date);
        chamado.setDataDeAbertura(dateFormate);
        chamado.setId(proximoID++);
        return chamado;
    }
}
