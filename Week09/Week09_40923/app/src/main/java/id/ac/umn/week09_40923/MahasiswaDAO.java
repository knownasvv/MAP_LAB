package id.ac.umn.week09_40923;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MahasiswaDAO {
    @Query("SELECT * FROM tblmahasiswa")
    LiveData<List<Mahasiswa>> getAllMahasiswa();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Mahasiswa mhs);

    @Delete
    void delete(Mahasiswa mhs);

    @Update
    void update(Mahasiswa mhs);

    @Query("DELETE FROM tblMahasiswa")
    void deleteAll();

}
