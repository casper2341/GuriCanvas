package com.guri.guricanvas.shapes

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp

@Composable
fun Triangle(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.size(250.dp)) {
        // Create a path to define the triangle
        val path = Path().apply {
            // Move to the top center point
            println(size)
            moveTo(size.width / 2f, 0f)
            // Draw line to bottom left corner
            lineTo(0f, size.height)
            // Draw line to bottom right corner
            lineTo(size.width, size.height)
            // Close the path to form a triangle
            close()
        }

        // Draw the triangle
        drawPath(
            path = path,
            color = Color.Cyan,
        )
    }
}