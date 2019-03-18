package com.company;

public class Chocolate extends Sweet {


    public Chocolate(String name, double weight, double price) {
        super(name, weight, price);

    }

    @Override
    public String toString(){
        return "Название: " + this.name + ", вес: " + this.weight + ", цена: " + this.price;
    }
}
//