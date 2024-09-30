package com.example.ejercicio2.Screen.nav
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenB(navController: NavController, contactViewModel: ContactViewModel) {

    val backgroundColor = Color(0xFFc6ded9)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    Spacer(modifier = Modifier.height(70.dp))
                    Text(
                        text = "Contactos Registrados",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        modifier = Modifier.fillMaxWidth().padding(32.dp)
                    )
                }

                items(contactViewModel.contactList) { contact ->
                    Card(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(0.9f),
                        border = BorderStroke(1.dp, Color.Gray),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "${contact.nombre} ${contact.apellido}",
                                fontSize = 20.sp,
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Text(
                                text = "Teléfono: ${contact.telefono}",
                                fontSize = 16.sp,
                                style = MaterialTheme.typography.bodyMedium
                            )
                            Text(
                                text = "Dirección: ${contact.direccion}",
                                fontSize = 16.sp,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }

            Button(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray, contentColor = Color.White)
            ) {
                Text("Volver a registrar", fontSize = 18.sp)
            }
        }
    }
}
