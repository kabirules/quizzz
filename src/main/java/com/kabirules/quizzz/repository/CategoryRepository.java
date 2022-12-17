package com.kabirules.quizzz.repository;

import com.kabirules.quizzz.entity.CategoryEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CategoryRepository extends ReactiveCrudRepository<CategoryEntity, Long> {

}
