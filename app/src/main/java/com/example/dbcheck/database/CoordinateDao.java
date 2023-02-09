package com.example.dbcheck.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CoordinateDao {
    @Query("SELECT * FROM coordinates ORDER BY id ASC")
    List<Coordinate> getCoordinateList();

    @Query("SELECT COUNT(id) FROM coordinates")
    int getColCount();
    @Insert
    void insert(Coordinate coordinate);

    @Update
    void update(Coordinate coordinate);

    @Delete
    void delete(Coordinate coordinate);
}
