package data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "citas")
data class Cita(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val cliente: String,
    val servicio: String,
    val fecha: String,
    val hora: String
)
