package com.example.mi_registro.ui.style

import android.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.mi_registro.ui.theme.Dimens

object EstiloTarjeta {
    val forma = RoundedCornerShape(Dimens.radioTarjeta)

    @Composable
    fun colores(): CardColors = CardDefaults.cardColors(
        containerColor = MaterialTheme.colorScheme.surface
    )
    @Composable
    fun elevacion(): CardElevation = CardDefaults.cardElevation(
        defaultElevation = Dimens.elevacionTarjeta
    )

}