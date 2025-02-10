package com.example.actividadpreviaalexamendela2evaluacin.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AyudaEmpleadosViewModel : ViewModel() {
    var temperaturaCelsius by mutableStateOf(0f)
        private set
    var usarFahrenheit by mutableStateOf(false)
        private set
    var temperaturasGuardadas = mutableStateListOf<Int>()
        private set

    fun actualizarTemperatura(value: Float) {
        temperaturaCelsius = value
    }

    fun manipularFahrenheit() {
        usarFahrenheit = !usarFahrenheit
    }

    fun guardarTemperatura() {
        if (temperaturasGuardadas.size >= 50) {
            temperaturasGuardadas.removeAt(0)
        }
        temperaturasGuardadas.add(temperaturaCelsius.toInt())
    }
}