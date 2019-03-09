package com.company;

public class Chocolate extends Sweet {
    private String colour;

    public Chocolate(String name, double weight, double price, String colour) {
        super(name, weight, price);
        this.colour = colour;
    }

    @Override
    public String toString(){
        return "Название: " + this.name + ", вес: " + this.weight + ", цена: " + this.price + ", цвет: " + this.colour;
    }
}
//