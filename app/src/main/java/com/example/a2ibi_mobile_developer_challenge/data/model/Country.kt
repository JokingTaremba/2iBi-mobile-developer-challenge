package com.example.a2ibi_mobile_developer_challenge.data.model
data class Country(
    val names: Name,
    val region: String?,
    val subregion: String?,
    val population: Long?,
    val timezones: List<String>?,
    val capitals: List<Capital>?,
    val flag: Flag?

)