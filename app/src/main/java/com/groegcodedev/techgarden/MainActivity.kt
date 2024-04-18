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

        val telefono1: Dispositivo = SmartPhone("Samsung", "Galaxy S24+", Estado.ENCENDIDO, false)
        val pc1: Dispositivo = Ordenador("Asus", "ROG Strix", Estado.EN_ESPERA, "i13900K", 64, 2, "Geforce RTX4090", true)
        val tableta1: Dispositivo = Tableta("iPad", "Pro 12", Estado.APAGADO, 12.9)

        binding.message1.text = "${pc1.__string__()}\n"
        binding.message2.text = "\n${telefono1.mostrarDetalle()}\n"
        binding.message3.text ="\n${tableta1.mostrarDetalle()}"


    }
}