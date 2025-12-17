package com.example.barberapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgendarCitaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agendar_cita)

        val etCliente = findViewById<EditText>(R.id.etCliente)
        val etServicio = findViewById<EditText>(R.id.etServicio)
        val etFecha = findViewById<EditText>(R.id.etFecha)
        val etHora = findViewById<EditText>(R.id.etHora)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener { it: View? ->

            val cliente = etCliente.text.toString()
            val servicio = etServicio.text.toString()
            val fecha = etFecha.text.toString()
            val hora = etHora.text.toString()

            if (cliente.isEmpty() || servicio.isEmpty() || fecha.isEmpty() || hora.isEmpty()) {
                Toast.makeText(
                    this,
                    "Completa todos los campos",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this,
                    "Cita guardada para $cliente\n$servicio\n$fecha - $hora",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
