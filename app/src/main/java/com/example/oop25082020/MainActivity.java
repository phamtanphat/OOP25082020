package com.example.oop25082020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

//        Animal animal = new Animal("Meo tam the",2);
//        animal.name = "";
//        animal.weight = 0;
        // Tinh dong goi
        // Tinh ke thua
        // Tinh truou tuong
        // Tinh da hinh
        // Quan he has A

//        Cat cat = new Cat("Con meo",2);
//        cat.setName("Meo tam the");
//        cat.setWeight(3);
//        Log.d("BBB",cat.toString());

//        showToast();
    }
    //overload : phuong thuc nap chong

    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    private void showToast(Integer integer){
        Toast.makeText(this, integer + "", Toast.LENGTH_SHORT).show();
    }


}