package basic.armor;

import basic.allEnums.armorAndWeapon.ArmorMaterial;
import basic.allEnums.armorAndWeapon.ArmorType;

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
