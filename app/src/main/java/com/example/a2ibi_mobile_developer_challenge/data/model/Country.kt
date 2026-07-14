package com.example.a2ibi_mobile_developer_challenge.data.model
data class Country (
    val name: Name?,
    val capital: List<String>?,
    val region: String?,
    val subregion: String?,
    val population: Long?,
    val area: Double?,
    val timezones: List<String>?,
    val flags: Flags?
)