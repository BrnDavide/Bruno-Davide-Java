package esercizio1;

/**
 * @author Davide Bruno
 * Classe che implementa il primo esercizio che si occupa di creare una calcolatrice classica, ovvero
 * una calcolatrice che implementa le 4 operazioni fondamentali.
 */
import java.util.Scanner;
public class CalcolatriceClassica {
    public static void main(String[] args) {
         Scanner tastiera =new Scanner(System.in);


        System.out.println("Premi 1 per un'operazione semplice o 2 per una trigonometrica.");
        String choice= tastiera.nextLine();
        if (choice.equals("1")) {
            int i = 0;
            System.out.println("Immetti il " + (i + 1) + "° numero");
            double num1 = Integer.parseInt(tastiera.nextLine());
            i += 1;
            System.out.println("Immetti il " + (i + 1) + "° numero");
            double num2 = Integer.parseInt(tastiera.nextLine());

            //Scelta operazione
            System.out.println("Scegli operazione");
            String operator = tastiera.nextLine();

            if (operator.equals("+")) {
                System.out.println("Ris: " + (num1 + num2));
            }//end sum if
            else if (operator.equals("-")) {
                System.out.println("Ris: " + (num1 - num2));
            }//end min if
            else if (operator.equals("*")) {
                System.out.println("Ris: " + num1 * num2);
            }//end times if
            else if (operator.equals("/")) {
                if (num2 == 0) {
                    System.out.println("Non si può dividere per 0, studia!");
                } else {
                    System.out.println("Ris: " + num1 / num2);
                }//end else
            }//end divide if-else
        }//end if choice
        else if(choice.equals("2")){
            System.out.println("Premi:"+"\t 1) Radice quadrata" + "\t2)Potenza");
            String opTrigon= tastiera.nextLine();
            switch (opTrigon) {
                case "1":
                    System.out.println("Inserisci numero");
                    double num3 = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Ris: " + Math.sqrt(num3));
                    break;

                case "2":
                    System.out.println("Cosa eleviamo?");
                    double num4 = Integer.parseInt(tastiera.nextLine());
                    System.out.println("A quanto lo eleviamo?");
                    double potenza = Integer.parseInt(tastiera.nextLine());
                    System.out.println("Ris: " + Math.pow(num4, potenza));
                    break;
            }//end switch

        }//end choice

    }//end main
}//end class
