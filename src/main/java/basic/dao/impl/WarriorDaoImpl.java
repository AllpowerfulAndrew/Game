package basic.dao.impl;

import basic.dao.WarriorDao;
import basic.model.entity.Warrior;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class WarriorDaoImpl extends BaseDaoImpl<Warrior> implements WarriorDao<Warrior> {

    @Override
    protected Class<Warrior> getEntityName() {
        return Warrior.class;
    }

    @Override
    public List<Warrior> getByName(String name) {
        Criteria criteria = sessionFactory.
                getCurrentSession().createCriteria(getEntityName());
        criteria.add(Restrictions.eq("name", name));
        return (List<Warrior>) criteria.list();
    }

    @Override
    public void deleteList(List<Warrior> warriors) {
        sessionFactory.getCurrentSession().delete(warriors);
    }
}
