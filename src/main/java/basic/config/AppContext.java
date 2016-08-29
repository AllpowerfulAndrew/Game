package basic.config;

import basic.dao.BaseSkillsDao;
import basic.dao.WarriorDao;
import basic.dao.impl.BaseSkillsDaoImpl;
import basic.dao.impl.WarriorDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
    public WarriorDao warriorDao() {
        return new WarriorDaoImpl();
    }
}