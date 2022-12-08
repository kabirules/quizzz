package com.kabirules.quizzz.mapper;

import com.kabirules.quizzz.api.v1.model.QuizzDTO;
import com.kabirules.quizzz.entity.QuizzEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuizzMapper {

    QuizzDTO entityToDTO(QuizzEntity quizzEntity);
    QuizzEntity dTOToEntity(QuizzDTO quizzDTO);
}
