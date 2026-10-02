package com.example.mi_registro.ui.style

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import com.example.mi_registro.ui.theme.Dimens
import com.example.mi_registro.ui.theme.GrisDashabilitado

object EstilosCampo {
    val forma = RoundedCornerShape(Dimens.radioCampo) // border-radius

    @Composable
    fun colores(): TextFieldColors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = MaterialTheme.colorScheme.primary,
        unfocusedBorderColor = GrisDashabilitado,
        focusedLabelColor = MaterialTheme.colorScheme.primary,
        focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
        errorBorderColor = MaterialTheme.colorScheme.error,
        cursorColor = MaterialTheme.colorScheme.primary
    )
}