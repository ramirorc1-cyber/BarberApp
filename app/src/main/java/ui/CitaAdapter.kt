package com.example.barberapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.barberapp.R
import com.example.barberapp.model.Cita

class CitaAdapter(
    private val citas: List<Cita>
) : RecyclerView.Adapter<CitaAdapter.CitaViewHolder>() {

    class CitaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCliente: TextView = itemView.findViewById(R.id.tvCliente)
        val tvServicio: TextView = itemView.findViewById(R.id.tvServicio)
        val tvFechaHora: TextView = itemView.findViewById(R.id.tvFechaHora)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cita, parent, false)
        return CitaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CitaViewHolder, position: Int) {
        val cita = citas[position]
        holder.tvCliente.text = cita.cliente
        holder.tvServicio.text = cita.servicio
        holder.tvFechaHora.text = "${cita.fecha} - ${cita.hora}"
    }

    override fun getItemCount(): Int = citas.size
}
