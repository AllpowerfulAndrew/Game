package basic.unit;

import basic.weapon.DamageType;

import java.util.HashMap;
import java.util.Map;

public class BaseCharacteristic {
    private int strength;
    private int agility;
    private int concentration;
    private final String sex;
    private final String name;

    private Map<DamageType, Double> weaponDamage = new HashMap<DamageType, Double>();

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

    private int mainBattleExperience = 0;

    {
        weaponDamage.put(DamageType.BLUNT, 0.0);
        weaponDamage.put(DamageType.CUT, 0.0);
        weaponDamage.put(DamageType.SLASH, 0.0);
        weaponDamage.put(DamageType.PIERCING, 0.0);
        weaponDamage.put(DamageType.CRUSH, 0.0);
    }

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

    public Map<DamageType, Double> getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(Map<DamageType, Double> weaponDamage) {
        this.weaponDamage = weaponDamage;
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

    public int getMainBattleExperience() {
        return mainBattleExperience;
    }

    public void setMainBattleExperience(int mainBattleExperience) {
        this.mainBattleExperience = mainBattleExperience;
    }
}