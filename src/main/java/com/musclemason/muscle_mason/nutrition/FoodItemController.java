package com.musclemason.muscle_mason.nutrition;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FoodItemController {

    private final FoodService foodItemRepository;

    public FoodItemController(FoodService foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    @GetMapping("/ListFoodItem")
    List<FoodItem> findAll() {
        return foodItemRepository.findAll();
    }

    @GetMapping("/{id}")
    FoodItem findByID(@PathVariable Long id) {
        Optional<FoodItem> byId = foodItemRepository.findById(id);

        if (byId.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return byId.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void createFoodItem(@RequestBody FoodItem item) {
        foodItemRepository.createFoodItem(item);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void updateFoodItem(FoodItem item, Long id) {
        foodItemRepository.editFoodItem(item, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteFoodItem(Long id) {
        foodItemRepository.deleteFoodItems(id);
    }


}
