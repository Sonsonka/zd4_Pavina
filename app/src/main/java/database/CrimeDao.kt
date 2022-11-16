package database

import android.arch.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.zd4_pavina.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}