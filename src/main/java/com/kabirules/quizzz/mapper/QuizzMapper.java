package com.kabirules.quizzz.mapper;

import com.kabirules.quizzz.api.v1.model.QuizzDTO;
import com.kabirules.quizzz.entity.QuizzEntity;
import com.kabirules.quizzz.model.Quizz;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuizzMapper {

    QuizzDTO entityToDTO(QuizzEntity quizzEntity);
    QuizzEntity dTOToEntity(QuizzDTO quizzDTO);
    QuizzDTO modelToDTO(Quizz quizz);
    QuizzEntity modelToEntity(Quizz quizz);
    Quizz entityToModel(QuizzEntity quizzEntity);
    Quizz dTOToModel(QuizzDTO quizzDTO);
}
