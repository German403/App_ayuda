package com.example.actividadpreviaalexamendela2evaluacin.navegacion

import androidx.compose.foundation.Image
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.actividadpreviaalexamendela2evaluacin.R


@Composable
fun BottomNavigationBar(navController: NavController) {
    NavigationBar {
        NavigationBarItem(
            icon = { Image(painter = painterResource(id =
            R.drawable.termometro_indooroutdoor_di_legno_20cm
            ), contentDescription = "Temperature") },
            label = { Text("Temp") },
            selected = false,
            onClick = { navController.navigate("temperature_screen") }
        )
        NavigationBarItem(
            icon = { Image(painter = painterResource(id = R.drawable.reloj), contentDescription = "World Clock") },
            label = { Text("Clock") },
            selected = false,
            onClick = { navController.navigate("world_clock_screen") }
        )
        NavigationBarItem(
            icon = { Image(painter = painterResource(id = R.drawable.telefono), contentDescription = "Screen 3") },
            label = { Text("Screen 3") },
            selected = false,
            onClick = { navController.navigate("screen3") }
        )
    }
}