package com.example.vega2298

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.vega2298.ui.theme.Vega2298Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Vega2298Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TpIntegradorScreenSwitcher(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()

                    )
                }
            }
        }
    }
}

@Composable
fun TpIntegradorScreenSwitcher(modifier: Modifier) {
    var currentScreen by remember { mutableStateOf("Portada") }

    Surface(modifier = modifier) {
        when (currentScreen) {
            "Portada" -> Portada {
                currentScreen = "EjercicioUno"
            }

            "EjercicioUno" -> EjercicioUno(
                onClickNextAction = { currentScreen = "EjercicioDos" },
                onClickPreviousAction = { currentScreen = "Portada" }
            )
            "EjercicioDos" -> EjercicioDos(
                onClickPreviousAction = { currentScreen = "EjercicioUno" },
                onClickNextAction = { currentScreen = "EjercicioTres" }
            )

            "EjercicioTres" -> EjercicioTres { currentScreen = "EjercicioDos" }
        }
    }
}
