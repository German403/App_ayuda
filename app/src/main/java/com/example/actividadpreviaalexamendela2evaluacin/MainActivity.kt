package com.example.actividadpreviaalexamendela2evaluacin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.actividadpreviaalexamendela2evaluacin.ui.AyudaEmpleadosApp

/*
Presencia de la empresa en el mundo (ciudad y país)
● Madrid - España
● París - Francia
● Londres - Reino Unido
● Porto Alegre - Brasil
● Acapulco - México
● Vancouver - Canadá
● Houston - Estados Unidos de América
● Casablanca - Marruecos
● Osaka - Japón
● Melbourne - Australia
● Ankara - Turquía
● Dubai - Emiratos Árabes Unidos
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AyudaEmpleadosApp()
        }
    }
}