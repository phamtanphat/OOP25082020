package com.example.oop25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // access modifier : Pham vi truy cap (class , object , function)

//        Animal meo = new Animal();
//        meo.name = "Meo duoi dai";
//        meo.weight = 2;
        // Tham chieu
        // Tham tri

        Animal animal = new Animal("Meo tam the",2);
        animal.name = "";
        animal.weight = 0;
        // Tinh dong goi
        // Tinh truou tuong
        // Tinh da hinh
        // Tinh ke thua
        // Quan he has A
    }

}