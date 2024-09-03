package exercices;

import java.util.Random;

public class Baloto {


    public static void main(String[] args) {

        Random random = new Random();

        int userNum1 = 30;
        int userNum2 = 15;
        int userNum3 = 17;
        int userNum4 = 43;
        int userNum5 = 76;
        int userNum6 = 92;


        int winnerNum1 = random.nextInt(100);
        int winnerNum2 = random.nextInt(100);
        int winnerNum3 = random.nextInt(100);
        int winnerNum4 = random.nextInt(100);
        int winnerNum5 = random.nextInt(100);
        int winnerNum6 = random.nextInt(100);

        System.out.println(winnerNum1);
        System.out.println(winnerNum2);
        System.out.println(winnerNum3);
        System.out.println(winnerNum4);
        System.out.println(winnerNum5);
        System.out.println(winnerNum6);

        if((userNum1==winnerNum1 || userNum1 == winnerNum2 ) && (userNum2 == winnerNum1 || userNum2 == winnerNum2 )){

            System.out.println("Eres el feliz ganador");
        }else{

            System.out.println("Sigue Intentando");
        }




    }






}
