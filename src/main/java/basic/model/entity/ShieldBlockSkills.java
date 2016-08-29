package basic.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "shield_block_skills")
public class ShieldBlockSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id = 1;

    @Column(name = "light_shield_block_skill")
    private double lightShieldBlockSkill = 0;

    @Column(name = "middle_shield_block_skill")
    private double middleShieldBlockSkill = 0;

    @Column(name = "heavy_shield_block_skill")
    private double heavyShieldBlockSkill = 0;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "shieldBlockSkills")
    private Warrior warrior;

    public ShieldBlockSkills() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLightShieldBlockSkill() {
        return lightShieldBlockSkill;
    }

    public void setLightShieldBlockSkill(double lightShieldBlockSkill) {
        this.lightShieldBlockSkill = lightShieldBlockSkill;
    }

    public double getMiddleShieldBlockSkill() {
        return middleShieldBlockSkill;
    }

    public void setMiddleShieldBlockSkill(double middleShieldBlockSkill) {
        this.middleShieldBlockSkill = middleShieldBlockSkill;
    }

    public double getHeavyShieldBlockSkill() {
        return heavyShieldBlockSkill;
    }

    public void setHeavyShieldBlockSkill(double heavyShieldBlockSkill) {
        this.heavyShieldBlockSkill = heavyShieldBlockSkill;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}