package com.jvhaeren.recipeapp.repositories;

import com.jvhaeren.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface RecipeRepository extends CrudRepository<Recipe, Long>, Repository<Recipe, Long> {
}
