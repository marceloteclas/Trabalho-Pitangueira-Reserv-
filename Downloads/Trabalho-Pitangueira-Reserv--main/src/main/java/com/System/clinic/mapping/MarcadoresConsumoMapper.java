package com.System.clinic.mapping;

import com.System.clinic.Dto.MarcadoresConsumoDTO;
import com.System.clinic.entity.MarcadoresConsumoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MarcadoresConsumoMapper {

    @Mapping(target = "refeicaoComCelular", source = "refeicaoComCelular")
    @Mapping(target = "refeicoesDia", source = "refeicoesDia")
    @Mapping(target = "consumiuFeijao", source = "consumiuFeijao")
    @Mapping(target = "consumiuFrutas", source = "consumiuFrutas")
    @Mapping(target = "consumiuVerduras", source = "consumiuVerduras")
    @Mapping(target = "consumiuHamburguer", source = "consumiuHamburguer")
    @Mapping(target = "consumiuBebidasAdocadas", source = "consumiuBebidasAdocadas")
    @Mapping(target = "consumiuMacarraoInstantaneo", source = "consumiuMacarraoInstantaneo")
    @Mapping(target = "consumiuBiscoitos", source = "consumiuBiscoitos")
    MarcadoresConsumoDTO toDto(MarcadoresConsumoEntity entity);

    @Mapping(target = "refeicaoComCelular", source = "refeicaoComCelular")
    @Mapping(target = "refeicoesDia", source = "refeicoesDia")
    @Mapping(target = "consumiuFeijao", source = "consumiuFeijao")
    @Mapping(target = "consumiuFrutas", source = "consumiuFrutas")
    @Mapping(target = "consumiuVerduras", source = "consumiuVerduras")
    @Mapping(target = "consumiuHamburguer", source = "consumiuHamburguer")
    @Mapping(target = "consumiuBebidasAdocadas", source = "consumiuBebidasAdocadas")
    @Mapping(target = "consumiuMacarraoInstantaneo", source = "consumiuMacarraoInstantaneo")
    @Mapping(target = "consumiuBiscoitos", source = "consumiuBiscoitos")
    MarcadoresConsumoEntity toEntity(MarcadoresConsumoDTO dto);
}
