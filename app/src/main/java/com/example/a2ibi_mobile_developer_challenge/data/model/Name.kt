package com.example.a2ibi_mobile_developer_challenge.data.model

data class Name(
    val common: String?,
    val official: String?,
    val nativeName: Map<String, NativeName>?
)