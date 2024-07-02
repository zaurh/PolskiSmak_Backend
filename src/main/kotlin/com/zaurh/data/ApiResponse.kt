package com.zaurh.data

import com.zaurh.data.model.MealData
import com.zaurh.data.model.QuoteData
import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val mealList: List<MealData>? = null,
    val meal: MealData? = null,
    val quote: QuoteData? = null,
)
