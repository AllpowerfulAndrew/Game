import basic.config.AppContext;
import basic.config.HibernateConfig;
import basic.dao.BaseSkillsDao;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {AppContext.class, HibernateConfig.class})
public class TestMainSkillsDao {
    private static final Logger log = Logger.getLogger(TestMainSkillsDao.class);

    @Autowired
    private BaseSkillsDao baseSkillsDao;

//    @Test
////    @Transactional
//    public void testAdd() {
//        List<BaseSkills> skills = new ArrayList<>();
//        skills.add(new BaseSkills());
////        skills.get(0).setId(11);
//        skills.get(0).setSkillName("MainBattleExperience");
//        skills.get(0).setSkillValue(4.2);
//        baseSkillsDao.add(skills.get(0));
//
////        Assert.assertEquals("Не досталось!", baseSkillsDao.getById(5).getSkillName(), "MainBattleExperience");
//    }

    @Test
    @Transactional
    public void testGetById() {
        log.warn(baseSkillsDao.getById(1).toString());
        Assert.assertEquals("Не досталось!", baseSkillsDao.getById(1), "MainBattleExperience");
    }

}
