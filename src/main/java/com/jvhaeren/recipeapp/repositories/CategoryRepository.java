package com.jvhaeren.recipeapp.repositories;

import com.jvhaeren.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
