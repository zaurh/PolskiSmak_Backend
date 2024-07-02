package com.zaurh.data.model

import kotlinx.serialization.Serializable

@Serializable
data class QuoteData(
    val quote: String,
    val author: String
)

val quotes = listOf(
    QuoteData(
        quote = "One cannot think well, love well, sleep well, if one has not dined well.",
        author = "Virginia Woolf"
    ),
    QuoteData(
        quote = "Tell me what you eat, and I will tell you what you are.",
        author = "Anthelme Brillat—Savarin"
    ),
    QuoteData(
        quote = "There is no sincerer love than the love of food.",
        author = "George Bernard Shaw"
    ),
)
