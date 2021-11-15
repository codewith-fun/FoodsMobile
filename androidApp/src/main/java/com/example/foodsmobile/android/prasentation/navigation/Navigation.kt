package com.example.foodsmobile.android.prasentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.foodsmobile.android.prasentation.recipe_details.RecipeDetailScreen
import com.example.foodsmobile.android.prasentation.recipe_list.RecipeListScreen

@Composable
fun Navigations(){
    val navController = rememberNavController()
    NavHost(navController = navController,startDestination = Screen.RecipeList.route ){
        composable(route = Screen.RecipeList.route){navBackStackEntry ->
            RecipeListScreen(onSelectRecipe = {recipeId ->
                navController.navigate(Screen.RecipeDetails.route+"/$recipeId")
            })
        }

        composable(
            route = Screen.RecipeDetails.route+"/{recipeId}",
            arguments = listOf(navArgument("recipeId"){
                type = NavType.IntType
            })
        ){navBackStackEntry ->
           RecipeDetailScreen(recipeId = navBackStackEntry.arguments?.getInt("recipeId"))
        }
    }
}