package awesoft.mofood;

import turniplabs.halplibe.helper.RecipeHelper;

public class recipes {
	public static void register() {
		RecipeHelper.Smelting.createRecipe(MoFood.foodporkchop,MoFood.foodporkchopraw);
		RecipeHelper.Blasting.createRecipe(MoFood.foodporkchop,MoFood.foodporkchopraw);
		RecipeHelper.Smelting.createRecipe(MoFood.foodmutton,MoFood.foodmuttonraw);
		RecipeHelper.Blasting.createRecipe(MoFood.foodmutton,MoFood.foodmuttonraw);
		RecipeHelper.Smelting.createRecipe(MoFood.foodsteak,MoFood.foodsteakraw);
		RecipeHelper.Blasting.createRecipe(MoFood.foodsteak,MoFood.foodsteakraw);
	}
}
