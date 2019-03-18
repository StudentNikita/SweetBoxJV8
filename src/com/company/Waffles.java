package com.company;

public class Waffles extends Sweet {


    public Waffles(String name, double weight, double price) {
        super(name, weight, price);

    }

    @Override
    public String toString(){
        return "Название: " + this.name + ", вес: " + this.weight + ", цена: " + this.price;
    }
}
