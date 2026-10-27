package org.example;

public class SecretariaAcademica extends Departamento {

    public SecretariaAcademica(Departamento superior) {
        listaInscricoes.add(TipoInscricaoGraduacao.getTipoInscricaoGraduacao());
        setDepartamentoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Secretaria Acadêmica";
    }
}