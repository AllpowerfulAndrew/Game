package basic.armor;

public class Armor {
    private ArmorCharacter armorCharacter;

    public Armor(ArmorType type, ArmorMaterial material, int weight, int quality) {
        armorCharacter = new ArmorCharacter(type, material, weight, quality);
    }

    public ArmorCharacter getArmorCharacter() {
        return armorCharacter;
    }

    public void setArmorCharacter(ArmorCharacter armorCharacter) {
        this.armorCharacter = armorCharacter;
    }
}
