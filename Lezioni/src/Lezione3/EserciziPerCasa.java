package Lezione3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class EserciziPerCasa {
    public static void main(String[] args) {
        Scanner tastiera= new Scanner(System.in);
        /*
    Es1: (if-else-Scanner) Chiedere un numero e stampare "Pari" o "dispari"
        */
        int n = Integer.parseInt(tastiera.nextLine());
        if (n % 2 == 0)
            System.out.println("Pari");
        else
            System.out.println("Dispari");
        System.out.println( n % 2 == 0 ? "Pari" : "Dispari");
        String m = n % 2 == 0 ? "Pari" : "Dispari";
        /*
    Es2: (for) Chiedere quante temperature si vuole inserire
    stampare il minimo, massimo e la media (senza array).*/

        System.out.println("Quante temperature vuoi inserire?");
        int numTemp = Integer.parseInt(tastiera.nextLine());
        double tempMin= 500;
        double tempMax= -100;
        double somma =0;

        for (int i=0; i<numTemp;i++){
            System.out.println("Inserisci la "+(i+1)+"° temperatura");
            double temp= Integer.parseInt(tastiera.nextLine());
            somma+=temp;
            if (temp<tempMin)
                tempMin = temp;
            if (temp>tempMax)
                tempMax = temp;
        }
        System.out.println("media: " + (somma/numTemp) + "\nminimo: "+tempMin +
                "\nmassimo: " + tempMax);
    /*
    Es3: (for - ArrayList) salvare le temperature precedenti.
    stampare quelle maggiori di 10 gradi*/
        /*
*/



   /* Es4: (while) chiedere all'utente dei numeri e sommarli finché
    non scrive 0 (terminare quando inserisce 0)
    Es5: (String, substring) stampare il proprio nome al contrario
    * */
    }
}
