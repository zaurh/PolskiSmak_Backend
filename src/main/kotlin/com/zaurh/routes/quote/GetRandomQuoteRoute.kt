package com.zaurh.routes.quote

import com.zaurh.data.ApiResponse
import com.zaurh.data.model.quotes
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getRandomQuoteRoute(){
    get("/quote_random") {
        try {
            call.respond(
                status = HttpStatusCode.OK,
                message = ApiResponse(
                    success = true,
                    message = "Random quote is retrieved successfully.",
                    quote = quotes.random()
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