package com.company;

public class Candy extends Sweet {
    private String taste;

    public Candy(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public String toString(){
        return "Название: " + this.name + ", вес: " + this.weight + ", цена: " + this.price + ", вкус: " + this.taste;
    }
}
