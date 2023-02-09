package com.example.dbcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.dbcheck.database.Coordinate;
import com.example.dbcheck.database.CoordinateHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoordinateHelper coordinateHelper = new CoordinateHelper(this);
        for( int i=0; i<100000; i++ ){
            Coordinate coordinate = new Coordinate(i);
            coordinateHelper.insert(coordinate); // データの追加
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        findViewById(R.id.button).setOnClickListener(view -> {
            Log.d("DEBUG", "");
        });
    }
}