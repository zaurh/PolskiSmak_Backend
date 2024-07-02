package com.zaurh.data.model

import kotlinx.serialization.Serializable

@Serializable
enum class IngredientUnit {
    GRAMS,
    KILOGRAMS,
    MILLILITERS,
    LITERS,
    TEASPOONS,
    TABLESPOONS,
    CUPS,
    PIECES
}

