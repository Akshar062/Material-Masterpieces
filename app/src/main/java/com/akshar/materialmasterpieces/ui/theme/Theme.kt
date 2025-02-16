package com.akshar.materialmasterpieces.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF8E24AA),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF4A148C),
    onPrimaryContainer = Color(0xFFE1BEE7),

    secondary = Color(0xFFD32F2F),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFB71C1C),
    onSecondaryContainer = Color(0xFFFFCDD2),

    tertiary = Color(0xFF212121),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFF424242),
    onTertiaryContainer = Color(0xFFBDBDBD),

    background = Color(0xFF121212),
    onBackground = Color(0xFFE0E0E0),
    surface = Color(0xFF1E1E1E),
    onSurface = Color(0xFFFFFFFF)
)

@Composable
fun MaterialMasterpiecesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
//    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }
//
//        darkTheme -> DarkColorScheme
//        else -> LightColorScheme
//    }

    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography = Typography,
        content = content
    )
}