package com.example.a2ibi_mobile_developer_challenge.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Surface

@Composable
fun CountryCard(){
   Card(
       elevation = CardDefaults.cardElevation( defaultElevation = 4.dp ),
       colors = CardDefaults.cardColors( containerColor = Surface),
               modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
   ) {
        Column (
           modifier = Modifier
               .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
       ){
           Row (
               modifier = Modifier
                        .fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceBetween,
               verticalAlignment = Alignment.Top
               ){

               Column (
                   modifier = Modifier.weight(1f),
                   verticalArrangement = Arrangement.spacedBy(6.dp)
               ){
                   CountryInfo(
                       name = country.name?.common ?: "Unknown",
                       capital = country.capital
                           ?.firstOrNull()
                           ?: "Unknown",
                       region = country.region
                           ?: "Unknown"
                   )
               }
           }

            AsyncImage(
                model = country.flags?.png,
                contentDescription = "Flag",
                modifier = Modifier.size(80.dp)
            )

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                SeeMoreButton(
                    onClick = { }
                )
            }
       }
    }
}