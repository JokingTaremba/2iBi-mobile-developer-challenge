package com.example.a2ibi_mobile_developer_challenge.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a2ibi_mobile_developer_challenge.data.model.Country
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Surface

@Composable
fun CountryCard(
    country: Country,
    onClick: () -> Unit = {}
) {

    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Surface
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ){
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(country.flags?.png)
                        .crossfade(true)
                        .build(),

                    contentDescription = null
                )

                CountryInfo(
                    name = country.name?.common
                        ?: "Unknown",
                    capital = country.capital
                        ?.firstOrNull()
                        ?: "Unknown",
                    region = country.region
                        ?: "Unknown"
                )
            }

            CountryExtraInfo(
                population = country.population,
                area = country.area
            )
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                SeeMoreButton(
                    onClick = onClick
                )
            }
        }
    }
}