package com.example.a2ibi_mobile_developer_challenge.data

import com.example.a2ibi_mobile_developer_challenge.data.network.RetrofitInstance
import com.example.a2ibi_mobile_developer_challenge.data.repository.CountryRepository

object RepositoryProvider {
    val countryRepository by lazy {
        CountryRepository(
            RetrofitInstance.api
        )
    }
}