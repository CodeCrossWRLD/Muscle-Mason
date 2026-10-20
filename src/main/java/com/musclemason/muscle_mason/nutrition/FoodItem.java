package com.musclemason.muscle_mason.nutrition;

//import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public class FoodItem {

    private static Long idCounter = 1L;
    private Long id;
    @NotBlank
    private String itemName;
    @PositiveOrZero(message = "Calories must be at 0 or above.")
    private double calories;
    @PositiveOrZero(message = "Fat must be at 0 or above.")
    private double fats;
    @PositiveOrZero(message = "Protein must be at 0 or above.")
    private double proteins;
    @PositiveOrZero(message = "Sugar must be at 0 or above.")
    private double sugars;
    @PositiveOrZero(message = "Sodium must be at 0 or above.")
    private double sodium;
    @PositiveOrZero(message = "Carbohydrates must be at 0 or above.")
    private double carbohydrates;
    @PositiveOrZero(message = "Serving size must be at 0 or above.")
    private double servingSize;

    //@Enumerated(EnumType.STRING)
    private DietaryTag tag;

    public FoodItem(String itemName, double calories, double fats, double proteins,
                    double sugars, double sodium, double carbohydrates, double servingSize, DietaryTag tag) {
        this.itemName = itemName;
        this.id = idCounter++;
        this.calories = calories;
        this.fats = fats;
        this.proteins = proteins;
        this.sugars = sugars;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.servingSize = servingSize;
        this.tag = tag;
    }

    public Long getID() { return id; }
    public String getItemName() { return itemName; }
    public double getCalories() { return calories; }
    public double getFats() { return fats; }
    public double getProteins() { return proteins; }
    public double getSugars() { return sugars; }
    public double getSodium() { return sodium; }
    public double getCarbohydrates() { return carbohydrates; }
    public double getServingSize() { return servingSize; }

    public void setId(Long id) { this.id = id; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setCalories(double calories) { this.calories = calories; }
    public void setFats(double fats) { this.fats = fats; }
    public void setProteins(double proteins) { this.proteins = proteins; }
    public void setTotalSugars(double sugars) { this.sugars = sugars; }
    public void setSodium(double sodium) { this.sodium = sodium; }
    public void setCarbohydrates(double carbohydrates) { this.carbohydrates = carbohydrates; }
    public void setServingSize(double servingSize) { this.servingSize = servingSize; }

    public FoodItem scalePortion(double multiplier) {
        return new FoodItem(
                this.itemName, this.calories * multiplier, this.fats * multiplier,
                this.proteins * multiplier, this.sugars * multiplier,
                this.sodium * multiplier, this.carbohydrates * multiplier,
                this.servingSize * multiplier, this.tag
        );

    }

}
