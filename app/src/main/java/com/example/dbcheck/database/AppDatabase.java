package com.example.dbcheck.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Coordinate.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    //DAO用メソッド
    public abstract CoordinateDao coordinateDao();
}
