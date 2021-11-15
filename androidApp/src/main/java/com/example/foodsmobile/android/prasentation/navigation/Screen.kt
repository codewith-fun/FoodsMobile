package com.example.foodsmobile.android.prasentation.navigation

sealed class Screen(val route:String) {
    object RecipeList:Screen("recipeList")
    object RecipeDetails:Screen("recipeDetails")
}