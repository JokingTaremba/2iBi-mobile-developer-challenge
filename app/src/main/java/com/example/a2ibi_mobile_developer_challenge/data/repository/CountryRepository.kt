package com.example.a2ibi_mobile_developer_challenge.data.repository

import com.example.a2ibi_mobile_developer_challenge.data.model.Country
import com.example.a2ibi_mobile_developer_challenge.data.network.ApiService
import com.example.a2ibi_mobile_developer_challenge.data.network.RetrofitInstance

class CountryRepository(
    private val apiService: ApiService
) {
    suspend fun getCountries(): List<Country> {
        return apiService
            .getAllCountries()
            .sortedBy {
                it.name?.common
            }
    }
}