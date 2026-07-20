package com.example.a2ibi_mobile_developer_challenge.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.example.a2ibi_mobile_developer_challenge.ui.theme.OnSurface

@Composable
fun CountryExtraInfo(
    population: Long?,
//    area: Double?
){
    Column {
        Text(
            text = "População: ${
                population?.let {
                    "%,d".format(it)
                } ?: "-"
            }",
            color = OnSurface,
            fontSize = 14.sp
        )

//        Text(
//            text = "Área: ${
//                area?.let {
//                    "$it km²"
//                } ?: "-"
//            }",
//            color = OnSurface,
//            fontSize = 14.sp
//        )
    }
}