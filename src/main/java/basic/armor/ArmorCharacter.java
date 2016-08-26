package basic.armor;

import basic.allEnums.armorAndWeapon.ArmorMaterial;
import basic.allEnums.armorAndWeapon.ArmorType;
import basic.allEnums.armorAndWeapon.DmgType;
import basic.unit.DamageType;

public class ArmorCharacter {
    private double price;
    private int quality;
    private int weight;
    private ArmorMaterial material;
    private ArmorType type;

    DamageType armorProtection = new DamageType();

    ArmorCharacter(ArmorType type, ArmorMaterial material, int weight, int quality) {
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.quality = quality;

        statistic();
    }

    public ArmorMaterial getMaterial() {
        return material;
    }

    public ArmorType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    public int getWeight() {
        return weight;
    }

    public DamageType getArmorProtection() {
        return armorProtection;
    }

    private void statistic() {
        switch (material) {
            case CLOTH:
                setClothArmor(1);
                price = quality / 10 - weight * 2;
                break;
            case LEATHER:
                setLeatherArmor(2);
                price = (quality / 10 - weight * 2) * 2;
                break;
            case CHAIN:
                setChainArmor(3);
                price = (quality / 10 - weight * 2) * 3;
                break;
            case SCALY:
                setScalyArmor(4);
                price = (quality / 10 - weight * 2) * 4;
                break;
            case LAT:
                setLatArmor(5);
                price = (quality / 10 - weight * 2) * 5;
                break;
        }
    }

    private void setClothArmor(int modifier) {
        armorProtection.setDamageType(DmgType.BLUNT, quality * 0.25 * modifier);
        armorProtection.setDamageType(DmgType.CUT, quality * 0.25 * modifier);
        armorProtection.setDamageType(DmgType.SLASH, quality * 0.15 * modifier);
        armorProtection.setDamageType(DmgType.PIERCING, quality * 0.05 * modifier);
        armorProtection.setDamageType(DmgType.CRUSH, quality * 0.30 * modifier);
    }

    private void setLeatherArmor(int modifier) {
        armorProtection.setDamageType(DmgType.BLUNT, quality * 0.30 * modifier);
        armorProtection.setDamageType(DmgType.CUT, quality * 0.25 * modifier);
        armorProtection.setDamageType(DmgType.SLASH, quality * 0.15 * modifier);
        armorProtection.setDamageType(DmgType.PIERCING, quality * 0.05 * modifier);
        armorProtection.setDamageType(DmgType.CRUSH, quality * 0.25 * modifier);
    }

    private void setChainArmor(int modifier) {
        armorProtection.setDamageType(DmgType.BLUNT, quality * 0.15 * modifier);
        armorProtection.setDamageType(DmgType.CUT, quality * 0.35 * modifier);
        armorProtection.setDamageType(DmgType.SLASH, quality * 0.10 * modifier);
        armorProtection.setDamageType(DmgType.PIERCING, quality * 0.20 * modifier);
        armorProtection.setDamageType(DmgType.CRUSH, quality * 0.20 * modifier);
    }

    private void setScalyArmor(int modifier) {
        armorProtection.setDamageType(DmgType.BLUNT, quality * 0.25 * modifier);
        armorProtection.setDamageType(DmgType.CUT, quality * 0.30 * modifier);
        armorProtection.setDamageType(DmgType.SLASH, quality * 0.10 * modifier);
        armorProtection.setDamageType(DmgType.PIERCING, quality * 0.15 * modifier);
        armorProtection.setDamageType(DmgType.CRUSH, quality * 0.20 * modifier);
    }

    private void setLatArmor(int modifier) {
        armorProtection.setDamageType(DmgType.BLUNT, quality * 0.20 * modifier);
        armorProtection.setDamageType(DmgType.CUT, quality * 0.35 * modifier);
        armorProtection.setDamageType(DmgType.SLASH, quality * 0.15 * modifier);
        armorProtection.setDamageType(DmgType.PIERCING, quality * 0.25 * modifier);
        armorProtection.setDamageType(DmgType.CRUSH, quality * 0.05 * modifier);
    }
}
