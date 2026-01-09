package com.example.barberapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.barberapp.R
import com.example.barberapp.model.Cita

class MainActivity : AppCompatActivity() {

    private val listaCitas = mutableListOf<Cita>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvCitas)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CitaAdapter(listaCitas)

        // 🔹 Datos de prueba (por ahora)
        listaCitas.add(
            Cita("Juan", "Corte", "10/01/2026", "10:30")
        )
        listaCitas.add(
            Cita("Pedro", "Barba", "10/01/2026", "11:00")
        )

        recyclerView.adapter?.notifyDataSetChanged()
    }
}
