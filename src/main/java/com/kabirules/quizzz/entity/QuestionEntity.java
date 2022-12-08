package com.kabirules.quizzz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name="question")
@AllArgsConstructor
public class QuestionEntity {

    private Long quizzId;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer;
    @Id
    private Long id;

    public QuestionEntity() {
    }

    @Override
    public String toString() {
        return String.format(
                "Question[id=%d, quizzId='%s', question='%s', " +
                        "answer1='%s', answer2='%s, answer3='%s, answer4='%s, correctAnswer='%s]",
                id, quizzId, question, answer1, answer2, answer3, answer4, correctAnswer);
    }
}
