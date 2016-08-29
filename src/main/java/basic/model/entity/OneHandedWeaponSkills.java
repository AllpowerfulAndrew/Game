package basic.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "one_handed_weapon_skills")
public class OneHandedWeaponSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id = 1;

    @Column(name = "knife_skill")
    private double knifeSkill = 0;

    @Column(name = "sword_skill")
    private double swordSkill = 0;

    @Column(name = "axe_skill")
    private double axeSkill = 0;

    @Column(name = "mace_skill")
    private double maceSkill = 0;

    @Column(name = "hammer_skill")
    private double hammerSkill = 0;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "oneHandedWeaponSkills")
    private Warrior warrior;

    public OneHandedWeaponSkills() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getKnifeSkill() {
        return knifeSkill;
    }

    public void setKnifeSkill(double knifeSkill) {
        this.knifeSkill = knifeSkill;
    }

    public double getSwordSkill() {
        return swordSkill;
    }

    public void setSwordSkill(double swordSkill) {
        this.swordSkill = swordSkill;
    }

    public double getAxeSkill() {
        return axeSkill;
    }

    public void setAxeSkill(double axeSkill) {
        this.axeSkill = axeSkill;
    }

    public double getMaceSkill() {
        return maceSkill;
    }

    public void setMaceSkill(double maceSkill) {
        this.maceSkill = maceSkill;
    }

    public double getHammerSkill() {
        return hammerSkill;
    }

    public void setHammerSkill(double hammerSkill) {
        this.hammerSkill = hammerSkill;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}
