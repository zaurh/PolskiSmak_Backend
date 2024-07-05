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
        quote = "The secret ingredient is always love.",
        author = "Wolfgang Puck"
    ),
    QuoteData(
        quote = "There is no sincerer love than the love of food.",
        author = "George Bernard Shaw"
    ),
    QuoteData(
        quote = "First we eat, then we do everything else.",
        author = "M.F.K. Fisher"
    ),
    QuoteData(
        quote = "A good cook is like a sorceress who dispenses happiness.",
        author = "Elsa Schiaparelli"
    ),
    QuoteData(
        quote = "Good food is the foundation of genuine happiness.",
        author = "Auguste Escoffier"
    ),
    QuoteData(
        quote = "A recipe has no soul. You, as the cook, must bring soul to the recipe.",
        author = "Thomas Keller"
    ),
    QuoteData(
        quote = "Food is symbolic of love when words are inadequate.",
        author = "Alan D. Wolfelt"
    ),
    QuoteData(
        quote = "Cooking is a philosophy; it's not a recipe.",
        author = "Marco Pierre White"
    )
)
