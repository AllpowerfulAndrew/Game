package basic.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "two_handed_weapon_skills")
public class TwoHandedWeaponSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id = 1;

    @Column(name = "two_handed_sword_skill")
    private double twoHandedSwordSkill = 0;

    @Column(name = "two_handed_axe_skill")
    private double twoHandedAxeSkill = 0;

    @Column(name = "two_handed_mace_skill")
    private double twoHandedMaceSkill = 0;

    @Column(name = "two_handed_hammer_skill")
    private double twoHandedHammerSkill = 0;

    @Column(name = "staff_skill")
    private double staffSkill = 0;

    @Column(name = "spear_skill")
    private double spearSkill = 0;

    @Column(name = "halberd_skill")
    private double halberdSkill = 0;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "twoHandedWeaponSkills")
    private Warrior warrior;

    public TwoHandedWeaponSkills() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTwoHandedSwordSkill() {
        return twoHandedSwordSkill;
    }

    public void setTwoHandedSwordSkill(double twoHandedswordSkill) {
        this.twoHandedSwordSkill = twoHandedswordSkill;
    }

    public double getTwoHandedAxeSkill() {
        return twoHandedAxeSkill;
    }

    public void setTwoHandedAxeSkill(double twoHandedaxeSkill) {
        this.twoHandedAxeSkill = twoHandedaxeSkill;
    }

    public double getTwoHandedMaceSkill() {
        return twoHandedMaceSkill;
    }

    public void setTwoHandedMaceSkill(double twoHandedmaceSkill) {
        this.twoHandedMaceSkill = twoHandedmaceSkill;
    }

    public double getTwoHandedHammerSkill() {
        return twoHandedHammerSkill;
    }

    public void setTwoHandedHammerSkill(double twoHandedhammerSkill) {
        this.twoHandedHammerSkill = twoHandedhammerSkill;
    }

    public double getStaffSkill() {
        return staffSkill;
    }

    public void setStaffSkill(double staffSkill) {
        this.staffSkill = staffSkill;
    }

    public double getSpearSkill() {
        return spearSkill;
    }

    public void setSpearSkill(double spearSkill) {
        this.spearSkill = spearSkill;
    }

    public double getHalberdSkill() {
        return halberdSkill;
    }

    public void setHalberdSkill(double halberdSkill) {
        this.halberdSkill = halberdSkill;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }
}
