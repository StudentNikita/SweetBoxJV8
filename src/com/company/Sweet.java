package com.company;

public class Sweet {
    String name;
    double weight, price;

    public Sweet (String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public double getWeight(){
        return weight;
    }
    public double getPrice(){
        return price;
    }
}
