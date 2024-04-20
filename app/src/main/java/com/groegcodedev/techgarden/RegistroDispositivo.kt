package com.groegcodedev.techgarden

// Object Class Registro de Dispositivos
// Mantener un registro de todos los dispositivos.
// Métodos para agregar, remover y buscar dispositivos en el registro.
object RegistroDispositivo {

    // Lista mutable para almacenar los Dispositivos
    val dispositivos: MutableList<Dispositivo> = mutableListOf()

    // Metodo para agregar Dispositivos al registro
    fun agregarDispositivo(dispositivo: Dispositivo) {
        dispositivos.add(dispositivo)
    }

    // Metodo para eliminar Dispositivo del registro
    fun eliminarDispositivo(dispositivo: Dispositivo) {
        dispositivos.remove(dispositivo)
    }

    // Metodo para buscar Dispositivos en el registro
    fun buscarDispositivo() {

    }

    // Metodo que muestra los Dispositivos que estan en el registro
    fun mostrarRegistros() {
    }
}