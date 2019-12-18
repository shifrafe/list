package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.storage.StorageReference;


public class MainActivity extends AppCompatActivity {
   private Button but;
   private DatabaseReference database;
  private   StorageReference store;
  private static final int CAMERA_REQUEST_CODE = 1;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        but = (Button) findViewById(R.id.btcreate);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CreateBookActivity.class);
                startActivity(intent);
            }

        });


        }

}

