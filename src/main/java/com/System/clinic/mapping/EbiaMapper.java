package com.System.clinic.mapping;

import com.System.clinic.Dto.EbiaDTO;
import com.System.clinic.entity.EbiaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EbiaMapper {

    @Mapping(target = "p1", source = "p1")
    @Mapping(target = "p2", source = "p2")
    @Mapping(target = "p3", source = "p3")
    @Mapping(target = "p4", source = "p4")
    @Mapping(target = "p5", source = "p5")
    @Mapping(target = "p6", source = "p6")
    @Mapping(target = "p7", source = "p7")
    @Mapping(target = "p8", source = "p8")
    EbiaDTO toDto(EbiaEntity entity);

    @Mapping(target = "p1", source = "p1")
    @Mapping(target = "p2", source = "p2")
    @Mapping(target = "p3", source = "p3")
    @Mapping(target = "p4", source = "p4")
    @Mapping(target = "p5", source = "p5")
    @Mapping(target = "p6", source = "p6")
    @Mapping(target = "p7", source = "p7")
    @Mapping(target = "p8", source = "p8")
    EbiaEntity toEntity(EbiaDTO dto);
}
