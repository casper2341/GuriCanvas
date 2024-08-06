package com.guri.guricanvas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShapeListScreen(shapeList: List<String>, onNavigate: (String) -> Unit) {

    Column(modifier = Modifier.padding(vertical = 12.dp).fillMaxSize()) {
        Text(
            text = "GURICanvas",
            modifier = Modifier.padding(vertical = 22.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontSize = 24.sp
        )

        LazyVerticalGrid(
            modifier = Modifier.padding(12.dp),
            columns = GridCells.Adaptive(minSize = 128.dp)
        ) {
            items(shapeList) { item ->
                CompShape(item = item, onNavigate)
            }
        }
    }
}

@Composable
fun CompShape(item: String, onNavigate: (String) -> Unit) {
    Text(
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(4.dp)
            .border(width = 2.dp, color = Color.DarkGray)
            .background(shape = RoundedCornerShape(3.dp), color = Color.Transparent)
            .clickable {
                onNavigate(item)
            }, text = item
    )
}