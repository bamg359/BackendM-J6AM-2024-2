package javanotes;

import java.util.Random;

public class Conditional {

    public static void main(String[] args) {

        Random random = new Random();

        int numPlay = 25;

        int numPLay2= 37;

        int numWinner1 = random.nextInt(99);

        int numWinner2 = random.nextInt(99);

        if((numPlay == numWinner1 || numPlay == numWinner2) && (numPLay2 == numWinner1 || numPLay2 == numWinner2)){

            System.out.println("Usted es un suertudo, gano!!!");
            System.out.println("ganador 1 = " + numWinner1 + "\n" +
                    "ganador 2 = " + numWinner2);
        }else{
            System.out.println("No has ganado");
            System.out.println("ganador 1 = " + numWinner1 + "\n" +
                    "ganador 2 = " + numWinner2);
        }


        // if anidado

        if((numPlay == numWinner1 || numPlay == numWinner2) && (numPLay2 == numWinner1 || numPLay2 == numWinner2)){

            System.out.println("Usted es un suertudo, gano!!!");
            System.out.println("ganador 1 = " + numWinner1 + "\n" +
                    "ganador 2 = " + numWinner2);
        }else if((numPlay == numWinner1 || numPlay == numWinner2) || (numPLay2 == numWinner1 || numPLay2 == numWinner2)){

            System.out.println("Felicitaciones, acertaste 1 y ganaste $100000");
            System.out.println("ganador 1 = " + numWinner1 + "\n" +
                    "ganador 2 = " + numWinner2);
        }else{

            System.out.println("No has ganado");
            System.out.println("ganador 1 = " + numWinner1 + "\n" +
                    "ganador 2 = " + numWinner2);
            }
        }

    }

