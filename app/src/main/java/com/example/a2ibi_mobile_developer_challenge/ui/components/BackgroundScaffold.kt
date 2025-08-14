package com.example.a2ibi_mobile_developer_challenge.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.a2ibi_mobile_developer_challenge.ui.theme.backgroundGradient

@Composable
fun BackgroundScaffold(
    topBar: @Composable (() -> Unit)? = null,
    content: @Composable () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = backgroundGradient)
    ) {
        Column {
            if (topBar != null) {
                topBar()
            }
            content()
        }
    }
}