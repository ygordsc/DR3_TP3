package br.infnet.model.repository;

import br.infnet.model.domain.Escola;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends CrudRepository<Escola, Integer> {

}