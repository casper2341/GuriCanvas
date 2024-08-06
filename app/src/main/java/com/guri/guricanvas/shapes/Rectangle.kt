package com.guri.guricanvas.shapes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Rectangle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.size(300.dp)) {
        drawRect(color = Color.Yellow, size = Size(size.width, 100.dp.toPx()), topLeft = Offset(20f, 280f))
    }
}