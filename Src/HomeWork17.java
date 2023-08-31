public class HomeWork17 {
    public static void main(String[] args) {

        User userTaras = new User("Taras", "Harkevuch", 11, 11, 2000,
                380662554111L, "t_h_user@ukr.net", 85.5,
                130, 75, 10000);
        userTaras.printAccountInfo();

        User userDenys = new User("Denys", "Marchuk", 12, 01, 1992,
                380973258301L, "Den1992@gmail.com", 68.7,
                120, 80, 5882);
        userDenys.printAccountInfo();

        userDenys.setSteps(9000);
        userDenys.setPressureDown(90);

        System.out.println("Changed data: ");
        userDenys.printAccountInfo();


        User userJulia = new User("Julia", "Veremchuk", 1, 12, 1984,
                380995864523L, "JVeremchuk@gmail.com", 55.0,
                110, 70, 8000);
        userJulia.printAccountInfo();

        userJulia.setSurname("Harkevuch");
        userJulia.setWeight(70);
        userJulia.setSteps(5000);

        System.out.println("Changed data: ");
        userJulia.printAccountInfo();

    }

}
