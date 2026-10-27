package org.example;

public class TipoInscricaoGraduacao implements TipoInscricao {
    private static final TipoInscricaoGraduacao instancia = new TipoInscricaoGraduacao();

    private TipoInscricaoGraduacao() {}

    public static TipoInscricaoGraduacao getTipoInscricaoGraduacao() {
        return instancia;
    }
}