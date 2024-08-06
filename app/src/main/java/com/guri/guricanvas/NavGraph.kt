package com.guri.guricanvas

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.guri.guricanvas.screens.ShapeListScreen
import com.guri.guricanvas.screens.ShapeScreen

@Composable
fun MyApp(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val list = listOf("Circle", "Rectangle", "Square", "Triangle", "Pentagon", "Hexagon")
    NavHost(navController = navController, startDestination = "screen_one") {
        composable(
            "screen_one",
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) {
            ShapeListScreen(shapeList = list) { passedName ->
                navController.navigate("screen_two/$passedName")
            }
        }
        composable(
            "screen_two/{name}",
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: "Guest"
            ShapeScreen(itemShape = name)
        }
    }
}