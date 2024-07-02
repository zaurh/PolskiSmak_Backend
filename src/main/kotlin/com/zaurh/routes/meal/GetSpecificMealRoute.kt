package com.zaurh.routes.meal

import com.zaurh.data.ApiResponse
import com.zaurh.data.model.meals
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getSpecificMealRoute() {
    get("/meals/{id}") {
        try {
            val id = call.parameters["id"]?.toIntOrNull() // Parse the ID from the path parameters as an Int
            if (id != null) {
                val meal = meals.find { it.mealId == id } // Find the meal with the specified ID
                if (meal != null) {
                    call.respond(
                        status = HttpStatusCode.OK,
                        message = ApiResponse(
                            success = true,
                            message = "Specific meal is retrieved successfully.",
                            meal = meal
                        )
                    )
                } else {
                    call.respond(
                        status = HttpStatusCode.NotFound,
                        message = ApiResponse(
                            success = false,
                            message = "Meal not found."
                        )
                    )
                }
            } else {
                call.respond(HttpStatusCode.BadRequest, "Invalid ID")
            }
        } catch (e: Exception) {
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = ApiResponse(
                    success = false,
                    message = e.message
                )
            )
        }
    }
}