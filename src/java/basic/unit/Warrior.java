package basic.unit;

import basic.armor.Armor;
import basic.armor.ArmorMaterial;
import basic.armor.ArmorType;
import basic.unit.skills.*;
import basic.weapon.Weapon;
import basic.weapon.WeaponType;

import java.util.HashMap;
import java.util.Map;

public class Warrior {
    Map<ArmorType, Armor> armors = new HashMap<ArmorType, Armor>();
    Weapon weapon = new Weapon(WeaponType.NO_TYPE, 0, 0);

    BaseCharacteristic baseCharacteristic;
    HandToHandFightSkill handToHandFightSkill;
    OneHandedWeaponSkill oneHandedWeaponSkill;
    TwoHandedWeaponSkill twoHandedWeaponSkill;
    ShieldBlockSkill shieldBlockSkill;
    ArmorSkill armorSkill;

    {
        baseCharacteristic = new BaseCharacteristic(1, 1, 1, true, "Warrior");
        handToHandFightSkill = new HandToHandFightSkill();
        oneHandedWeaponSkill = new OneHandedWeaponSkill();
        twoHandedWeaponSkill = new TwoHandedWeaponSkill();
        shieldBlockSkill = new ShieldBlockSkill();
        armorSkill = new ArmorSkill();

        armors.put(ArmorType.SHIELD, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
        armors.put(ArmorType.HELM, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
        armors.put(ArmorType.BODY, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
        armors.put(ArmorType.GLOVES, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
        armors.put(ArmorType.BOOTS, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
    }

    public Warrior(int strength, int agility, int concentration, boolean sex, String name) {
        baseCharacteristic = new BaseCharacteristic(strength, agility, concentration, sex, name);
        setBaseCharacteristic();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        setWeaponAndArmorToBaseCharacteristic();
    }

    public void setArmors(Armor armor) {
//        for (ArmorType type : armors.keySet()) {
//            if (armor.getArmorCharacter().getType().equals(type)) {
//                armors.put(type, armor);
//            }
//        }

        if (armor.getArmorCharacter().getType().equals(ArmorType.SHIELD)) {
            armors.put(ArmorType.SHIELD, armor);
        } else if (armor.getArmorCharacter().getType().equals(ArmorType.HELM)) {
            armors.put(ArmorType.HELM, armor);
        } else if (armor.getArmorCharacter().getType().equals(ArmorType.BODY)) {
            armors.put(ArmorType.BODY, armor);
        } else if (armor.getArmorCharacter().getType().equals(ArmorType.GLOVES)) {
            armors.put(ArmorType.GLOVES, armor);
        } else if (armor.getArmorCharacter().getType().equals(ArmorType.BOOTS)) {
            armors.put(ArmorType.BOOTS, armor);
        } else {
            return;
        }

        setWeaponAndArmorToBaseCharacteristic();
    }

    public BaseCharacteristic getBaseCharacteristic() {
        return baseCharacteristic;
    }

    public void setBaseCharacteristic(BaseCharacteristic BaseCharacteristic) {
        this.baseCharacteristic = BaseCharacteristic;
    }

    public HandToHandFightSkill getHandToHandFightSkill() {
        return handToHandFightSkill;
    }

    public void setHandToHandFightSkill(HandToHandFightSkill handToHandFightSkill) {
        this.handToHandFightSkill = handToHandFightSkill;
    }

    public OneHandedWeaponSkill getOneHandedWeaponSkill() {
        return oneHandedWeaponSkill;
    }

    public void setOneHandedWeaponSkill(OneHandedWeaponSkill oneHandedWeaponSkill) {
        this.oneHandedWeaponSkill = oneHandedWeaponSkill;
    }

    public TwoHandedWeaponSkill getTwoHandedWeaponSkill() {
        return twoHandedWeaponSkill;
    }

    public void setTwoHandedWeaponSkill(TwoHandedWeaponSkill twoHandedWeaponSkill) {
        this.twoHandedWeaponSkill = twoHandedWeaponSkill;
    }

    public ShieldBlockSkill getShieldBlockSkill() {
        return shieldBlockSkill;
    }

    public void setShieldBlockSkill(ShieldBlockSkill shieldBlockSkill) {
        this.shieldBlockSkill = shieldBlockSkill;
    }

    public ArmorSkill getArmorSkill() {
        return armorSkill;
    }

    public void setArmorSkill(ArmorSkill armorSkill) {
        this.armorSkill = armorSkill;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    private void setBaseCharacteristic() {
        int modTwo = 2;
        int modThree = 3;
        int modFife = 5;
        int modTeny = 10;
        int modTweny = 20;
        int modHndrt = 100;

        int strength = getBaseCharacteristic().getStrength();
        int agility = getBaseCharacteristic().getAgility();
        int mainBattleExperience = getBaseCharacteristic().getMainBattleExperience();
        int handToHandFightSkill = getHandToHandFightSkill().getHandToHandFightSkill();
        int handFightSkill = getHandToHandFightSkill().getHandFightSkill();
        int footFightSkill = getHandToHandFightSkill().getFootFightSkill();
        int mainHandFightSkill;
        int mainFootFightSkill;

        getBaseCharacteristic().setHealth(strength * modTeny);
        getBaseCharacteristic().setStamina(strength * modTweny + agility * modTeny);
        mainHandFightSkill = (mainBattleExperience * modThree + handToHandFightSkill * modTwo + handFightSkill + modTweny) / modHndrt;
        mainFootFightSkill = (mainBattleExperience * modThree + handToHandFightSkill * modTwo + footFightSkill + modTweny) / modHndrt;

        getHandToHandFightSkill().setMainHandFightSkill(mainHandFightSkill);
        getHandToHandFightSkill().setMainFootFightSkill(mainFootFightSkill);

        getBaseCharacteristic().setHandDamage((strength * modFife) * mainHandFightSkill * (agility / modTeny));
        getBaseCharacteristic().setFootDamage((strength * modFife) * mainFootFightSkill * (agility / modTeny));
    }

    private void setWeaponAndArmorToBaseCharacteristic() {
        int modTwo = 2;
        int modFife = 5;

        int strength = getBaseCharacteristic().getStrength();
        double weaponWeight = getWeapon().getWeight();
        double allArmorWeight = 0;

        for (Armor armor : armors.values()) {
            weaponWeight = weaponWeight + armor.getArmorCharacter().getWeight();
        }

        double weaponDamage = (strength * modFife + weapon.

        setNeededStaminaToAttack(allArmorWeight, modTwo, strength);

    }

    private void setNeededStaminaToAttack(double allArmorWeight, int modTwo, double strength) {
        double neededStaminaToAttack;

        if (allArmorWeight / modTwo - strength + 1 < 1) {
            neededStaminaToAttack = 1;
        } else {
            neededStaminaToAttack = allArmorWeight / modTwo - strength + 1;
        }

        getBaseCharacteristic().setNeededStaminaToAttack(neededStaminaToAttack);
    }
}