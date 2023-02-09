package com.example.dbcheck.database;

import android.content.Context;

import androidx.room.Room;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CoordinateHelper {
    public static final String DB_NAME = "coordinate.db";
    private final CoordinateDao mDao;
    private List<Coordinate> mCoordinateList;

    public CoordinateHelper(Context context) {
        AppDatabase db = Room.databaseBuilder(context, AppDatabase.class, DB_NAME).build();
        this.mDao = db.coordinateDao();
    }

    /**
     *  DBからデータ取得してセット
     */
    public void setCoordinateLocationList() {
        // Roomは非同期でアクセスしないと、エラーを出すので注意
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    mCoordinateList = mDao.getCoordinateList();
                    // UI変更など

                } catch (Exception e) {
                    // エラー処理
                }
            }
        });
    }

    /**
     * DBへデータ追加
     */
    public void insert(Coordinate coordinate){

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    mDao.insert(coordinate);
                } catch (Exception e) {
                    // エラー処理
                }
            }
        });
    }

    /**
     * DBのデータを削除
     */
    public void delete(Coordinate coordinate){
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    mDao.delete(coordinate);
                } catch (Exception e) {
                    // エラー処理
                }
            }
        });
    }
}
