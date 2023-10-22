package alfa.heroku.api.recipes.api.recipe.usecase.retrieve.get;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RecipeResponse(
		@JsonProperty(value = "publisher") String publisher,
		@JsonProperty(value = "title") String title, 
		@JsonProperty(value = "source_url") String sourceUrl,
		@JsonProperty(value = "recipe_id") String recipeId, 
		@JsonProperty(value = "image_url") String imageUrl,
		@JsonProperty(value = "social_rank") Long socialRank,
		@JsonProperty(value = "publisher_url") String publisherUrl) {

}
