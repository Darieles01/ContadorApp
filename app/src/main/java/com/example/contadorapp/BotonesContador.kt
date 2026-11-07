package com.example.contadorapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.contadorapp.ui.theme.ContadorAppTheme

@Composable
fun BotonesContador(
    onDisminuir: () -> Unit,
    onAumentar: () -> Unit,
    onReiniciar: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            Button(onClick = onDisminuir) { Text(text = "-1") }
            Button(onClick = onAumentar) { Text(text = "+1") }
        }
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedButton(onClick = onReiniciar) { Text(text = "Reiniciar") }
    }
}

@Preview(showBackground = true)
@Composable
fun BotonesContadorPreview() {
    ContadorAppTheme {
        BotonesContador(onDisminuir = {}, onAumentar = {}, onReiniciar = {})
    }
}