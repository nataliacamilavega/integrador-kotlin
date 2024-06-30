package com.example.vega2298

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vega2298.ui.theme.Vega2298Theme


@Composable
fun EjercicioDos(
    onClickPreviousAction: () -> Unit,
    onClickNextAction: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = "Icono de checked"
            )
            Text(
                text = "All tasks completed",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    top = 24.dp, bottom = 8.dp
                )
            )
            Text(
                text = "Nice work!",
                fontSize = 16.sp
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
fun EjercicioDosPreview() {
    Vega2298Theme {
        EjercicioDos(
            onClickPreviousAction = { },
            onClickNextAction = { }
        )
    }
}