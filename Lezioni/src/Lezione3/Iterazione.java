package Lezione3;

import java.security.spec.RSAOtherPrimeInfo;

public class Iterazione {
    public static void main(String[] args) {
        //sintassi

       /* while(condizione){

        }*/

        int i=0;
        while(i<2){
            System.out.println(i);
            i++;
        }
        System.out.println(i);

        //ciclo for

        /*for(inizializzazione;condizione;aggiornamento)
        {istruzioni} le graffe si possono omettere se c'é una sola istruzione.
         */

        for(int j=0; j<2;j++){
            System.out.println(j);
        }
        //System.out.println(j);
        /*Le graffe indicano che tutte le variabili all'interno ha vita solo lì. Nel ciclo for è come se
        la graffa includesse tutto il "for".
        Difatti il print fuori dalla graffa del for dà errore per j non più esistente
        (si è esaurito nella funzione).
        Nel while la variabile viene dichiarata fuori, quindi continua ad esistere perché dichiarata fuori.*/








    }
}
