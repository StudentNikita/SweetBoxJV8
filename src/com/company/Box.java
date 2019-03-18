package com.company;

import java.util.function.Predicate;

public interface Box {
    void addToBox(Sweet sweet);
    void removeFromBoxByIndex(int index);
    void boxWeight ();
    void boxPrice ();
    void boxInformation ();
    void reduceWeight (double weight);
    void reducePrice (double price);
    void howMuchChocoInBox();
    void howMuchWafflesInBox();
    void howMuchToffeeInBox();
    void howMuchCandyInBox();

}
