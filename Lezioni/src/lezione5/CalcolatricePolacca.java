package lezione5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public class CalcolatricePolacca {
            public static void main(String[] args) {
                System.out.println("Inserisci l'espressione in notazione polacca inversa: ");
                Scanner tastiera = new Scanner(System.in);
                boolean continua = true;
                List<Integer> stack = new ArrayList<>();

                while(continua){
                    String token = tastiera.next();

                    switch (token){
                        case "+":
                            if(stack.size()<2){
                                System.out.println("ERRORE");
                                continua=false;
                            } else {
                                int n1 = stack.get(stack.size() - 1);
                                stack.remove(stack.size()-1);
                                int n2 = stack.get(stack.size() - 1);
                                stack.remove(stack.size()-1);
                                stack.add(n2+n1);
                                System.out.println(stack);
                            }// end else sum

                            break;
                        case "-":
                            int n7 = stack.get(stack.size() - 1);
                            stack.remove(stack.size()-1);
                            int n8 = stack.get(stack.size() - 1);
                            stack.remove(stack.size()-1);
                            stack.add(n8-n7);
                            System.out.println(stack);

                            break;
                        case "*":
                            int n3 = stack.get(stack.size() - 1);
                            stack.remove(stack.size()-1);
                            int n4 = stack.get(stack.size() - 1);
                            stack.remove(stack.size()-1);
                            stack.add(n4*n3);
                            System.out.println(stack);

                            break;
                        case "/":

                            int n5 = stack.get(stack.size() - 1);
                            stack.remove(stack.size()-1);
                            int n6 = stack.get(stack.size() - 1);
                            stack.remove(stack.size()-1);
                            if (n5==0){
                                System.out.println("Non si può dividere per 0");
                            }else {
                                stack.add(n6 / n5);
                                System.out.println(stack);
                            }//end else division

                            break;
                        case "=":
                            System.out.println(stack.get(stack.size()-1));
                            continua = false;
                            break;
                        default:
                            int n = Integer.parseInt(token);
                            stack.add(n);
                    }
                }
            }
        }
