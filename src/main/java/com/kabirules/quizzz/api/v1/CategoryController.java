package com.kabirules.quizzz.api.v1;

import com.kabirules.quizzz.api.v1.model.CategoryDTO;
import com.kabirules.quizzz.mapper.CategoryMapper;
import com.kabirules.quizzz.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class CategoryController {
    private CategoryService categoryService;
    private CategoryMapper categoryMapper;

    @PostMapping("/category")
    public Mono<CategoryDTO> categorySave(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.categorySave(categoryMapper.dTOToEntity(categoryDTO))
                .map(categoryEntity -> categoryMapper.entityToDTO(categoryEntity));
    }

    @GetMapping("/category")
    public Flux<CategoryDTO> categorygGetAll() {
        return categoryService.categoryGetAll()
                .map(categoryEntity -> categoryMapper.entityToDTO(categoryEntity));
    }
}
