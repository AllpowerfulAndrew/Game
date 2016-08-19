package basic.armor;

public class ArmorCharacter {
    private double price;
    private int quality;
    private int weight;
    private ArmorMaterial material;
    private ArmorType type;

    private double bluntArmor;
    private double cutArmor;
    private double slashArmor;
    private double piercingArmor;
    private double crushArmor;

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

    public double getBluntArmor() {
        return bluntArmor;
    }

    public double getCutArmor() {
        return cutArmor;
    }

    public double getSlashArmor() {
        return slashArmor;
    }

    public double getPiercingArmor() {
        return piercingArmor;
    }

    public double getCrushArmor() {
        return crushArmor;
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
        bluntArmor = quality * 0.25 * modifier;
        cutArmor = quality * 0.25 * modifier;
        slashArmor = quality * 0.15 * modifier;
        piercingArmor = quality * 0.05 * modifier;
        crushArmor = quality * 0.30 * modifier;
    }

    private void setLeatherArmor(int modifier) {
        bluntArmor = quality * 0.30 * modifier;
        cutArmor = quality * 0.25 * modifier;
        slashArmor = quality * 0.15 * modifier;
        piercingArmor = quality * 0.05 * modifier;
        crushArmor = quality * 0.25 * modifier;
    }

    private void setChainArmor(int modifier) {
        bluntArmor = quality * 0.15 * modifier;
        cutArmor = quality * 0.35 * modifier;
        slashArmor = quality * 0.10 * modifier;
        piercingArmor = quality * 0.20 * modifier;
        crushArmor = quality * 0.20 * modifier;
    }

    private void setScalyArmor(int modifier) {
        bluntArmor = quality * 0.25 * modifier;
        cutArmor = quality * 0.30 * modifier;
        slashArmor = quality * 0.10 * modifier;
        piercingArmor = quality * 0.15 * modifier;
        crushArmor = quality * 0.20 * modifier;
    }

    private void setLatArmor(int modifier) {
        bluntArmor = quality * 0.20 * modifier;
        cutArmor = quality * 0.35 * modifier;
        slashArmor = quality * 0.15 * modifier;
        piercingArmor = quality * 0.25 * modifier;
        crushArmor = quality * 0.05 * modifier;
    }

}
