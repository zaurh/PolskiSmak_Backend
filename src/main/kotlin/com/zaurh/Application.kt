package com.zaurh

import com.zaurh.plugins.configureMonitoring
import com.zaurh.plugins.configureRouting
import com.zaurh.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
