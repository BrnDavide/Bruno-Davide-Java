package Lezione3;

import java.util.ArrayList;
import java.util.List;

public class ArrayEdArrayList {
    public static void main(String[] args) {
        List<Integer> numeri= new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        System.out.println(numeri); //Stampa tutto
        System.out.println(numeri.get(0)); //Stampa elemento nell'indice specificato
        numeri.remove(1);//Questo comando elimina elementi nell'indice.
        System.out.println(numeri.size()); // Equivale al length.
    }
}
