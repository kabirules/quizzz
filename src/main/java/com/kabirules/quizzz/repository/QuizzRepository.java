package com.kabirules.quizzz.repository;

import com.kabirules.quizzz.entity.QuizzEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface QuizzRepository extends ReactiveCrudRepository<QuizzEntity, Long> {

    @Query("SELECT * FROM quizz WHERE name = :name")
    Flux<QuizzEntity> findByName(String name);
}
