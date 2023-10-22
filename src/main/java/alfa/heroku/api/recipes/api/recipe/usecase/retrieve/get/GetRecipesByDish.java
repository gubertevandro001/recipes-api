package alfa.heroku.api.recipes.api.recipe.usecase.retrieve.get;

import org.springframework.stereotype.Service;

import alfa.heroku.api.recipes.api.recipe.RecipeAPIClient;

@Service
public class GetRecipesByDish {
	
	private final RecipeAPIClient recipeAPI;
	
	public GetRecipesByDish(RecipeAPIClient recipeAPI) {
		this.recipeAPI = recipeAPI;
	}
	
	public GetRecipesByDishResponse find(String name) {
		return this.recipeAPI.find(name);
	}
}
