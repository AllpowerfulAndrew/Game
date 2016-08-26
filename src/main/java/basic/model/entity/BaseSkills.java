package basic.model.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name = "main_skills")
public class BaseSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "skill_name", unique = true)
    private String skillName;

    @Column(name = "skill_value")
    private double skillValue;

    public BaseSkills() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public double getSkillValue() {
        return skillValue;
    }

    public void setSkillValue(double skillValue) {
        this.skillValue = skillValue;
    }
}
