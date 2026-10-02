package com.example.mi_registro.ui.style

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mi_registro.ui.theme.Blanco
import com.example.mi_registro.ui.theme.Dimens
import com.example.mi_registro.ui.theme.GrisDashabilitado
import com.example.mi_registro.ui.theme.Primario

object EstilosBoton {
    val forma = RoundedCornerShape(Dimens.radioBoton) // border-radius
    val relleno = PaddingValues(horizontal = 20.dp, vertical = 12.dp) //padding
    // boton principal : fondo morado y texto blanco
    @Composable
    fun coloresPrincipales(): ButtonColors = ButtonDefaults.buttonColors(
        containerColor = Primario, //background-color
        contentColor = Blanco, // color
        disabledContentColor = GrisDashabilitado,
        disabledContainerColor = Blanco
    )
    //botones secundario : transparente , texto color del tema de tlf
    @Composable
    fun coloresSecundario(): ButtonColors = ButtonDefaults.outlinedButtonColors(
        contentColor = MaterialTheme.colorScheme.primary
    )

    //borde secundario
    @Composable
    fun bordeSecundario(): BorderStroke = BorderStroke(
        Dimens.bordeBoton,
        MaterialTheme.colorScheme.primary
    )
    //boton principal (animacion = presione el boton se hunda)
    @Composable
    fun elevacion(): ButtonElevation = ButtonDefaults.buttonElevation(
        defaultElevation = Dimens.elevacionBoton,
        pressedElevation = 1.dp
    )

}

fun Modifier.estiloAltoBoton(): Modifier = this.height(Dimens.alturaBoton)