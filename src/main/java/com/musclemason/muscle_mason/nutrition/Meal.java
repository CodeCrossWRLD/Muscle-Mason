package com.musclemason.muscle_mason.nutrition;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private String MealName;
    private MealType mealType;
    private List<FoodItem> foodItems = new ArrayList<>();

    public Meal(String MealName) {
        this.MealName = MealName;
        this.mealType = mealType;
    }

    public String getMealName() { return MealName; }
    public void setMealName() { this.MealName = MealName; }
    public MealType getMealType() { return mealType; }

    public double getTotalCalories() {
        double totalCalories = 0;
        for (FoodItem item : foodItems) {
            totalCalories += item.getCalories();
        }
        return totalCalories;
    }
    public double getTotalFat() {
        double totalFats = 0;
        for (FoodItem item : foodItems) {
            totalFats += item.getFats();
        }
        return totalFats;
    }
    public double getTotalProteins() {
        double totalProteins = 0;
        for (FoodItem item : foodItems) {
            totalProteins += item.getProteins();
        }
        return totalProteins;
    }
    public double getTotalSodium() {
        double totalSodium = 0;
        for (FoodItem item : foodItems) {
            totalSodium += item.getSodium();
        }
        return totalSodium;
    }
    public double getTotalSugars() {
        double totalSugars = 0;
        for (FoodItem item : foodItems) {
            totalSugars += item.getSugars();
        }
        return totalSugars;
    }
    public double getTotalCarbohydrates() {
        double totalCarbohydrates = 0;
        for (FoodItem item : foodItems) {
            totalCarbohydrates += item.getCarbohydrates();
        }
        return totalCarbohydrates;
    }

}
