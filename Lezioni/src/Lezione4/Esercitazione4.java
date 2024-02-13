package Lezione4;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Esercitazione4 {
    public static void main(String[] args) {
        Scanner tastiera= new Scanner(System.in);

        //Esercizio 1 (variabili, input e cast) : chiedere all'utente due numeri con la virgola e stampare la loro somma
        /*double somma=0;
        for (int i=0;i<2;i++){
        System.out.println("Inserisci due numeri. " +(i+1)+"° numero:");
        double n= Integer.parseInt(tastiera.nextLine());
        somma+=n;
        }
        System.out.println(somma);*/

        //Esercizio 2 (if-else): Chiedere all'utente un numero. Stampare il doppio se è pari, la metà se è dispari.
        /*int i=0;
        System.out.println("Inserisci due numeri. " +(i+1)+"° numero:");
        double n= Integer.parseInt(tastiera.nextLine());
        System.out.println(n%2==0? n*2:n/2);*/

        //Esercizio 3 (for-if): quanto è la somma dei numeri da 1 a 100 pari o divisibili per 5?

        /*int somma=0;
        for (int i=1;i<=100;i++) {
            if (i % 2 == 0 || i % 5 == 0)
                somma += i;
        }
        System.out.println(somma);*/

        //Esercizio 4 (Liste): creare una lista di 10 nomi con ArrayList. Rimuovere quelli con la prima lettera una vocale.
        List<String> nomi= new ArrayList<>();
        nomi.add("Armando");
        nomi.add("Mohcine");
        nomi.add("Giorgio");
        nomi.add("Christian");
        nomi.add("Erik");
        nomi.add("Daniele");
        nomi.add("Valeria");
        nomi.add("Valentina");
        nomi.add("Ewa");
        nomi.add("Luca");
        for (int i=0;i<nomi.size();i++) {
            if("aeiouAEIOU".contains(nomi.get(i).substring(0,1)));
            nomi.remove(i);
            System.out.println(nomi);
        }


        //Esercizio 5 (filter): data una lista con 15 numeri, creare una nuova lista con solo quelli in posizione dispari.










    }
}
