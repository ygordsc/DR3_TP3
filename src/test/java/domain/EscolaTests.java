package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.infnet.model.domain.Endereco;
import br.infnet.model.domain.Escola;
import br.infnet.model.domain.Professor;

@SpringBootTest
class EscolaTests {

    private Escola escola;

    private Professor professor = new Professor();

    private final String EMAIL = "instituto@infnet.edu.br";
    private final String NOME = "Infnet";

    @BeforeEach
    void setUp() {

        List<Professor> professores = new ArrayList<Professor>();
        professores.add(professor);

        escola = new Escola();
        escola.setEmail(EMAIL);
        escola.setEndereco(new Endereco());
        escola.setNome(NOME);
        escola.setProfessores(professores);
    }

    @Test
    void recuperarDados() {
        assertEquals(EMAIL, escola.getEmail());
        assertEquals(NOME, escola.getNome());
        assertEquals(new Endereco().getCep(), escola.getEndereco().getCep());
        assertTrue(escola.getProfessores().contains(professor));
    }
}