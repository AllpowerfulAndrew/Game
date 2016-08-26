package basic.unit;

public class BaseCharacteristic {
    private int strength;
    private int agility;
    private int concentration;
    private final String sex;
    private final String name;

    private double health;
    private double stamina;
    private double handDamage;
    private double footDamage;
    private double criticalDamage;
    private double neededStaminaToAttack;
    private double attackSpeed;
    private double attackDuration;
    private double neededStaminaToDodge;
    private double dodgeFrequency;

    private DamageType damageType = new DamageType();

    public BaseCharacteristic(int strength, int agility, int concentration, boolean sex, String name) {
        this.strength = strength;
        this.agility = agility;
        this.concentration = concentration;
        this.sex = (sex)? "мужчина" : "женщина";
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getConcentration() {
        return concentration;
    }

    public void setConcentration(int concentration) {
        this.concentration = concentration;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getHandDamage() {
        return handDamage;
    }

    public void setHandDamage(double handDamage) {
        this.handDamage = handDamage;
    }

    public double getFootDamage() {
        return footDamage;
    }

    public void setFootDamage(double footDamage) {
        this.footDamage = footDamage;
    }

    public double getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(double criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public double getNeededStaminaToAttack() {
        return neededStaminaToAttack;
    }

    public void setNeededStaminaToAttack(double neededStaminaToAttack) {
        this.neededStaminaToAttack = neededStaminaToAttack;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getAttackDuration() {
        return attackDuration;
    }

    public void setAttackDuration(double attackDuration) {
        this.attackDuration = attackDuration;
    }

    public double getNeededStaminaToDodge() {
        return neededStaminaToDodge;
    }

    public void setNeededStaminaToDodge(double neededStaminaToDodge) {
        this.neededStaminaToDodge = neededStaminaToDodge;
    }

    public double getDodgeFrequency() {
        return dodgeFrequency;
    }

    public void setDodgeFrequency(double dodgeFrequency) {
        this.dodgeFrequency = dodgeFrequency;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }
}