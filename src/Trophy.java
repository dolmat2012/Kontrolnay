public class Trophy {
    public static void main(String[] args) {
        Toyshop store = new Toyshop();

        Toy toy1 = new Toy(1, "Игрушечный домик", 35, 17);
        Toy toy2 = new Toy(2, "Коляска", 15, 10);
        Toy toy3 = new Toy(3, "Куклу", 150, 90);
        Toy toy4 = new Toy(3, "Юла", 36, 30);
        Toy toy5 = new Toy(3, "Расскраски", 120, 52);
        Toy toy6 = new Toy(3, "Игрушечный телефон", 560, 25);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Поздравляем! Вы выиграли игрушку: " + prizeToy.getName());
        }
    }
}

