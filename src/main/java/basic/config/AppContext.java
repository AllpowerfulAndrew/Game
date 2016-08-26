package basic.config;

import basic.dao.BaseSkillsDao;
import basic.dao.impl.BaseSkillsDaoImpl;
import basic.unit.DamageType;
import basic.unit.Skills;
import basic.unit.Warrior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource(value = {"classpath:util.properties"})
//@PropertySource(value = {"classpath:auth.properties"})
public class AppContext {
    @Autowired
    private HibernateConfig hibernateConfig;

    @Bean
    public BaseSkillsDao baseSkillsDao() {
        return new BaseSkillsDaoImpl();
    }

    @Bean
    @Scope("prototype")
    public Skills skills() {
        Skills skills = new Skills();
        return skills;
    }

    @Bean
    @Scope("prototype")
    public DamageType type() {
        DamageType type = new DamageType();
        return type;
    }

    @Bean
    @Scope("prototype")
    public Warrior warrior() {
        Warrior warrior = new Warrior();
        return warrior;
    }
//
//    @Bean
//    @Scope("prototype")
//    public Warrior warrior(int strength, int agility, int concentration, boolean sex, String name) {
//        Warrior warrior = new Warrior();
//        return warrior;
//    }
}