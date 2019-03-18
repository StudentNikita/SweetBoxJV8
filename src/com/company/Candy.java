package com.company;

public class Candy extends Sweet {


    public Candy(String name, double weight, double price) {
        super(name, weight, price);

    }

    @Override
    public String toString(){
        return "Название: " + this.name + ", вес: " + this.weight + ", цена: " + this.price;
    }
}
