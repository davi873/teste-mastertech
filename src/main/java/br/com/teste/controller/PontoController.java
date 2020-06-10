package br.com.teste.controller;

import br.com.teste.datasource.model.Ponto;
import br.com.teste.service.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PontoController {

    @Autowired
    PontoService pontoService;

    @PostMapping("/resgisterPonto")
    private boolean registerPonto(@RequestBody Ponto ponto){
        try {
            pontoService.register(ponto);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @GetMapping("/pontoByUser/{idUser}")
    private List<Ponto> pontoByUser(@PathVariable(value = "idUser") int idUser){
        return pontoService.getPontoByUser(idUser);
    }
}
