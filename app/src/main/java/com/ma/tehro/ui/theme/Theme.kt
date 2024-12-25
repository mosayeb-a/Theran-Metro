package com.ma.tehro.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val AppColorScheme = darkColorScheme(
    primary = Gray,
    onPrimary = Color.White,
    secondary = DarkGray,
    onSecondary = Color.White,
    tertiary = Blue,
    onTertiary = Color.White
)

@Composable
fun TehroTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        content = content
    )
}