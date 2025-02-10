package com.example.actividadpreviaalexamendela2evaluacin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actividadpreviaalexamendela2evaluacin.ui.theme.ActividadPreviaAlExamenDeLa2ªEvaluaciónTheme

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
            ActividadPreviaAlExamenDeLa2ªEvaluaciónTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    LazyColumn {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActividadPreviaAlExamenDeLa2ªEvaluaciónTheme {
        Greeting()
    }
}