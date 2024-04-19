package com.groegcodedev.techgarden

// Clase Tableta que hereda de clase Dispositivo devolviendo un string
class Tableta(marca: String, modelo: String, estado: Estado, especificaciones: Especificaciones,val es_dual_sim: Boolean, val tamaño_pantalla: Double): Dispositivo(
    marca,
    modelo,
    estado,
    especificaciones
) {

    // Metodo que muestra los detalles de x dispositivo
    override fun mostrarDetalle(): String {
        val dualSIM = if (es_dual_sim) {
            "Sí"
        }else {
            "No"
        }
        return "Tableta: $marca $modelo, \nEstado: $estado, \nTamaño de Pantalla: $tamaño_pantalla"
    }
}