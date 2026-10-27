package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscricaoTest {

    CoordenadoriaPos coordenadoriaPos;
    SecretariaAcademica secretariaAcademica;

    @BeforeEach
    void setUp() {
        coordenadoriaPos = new CoordenadoriaPos(null);
        secretariaAcademica = new SecretariaAcademica(coordenadoriaPos); // Secretaria aponta para a Pós
    }

    @Test
    void deveProcessarGraduacaoNaSecretariaAcademica() {
        Inscricao inscricao = new Inscricao(TipoInscricaoGraduacao.getTipoInscricaoGraduacao(), "João");

        assertEquals("Secretaria Acadêmica", secretariaAcademica.processarInscricao(inscricao));
    }

    @Test
    void deveEncadearAteCoordenadoriaParaPosGraduacao() {
        Inscricao inscricao = new Inscricao(TipoInscricaoPosGraduacao.getTipoInscricaoPosGraduacao(), "Maria");

        assertEquals("Coordenadoria de Pós-Graduação", secretariaAcademica.processarInscricao(inscricao));
    }

    @Test
    void deveRetornarInscricaoNaoProcessadaQuandoCadeiaChegaAoFimSemAtender() {
        SecretariaAcademica secretariaSozinha = new SecretariaAcademica(null);
        Inscricao inscricaoPos = new Inscricao(TipoInscricaoPosGraduacao.getTipoInscricaoPosGraduacao(), "Ana");
        assertEquals("Inscrição não processada", secretariaSozinha.processarInscricao(inscricaoPos));
    }

    @Test
    void deveGarantirGetDepartamentoSuperiorRetornaCorretamente() {
        CoordenadoriaPos coordenadoria = new CoordenadoriaPos(null);
        SecretariaAcademica secretaria = new SecretariaAcademica(coordenadoria);
        assertEquals(coordenadoria, secretaria.getDepartamentoSuperior());
    }
}