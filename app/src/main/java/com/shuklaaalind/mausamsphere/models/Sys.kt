package com.shuklaaalind.mausamsphere.models

import java.io.Serializable

data class Sys (
    val type: Int,
    val message: Double,
    val name: String,
    val country: String,
    val sunrise: Long,
    val sunset: Long
    ):Serializable