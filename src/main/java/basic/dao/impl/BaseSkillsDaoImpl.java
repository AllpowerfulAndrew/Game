package basic.dao.impl;

import basic.dao.BaseSkillsDao;
import basic.model.entity.BaseSkills;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BaseSkillsDaoImpl extends BaseDaoImpl<BaseSkills> implements BaseSkillsDao<BaseSkills> {

    @Override
    protected Class<BaseSkills> getEntityName() {
        return BaseSkills.class;
    }
}