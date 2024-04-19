package com.groegcodedev.techgarden

// Data Class Especificaciones de x Dispositivo
data class Especificaciones(
    // Tipo Ordenador
    val tipoCPU: String,
    val tamañoRAM: Int,
    val tamañoAlmacenamiento: Int,
    val tarjetaMadre: String?,
    val tarjetaGrafica: String?,
    val refrigeracion: String?,
    val fuenteAlimentacion: String?,
    val gabinete: String?,

    // Tipo SmartPhone / Tableta
    val tamañoPantalla: Double?,
    val camaraTrasera: Boolean?,
    val camaraFrontal: Boolean?,
    val colorDispositivo: String?,

    // Tipo conectividad
    val conexionBluetooth: String?,
    val conexionWifi: String?,
    val conexionNFC: String?,
    val OS: String?
)
