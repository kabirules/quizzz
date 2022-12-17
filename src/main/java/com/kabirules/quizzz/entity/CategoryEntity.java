package com.kabirules.quizzz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name="category")
@AllArgsConstructor
public class CategoryEntity {

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
