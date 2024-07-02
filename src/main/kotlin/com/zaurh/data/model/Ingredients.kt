package com.zaurh.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Ingredients(
    val name: String,
    val imageUrl: String? = "",
    val unit: IngredientUnit? = null,
    val quantity: String? = null,
    val recipe: List<IngredientRecipe>? = null,
    val optional: String? = null
)
