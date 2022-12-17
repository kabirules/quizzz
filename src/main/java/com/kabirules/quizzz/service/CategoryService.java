package com.kabirules.quizzz.service;

import com.kabirules.quizzz.entity.CategoryEntity;
import com.kabirules.quizzz.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;

    public Mono<CategoryEntity> categorySave(CategoryEntity categoryEntity) {
        return categoryRepository.save(categoryEntity);
    }

    public Flux<CategoryEntity> categoryGetAll() {
        return categoryRepository.findAll();
    }




}
