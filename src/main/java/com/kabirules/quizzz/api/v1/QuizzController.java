package com.kabirules.quizzz.api.v1;

import com.kabirules.quizzz.api.v1.model.QuestionDTO;
import com.kabirules.quizzz.api.v1.model.QuizzDTO;
import com.kabirules.quizzz.mapper.QuizzMapper;
import com.kabirules.quizzz.service.QuizzService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class QuizzController {

    private QuizzService quizzService;
    private QuizzMapper quizzMapper;

    @PostMapping("/quizz")
    public Mono<QuizzDTO> save(@RequestBody QuizzDTO quizzDTO) {
        return quizzService.quizzSave(quizzMapper.dTOToEntity(quizzDTO))
                .map(quizzEntity -> quizzMapper.entityToDTO(quizzEntity));
    }

    @GetMapping("/quizz/{id}")
    public Mono<QuizzDTO> getById(@PathVariable Long id) {
        return quizzService.quizzGetById(id)
                .map(quizzEntity -> quizzMapper.entityToDTO(quizzEntity));
    }

    @GetMapping("/quizz")
    public Flux<QuizzDTO> get() {
        return quizzService.quizzGet()
                .map(quizzEntity -> quizzMapper.entityToDTO(quizzEntity));
    }

    @PostMapping("/question")
    public Mono<QuestionDTO> save(@RequestBody QuestionDTO questionDTO) {
        return Mono.empty();
    }


}
