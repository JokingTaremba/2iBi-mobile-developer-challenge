package com.example.a2ibi_mobile_developer_challenge.ui.screens.home.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.a2ibi_mobile_developer_challenge.ui.theme.Primary

@Composable
fun SeeMoreButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(
            text = "Ver mais detalhes do pais",
            style = MaterialTheme.typography.labelMedium,
            color = Primary
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = ">",
            style = MaterialTheme.typography.labelMedium,
            color = Primary
        )
    }
}