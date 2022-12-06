package com.kabirules.quizzz.api.v1;

import com.kabirules.quizzz.api.v1.model.QuizzDTO;
import com.kabirules.quizzz.mapper.QuizzMapper;
import com.kabirules.quizzz.service.QuizzService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class QuizzController {

    private QuizzService quizzService;
    private QuizzMapper quizzMapper;

    @PostMapping("/quizz")
    public Mono<QuizzDTO> save(@RequestBody QuizzDTO quizzDTO) {
        return quizzService.save(quizzMapper.dTOToEntity(quizzDTO))
                .map(quizzEntity -> quizzMapper.entityToDTO(quizzEntity));
    }


}
