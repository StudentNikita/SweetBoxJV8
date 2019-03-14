package com.company;

public class Main {


    public static void main(String[] args) {
        Box box = new SweetBox();



        box.addToBox(new Chocolate("Аленка",55, 1000, "Черный"));
        box.addToBox(new Candy("Фрутис",45, 45, "Клубника"));
        box.addToBox(new Waffles("Киткат",16, 69, "Шоколад"));
        box.addToBox(new Waffles("К чаю",15, 80, "Ваниль"));
        box.addToBox(new Toffee("Элитная Коровка",18, 120, "Квадрат"));
        box.addToBox(new Candy("Бонпари",5, 501, "Апельсин"));

        box.addToBox(null);

        box.boxInformation();
        box.removeFromBoxByIndex(0);
        box.boxPrice();
        box.reducePrice(500);
        box.boxInformation();
        box.boxPrice();










        // write your code here
    }


}
