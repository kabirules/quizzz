package com.kabirules.quizzz.mapper;

import com.kabirules.quizzz.api.v1.model.CategoryDTO;
import com.kabirules.quizzz.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryDTO entityToDTO(CategoryEntity categoryEntity);
    CategoryEntity dTOToEntity(CategoryDTO categoryDTO);
}
