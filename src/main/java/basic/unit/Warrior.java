//package basic.unit;
//
//import basic.allEnums.armorAndWeapon.ArmorMaterial;
//import basic.allEnums.armorAndWeapon.ArmorType;
//import basic.allEnums.armorAndWeapon.DmgType;
//import basic.allEnums.armorAndWeapon.WeaponType;
//import basic.allEnums.skills.BaseSkillType;
//import basic.allEnums.skills.HandToHandFightSkillType;
//import basic.armor.Armor;
//import basic.weapon.Weapon;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Warrior {
//    int two = 2;
//    int three = 3;
//    int five = 5;
//    int ten = 10;
//    int twenty = 20;
//    int hundred = 100;
//
//    @Autowired
//    Skills skills;
////    private Skills skills = new Skills();
//
//    @Autowired
//    DamageType attack;
//
//    private Map<ArmorType, Armor> armors = new HashMap<ArmorType, Armor>();
//    private Weapon weapon = new Weapon(WeaponType.NO_TYPE, 0, 0);
//    private BaseCharacteristic baseCharacteristic = new BaseCharacteristic(1, 1, 1, true, "Warrior");
//
//    {
//        armors.put(ArmorType.SHIELD, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
//        armors.put(ArmorType.HELM, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
//        armors.put(ArmorType.BODY, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
//        armors.put(ArmorType.GLOVES, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
//        armors.put(ArmorType.BOOTS, new Armor(ArmorType.NO_TYPE, ArmorMaterial.NO_MATERIAL, 0, 0));
//    }
//
//    public Warrior() {
//    }
//
//    public Warrior(int strength, int agility, int concentration, boolean sex, String name) {
//        baseCharacteristic = new BaseCharacteristic(strength, agility, concentration, sex, name);
//        setCharacteristic();
//    }
//
//    public void setWeapon(Weapon weapon) {
//        this.weapon = weapon;
//        setWeaponAndArmorToBaseCharacteristic();
//    }
//
//    public void setArmor(Armor armor) {
////        for (ArmorType type : armors.keySet()) {
////            if (armor.getArmorCharacter().getType().equals(type)) {
////                armors.put(type, armor);
////            }
////        }
//
//        if (armor.getArmorCharacter().getType().equals(ArmorType.SHIELD)) {
//            armors.put(ArmorType.SHIELD, armor);
//        } else if (armor.getArmorCharacter().getType().equals(ArmorType.HELM)) {
//            armors.put(ArmorType.HELM, armor);
//        } else if (armor.getArmorCharacter().getType().equals(ArmorType.BODY)) {
//            armors.put(ArmorType.BODY, armor);
//        } else if (armor.getArmorCharacter().getType().equals(ArmorType.GLOVES)) {
//            armors.put(ArmorType.GLOVES, armor);
//        } else if (armor.getArmorCharacter().getType().equals(ArmorType.BOOTS)) {
//            armors.put(ArmorType.BOOTS, armor);
//        }
//
//        setWeaponAndArmorToBaseCharacteristic();
//    }
//
//    public BaseCharacteristic getBaseCharacteristic() {
//        return baseCharacteristic;
//    }
//
//    public void setBaseCharacteristic(BaseCharacteristic BaseCharacteristic) {
//        this.baseCharacteristic = BaseCharacteristic;
//    }
//
//    public Weapon getWeapon() {
//        return weapon;
//    }
//
//    public DamageType getAttack() {
//        return attack;
//    }
//
//    private void setCharacteristic() {
//        int strength = getBaseCharacteristic().getStrength();
//        int agility = getBaseCharacteristic().getAgility();
//        double mainBattleExperience = skills.getBaseSkills().get(BaseSkillType.MAIN_BATTLE_EXPERIENCE);
//        double handToHandFightSkill = skills.getBaseSkills().get(BaseSkillType.HAND_TO_HAND_FIGHT_SKILL);
//        double handFightSkill = skills.getHandToHandFightSkills().get(HandToHandFightSkillType.HANDS_FIGHT_SKILL);
//        double footFightSkill = skills.getHandToHandFightSkills().get(HandToHandFightSkillType.FOOTS_FIGHT_SKILL);
//
//        getBaseCharacteristic().setHealth(strength * ten);
//        getBaseCharacteristic().setStamina(strength * twenty + agility * ten);
//
//        double mainHandFightSkill = (mainBattleExperience * three + handToHandFightSkill * two +
//                handFightSkill + twenty) / hundred;
//        double mainFootFightSkill = (mainBattleExperience * three + handToHandFightSkill * two +
//                footFightSkill + twenty) / hundred;
//
//        getBaseCharacteristic().setHandDamage((strength * five) * mainHandFightSkill * (agility / ten));
//        getBaseCharacteristic().setFootDamage((strength * five) * mainFootFightSkill * (agility / ten));
//    }
//
//    private void setWeaponAndArmorToBaseCharacteristic() {
//        int strength = getBaseCharacteristic().getStrength();
//        int agility = getBaseCharacteristic().getAgility();
//        double weaponWeight = getWeapon().getWeight();
//        double allArmorWeight = 0;
//
//        for (Armor armor : armors.values()) {
//            weaponWeight = weaponWeight + armor.getArmorCharacter().getWeight();
//        }
//
//        setNeededStaminaToAttack(allArmorWeight, strength);
//        setWeaponDamage(strength, agility);
//
//    }
//
//    private void setNeededStaminaToAttack(double allArmorWeight, double strength) {
//        double neededStaminaToAttack = allArmorWeight / two - strength + 1;
//
//        if (neededStaminaToAttack < 1) {
//            neededStaminaToAttack = 1;
//        }
//
//        getBaseCharacteristic().setNeededStaminaToAttack(neededStaminaToAttack);
//    }
//
//    private void setWeaponDamage(int strength, int agility) {
//        double weaponSkill = 0;
//        double weaponGroupSkill = 0;
//        double mainBattleExperience = skills.getBaseSkills().get(BaseSkillType.MAIN_BATTLE_EXPERIENCE);
//        double equippedWeaponFightSkill;
//
//        for (WeaponType type : WeaponType.values()) {
//            if (weapon.getType() == type) {
//                if (skills.getOneHandedWeaponSkills().containsKey(type)) {
//                    weaponSkill = skills.getOneHandedWeaponSkills().get(type);
//                    weaponGroupSkill = skills.getBaseSkills().get(BaseSkillType.ONE_HANDED_WEAPON_SKILL);
//                } else if (skills.getTwoHandedWeaponSkills().containsKey(type)) {
//                    weaponSkill = skills.getTwoHandedWeaponSkills().get(type);
//                    weaponGroupSkill = skills.getBaseSkills().get(BaseSkillType.TWO_HANDED_WEAPON_SKILL);
//                }
//            }
//        }
//
//        equippedWeaponFightSkill = (mainBattleExperience * three + weaponGroupSkill * two + weaponSkill + twenty) / hundred;
//
//        attack.setDamageType(DmgType.BLUNT, (strength * five + weapon.getDamage().getDamageType()
//                .get(DmgType.BLUNT) + equippedWeaponFightSkill) * (agility / ten));
//        attack.setDamageType(DmgType.CUT, (strength * five + weapon.getDamage().getDamageType()
//                .get(DmgType.CUT) + equippedWeaponFightSkill) * (agility / ten));
//        attack.setDamageType(DmgType.SLASH, (strength * five + weapon.getDamage().getDamageType()
//                .get(DmgType.SLASH) + equippedWeaponFightSkill) * (agility / ten));
//        attack.setDamageType(DmgType.PIERCING, (strength * five + weapon.getDamage().getDamageType()
//                .get(DmgType.PIERCING) + equippedWeaponFightSkill) * (agility / ten));
//        attack.setDamageType(DmgType.CRUSH, (strength * five + weapon.getDamage().getDamageType()
//                .get(DmgType.CRUSH) + equippedWeaponFightSkill) * (agility / ten));
//    }
//}