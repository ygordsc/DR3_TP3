package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import br.infnet.model.domain.Endereco;

@SpringBootTest
class EnderecoTests {

    private Endereco endereco;

    private final String CEP = "79735186";
    private final String LOGRADOURO = "Rua Machado de Assis";
    private final String COMPLEMENTO = "Apartamento 302";
    private final String BAIRRO = "Centro";
    private final String LOCALIDADE = "Campo Grande";
    private final String UF = "MS";

    @BeforeEach
    void setUp() {
        endereco = new Endereco();
        endereco.setCep(CEP);
        endereco.setLogradouro(LOGRADOURO);
        endereco.setComplemento(COMPLEMENTO);
        endereco.setBairro(BAIRRO);
        endereco.setLocalidade(LOCALIDADE);
        endereco.setUf(UF);
    }

    @Test
    void recuperarDados() {
        assertEquals(CEP, endereco.getCep());
        assertEquals(LOGRADOURO, endereco.getLogradouro());
        assertEquals(COMPLEMENTO, endereco.getComplemento());
        assertEquals(BAIRRO, endereco.getBairro());
        assertEquals(LOCALIDADE, endereco.getLocalidade());
        assertEquals(UF, endereco.getUf());
    }
}