package com.kabirules.quizzz.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class CategoryDTO {

    private String name;
    @Id
    private Long id;

    public CategoryDTO() {
    }

    @Override
    public String toString() {
        return String.format(
                "Quizz[id=%d, name='%s']",
                id, name);
    }
}
