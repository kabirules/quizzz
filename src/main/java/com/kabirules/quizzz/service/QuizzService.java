package com.kabirules.quizzz.service;

import com.kabirules.quizzz.entity.QuizzEntity;
import com.kabirules.quizzz.mapper.QuizzMapper;
import com.kabirules.quizzz.repository.QuizzRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class QuizzService {

    private QuizzRepository quizzRepository;
    private QuizzMapper quizzMapper;

    public Mono<QuizzEntity> save(QuizzEntity quizzEntity) {
        return quizzRepository.save(quizzEntity);
    }
}
