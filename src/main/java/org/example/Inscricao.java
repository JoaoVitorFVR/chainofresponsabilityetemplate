package org.example;

public class Inscricao {
    private TipoInscricao tipoInscricao;
    private String candidato;

    public Inscricao(TipoInscricao tipoInscricao, String candidato) {
        this.tipoInscricao = tipoInscricao;
        this.candidato = candidato;
    }

    public TipoInscricao getTipoInscricao() {
        return tipoInscricao;
    }

    public String getCandidato() {
        return candidato;
    }
}