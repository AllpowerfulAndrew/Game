package basic.unit.skills;

import java.util.HashMap;
import java.util.Map;

public class Skills {
    private Map<BaseSkillType, Integer> baseSkills = new HashMap<BaseSkillType, Integer>();
    private Map<OneHandedWeaponSkillType, Integer> oneHandedWeaponSkills = new HashMap<OneHandedWeaponSkillType, Integer>();
    private Map<TwoHandedWeaponSkillType, Integer> twoHandedWeaponSkills = new HashMap<TwoHandedWeaponSkillType, Integer>();
    private Map<ShieldBlockSkillType, Integer> shieldBlockSkills = new HashMap<ShieldBlockSkillType, Integer>();
    private Map<ArmorSkillType, Integer> armorSkills = new HashMap<ArmorSkillType, Integer>();
    private Map<HandToHandFightSkillType, Integer> handToHandFightSkills = new HashMap<HandToHandFightSkillType, Integer>();

    {
        baseSkills.put(BaseSkillType.MAIN_BATTLE_EXPERIENCE, 0);
        baseSkills.put(BaseSkillType.ONE_HANDED_WEAPON_SKILL, 0);
        baseSkills.put(BaseSkillType.TWO_HANDED_WEAPON_SKILL, 0);
        baseSkills.put(BaseSkillType.SHIELD_BLOCK_SKILL, 0);
        baseSkills.put(BaseSkillType.ARMOR_SKILL, 0);
        baseSkills.put(BaseSkillType.HAND_TO_HAND_FIGHT_SKILL, 0);

        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.KNIFE_SKILL, 0);
        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.SWORD_SKILL, 0);
        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.AXE_SKILL, 0);
        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.MACE_SKILL, 0);

        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.TWO_HANDED_SWORD_FIGHT_SKILL, 0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.TWO_HANDED_AXE_FIGHT_SKILL, 0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.TWO_HANDED_MACE_FIGHT_SKILL, 0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.HALBERD_FIGHT_SKILL, 0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.SPEAR_FIGHT_SKILL, 0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.STAFF_FIGHT_SKILL, 0);

        shieldBlockSkills.put(ShieldBlockSkillType.LIGHT_SHIELD_BLOCK_SKILL, 0);
        shieldBlockSkills.put(ShieldBlockSkillType.MIDDLE_SHIELD_BLOCK_SKILL, 0);
        shieldBlockSkills.put(ShieldBlockSkillType.HEAVY_SHIELD_BLOCK_SKILL, 0);

        armorSkills.put(ArmorSkillType.CLOTH_ARMOR_SKILL, 0);
        armorSkills.put(ArmorSkillType.LEATHER_ARMOR_SKILL, 0);
        armorSkills.put(ArmorSkillType.CHAIN_ARMOR_SKILL, 0);
        armorSkills.put(ArmorSkillType.SCALY_ARMOR_SKILL, 0);
        armorSkills.put(ArmorSkillType.LAT_ARMOR_SKILL, 0);

        handToHandFightSkills.put(HandToHandFightSkillType.HAND_FIGHT_SKILL, 0);
        handToHandFightSkills.put(HandToHandFightSkillType.FOOT_FIGHT_SKILL, 0);
        handToHandFightSkills.put(HandToHandFightSkillType.MAIN_HAND_FIGHT_SKILL, 0);
        handToHandFightSkills.put(HandToHandFightSkillType.MAIN_FOOT_FIGHT_SKILL, 0);
    }

    public Map<BaseSkillType, Integer> getBaseSkills() {
        return baseSkills;
    }

    public void setBaseSkills(BaseSkillType type, Integer skill) {
        baseSkills.put(type, skill);
    }

    public Map<OneHandedWeaponSkillType, Integer> getOneHandedWeaponSkills() {
        return oneHandedWeaponSkills;
    }

    public void setOneHandedWeaponSkills(OneHandedWeaponSkillType type, Integer skill) {
        oneHandedWeaponSkills.put(type, skill);
    }

    public Map<TwoHandedWeaponSkillType, Integer> getTwoHandedWeaponSkills() {
        return twoHandedWeaponSkills;
    }

    public void setTwoHandedWeaponSkills(TwoHandedWeaponSkillType type, Integer skill) {
        twoHandedWeaponSkills.put(type, skill);
    }

    public Map<ShieldBlockSkillType, Integer> getShieldBlockSkills() {
        return shieldBlockSkills;
    }

    public void setShieldBlockSkills(ShieldBlockSkillType type, Integer skill) {
        shieldBlockSkills.put(type, skill);
    }

    public Map<ArmorSkillType, Integer> getArmorSkills() {
        return armorSkills;
    }

    public void setArmorSkills(ArmorSkillType type, Integer skill) {
        armorSkills.put(type, skill);
    }

    public Map<HandToHandFightSkillType, Integer> getHandToHandFightSkills() {
        return handToHandFightSkills;
    }

    public void setHandToHandFightSkills(HandToHandFightSkillType type, Integer skill) {
        handToHandFightSkills.put(type, skill);
    }
}
