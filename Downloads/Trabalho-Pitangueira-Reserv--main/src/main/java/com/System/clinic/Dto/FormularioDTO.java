package com.System.clinic.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormularioDTO {

    private Long id;

    private SocioeconomicoDTO socioeconomico;
    private MarcadoresConsumoDTO marcadoresConsumo;
    private EbiaDTO ebia;

    private LocalDate dataPreenchimento = LocalDate.now();

}
