package basic.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "shield_block_skills")
public class ArmorSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id = 1;

    @Column(name = "cloth_armor_skill")
    private double clothArmorSkill = 0;

    @Column(name = "leather_armor_skill")
    private double leatherArmorSkill = 0;

    @Column(name = "chain_armor_skill")
    private double chainArmorSkill = 0;

    @Column(name = "scaly_armor_skill")
    private double scalyArmorSkill = 0;

    @Column(name = "lat_armor_skill")
    private double latArmorSkill = 0;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "armorSkills")
    private Warrior warrior;

    public ArmorSkills() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getClothArmorSkill() {
        return clothArmorSkill;
    }

    public void setClothArmorSkill(double clothArmorSkill) {
        this.clothArmorSkill = clothArmorSkill;
    }

    public double getLeatherArmorSkill() {
        return leatherArmorSkill;
    }

    public void setLeatherArmorSkill(double leatherArmorSkill) {
        this.leatherArmorSkill = leatherArmorSkill;
    }

    public double getChainArmorSkill() {
        return chainArmorSkill;
    }

    public void setChainArmorSkill(double chainArmorSkill) {
        this.chainArmorSkill = chainArmorSkill;
    }

    public double getScalyArmorSkill() {
        return scalyArmorSkill;
    }

    public void setScalyArmorSkill(double scalyArmorSkill) {
        this.scalyArmorSkill = scalyArmorSkill;
    }

    public double getLatArmorSkill() {
        return latArmorSkill;
    }

    public void setLatArmorSkill(double latArmorSkill) {
        this.latArmorSkill = latArmorSkill;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}