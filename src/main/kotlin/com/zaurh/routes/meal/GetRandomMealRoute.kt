package com.zaurh.routes.meal

import com.zaurh.data.ApiResponse
import com.zaurh.data.model.meals
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getRandomMealRoute(){
    get("/meals_random") {
        try {
            call.respond(
                status = HttpStatusCode.OK,
                message = ApiResponse(
                    success = true,
                    message = "Random meal is retrieved successfully.",
                    meal = meals.random()
                )
            )
        }catch (e: Exception){
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