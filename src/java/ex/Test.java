package ex;

public class Test {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(1, 1, 1, true, "Вася Пупкин");

        System.out.println(warrior.getStrength() + " " + warrior.getAgility() + " " + warrior.getConcentration() +
                " " + warrior.getSex() + " " + warrior.getName());

        warrior = new Warrior(2, 2, 2, false, "Маша Цибулькина");

        System.out.println(warrior.getStrength() + " " + warrior.getAgility() + " " + warrior.getConcentration() +
                " " + warrior.getSex() + " " + warrior.getName());
    }
}
