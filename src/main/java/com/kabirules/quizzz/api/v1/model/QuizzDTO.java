package com.kabirules.quizzz.api.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class QuizzDTO {

    private String name;
    private String image;
    private LocalDate creationDate = LocalDate.now();
    @Id
    private Long id;

    public QuizzDTO() {
    }

    @Override
    public String toString() {
        return String.format(
                "Quizz[id=%d, name='%s', image='%s', creation_date='%s']",
                id, name, image, creationDate);
    }
}
