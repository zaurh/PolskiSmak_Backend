package com.zaurh.plugins

import com.zaurh.routes.meal.getAllMealsRoute
import com.zaurh.routes.meal.getRandomMealRoute
import com.zaurh.routes.meal.getSpecificMealRoute
import com.zaurh.routes.quote.getRandomQuoteRoute
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        getAllMealsRoute()
        getRandomMealRoute()
        getSpecificMealRoute()
        getRandomQuoteRoute()
        staticResources("/static", "static")
    }
}
