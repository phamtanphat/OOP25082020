package com.example.oop25082020;

import android.util.Log;

public class Cat extends Animal implements OnRunAnimal,OnEatAnimal {

    public Cat(String name, Integer weight ) {
       super(name ,weight);
    }

    @Override
    public void run() {
        Log.d("BBB","Chay bang 4 chan");
    }

    @Override
    public void eat() {

    }
}
