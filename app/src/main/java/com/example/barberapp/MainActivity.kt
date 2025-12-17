package com.example.barberapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAgendar = findViewById<Button>(R.id.btnGuardar)

        btnAgendar.setOnClickListener {
            val intent = Intent(this, AgendarCitaActivity::class.java)
            startActivity(intent)
        }
    }
}
