package Lezione2;

import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) {
/*
Es1: Esercizio 1: Calcolatrice Semplice

Scrivi un programma Java che utilizza la classe Scanner
per prendere due numeri in input dall'utente.
Il programma poi chiede all'utente di scegliere un'operazione
matematica da eseguire tra i due numeri
(addizione, sottrazione, moltiplicazione, divisione, modulo).
Il programma calcola il risultato dell'operazione scelta e
 lo stampa a schermo.

 */

        Scanner tastiera = new Scanner(System.in);
            /*
            System.out.println("Inserisci il primo numero: ");
            int numero1= Integer.parseInt(tastiera.nextLine());
            System.out.println("Inserisci il secondo numero: ");
            int numero2= Integer.parseInt(tastiera.nextLine());
            System.out.println("Scegli un'operazione: ");
            String operazione = tastiera.nextLine();
            if (operazione.equals("+")){
                System.out.println(numero1 + numero2);
            } else if (operazione.equals("-")){
                System.out.println(numero1-numero2);
            }else if( operazione.equals("*")){
                System.out.println(numero1*numero2);
            }
            else if(operazione.equals("/")){
                System.out.println(numero1/numero2);
            }*/
        /*Esercizio 2: Conversione Temperatura

        Scrivi un programma Java che permetta all'utente di convertire una temperatura da Fahrenheit a Celsius.
        Il programma dovrà:
        Chiedere all'utente di inserire una temperatura in Fahrenheit.
        Convertire la temperatura in Celsius usando la formula: C = (F - 32) * 5/9.
        Stampare il risultato.
                Utilizzare Scanner per l'input, e variabili di tipo double per le temperature.
                - dire nel caso dell'acqua se con quella temperatura
        sarebbe ghiaccio, acqua o vapore

        System.out.println("Inserisci la temperatura (Farenheit):");
        double tempFar= Integer.parseInt(tastiera.nextLine());
        double tempCel= (tempFar-32)*5/9;
        System.out.println("Equivale a " +tempCel + "C°.");
        if (tempCel<=0){
            System.out.println("L'acqua ora serve per il gin tonic!");}
            else if (tempCel>0 && tempCel<100){
                System.out.println("Fatti una doccia!");}
            else if (tempCel>=100) {
                System.out.println("Non è il caldo, è l'umidità");
            }*/
        /*Esercizio 3: Calcolo Distanza

        Crea un programma Java che calcoli la distanza tra due punti nel piano cartesiano. Le coordinate dei punti (x1, y1) e (x2, y2)
        verranno fornite dall'utente. Il programma dovrà:

        Chiedere all'utente di inserire le coordinate dei due punti.
        Calcolare la distanza usando la formula: distanza = sqrt((x2 - x1)^2 + (y2 - y1)^2).
                Stampare la distanza calcolata.
                Ricorda di usare Math.sqrt per la radice quadrata e Math.pow per elevare a potenza, con variabili double.*/
        System.out.println("Inserisci x1:");
        double x1= Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci x2:");
        double x2= Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci y1:");
        double y1= Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisci y2:");
        double y2= Integer.parseInt(tastiera.nextLine());
        /*int potenza= 2;
        double parentesi1= x2-x1;
        double parentesi2= y2-y1;*/
        double distanza= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("La distanza tra i tuoi punti è:" +distanza);


    }

}


