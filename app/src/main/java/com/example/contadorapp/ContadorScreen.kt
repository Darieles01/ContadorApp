package com.example.contadorapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContadorScreen(modifier: Modifier = Modifier) {
    val valorInicial = 0
    var contador by rememberSaveable { mutableIntStateOf(valorInicial) }

    val colorNumero = when {
        contador > 0 -> Color(0xFF2E7D32)
        contador < 0 -> Color(0xFFC62828)
        else -> MaterialTheme.colorScheme.onBackground
    }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Contador", fontSize = 28.sp)
        Text(text = "$contador", fontSize = 72.sp, color = colorNumero)
        Spacer(modifier = Modifier.height(24.dp))
//        BotonesContador(
//            onDisminuir = { contador-- },
//            onAumentar = { contador++ },
//            onReiniciar = { contador = valorInicial }
//        )
    }
}