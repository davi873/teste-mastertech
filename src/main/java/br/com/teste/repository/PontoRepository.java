package br.com.teste.repository;

import br.com.teste.datasource.model.Ponto;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PontoRepository extends CrudRepository<Ponto, Integer> {
    public List<Ponto> findByUserId(int id);
}
