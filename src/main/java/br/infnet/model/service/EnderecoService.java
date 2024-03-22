package br.infnet.model.service;

import java.util.Collection;

import br.infnet.model.domain.Endereco;
import br.infnet.model.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public void incluir(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public void excluir(Integer id) {
        enderecoRepository.deleteById(id);
    }

    public Collection<Endereco> obterLista(){
        return (Collection<Endereco>) enderecoRepository.findAll();
    }

    public Endereco obter(Integer id){
        return enderecoRepository.findById(id).orElse(null);
    }
}