package com.System.clinic.entity.Enums;

public enum Resposta {
    SIM("Sim"),
    NAO("Não"),
    NAO_SABE("Não Sei");

    private final String descricao;

    Resposta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
