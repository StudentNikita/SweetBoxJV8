package com.company;

public class Toffee extends Sweet {
    private String form;

    public Toffee(String name, double weight, double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    @Override
    public String toString(){
        return "Название: " + this.name + ", вес: " + this.weight + ", цена: " + this.price + ", форма: " + this.form;
    }


}
