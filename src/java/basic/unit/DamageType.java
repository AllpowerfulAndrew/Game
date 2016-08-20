package basic.weapon;

import basic.allEnums.armorAndWeapon.DamageArmorType;

import java.util.HashMap;
import java.util.Map;

public class WeaponDamage {
    private Map<DamageArmorType, Double> weaponDamage = new HashMap<DamageArmorType, Double>();

    {
        weaponDamage.put(DamageArmorType.BLUNT, 0.0);
        weaponDamage.put(DamageArmorType.CUT, 0.0);
        weaponDamage.put(DamageArmorType.SLASH, 0.0);
        weaponDamage.put(DamageArmorType.PIERCING, 0.0);
        weaponDamage.put(DamageArmorType.CRUSH, 0.0);
    }

    public Map<DamageArmorType, Double> getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(DamageArmorType type, Double damage) {
        weaponDamage.put(type, damage);
    }
}
