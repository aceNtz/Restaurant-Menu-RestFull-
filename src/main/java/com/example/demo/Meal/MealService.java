package com.example.demo.Meal;

import java.util.List;

public interface MealService {

    public List<Meal> getMealList();
    public Meal getMeal(int id);
    public void addMeal();
    public void updateMeal(int id);
    public void deleteMeal(int id);
}
