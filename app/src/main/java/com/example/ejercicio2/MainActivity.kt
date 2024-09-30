package com.example.ejercicio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ejercicio2.Screen.nav.ContactViewModel
import com.example.ejercicio2.Screen.nav.NavigationExample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Obtiene el ViewModel
            val contactViewModel: ContactViewModel = viewModel()

            // Pasa el ViewModel a la función de navegación
            NavigationExample(contactViewModel)
        }
    }
}
