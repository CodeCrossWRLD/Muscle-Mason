package com.musclemason.muscle_mason.nutrition;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class FoodService {

    //@Autowired
    //private FoodItemRepository foodItemRepository;

    private List<FoodItem> items = new ArrayList<>();

    List<FoodItem> findAll(){
        return items;
    }

    Optional<FoodItem> findById(Long id) {
        return items.stream()
                .filter(item -> Objects.equals(item.getID(), id))
                .findFirst();
    }

    // post
    void createFoodItem(FoodItem item) {
        items.add(item);
    }

    // put
    void editFoodItem(FoodItem item, Long id) {
        Optional<FoodItem> existingFoodItem = findById(id);
        if (existingFoodItem.isPresent()) {
            items.set(items.indexOf(existingFoodItem.get()), item);
        }
    }

    // delete
    void deleteFoodItems(Long id) {
        items.removeIf(item -> item.getID().equals(id));
    }


    @PostConstruct
    private void init() {
        items.add(new FoodItem("Banana", 100,10.0, 10,10,10,
                10,10, DietaryTag.VEGETARIAN));
        items.add(new FoodItem("Apple", 200,10.0, 15,12,11,
                5, 6, DietaryTag.VEGETARIAN));

    }

}
