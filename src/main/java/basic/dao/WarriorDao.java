package basic.dao;

import java.util.List;

public interface WarriorDao<Warrior> extends BaseDao<Warrior> {
    List<Warrior> getByName(String name);

    void deleteList(List<Warrior> warriorList);
}
