package com.example.oop25082020;

public class Animal {
    // 1 : Thuoc tinh
    private String name;
    private Integer weight;

    // 2 : Phuong thuc khoi tao
    public Animal(String name , Integer weight){
        this.name = name;
        this.weight = weight;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    // getter
    public String getName(){
        return name;
    }

    // alt + insert : generate

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
