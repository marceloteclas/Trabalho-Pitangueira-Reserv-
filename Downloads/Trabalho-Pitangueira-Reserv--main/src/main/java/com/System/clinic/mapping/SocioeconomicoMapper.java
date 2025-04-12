package com.System.clinic.mapping;

import com.System.clinic.Dto.SocioeconomicoDTO;
import com.System.clinic.entity.SocioeconomicoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SocioeconomicoMapper {

    // Mapeamento de Enums para String e vice-versa
    @Mapping(target = "outroGenero", source = "outroGenero")
    @Mapping(target = "outraRaca", source = "outraRaca")
    @Mapping(target = "outraEscolaridade", source = "outraEscolaridade")
    @Mapping(target = "outroEstadoCivil", source = "outroEstadoCivil")
    @Mapping(target = "outroEmprego", source = "outroEmprego")
    @Mapping(target = "outrosAuxilios", source = "outrosAuxilios")
    @Mapping(target = "outraReligiao", source = "outraReligiao")
    SocioeconomicoDTO toDto(SocioeconomicoEntity entity);

    // Mapeamento de Enums para String e vice-versa
    @Mapping(target = "outroGenero", source = "outroGenero")
    @Mapping(target = "outraRaca", source = "outraRaca")
    @Mapping(target = "outraEscolaridade", source = "outraEscolaridade")
    @Mapping(target = "outroEstadoCivil", source = "outroEstadoCivil")
    @Mapping(target = "outroEmprego", source = "outroEmprego")
    @Mapping(target = "outrosAuxilios", source = "outrosAuxilios")
    @Mapping(target = "outraReligiao", source = "outraReligiao")
    SocioeconomicoEntity toEntity(SocioeconomicoDTO dto);
}
