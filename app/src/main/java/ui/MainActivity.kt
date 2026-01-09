package com.example.barberapp.ui


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.barberapp.R
import com.example.barberapp.ui.AgendarCitaActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAgendar = findViewById<Button>(R.id.btnAgendar)

        btnAgendar.setOnClickListener {
            startActivity(
                Intent(this, AgendarCitaActivity::class.java)
            )
        }
    }
}
