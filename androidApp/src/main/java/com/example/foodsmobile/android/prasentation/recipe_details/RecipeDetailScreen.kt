package com.example.foodsmobile.android.prasentation.recipe_details

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun RecipeDetailScreen(recipeId:Int?){
    if (recipeId== null){
        Text("ERROR")
    }else
        Text("RecipeDetailScreen : ${recipeId}")
}