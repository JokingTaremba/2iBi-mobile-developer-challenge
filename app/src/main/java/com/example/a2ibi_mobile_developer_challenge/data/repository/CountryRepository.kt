package com.example.a2ibi_mobile_developer_challenge.data.repository

import com.example.a2ibi_mobile_developer_challenge.data.model.Country
import com.example.a2ibi_mobile_developer_challenge.data.network.RetrofitInstance

class CountryRepository {
    suspend fun getCountries(): List<Country> {
        return RetrofitInstance.api.getAllCountries()
    }
}