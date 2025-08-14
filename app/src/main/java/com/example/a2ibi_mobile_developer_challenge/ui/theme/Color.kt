package com.example.a2ibi_mobile_developer_challenge.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Primary = Color(0xFFFF7043)      // laranja vibrante (ícones ativos, botões principais)
val Secondary = Color(0xFF6A5ACD)    // roxo médio (detalhes, botões secundários)
val Accent = Color(0xFF00E5FF)       // ciano vibrante (ações especiais, ex: exportar)
val Background = Color(0xFF030B12)   // azul noturno muito escuro (fundo principal)
val Surface = Color(0xFF142A3A)      // azul médio para cards e top/bottom bar
val OnBackground = Color(0xFFE1F5FE) // texto principal quase branco
val OnSurface = Color(0xFF90A4AE)    // texto secundário / ícones inativos

val backgroundGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF030B12),
        Color(0xFF142A3A),
        Color(0xFF1B3B55)
    ),
    startY = 0f,
    endY = Float.POSITIVE_INFINITY
)