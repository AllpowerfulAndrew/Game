package basic.unit;

import basic.allEnums.armorAndWeapon.DmgType;

import java.util.HashMap;
import java.util.Map;

public class DamageType {
    private Map<DmgType, Double> damageType = new HashMap<DmgType, Double>();

    {
        damageType.put(DmgType.BLUNT, 0.0);
        damageType.put(DmgType.CUT, 0.0);
        damageType.put(DmgType.SLASH, 0.0);
        damageType.put(DmgType.PIERCING, 0.0);
        damageType.put(DmgType.CRUSH, 0.0);
    }

    public Map<DmgType, Double> getDamageType() {
        return damageType;
    }

    public void setDamageType(DmgType type, Double damage) {
        damageType.put(type, damage);
    }
}