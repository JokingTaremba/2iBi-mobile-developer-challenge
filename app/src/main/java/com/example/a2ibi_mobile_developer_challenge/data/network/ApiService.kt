package com.example.a2ibi_mobile_developer_challenge.data.network

import com.example.a2ibi_mobile_developer_challenge.data.model.CountriesResponse
import com.example.a2ibi_mobile_developer_challenge.data.model.Country
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {

    @GET("countries/v5")
    suspend fun getCountries(
        @Header("Authorization")
        token:String = "Bearer rc_live_demo",
    ):CountriesResponse
}