package basic.unit;

import basic.allEnums.skills.*;

import java.util.HashMap;
import java.util.Map;

public class Skills {
    private Map<BaseSkillType, Double> baseSkills = new HashMap<>();
    private Map<OneHandedWeaponSkillType, Double> oneHandedWeaponSkills = new HashMap<>();
    private Map<TwoHandedWeaponSkillType, Double> twoHandedWeaponSkills = new HashMap<>();
    private Map<ShieldBlockSkillType, Double> shieldBlockSkills = new HashMap<>();
    private Map<ArmorSkillType, Double> armorSkills = new HashMap<>();
    private Map<HandToHandFightSkillType, Double> handToHandFightSkills = new HashMap<>();

    {
        baseSkills.put(BaseSkillType.MAIN_BATTLE_EXPERIENCE, 0.0);
        baseSkills.put(BaseSkillType.ONE_HANDED_WEAPON_SKILL, 0.0);
        baseSkills.put(BaseSkillType.TWO_HANDED_WEAPON_SKILL, 0.0);
        baseSkills.put(BaseSkillType.SHIELD_BLOCK_SKILL, 0.0);
        baseSkills.put(BaseSkillType.ARMOR_SKILL, 0.0);
        baseSkills.put(BaseSkillType.HAND_TO_HAND_FIGHT_SKILL, 0.0);

        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.KNIFE_SKILL, 0.0);
        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.SWORD_SKILL, 0.0);
        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.AXE_SKILL, 0.0);
        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.MACE_SKILL, 0.0);
        oneHandedWeaponSkills.put(OneHandedWeaponSkillType.HAMMER_SKILL, 0.0);

        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.TWO_HANDED_SWORD_FIGHT_SKILL, 0.0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.TWO_HANDED_AXE_FIGHT_SKILL, 0.0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.TWO_HANDED_MACE_FIGHT_SKILL, 0.0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.TWO_HANDED_HAMMER_FIGHT_SKILL, 0.0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.HALBERD_FIGHT_SKILL, 0.0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.SPEAR_FIGHT_SKILL, 0.0);
        twoHandedWeaponSkills.put(TwoHandedWeaponSkillType.STAFF_FIGHT_SKILL, 0.0);

        shieldBlockSkills.put(ShieldBlockSkillType.LIGHT_SHIELD_BLOCK_SKILL, 0.0);
        shieldBlockSkills.put(ShieldBlockSkillType.MIDDLE_SHIELD_BLOCK_SKILL, 0.0);
        shieldBlockSkills.put(ShieldBlockSkillType.HEAVY_SHIELD_BLOCK_SKILL, 0.0);

        armorSkills.put(ArmorSkillType.CLOTH_ARMOR_SKILL, 0.0);
        armorSkills.put(ArmorSkillType.LEATHER_ARMOR_SKILL, 0.0);
        armorSkills.put(ArmorSkillType.CHAIN_ARMOR_SKILL, 0.0);
        armorSkills.put(ArmorSkillType.SCALY_ARMOR_SKILL, 0.0);
        armorSkills.put(ArmorSkillType.LAT_ARMOR_SKILL, 0.0);

        handToHandFightSkills.put(HandToHandFightSkillType.HANDS_FIGHT_SKILL, 0.0);
        handToHandFightSkills.put(HandToHandFightSkillType.FOOTS_FIGHT_SKILL, 0.0);
        handToHandFightSkills.put(HandToHandFightSkillType.RIGHT_HAND_FIGHT_SKILL, 0.0);
        handToHandFightSkills.put(HandToHandFightSkillType.LEFT_HAND_FIGHT_SKILL, 0.0);
        handToHandFightSkills.put(HandToHandFightSkillType.RIGHT_FOOT_FIGHT_SKILL, 0.0);
        handToHandFightSkills.put(HandToHandFightSkillType.LEFT_FOOT_FIGHT_SKILL, 0.0);
    }

    private void setMainBattleExperience() {
        int five = 5;

        double oneHandedWeaponSkill = baseSkills.get(BaseSkillType.ONE_HANDED_WEAPON_SKILL);
        double twoHandedWeaponSkill = baseSkills.get(BaseSkillType.TWO_HANDED_WEAPON_SKILL);
        double shieldBlockSkill = baseSkills.get(BaseSkillType.SHIELD_BLOCK_SKILL);
        double armorSkill = baseSkills.get(BaseSkillType.ARMOR_SKILL);
        double handToHandFightSkill = baseSkills.get(BaseSkillType.HAND_TO_HAND_FIGHT_SKILL);

        double mainBattleExperience = oneHandedWeaponSkill + twoHandedWeaponSkill + shieldBlockSkill + armorSkill + handToHandFightSkill;
        mainBattleExperience = mainBattleExperience / five;
        baseSkills.put(BaseSkillType.MAIN_BATTLE_EXPERIENCE, mainBattleExperience);
    }

    private void setOneHandedWeaponSkill() {
        int ten = 10;

        double knifeSkill = oneHandedWeaponSkills.get(OneHandedWeaponSkillType.KNIFE_SKILL);
        double swordSkill = oneHandedWeaponSkills.get(OneHandedWeaponSkillType.SWORD_SKILL);
        double axeSkill = oneHandedWeaponSkills.get(OneHandedWeaponSkillType.AXE_SKILL);
        double maceSkill = oneHandedWeaponSkills.get(OneHandedWeaponSkillType.MACE_SKILL);
        double hammerSkill = oneHandedWeaponSkills.get(OneHandedWeaponSkillType.HAMMER_SKILL);

        double oneHandedWeaponSkill = (knifeSkill + swordSkill + axeSkill + maceSkill + hammerSkill) / ten;
        baseSkills.put(BaseSkillType.ONE_HANDED_WEAPON_SKILL, oneHandedWeaponSkill);

        setMainBattleExperience();
    }

    private void setTwoHandedWeaponSkill() {
        int ten = 10;

        double twoHandedSwordSkill = twoHandedWeaponSkills.get(TwoHandedWeaponSkillType.TWO_HANDED_SWORD_FIGHT_SKILL);
        double twoHandedAxeSkill = twoHandedWeaponSkills.get(TwoHandedWeaponSkillType.TWO_HANDED_AXE_FIGHT_SKILL);
        double twoHandedMaceSkill = twoHandedWeaponSkills.get(TwoHandedWeaponSkillType.TWO_HANDED_MACE_FIGHT_SKILL);
        double twoHandedHammerSkill = twoHandedWeaponSkills.get(TwoHandedWeaponSkillType.TWO_HANDED_HAMMER_FIGHT_SKILL);
        double halberdSkill = twoHandedWeaponSkills.get(TwoHandedWeaponSkillType.HALBERD_FIGHT_SKILL);
        double spearSkill = twoHandedWeaponSkills.get(TwoHandedWeaponSkillType.SPEAR_FIGHT_SKILL);
        double staffSkill = twoHandedWeaponSkills.get(TwoHandedWeaponSkillType.STAFF_FIGHT_SKILL);

        double oneHandedWeaponSkill = (twoHandedSwordSkill + twoHandedAxeSkill +
                twoHandedMaceSkill + twoHandedHammerSkill + halberdSkill + spearSkill + staffSkill) / ten;

        baseSkills.put(BaseSkillType.ONE_HANDED_WEAPON_SKILL, oneHandedWeaponSkill);

        setMainBattleExperience();
    }

    private void setShieldBlockSkill() {
        int ten = 10;

        double lightShieldBlockSkill = shieldBlockSkills.get(ShieldBlockSkillType.LIGHT_SHIELD_BLOCK_SKILL);
        double middleShieldBlockSkill = shieldBlockSkills.get(ShieldBlockSkillType.MIDDLE_SHIELD_BLOCK_SKILL);
        double heavyShieldBlockSkill = shieldBlockSkills.get(ShieldBlockSkillType.HEAVY_SHIELD_BLOCK_SKILL);

        double shieldBlockSkill = (lightShieldBlockSkill + middleShieldBlockSkill + heavyShieldBlockSkill) / ten;
        baseSkills.put(BaseSkillType.SHIELD_BLOCK_SKILL, shieldBlockSkill);

        setMainBattleExperience();
    }

    private void setArmorSkill() {
        int ten = 10;

        double clothArmorSkill = armorSkills.get(ArmorSkillType.CLOTH_ARMOR_SKILL);
        double leatherArmorSkill = armorSkills.get(ArmorSkillType.LEATHER_ARMOR_SKILL);
        double chainArmorSkill = armorSkills.get(ArmorSkillType.CHAIN_ARMOR_SKILL);
        double scalyArmorSkill = armorSkills.get(ArmorSkillType.SCALY_ARMOR_SKILL);
        double latArmorSkill = armorSkills.get(ArmorSkillType.LAT_ARMOR_SKILL);

        double armorSkill = (clothArmorSkill + leatherArmorSkill + chainArmorSkill + scalyArmorSkill + latArmorSkill) / ten;
        baseSkills.put(BaseSkillType.ARMOR_SKILL, armorSkill);

        setMainBattleExperience();
    }

    public void setHandToHandFightSkill() {
        int ten = 10;
        double handsFightSkill = handToHandFightSkills.get(HandToHandFightSkillType.HANDS_FIGHT_SKILL);
        double footsFightSkill = handToHandFightSkills.get(HandToHandFightSkillType.FOOTS_FIGHT_SKILL);

        double handToHandFightSkill = (handsFightSkill + footsFightSkill) / 10;
        baseSkills.put(BaseSkillType.HAND_TO_HAND_FIGHT_SKILL, handToHandFightSkill);

        setMainBattleExperience();
    }

    public Map<BaseSkillType, Double> getBaseSkills() {
        return baseSkills;
    }

    public void setBaseSkills(BaseSkillType type, Double skill) {
        baseSkills.put(type, skill);
        setMainBattleExperience();
    }

    public Map<OneHandedWeaponSkillType, Double> getOneHandedWeaponSkills() {
        return oneHandedWeaponSkills;
    }

    public void setOneHandedWeaponSkills(OneHandedWeaponSkillType type, Double skill) {
        oneHandedWeaponSkills.put(type, skill);
        setOneHandedWeaponSkill();
    }

    public Map<TwoHandedWeaponSkillType, Double> getTwoHandedWeaponSkills() {
        return twoHandedWeaponSkills;
    }

    public void setTwoHandedWeaponSkills(TwoHandedWeaponSkillType type, Double skill) {
        twoHandedWeaponSkills.put(type, skill);
        setTwoHandedWeaponSkill();
    }

    public Map<ShieldBlockSkillType, Double> getShieldBlockSkills() {
        return shieldBlockSkills;
    }

    public void setShieldBlockSkills(ShieldBlockSkillType type, Double skill) {
        shieldBlockSkills.put(type, skill);
        setShieldBlockSkill();
    }

    public Map<ArmorSkillType, Double> getArmorSkills() {
        return armorSkills;
    }

    public void setArmorSkills(ArmorSkillType type, Double skill) {
        armorSkills.put(type, skill);
        setArmorSkill();
    }

    public Map<HandToHandFightSkillType, Double> getHandToHandFightSkills() {
        return handToHandFightSkills;
    }

    public void setHandToHandFightSkills(HandToHandFightSkillType type, Double skill) {
        handToHandFightSkills.put(type, skill);
        setHandToHandFightSkill();
    }
}
