package com.example.vega2298

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Portada(
    onClickVerEjercicios: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Desarrollo de Aplicaciones para Dispositivos Móviles",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color(0xFF58B8E4)
        )
        Spacer(
            modifier =
            Modifier.padding(24.dp)
        )

        Text(text = "Vega Natalia Camila", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo de IFTS24"
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp)
        ) {


            Text(
                "Índice",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(text = "Ejercicio 1")
            Spacer(modifier = Modifier.padding(8.dp))
            Text(text = "Ejercicio 2")
            Spacer(modifier = Modifier.padding(8.dp))
            Text(text = "Ejercicio 3")
        }

        Button(
            onClick = onClickVerEjercicios,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End)

        ) {
            Text(text = "Ver ejercicios")
        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PortadaPreview() {
    Portada(
        onClickVerEjercicios = {}
    )
}
