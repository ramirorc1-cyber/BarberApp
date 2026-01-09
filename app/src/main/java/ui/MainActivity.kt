package com.example.barberapp.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.barberapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCliente = findViewById<EditText>(R.id.etCliente)
        val etServicio = findViewById<EditText>(R.id.etServicio)
        val etFecha = findViewById<EditText>(R.id.etFecha)
        val etHora = findViewById<EditText>(R.id.etHora)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener {
            val cliente = etCliente.text.toString()
            val servicio = etServicio.text.toString()
            val fecha = etFecha.text.toString()
            val hora = etHora.text.toString()

            if (cliente.isBlank() || servicio.isBlank() || fecha.isBlank() || hora.isBlank()) {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Cita guardada correctamente", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
