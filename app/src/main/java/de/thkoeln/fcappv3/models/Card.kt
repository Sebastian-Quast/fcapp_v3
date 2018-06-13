package de.thkoeln.fcappv3.models

import java.io.Serializable

data class Card constructor(
        val id: Long,
        val title: String,
        val picturePath: String,
        val problem: String,
        val buts: String,
        val solution: String,
        val keywords: List<String> = listOf()) : Serializable