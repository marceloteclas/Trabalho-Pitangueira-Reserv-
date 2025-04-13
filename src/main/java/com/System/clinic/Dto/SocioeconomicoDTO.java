package com.System.clinic.Dto;

import com.System.clinic.entity.Enums.Auxilios;
import com.System.clinic.entity.Enums.Dependentes;
import com.System.clinic.entity.Enums.Emprego;
import com.System.clinic.entity.Enums.Escolaridade;
import com.System.clinic.entity.Enums.EstadoCivil;
import com.System.clinic.entity.Enums.Genero;
import com.System.clinic.entity.Enums.Raca;
import com.System.clinic.entity.Enums.Religiao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocioeconomicoDTO {
    private Long id;

    private Genero genero;
    private String outroGenero;

    private Raca raca;
    private String outraRaca;

    private Escolaridade escolaridade;
    private String outraEscolaridade;

    private EstadoCivil estadoCivil;
    private String outroEstadoCivil;

    private Emprego emprego;
    private String outroEmprego;

    private Auxilios auxilios;
    private String outrosAuxilios;

    private Dependentes dependentes;

    private Religiao religiao;
    private String outraReligiao;

}
