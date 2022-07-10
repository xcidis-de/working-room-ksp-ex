package com.crypto.encrypditmobile.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = teal,
    primaryVariant = medTeal,
    secondary = mint,
    background = darkMocha,
    surface = medMocha,
    onSecondary = teal,
    onBackground = teal,
    onSurface = mint,
)

private val LightColorPalette = lightColors(
    primary = teal,
    primaryVariant = medTeal,
    secondary = mint,
    background = lightCloud,
    surface = lightCloud,
    onPrimary = lightCloud,
    onSecondary = black,
    onBackground = black,
    onSurface = black,
)

@Composable
fun EncrypditMobileTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}