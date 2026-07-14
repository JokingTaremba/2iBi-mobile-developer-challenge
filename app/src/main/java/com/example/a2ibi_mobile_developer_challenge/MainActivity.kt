package com.example.a2ibi_mobile_developer_challenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.example.a2ibi_mobile_developer_challenge.ui.navigation.AppNavigation
import com.example.a2ibi_mobile_developer_challenge.ui.theme.A2IBIMobileDeveloperChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A2IBIMobileDeveloperChallengeTheme {
                AppNavigation()
            }
        }
    }
}