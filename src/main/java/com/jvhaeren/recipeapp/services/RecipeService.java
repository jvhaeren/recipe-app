package com.jvhaeren.recipeapp.services;

import com.jvhaeren.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
