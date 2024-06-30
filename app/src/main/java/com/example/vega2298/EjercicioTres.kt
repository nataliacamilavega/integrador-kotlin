package com.example.vega2298

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vega2298.ui.theme.Vega2298Theme

class EjercicioTresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioTres()
        }
    }
}


@Composable
fun Cuadrante(title: String, body: String) {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(
                bottom = 16.dp
            )
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }

}


@Composable
fun EjercicioTres(onClickPreviousAction: () -> Unit = {}) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color(0xFFEADDFF))
                        .fillMaxSize()
                ) {
                    Cuadrante(
                        title = "Text composable",
                        body = "Displays text and follows the recommended Material Design guidelines."
                    )
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color(0xFFD0BCFF))
                        .fillMaxSize()
                ) {
                    Cuadrante(
                        title = "Image composable",
                        body = "Creates a composable that lays out and draws a given painter class object."
                    )
                }
            }
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color(0xFFB69DF8))
                        .fillMaxSize()
                ) {
                    Cuadrante(
                        title = "Row composable",
                        body = "A layout composable that places its children in a horizontal sequence."
                    )
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color(0xFFF6EDFF))
                        .fillMaxSize()
                ) {
                    Cuadrante(
                        title = "Column composable",
                        body = "A layout composable that places its children in a vertical sequence."
                    )
                }
            }

        }
        FloatingActionButton(
            onClick = onClickPreviousAction,
            modifier = Modifier
                .padding(16.dp)
                .align(
                    Alignment.BottomStart
                )
                .size(
                    width = 64.dp, height = 64.dp
                ),
            shape = CircleShape
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Anterior"
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EjercicioTresPreview() {
    Vega2298Theme {
        EjercicioTres(
            onClickPreviousAction = { }
        )
    }
}