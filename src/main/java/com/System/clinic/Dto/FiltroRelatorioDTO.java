package com.System.clinic.Dto;

import java.time.LocalDate;

import lombok.Data;
@Data
public class FiltroRelatorioDTO {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String faixaEtaria;
    private String escolaridade;
    private String tamanhoFamilia;
    private String nivelInseguranca;
    private String grupoSocioeconomico;
    
    // Getters e Setters
}
