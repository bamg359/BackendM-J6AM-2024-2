package javanotes;

import java.util.Locale;
import java.util.Scanner;

public class Variable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String character = "Steve";
        String subject = "steve";

        if(character.equals(subject)){
            System.out.println("Tienen el mismo nombre");
        }else{
            System.out.println("No tienen el mismo nombre");
        }


        System.out.println(character.length());
        System.out.println(character.toLowerCase());
        System.out.println(character.toUpperCase());


        // TRabajemos con primitivos

        byte dato = 127;

        short shortDato =  dato;

        System.out.println(shortDato);

        shortDato = 128;

        System.out.println(shortDato);


        float note = 4.5f;

        int intNote = (int) note;


        // dos numeros y requiero el promedio.

        int num1 = 58;

        String num2 = "75";

        int newNum2 = Integer.parseInt(num2);

        float promedio = (num1 + newNum2)/2;

        System.out.println("El promedio es " + promedio);

        String promedioStr = promedio + "";


        // Vamos a incluir Scanner en nuestro proyecto

        System.out.println("INgrese su edad:");
        int age = sc.nextInt();
        System.out.println("Edad: " + age);





    }


}
