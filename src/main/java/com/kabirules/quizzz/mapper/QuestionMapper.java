package com.kabirules.quizzz.mapper;

import com.kabirules.quizzz.api.v1.model.QuestionDTO;
import com.kabirules.quizzz.entity.QuestionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    QuestionDTO entityToDTO(QuestionEntity questionEntity);
    QuestionEntity dTOToEntity(QuestionDTO questionDTO);
}
