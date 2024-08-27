package javanotes;

import java.util.Scanner;

public class VoidFunction {

    static int costumerId;
    static String costumerName;
    static String email;
    static String password;
    static String status;


    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        createCostumer();
        printCostumerData();

    }

    public static void createCostumer(){

        System.out.println("Ingrese el id");
        costumerId = sc.nextInt();
        sc.nextLine();
        System.out.println("Name");
        costumerName = sc.nextLine();
        System.out.println("email");
        email = sc.nextLine();
        System.out.println("Ingrese el correo");
        password = sc.nextLine();
        System.out.println("Seleccione un estado:");
        int selection = sc.nextInt();
        status = selectStatus(selection);
    }

    public static void printCostumerData(){

        System.out.println("Id" + costumerId + "\n" +
                "Nombre" + costumerName + "\n" +
                "Correo" + email + "\n" +
                "Status" + status );
    }


    public static String selectStatus(int selection){

        String active= "";

        if (selection == 1){

            active = String.valueOf(StatusCostumer.TRUE);



        }else if(selection == 2){
            active = String.valueOf(StatusCostumer.FALSE);
        }else{
            System.out.println("Seleccion no valida");

        }

        return active;
    }




}
