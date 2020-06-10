package br.com.teste.service;

import br.com.teste.datasource.model.Ponto;
import br.com.teste.repository.PontoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoService {

    @Autowired
    PontoRepository pontoRepository;

    public void register(Ponto ponto){
        pontoRepository.save(ponto);
    }

    public List<Ponto> getPontoByUser(int idUser){
        return pontoRepository.findByUserId(idUser);
    }

}
