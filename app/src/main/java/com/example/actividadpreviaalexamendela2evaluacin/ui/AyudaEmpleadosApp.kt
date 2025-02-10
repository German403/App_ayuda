package com.example.actividadpreviaalexamendela2evaluacin.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.actividadpreviaalexamendela2evaluacin.R
import com.example.actividadpreviaalexamendela2evaluacin.conversor.CelsiusToFahrenheit
import com.example.actividadpreviaalexamendela2evaluacin.viewmodel.TemperaturaViewModel
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.actividadpreviaalexamendela2evaluacin.navegacion.BottomNavigationBar
import com.example.actividadpreviaalexamendela2evaluacin.viewmodel.AyudaEmpleadosViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AyudaEmpleadosApp(viewModel: AyudaEmpleadosViewModel = viewModel()) {
    val temperatura = viewModel.temperaturaCelsius
    val esFahrenheit = viewModel.usarFahrenheit
    val temperaturasGuardadas = viewModel.temperaturasGuardadas
    val navController = rememberNavController()


}