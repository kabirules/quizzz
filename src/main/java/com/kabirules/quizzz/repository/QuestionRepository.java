package com.kabirules.quizzz.repository;

import com.kabirules.quizzz.entity.QuestionEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface QuestionRepository extends ReactiveCrudRepository<QuestionEntity, Long> {

}
