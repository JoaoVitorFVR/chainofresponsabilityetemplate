package org.example;

public class TipoInscricaoPosGraduacao implements TipoInscricao {
    private static final TipoInscricaoPosGraduacao instancia = new TipoInscricaoPosGraduacao();

    private TipoInscricaoPosGraduacao() {}

    public static TipoInscricaoPosGraduacao getTipoInscricaoPosGraduacao() {
        return instancia;
    }
}