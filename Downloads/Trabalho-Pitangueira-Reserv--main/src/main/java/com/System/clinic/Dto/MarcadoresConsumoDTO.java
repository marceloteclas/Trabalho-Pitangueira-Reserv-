package com.System.clinic.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarcadoresConsumoDTO {

    private Long id;

    private String refeicaoComCelular; // Sim, Não, Não sei
    private String refeicoesDia; // Exemplo: Café da manhã, Almoço, etc.
    private String consumiuFeijao;
    private String consumiuFrutas;
    private String consumiuVerduras;
    private String consumiuHamburguer;
    private String consumiuBebidasAdocadas;
    private String consumiuMacarraoInstantaneo;
    private String consumiuBiscoitos;

}
