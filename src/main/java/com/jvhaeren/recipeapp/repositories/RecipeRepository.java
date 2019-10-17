package com.jvhaeren.recipeapp.repositories;

import com.jvhaeren.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
