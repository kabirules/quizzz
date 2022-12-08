package com.kabirules.quizzz.api.v1;

import com.kabirules.quizzz.api.v1.model.QuestionDTO;
import com.kabirules.quizzz.api.v1.model.QuizzDTO;
import com.kabirules.quizzz.mapper.QuestionMapper;
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
    private QuestionMapper questionMapper;

    @PostMapping("/quizz")
    public Mono<QuizzDTO> quizzSave(@RequestBody QuizzDTO quizzDTO) {
        return quizzService.quizzSave(quizzMapper.dTOToEntity(quizzDTO))
                .map(quizzEntity -> quizzMapper.entityToDTO(quizzEntity));
    }

    @GetMapping("/quizz/{id}")
    public Mono<QuizzDTO> getById(@PathVariable Long id) {
        return quizzService.quizzGetById(id)
                .map(quizzEntity -> quizzMapper.entityToDTO(quizzEntity));
    }

    @GetMapping("/quizz")
    public Flux<QuizzDTO> getAll() {
        return quizzService.quizzGetAll()
                .map(quizzEntity -> quizzMapper.entityToDTO(quizzEntity));
    }

    @PostMapping("/question")
    public Mono<QuestionDTO> save(@RequestBody QuestionDTO questionDTO) {
        return quizzService.questionSave(questionMapper.dTOToEntity(questionDTO))
                .map(questionEntity -> questionMapper.entityToDTO(questionEntity));
    }

    @GetMapping("/question/{quizzId}")
    public Flux<QuestionDTO> getByQuizzId(@PathVariable Long quizzId) {
        return quizzService.quizzGetByQuizzId(quizzId)
                .map(questionEntity -> questionMapper.entityToDTO(questionEntity));
    }
}
