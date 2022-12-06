package com.kabirules.quizzz.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@AllArgsConstructor
public class Quizz {
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
