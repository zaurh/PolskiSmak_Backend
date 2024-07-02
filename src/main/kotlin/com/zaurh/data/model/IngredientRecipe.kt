package com.zaurh.data.model

import kotlinx.serialization.Serializable

@Serializable
data class IngredientRecipe(
    val name: String,
    val unit: IngredientUnit,
    val imageUrl: String? = null,
    val quantity: String,
    val optional: String? = null
)
