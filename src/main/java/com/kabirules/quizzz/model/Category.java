package com.kabirules.quizzz.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
public class Category {
    private String name;
    @Id
    private Long id;

    @Override
    public String toString() {
        return String.format(
                "Quizz[id=%d, name='%s']",
                id, name);
    }
}
