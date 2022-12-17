package com.kabirules.quizzz.service;

import com.kabirules.quizzz.entity.QuestionEntity;
import com.kabirules.quizzz.entity.QuizzEntity;
import com.kabirules.quizzz.repository.QuestionRepository;
import com.kabirules.quizzz.repository.QuizzRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class QuizzService {

    private QuizzRepository quizzRepository;
    private QuestionRepository questionRepository;

    public Mono<QuizzEntity> quizzSave(QuizzEntity quizzEntity) {
        return quizzRepository.save(quizzEntity);
    }

    public Mono<QuizzEntity> quizzGetById(Long id) {
        return quizzRepository.findById(id);
    }

    public Flux<QuizzEntity> quizzGetAll() {
        return quizzRepository.findAll();
    }


    public Mono<QuestionEntity> questionSave(QuestionEntity questionEntity) {
        return questionRepository.save(questionEntity);
    }

    public Flux<QuestionEntity> quizzGetByQuizzId(Long quizzId) {
        return questionRepository.findByQuizzId(quizzId);
    }
}
