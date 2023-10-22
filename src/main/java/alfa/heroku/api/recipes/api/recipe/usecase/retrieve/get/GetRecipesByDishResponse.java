package alfa.heroku.api.recipes.api.recipe.usecase.retrieve.get;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GetRecipesByDishResponse(
		@JsonProperty(value = "count") Integer count,
		@JsonProperty(value = "recipes") List<RecipeResponse> recipes) {

}
