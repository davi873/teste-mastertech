package br.com.teste.controller;

import br.com.teste.controller.dto.PontoDTO;
import br.com.teste.model.Ponto;
import br.com.teste.service.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;


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
    private PontoDTO pontoByUser(@PathVariable(value = "idUser") int idUser){
        List<Ponto> lsReturn = pontoService.getPontoByUser(idUser);
        PontoDTO pontoDto = new PontoDTO(lsReturn);
        return pontoDto;
    }
}
