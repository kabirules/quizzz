package com.kabirules.quizzz.repository;

import com.kabirules.quizzz.entity.QuestionEntity;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface QuestionRepository extends ReactiveCrudRepository<QuestionEntity, Long> {

    @Query("SELECT * FROM question WHERE quizz_id = :quizzId")
    Flux<QuestionEntity> findByQuizzId(Long quizzId);

}
