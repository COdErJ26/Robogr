package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //loads the ui component from activity_main.xml

        Log.d("FirstLog","This is my first message");
        Log.e("FirstLog","This is my first message");
        Log.i("FirstLog","This is my first message");
        Log.w("FirstLog","This is my first message");
        Log.v("FirstLog","This is my first message");


    }

    }
