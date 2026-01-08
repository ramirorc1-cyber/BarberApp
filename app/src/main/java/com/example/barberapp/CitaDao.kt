package com.example.barberapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CitaDao {

    @Insert
    suspend fun insertarCita(cita: Cita)
    @Query("SELECT * FROM citas ORDER BY fecha, hora")
    suspend fun obtenerCitas(): List<Cita>

}
