package com.groegcodedev.techgarden

// Clase Ordenador que hereda de clase Dispositivo devolviendo un string
class Ordenador(marca: String, modelo: String, estado: Estado, val tipoCPU: String, val ram: Int, val almacenamiento: Int, val tarjetaVideo: String, val refrigeracionLiquida: Boolean): Dispositivo(
    marca,
    modelo,
    estado
) {
    override fun mostrarDetalle(): String {
        val _refrigeracionLiquida = if (refrigeracionLiquida) {
            "Sí"
        } else {
            "No"
        }
        return "Ordenador: $marca $modelo, \nEstado: $estado, \nCPU: $tipoCPU, \nRAM: $ram GB, \nAlmacenamiento: $almacenamiento TB, \nTarjeta de Video: $tarjetaVideo, \nRefrigeracion Liquida: $_refrigeracionLiquida"
    }
}