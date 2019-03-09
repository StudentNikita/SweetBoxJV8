package com.company;

public class Main {
    public static Sweet [] sweetbox = new Sweet [0];

    public static void main(String[] args) {
        Box box = new SweetBox();
        sweetbox = box.addToBox(sweetbox,new Chocolate("Аленка",30.56, 70, "Черный"));
        sweetbox = box.addToBox(sweetbox,new Candy("Фрутис",147.1, 43, "Клубника"));
        sweetbox = box.addToBox(sweetbox,new Candy("Бонпари",151.5, 45, "Апельсин"));
        sweetbox = box.addToBox(sweetbox,new Waffles("Киткат",149.14, 69, "Шоколад"));
        sweetbox = box.addToBox(sweetbox,new Waffles("К чаю",170.34, 65.5, "Ваниль"));
        sweetbox = box.addToBox(sweetbox,new Toffee("Элитная Коровка",100, 120, "Квадрат"));

        box.boxWeight(sweetbox);
        box.boxInformation(sweetbox);
        sweetbox = box.reduceWeight(sweetbox,500);
        box.boxWeight(sweetbox);

        box.boxPrice(sweetbox);
        sweetbox = box.reducePrice(sweetbox,300);
        box.boxPrice(sweetbox);
        box.boxInformation(sweetbox);


        // write your code here
    }


}
