package com.groegcodedev.techgarden

// Clase padre Dispositivo
open class Dispositivo(
    val marca: String,
    val modelo: String,
    var estado: Estado,
    val especificaciones: Especificaciones
) {

    // Metodo para encencer dispositivo
    open fun encender(): String {
        estado = Estado.ENCENDIDO
        return "$marca $modelo ha sido encendido."
    }

    // Metodo para apagar dispositivo
    open fun apagar(): String {
        estado = Estado.APAGADO
        return "$marca $modelo ha sido apagado."
    }

    // Metodo para poner dispositivo en espera
    open fun espera(): String {
        estado = Estado.EN_ESPERA
        return "$marca $modelo esta en modo espera."
    }

    // Metodo __string__ para devolver informacion del dispositivo
    open fun __string__(): String {
        return "Dispositivo: $marca $modelo, Estado: $estado"
    }

    // Metofo que muestra detalles del dispositivo
    open fun mostrarDetalle(): String {
        return "Dispositivo: $marca $modelo, \nEstado: $estado"
    }
}