package com.kabirules.quizzz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Data
@Table(name="quizz")
@AllArgsConstructor
public class QuizzEntity {

    private String name;
    private String image;
    private LocalDate creationDate;
    @Id
    private Long id;

    @Override
    public String toString() {
        return String.format(
                "Quizz[id=%d, name='%s', image='%s']",
                id, name, image);
    }
}
