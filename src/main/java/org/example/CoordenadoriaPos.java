package org.example;

public class CoordenadoriaPos extends Departamento {

    public CoordenadoriaPos(Departamento superior) {
        listaInscricoes.add(TipoInscricaoPosGraduacao.getTipoInscricaoPosGraduacao());
        setDepartamentoSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Coordenadoria de Pós-Graduação";
    }
}