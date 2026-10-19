package com.musclemason.muscle_mason.nutrition;

//import jakarta.persistence.*;

public class FoodItem {

    private Long id;

    private String itemName;
    private double calories;
    private double fats;
    private double proteins;
    private double sugars;
    private double sodium;
    private double carbohydrates;
    private double servingSize;

    //@Enumerated(EnumType.STRING)
    private DietaryTag tag;

    public FoodItem(String itemName, double calories, double fats, double proteins,
                    double totalSugars, double sodium, double carbohydrates, double servingSize) {
        this.itemName = itemName;
        this.calories = calories;
        this.fats = fats;
        this.proteins = proteins;
        this.sugars = sugars;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.servingSize = servingSize;
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
                this.servingSize * multiplier
        );

    }

}
