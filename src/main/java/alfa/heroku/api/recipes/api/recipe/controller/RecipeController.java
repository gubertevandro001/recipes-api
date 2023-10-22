package alfa.heroku.api.recipes.api.recipe.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import alfa.heroku.api.recipes.api.recipe.RecipeAPI;
import alfa.heroku.api.recipes.api.recipe.usecase.retrieve.get.GetRecipesByDish;
import alfa.heroku.api.recipes.api.recipe.usecase.retrieve.get.GetRecipesByDishResponse;

@Service
public class RecipeController implements RecipeAPI {
	
	private final GetRecipesByDish getRecipes;
	
	public RecipeController(GetRecipesByDish getRecipes) {
		this.getRecipes = getRecipes;
	}
	
	@Override
	public ResponseEntity<GetRecipesByDishResponse> find(String name) {
		return ResponseEntity.ok().body(getRecipes.find(name));
	}
}
