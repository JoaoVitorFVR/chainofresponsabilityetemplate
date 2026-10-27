package org.example;

import java.util.ArrayList;

public abstract class Departamento {

    protected ArrayList listaInscricoes = new ArrayList();
    private Departamento departamentoSuperior;

    public Departamento getDepartamentoSuperior() {
        return departamentoSuperior;
    }

    public void setDepartamentoSuperior(Departamento departamentoSuperior) {
        this.departamentoSuperior = departamentoSuperior;
    }

    public abstract String getDescricaoCargo();

    public final String processarInscricao(Inscricao inscricao) {
        if (listaInscricoes.contains(inscricao.getTipoInscricao())) {
            validarDocumentacaoInterna(inscricao);
            return getDescricaoCargo();
        } else {
            if (departamentoSuperior != null) {
                return departamentoSuperior.processarInscricao(inscricao);
            } else {
                return "Inscrição não processada";
            }
        }
    }

    private void validarDocumentacaoInterna(Inscricao inscricao) {
    }
}