package com.vysotskiy.caloric_froglets.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "calories")
    private int calories;

    @Column(name = "proteins")
    private float proteins;

    @Column(name = "fats")
    private float fats;

    @Column(name = "carbohydrates")
    private float carbohydrates;

    @Column(name = "category_id")
    private int categoryId;

    public Ingredient(String name, int calories, float proteins, float fats, float carbohydrates, int categoryId) {
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.categoryId = categoryId;
    }
}
