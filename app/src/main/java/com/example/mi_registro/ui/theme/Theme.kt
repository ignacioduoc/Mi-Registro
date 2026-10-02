package com.example.mi_registro.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val EsquemaOscuro = darkColorScheme(
    primary = PrimarioClaro ,
    onPrimary = PrimarioOscuro,
    primaryContainer = PrimarioOscuro,
    onPrimaryContainer = PrimarioClaro,
    secondary = Secundario,
    onSecondary = Blanco,
    tertiary = Acento,
    onTertiary = Blanco,
    background = FondoOscuro,
    onBackground = TextoClaro,
    surface = SuperficieOscura,
    onSurface = TextoClaro

)

private val EsquemaBlanco = lightColorScheme(
    primary = Primario ,
    onPrimary = Blanco,
    primaryContainer = PrimarioClaro,
    onPrimaryContainer = PrimarioOscuro,
    secondary = Secundario,
    onSecondary = Blanco,
    tertiary = Acento,
    onTertiary = Blanco,
    background = FondoBlanco,
    onBackground = TextoOscuro,
    surface = SuperFicieClara,
    onSurface = TextoOscuro
)

@Composable
fun MiregistroTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}