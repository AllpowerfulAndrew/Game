package basic.dao.impl;

import basic.dao.WarriorDao;
import basic.unit.Warrior;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class WarriorDaoImpl extends BaseDaoImpl<Warrior> implements WarriorDao<Warrior> {

    @Override
    protected Class<Warrior> getEntityName() {
        return Warrior.class;
    }
}
