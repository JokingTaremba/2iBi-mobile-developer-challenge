package com.example.a2ibi_mobile_developer_challenge.data.model

import com.squareup.moshi.Json

data class Flag(
    @Json(name = "url_png")
    val png: String?,
    @Json(name = "url_svg")
    val svg: String?
)