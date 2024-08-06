package com.guri.guricanvas.shapes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Circle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.size(300.dp)) {
        drawCircle(color = Color.Yellow, radius = size.minDimension / 2)
    }
}