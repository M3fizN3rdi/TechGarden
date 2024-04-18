package com.groegcodedev.techgarden

// Clase SmartPhone que hereda de clase Dispositivo y devuelve un strinf
class SmartPhone(marca: String, modelo: String, estado: Estado, val es_dual_sim: Boolean): Dispositivo(
    marca,
    modelo,
    estado,
) {
    override fun mostrarDetalle(): String {
        val dualSIM = if (es_dual_sim) {
            "Sí"
        }else {
            "No"
        }
        return "SmartPhone: $marca $modelo, \nEstado: $estado, \nEs Dual Sim: $dualSIM"
    }
}