package com.example.a2ibi_mobile_developer_challenge.data.network.interfaces

import com.example.a2ibi_mobile_developer_challenge.data.model.Country
import retrofit2.http.GET

interface ApiService {

    @GET("v3.1/all")
    suspend fun getAllCountries(): List<Country>
}