package br.infnet.model.service;

import java.util.Collection;

import br.infnet.model.domain.Distrito;
import br.infnet.model.domain.Endereco;
import br.infnet.model.domain.Estado;
import br.infnet.model.domain.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.infnet.clients.IEnderecoClient;
import br.infnet.clients.ILocalidadeClient;

@Service
public class LocalidadeService {

    @Autowired
    private ILocalidadeClient localidadeClient;

    @Autowired
    private IEnderecoClient enderecoClient;

    public Endereco obterPorCep(String cep) {
        return enderecoClient.obterPorCep(cep);
    }

    public Collection<Estado> obterEstados(){
        return localidadeClient.obterEstados();
    }

    public Collection<Municipio> obterMunicipioPorUF(Integer uf){
        return localidadeClient.obterMunicipioPorUF(uf);
    }

    public Collection<Distrito> obterDistritoPorMunicipio(Integer municipio){
        return localidadeClient.obterDistritoPorMunicipio(municipio);
    }
}