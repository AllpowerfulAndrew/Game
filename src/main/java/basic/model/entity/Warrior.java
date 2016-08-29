package basic.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "warrior")
public class Warrior {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "base_skills_id")
    private BaseSkills baseSkills;

    @OneToOne
    @JoinColumn(name = "one_handed_weapon_skills_id")
    private OneHandedWeaponSkills oneHandedWeaponSkills;

    @OneToOne
    @JoinColumn(name = "two_handed_weapon_skills_id")
    private TwoHandedWeaponSkills twoHandedWeaponSkills;

    @OneToOne
    @JoinColumn(name = "shield_block_skills_id")
    private ShieldBlockSkills shieldBlockSkills;

    @OneToOne
    @JoinColumn(name = "armor_skills_id")
    private ArmorSkills armorSkills;

    public Warrior() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseSkills getBaseSkills() {
        return baseSkills;
    }

    public void setBaseSkills(BaseSkills baseSkills) {
        this.baseSkills = baseSkills;
    }

    public OneHandedWeaponSkills getOneHandedWeaponSkills() {
        return oneHandedWeaponSkills;
    }

    public void setOneHandedWeaponSkills(OneHandedWeaponSkills oneHandedWeaponSkills) {
        this.oneHandedWeaponSkills = oneHandedWeaponSkills;
    }

    public TwoHandedWeaponSkills getTwoHandedWeaponSkills() {
        return twoHandedWeaponSkills;
    }

    public void setTwoHandedWeaponSkills(TwoHandedWeaponSkills twoHandedWeaponSkills) {
        this.twoHandedWeaponSkills = twoHandedWeaponSkills;
    }

    public ShieldBlockSkills getShieldBlockSkills() {
        return shieldBlockSkills;
    }

    public void setShieldBlockSkills(ShieldBlockSkills shieldBlockSkills) {
        this.shieldBlockSkills = shieldBlockSkills;
    }

    public ArmorSkills getArmorSkills() {
        return armorSkills;
    }

    public void setArmorSkills(ArmorSkills armorSkills) {
        this.armorSkills = armorSkills;
    }
}
