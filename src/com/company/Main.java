package com.company;

public class Main {


    public static void main(String[] args) {
        Box box = new SweetBox();

        box.boxInformation();
        box.removeFromBoxByIndex(1);

        box.addToBox(new Chocolate("Аленка",13, 70, "Черный"));
        box.addToBox(new Candy("Фрутис",14, 43, "Клубника"));
        box.addToBox(new Waffles("Киткат",16, 69, "Шоколад"));
        box.addToBox(new Waffles("К чаю",17, 65.5, "Ваниль"));
        box.addToBox(new Toffee("Элитная Коровка",18, 120, "Квадрат"));



        box.boxPrice();
        box.boxWeight();
        box.removeFromBoxByIndex(5);
        box.boxInformation();
        box.reducePrice(200);
        box.boxInformation();
        box.addToBox(new Candy("Бонпари",15, 45, "Апельсин"));
        box.boxWeight();
        box.reduceWeight(25);
        box.boxInformation();










        // write your code here
    }


}
