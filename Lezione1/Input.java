import java.util.Scanner; //Importare Scanner è fondamentale
public class Input{
    public static void main(String []args){
        Scanner tastiera = new Scanner(System.in); //Accetta input da terminale (simile prompt di JS)

        System.out.print("Inserisci un nome: ");
        String nome = tastiera.nextLine();     //Qui gli si dice di inserire come variabile ciò che abbiamo scritto a teerminale.

        System.out.print("Inserisci un cognome: ");
        String cognome = tastiera.nextLine();

        System.out.print("Inserisci un'età': ");
        int eta= Integer.parseInt(tastiera.nextLine());   // Integer.parseInt serve a convertire stringhe in interi
                
        System.out.println("Ciao " + nome + " " + cognome +" "+ (eta*2));
        System.out.print("Vecchio!");
        
        System.out.println("Inserisci una base: ");
        int base= Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci un'altezza: ");
        int altezza= Integer.parseInt(tastiera.nextLine());
        System.out.println("Area del triangolo: base; " + base + ", " + "per altezza; " + altezza + ", " + "diviso 2 = " + ((base * altezza)/2));


    }
}