package com.example.demo.Meal;

import javax.persistence.*;

@Entity
@Table
public class Meal {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mealId;

    @Column
    private String mealName;

    @Column
    private String mealIngredients;

    @Column
    private String mealPrice;

    @Column
    @OneToOne(cascade = CascadeType.ALL)
    private Recipe mealRecipe;

    @Column
    private PortionSize mealPortionSize;

    @Column
    private String mealWeight;




    public Meal() {
    }


    public Meal(String mealName, String mealIngredients,
                String mealPrice, Recipe mealRecipe,
                PortionSize mealPortionSize, String mealWeight) {
        this.mealName = mealName;
        this.mealIngredients = mealIngredients;
        this.mealPrice = mealPrice;
        this.mealRecipe = mealRecipe;
        this.mealPortionSize = mealPortionSize;
        this.mealWeight = mealWeight;
    }




    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealIngredients() {
        return mealIngredients;
    }

    public void setMealIngredients(String mealIngredients) {
        this.mealIngredients = mealIngredients;
    }

    public String getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }

    public Recipe getMealRecipe() {
        return mealRecipe;
    }

    public void setMealRecipe(Recipe mealRecipe) {
        this.mealRecipe = mealRecipe;
    }

    public PortionSize getMealPortionSize() {
        return mealPortionSize;
    }

    public void setMealPortionSize(PortionSize mealPortionSize) {
        this.mealPortionSize = mealPortionSize;
    }

    public String getMealWeight() {
        return mealWeight;
    }

    public void setMealWeight(String mealWeight) {
        this.mealWeight = mealWeight;
    }
}
