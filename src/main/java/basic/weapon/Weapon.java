package basic.weapon;

import basic.allEnums.armorAndWeapon.DmgType;
import basic.allEnums.armorAndWeapon.WeaponType;
import basic.unit.DamageType;

public class Weapon {
    private double quality;
    private double price;
    private double weight;
    private WeaponType type;
    private boolean isOneHanded;

    private DamageType damage = new DamageType();

    public Weapon(WeaponType type, double weight, int quality) {
        this.type = type;
        this.weight = weight;
        this.quality = quality;
        this.price = quality / 10 - weight * 2;

        setWeapon();
    }

    public double getPrice() {
        return price;
    }

    public double getQuality() {
        return quality;
    }

    public double getWeight() {
        return weight;
    }

    public WeaponType getType() {
        return type;
    }

    public boolean isOneHanded() {
        return isOneHanded;
    }

    public DamageType getDamage() {
        return damage;
    }

    private void setWeapon() {
        switch (type) {
            case KNIFE:
                isOneHanded = true;
                setKnifeDamage();
                break;
            case SWORD:
                isOneHanded = true;
                setSwordDamage();
                break;
            case AXE:
                isOneHanded = true;
                setAxeDamage();
                break;
            case MACE:
                isOneHanded = true;
                setMaceDamage();
                break;
            case HAMMER:
                isOneHanded = true;
                setHammerDamage();
                break;
            case TWO_HANDED_SWORD:
                isOneHanded = false;
                setSwordDamage();
                break;
            case TWO_HANDED_AXE:
                isOneHanded = false;
                setAxeDamage();
                break;
            case TWO_HANDED_MACE:
                isOneHanded = false;
                setTwoHandedMaceDamage();
                break;
            case TWO_HANDED_HAMMER:
                isOneHanded = false;
                setTwoHandedHammerDamage();
                break;
            case SPEAR:
                isOneHanded = false;
                setSpearDamage();
                break;
            case STAFF:
                isOneHanded = false;
                setStaffDamage();
                break;
            case HALBERD:
                isOneHanded = false;
                setHalberdDamage();
                break;
        }
    }

    private void setKnifeDamage() {
        damage.setDamageType(DmgType.CUT, quality * 0.50);
        damage.setDamageType(DmgType.SLASH, quality * 0.10);
        damage.setDamageType(DmgType.PIERCING, quality * 0.40);
    }

    private void setSwordDamage() {
        damage.setDamageType(DmgType.CUT, quality * 0.15);
        damage.setDamageType(DmgType.SLASH, quality * 0.50);
        damage.setDamageType(DmgType.PIERCING, quality * 0.35);
    }

    private void setAxeDamage() {
        damage.setDamageType(DmgType.BLUNT, quality * 0.25);
        damage.setDamageType(DmgType.SLASH, quality * 0.75);
    }

    private void setMaceDamage() {
        damage.setDamageType(DmgType.BLUNT, quality * 0.35);
        damage.setDamageType(DmgType.CRUSH, quality * 0.65);
    }

    private void setHammerDamage() {
        damage.setDamageType(DmgType.BLUNT, quality * 0.10);
        damage.setDamageType(DmgType.PIERCING, quality * 0.90);
    }

    private void setTwoHandedMaceDamage() {
        damage.setDamageType(DmgType.PIERCING, quality * 0.10);
        damage.setDamageType(DmgType.SLASH, quality * 0.90);
    }

    private void setTwoHandedHammerDamage() {
        damage.setDamageType(DmgType.BLUNT, quality * 0.65);
        damage.setDamageType(DmgType.PIERCING, quality * 0.35);
    }

    private void setSpearDamage() {
        damage.setDamageType(DmgType.PIERCING, quality);
    }

    private void setStaffDamage() {
        damage.setDamageType(DmgType.BLUNT, quality);
    }

    private void setHalberdDamage() {
        damage.setDamageType(DmgType.BLUNT, quality * 0.05);
        damage.setDamageType(DmgType.CUT, quality * 0.05);
        damage.setDamageType(DmgType.PIERCING, quality * 0.35);
        damage.setDamageType(DmgType.SLASH, quality * 0.55);
    }
}
