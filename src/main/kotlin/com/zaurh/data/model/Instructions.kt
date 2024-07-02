package com.zaurh.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Instructions(
    val number: Int = 0,
    val step: String = ""
)
