package basic.weapon;

public class Weapon {
    private int quality;
    private double price;
    private double weight;
    private WeaponType type;
    private boolean isOneHanded;

    private double bluntDamage;
    private double cutDamage;
    private double slashDamage;
    private double piercingDamage;
    private double crushDamage;

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

    public int getQuality() {
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

    public double getBluntDamage() {
        return bluntDamage;
    }

    public double getCutDamage() {
        return cutDamage;
    }

    public double getSlashDamage() {
        return slashDamage;
    }

    public double getPiercingDamage() {
        return piercingDamage;
    }

    public double getCrushDamage() {
        return crushDamage;
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
        cutDamage = quality * 0.50;
        slashDamage = quality * 0.10;
        piercingDamage = quality * 0.40;
    }

    private void setSwordDamage() {
        cutDamage = quality * 0.15;
        slashDamage = quality * 0.50;
        piercingDamage = quality * 0.35;
    }

    private void setAxeDamage() {
        bluntDamage = quality * 0.25;
        slashDamage = quality * 0.75;
    }

    private void setMaceDamage() {
        bluntDamage = quality * 0.35;
        crushDamage = quality * 0.65;
    }

    private void setHammerDamage() {
        bluntDamage = quality * 0.10;
        piercingDamage = quality * 0.90;
    }

    private void setTwoHandedMaceDamage() {
        piercingDamage = quality * 0.10;
        slashDamage = quality * 0.90;
    }

    private void setTwoHandedHammerDamage() {
        bluntDamage = quality * 0.65;
        piercingDamage = quality * 0.35;
    }

    private void setSpearDamage() {
        bluntDamage = quality * 0.05;
        piercingDamage = quality * 0.95;
    }

    private void setStaffDamage() {
        bluntDamage = quality;
    }

    private void setHalberdDamage() {
        bluntDamage = quality * 0.05;
        cutDamage = quality * 0.05;
        piercingDamage = quality * 0.35;
        slashDamage = quality * 0.55;
    }
}
