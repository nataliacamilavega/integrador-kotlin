package com.example.vega2298

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.example.vega2298.ui.theme.Vega2298Theme

@Composable
fun EjercicioUno(
    onClickPreviousAction: () -> Unit,
    onClickNextAction: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(red = 250, green = 250, blue = 250)),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,

            ) {
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = "Banner de la imagen"
            )
            Text(
                text = "Jetpack Composable Tutorial",
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
                modifier = Modifier.padding(
                    start = 16.dp, end = 16.dp
                ),
                fontSize = 16.sp,
                textAlign = TextAlign.Justify
            )
            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your appl's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI!'s construction, such as initializing an element and then attaching i t to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
                modifier = Modifier.padding(16.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Justify
            )

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
        FloatingActionButton(
            onClick = onClickNextAction,
            modifier = Modifier
                .padding(16.dp)
                .align(
                    Alignment.BottomEnd
                )
                .size(
                    width = 64.dp, height = 64.dp
                ),
            shape = CircleShape
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "Anterior"
            )
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EjercicioUnoPreview() {
    Vega2298Theme {
        EjercicioUno(
            onClickPreviousAction = { },
            onClickNextAction = { }
        )
    }
}
