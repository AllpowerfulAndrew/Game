package basic.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "base_skills")
public class BaseSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id = 1;

    @Column(name = "main_battle_experience")
    private double mainBattleExperience = 0;

    @Column(name = "one_handed_weapon_skills")
    private double oneHandedWeaponSkills = 0;

    @Column(name = "two_handed_weapon_skills")
    private double twoHandedWeaponSkills = 0;

    @Column(name = "shield_block_skills")
    private double shieldBlockSkills = 0;

    @Column(name = "armor_skills")
    private double armorSkills = 0;

    @Column(name = "hand_to_hand_fight_skills")
    private double handToHandFightSkills = 0;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "baseSkills")
    private Warrior warrior;

    public BaseSkills() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMainBattleExperience() {
        return mainBattleExperience;
    }

    public void setMainBattleExperience(double mainBattleExperience) {
        this.mainBattleExperience = mainBattleExperience;
    }

    public double getOneHandedWeaponSkills() {
        return oneHandedWeaponSkills;
    }

    public void setOneHandedWeaponSkills(double oneHandedWeaponSkills) {
        this.oneHandedWeaponSkills = oneHandedWeaponSkills;
    }

    public double getTwoHandedWeaponSkills() {
        return twoHandedWeaponSkills;
    }

    public void setTwoHandedWeaponSkills(double twoHandedWeaponSkills) {
        this.twoHandedWeaponSkills = twoHandedWeaponSkills;
    }

    public double getShieldBlockSkills() {
        return shieldBlockSkills;
    }

    public void setShieldBlockSkills(double shieldBlockSkills) {
        this.shieldBlockSkills = shieldBlockSkills;
    }

    public double getArmorSkills() {
        return armorSkills;
    }

    public void setArmorSkills(double armorSkills) {
        this.armorSkills = armorSkills;
    }

    public double getHandToHandFightSkills() {
        return handToHandFightSkills;
    }

    public void setHandToHandFightSkills(double handToHandFightSkills) {
        this.handToHandFightSkills = handToHandFightSkills;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}
