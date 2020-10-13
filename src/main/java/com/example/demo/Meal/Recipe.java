package com.example.demo.Meal;

import javax.persistence.*;

@Entity
@Table
public class Recipe {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recipeId;

    @Column
    private String recipeName;

    @Column
    private String recipe;




    public Recipe() {
    }

    public Recipe(String recipeName, String recipe) {
        this.recipeName = recipeName;
        this.recipe = recipe;
    }




    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }




}
