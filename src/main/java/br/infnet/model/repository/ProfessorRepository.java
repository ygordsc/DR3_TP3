package br.infnet.model.repository;

import br.infnet.model.domain.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {

}