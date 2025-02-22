package com.app.sagliklikal.model.exercise


import com.google.gson.annotations.SerializedName

data class Leg(
    @SerializedName("bodyPart")
    val bodyPart: String,
    @SerializedName("exercises")
    val exercises: List<Exercise>,
    @SerializedName("imageURL")
    val imageURL: String
)