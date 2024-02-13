package Lezione3;
import java.util.Scanner;
public class Esercizi {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        /*
        * Es1. (if-else-Scanner) Chiedere un numero e di stampare pari o dispari.
        *  */
        /*System.out.println("inserisci un numero");
        int numero= Integer.parseInt(tastiera.nextLine());
        if (numero %2==0){
            System.out.println("Il numero è pari");
        }
        else {
            System.out.println("Il numero è dispari");
        }*/

        /*Es2: (for) Chiedere quante temperature si vuole inserire
        stampare il minimo, massimo e la media (senza array).*/

        System.out.println("Quante temperature vuoi inserire?");
        int indexTemp=Integer.parseInt(tastiera.nextLine());
        for (int i=0;i<indexTemp;i++){

            System.out.println("Inserisci temperatura "+ indexTemp);
        }

        System.out.println("Inserisci temp 1");
        double t1= Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci temp 2");
        double t2= Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci temp 3");
        double t3= Integer.parseInt(tastiera.nextLine());














    }
}
