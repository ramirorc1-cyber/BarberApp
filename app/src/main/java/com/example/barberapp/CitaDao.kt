package com.example.barberapp

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface CitaDao {

    @Insert
    suspend fun insertarCita(cita: Cita)
}
