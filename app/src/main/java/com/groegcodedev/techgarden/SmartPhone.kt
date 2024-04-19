package com.groegcodedev.techgarden

// Clase SmartPhone que hereda de clase Dispositivo y devuelve un strinf
class SmartPhone(marca: String, modelo: String, estado: Estado, especificaciones: Especificaciones, val es_dual_sim: Boolean): Dispositivo(
    marca,
    modelo,
    estado,
    especificaciones
) {
    // Metodo que muestra los detalles de x Dispositivo
    override fun mostrarDetalle(): String {
        val dualSIM = if (es_dual_sim) {
            "Sí"
        }else {
            "No"
        }
        return "SmartPhone: $marca $modelo, \nEstado: $estado, \nEs Dual Sim: $dualSIM"
    }
}