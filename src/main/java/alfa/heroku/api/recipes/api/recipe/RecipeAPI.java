package alfa.heroku.api.recipes.api.recipe;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import alfa.heroku.api.recipes.api.recipe.usecase.retrieve.get.GetRecipesByDishResponse;

@RestController
@RequestMapping(value = "/recipes")
public interface RecipeAPI {
	
	@GetMapping(value = "/dish")
	public ResponseEntity<GetRecipesByDishResponse> find(@RequestParam(name = "name") String name);
}


