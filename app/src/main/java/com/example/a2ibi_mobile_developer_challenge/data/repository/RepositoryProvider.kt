package com.example.a2ibi_mobile_developer_challenge.data.repository

import com.example.a2ibi_mobile_developer_challenge.data.network.RetrofitInstance

object RepositoryProvider {
    val countryRepository by lazy {
        CountryRepository(
            RetrofitInstance.api
        )
    }
}