package com.example.demo.Recipe;

import java.util.List;

public interface RecipeService {

    public List<Recipe> getRecipeList();
    public Recipe getRecipe(int id);
    public void addRecipe();
    public void updateRecipe(int id);
    public void deleteRecipe(int id);

}
