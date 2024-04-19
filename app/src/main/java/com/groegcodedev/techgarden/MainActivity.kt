package com.groegcodedev.techgarden

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.groegcodedev.techgarden.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.message0.text = "Mod Groeg Fausto Dev"

        /*val telefono1: Dispositivo = SmartPhone("Samsung", "Galaxy S24+", Estado.ENCENDIDO, false)
        val pc1: Dispositivo = Ordenador("Asus", "ROG Strix", Estado.EN_ESPERA, "i13900K", 64, 2, "Geforce RTX4090", true)
        val tableta1: Dispositivo = Tableta("iPad", "Pro 12", Estado.APAGADO, 12.9)

        binding.message1.text = "${pc1.__string__()}\n"
        binding.message2.text = "\n${telefono1.mostrarDetalle()}\n"
        binding.message3.text ="\n${tableta1.mostrarDetalle()}"*/

        val especificacionesOrdenador1 = Especificaciones(
            "Intel Core i9 13900k",
            64,
            4,
            "Asus ROG Maximus z790 Hero EVA-02 Edition",
            "Asus ROG Strix GeForce RTX 4070 4090 24GB OC EVA-02 Edition",
            "Asus ROG Ryujin III 360 ARGB EVA-02 Edition",
            "Asus ROG Thor 1000W Platinum II EVA Edition",
            "Asus ROG Hyperion EVA-02 Edition",
            null,
            null,
            null,
            null,
            "Bluetooth versión 5.3",
            "Intel WI-FI 6E",
            null,
            "Windows 11 Pro"
        )
        val ordenador1: Dispositivo = Ordenador("Asus", "ROG", Estado.ENCENDIDO, especificacionesOrdenador1)
        binding.message1.text = "Ordenador #1:\n\nCPU: ${ordenador1.especificaciones.tipoCPU}"+
                                "\nRAM: ${ordenador1.especificaciones.tamañoRAM} GB"+
                                "\nAlmacenamiento: M.2 Sam ${ordenador1.especificaciones.tamañoAlmacenamiento} TB"+
                                "\nMainboard: ${ordenador1.especificaciones.tarjetaMadre}"+
                                "\nTarjeta Grafica: ${ordenador1.especificaciones.tarjetaGrafica}"+
                                "\nEnfiramiento: ${ordenador1.especificaciones.refrigeracion}"+
                                "\nAlimentacion: ${ordenador1.especificaciones.fuenteAlimentacion}"+
                                "\nGabinete: ${ordenador1.especificaciones.gabinete}\n"

        val especificacionesCelular1 = Especificaciones(
            "Qualcomm Snapdragon 8 Gen 3",
            12,
            512,
            null,
            null,
            null,
            "5000mAh",
            null,
            6.8,
            true,
            true,
            "Negro",
            "v5.3",
            "Si",
            "Si",
            "Android 14 basado en One UI 6.1"
        )
        val celular1: Dispositivo = SmartPhone("Samsung", "Galaxy S24 Ultra", Estado.NUEVO, especificacionesCelular1, true)
        binding.message2.text = celular1.mostrarDetalle()


       /*val especificacionesTableta1 = Especificaciones(
            "M2 de Apple",
            16,
            2,
            null,
            null,
            null,
            "No especificado",
            null,
            12.9,
            true,
            true,
            "Gris espacial",
            "Si",
            "Si",
            "No especificado",
            "iPadOS 17.4"
        )
        val tableta1: Dispositivo = Tableta("Apple", "iPad Pro", Estado.APAGADO, especificacionesCelular1, true, 12.9)
        binding.message3.text = "\nTableta #1:\n\nCPU: ${tableta1.especificaciones.tipoCPU}"+
                                "\nRAM: ${tableta1.especificaciones.tamañoRAM} GB"+
                                "\nAlmacenamiento: ${tableta1.especificaciones.tamañoAlmacenamiento} TB"+
                                "\nColor: ${tableta1.especificaciones.colorDispositivo}"+
                                "\nBluetooht: ${tableta1.especificaciones.conexionBluetooth}"+
                                "\nWiFi: ${tableta1.especificaciones.conexionWifi}"+
                                "\nOs: ${tableta1.especificaciones.OS}"*/



    }
}