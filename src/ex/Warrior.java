package ex;

public class Warrior {
    private int strength;
    private int agility;
    private int concentration;
    private final String sex;
    private final String name;

    public Warrior(int strength, int agility, int concentration, boolean sex, String name) {
        this.strength = strength;
        this.agility = agility;
        this.concentration = concentration;
        this.sex = (sex) ? "мужчина" : "женщина";
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getConcentration() {
        return concentration;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}
