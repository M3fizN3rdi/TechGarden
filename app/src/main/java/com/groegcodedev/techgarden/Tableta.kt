package com.groegcodedev.techgarden

// Clase Tableta que hereda de clase Dispositivo devolviendo un string
class Tableta(marca: String, modelo: String, estado: Estado, val tamaño_pantalla: Double): Dispositivo(
    marca,
    modelo,
    estado,
) {
    override fun mostrarDetalle(): String {
        return "Tableta: $marca $modelo, \nEstado: $estado, \nTamaño de Pantalla: $tamaño_pantalla"
    }
}