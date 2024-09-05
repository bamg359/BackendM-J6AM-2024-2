package tiendapoo;

public class Costumer extends User{

    //Atributos

    String costumerType;
    int experiencePoints;

    //Metodos


    @Override
    public void createUser() {
        super.createUser();
        System.out.println("Ingrese el tipo de usurio");
        costumerType = sc.nextLine();
        System.out.println("Asigne los puntos");
        experiencePoints = sc.nextInt();
    }

    @Override
    public void selectUser() {
        super.selectUser();
    }

    @Override
    public void selectUser(int userId) {
        super.selectUser(userId);
    }

    @Override
    public void updateUser() {
        super.updateUser();
    }

    @Override
    public void deleteUser(int userId) {
        super.deleteUser(userId);
    }
}
