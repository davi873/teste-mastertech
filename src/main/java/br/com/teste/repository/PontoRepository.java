package br.com.teste.repository;

import br.com.teste.model.Ponto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PontoRepository extends CrudRepository<Ponto, Integer> {
    public List<Ponto> findByUserId(int id);
}
