package com.groegcodedev.techgarden

// Clase Ordenador que hereda de clase Dispositivo devolviendo un string
class Ordenador(marca: String, modelo: String, estado: Estado, especificaciones: Especificaciones): Dispositivo(
    marca,
    modelo,
    estado,
    especificaciones
) {

    // Metodo que muestra los detalles de x dispositivo
    override fun mostrarDetalle(): String {
        return "Ordenador: $marca $modelo, \nEstado: $estado"
    }
}