package com.example.ejercicio2.Screen.nav

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

data class Contact(
    val nombre: String,
    val apellido: String,
    val telefono: String,
    val direccion: String
)

class ContactViewModel : ViewModel() {
    // Lista de contactos que puede ser observada
    val contactList: SnapshotStateList<Contact> = mutableStateListOf()

    // Función para agregar un nuevo contacto a la lista
    fun addContact(nombre: String, apellido: String, telefono: String, direccion: String): Boolean {
        // Verificar que los campos no estén vacíos
        return if (nombre.isNotBlank() && apellido.isNotBlank() && telefono.isNotBlank() && direccion.isNotBlank()) {
            contactList.add(Contact(nombre, apellido, telefono, direccion))
            true  // Retorna true si el contacto se agregó correctamente
        } else {
            false // Retorna false si alguno de los campos estaba vacío
        }
    }
}

