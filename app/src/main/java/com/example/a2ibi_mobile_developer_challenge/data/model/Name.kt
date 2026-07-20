package com.example.a2ibi_mobile_developer_challenge.data.model

import com.squareup.moshi.Json

data class Name(
    val common: String?,
    val official: String?,
    @Json(name = "native")
    val nativeName: Map<String, NativeName>?
)