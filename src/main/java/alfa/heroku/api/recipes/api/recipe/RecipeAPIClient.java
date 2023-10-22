package alfa.heroku.api.recipes.api.recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import alfa.heroku.api.recipes.api.recipe.usecase.retrieve.get.GetRecipesByDishResponse;

@org.springframework.cloud.openfeign.FeignClient(name = "recipe", url = "https://forkify-api.herokuapp.com/api/search")
public interface RecipeAPIClient {
	
	@GetMapping
	public GetRecipesByDishResponse find(@RequestParam("q") String dish);
}
