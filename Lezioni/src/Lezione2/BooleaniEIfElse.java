package Lezione2;

import java.util.Scanner;

public class BooleaniEIfElse {
    public static void main(String[] args) {
       /* boolean a = true, b = false;
        //Operatori booleani
        System.out.println(a);
        System.out.println(b);
        System.out.println(!a);
        System.out.println(!b);
        System.out.println("AND");
        System.out.println(a&&a);
        System.out.println(a&&b);
        System.out.println(b&&b);
        System.out.println(b&&a);
        System.out.println("OR");
        System.out.println(a||a);
        System.out.println(a||b);
        System.out.println(b||a);
        System.out.println(b||b);*/
        // == != <> <= >=
        Scanner tastiera = new Scanner(System.in);
        /*int eta = Integer.parseInt(tastiera.nextLine());
        boolean condizione= eta >=18;
        System.out.println(condizione);*/
        /*int numero= Integer.parseInt(tastiera.nextLine());
        boolean pari= numero%2==0;
        System.out.println(pari);*/

        /*int numero= Integer.parseInt(tastiera.nextLine());
        boolean insufficienza= numero <=5 && numero>=0;
        System.out.println(insufficienza);*/

        /*System.out.println("Inserisci anno: ");
        int anno= Integer.parseInt(tastiera.nextLine());
        boolean bisestile= anno%4==0 && anno%100!=0 || anno%400==0;
        System.out.println("L'anno è bisestile? " + bisestile);*/

        /*Per confrontare due tipi NON primitivi bisogna usare il metodo equals();
        gli indicatori dei tipi primitivi non funzionano perché, mentre i tipi
        primitivi occupano una porzione di memoria nello Stack, quelli non primitivi
        hanno solo un puntatore.
         */
        /*String nome= "Davide";
        //errato
        System.out.println(nome=="ADavide".substring(1));
        //corretto
        System.out.println(nome.equals("ADavide".substring(1)));
        System.out.println(nome.equalsIgnoreCase("ddavide".substring(1)));*/ //metodo IgnoreCase();
        //Es 1
        /*System.out.println("Inserire password: ");
        String password1= tastiera.nextLine();
        System.out.println("Inserire di nuovo la password: ");
        String password2= tastiera.nextLine();
        System.out.println(password1.equals(password2));*/

        //Es 2
        /*String nomeUtente= tastiera.nextLine();
        String password= tastiera.nextLine();
        boolean condizione= nomeUtente.equals("utente") || password.equals("password");
        System.out.println(condizione);*/

        //Es 3
        String nomeUtente= tastiera.nextLine();
        String password= tastiera.nextLine();
        boolean condizione= nomeUtente.equals("utente") && password.equals("password");
        //System.out.println(condizione); qui può finire. Sotto l'alternativa con if/else.
        if(condizione){
            System.out.println("messaggio segreto");
        } else {
            System.out.println("User e/o password errati");
        }


















    }
}
