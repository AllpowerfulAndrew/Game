package basic.dao.impl;

import basic.dao.BaseSkillsDao;
import basic.unit.Skills;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BaseSkillsDaoImpl extends BaseDaoImpl<Skills> implements BaseSkillsDao<Skills> {

    @Override
    protected Class<Skills> getEntityName() {
        return Skills.class;
    }
}