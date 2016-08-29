package basic.logic;

import basic.dao.WarriorDao;
import basic.logic.exceptions.NoWarriorNameException;
import basic.model.entity.Warrior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WarriorListEdition {
    @Autowired
    WarriorDao warriorDao;

    public WarriorListEdition() {

    }

    public Warrior add(int id, String name) throws NoWarriorNameException {
        if (name == null || name.equals("")) {
            throw new NoWarriorNameException();
        }
        Warrior warrior = new Warrior();
        warrior.setName(name);
        if (warriorDao.getById(id) != null) {
            warrior.setId(id);
        }

        return warrior;
    }
//TODO сделаем это когда мозг будет свеженький, как мороз.
//    public void delete(int id, String name) throws NoWarriorNameException {
//        if (name == null || name.equals("")) {
//            throw new NoWarriorNameException();
//        }
//
//        if (id == 0) {
//            deleteListName(name);
//        } else{
//            deleteOneName(name);
//        }
//    }
//
//    private void deleteOneName(String name) {
//        Warrior warrior = new Warrior();
//        warrior.setName(name);
//    }
//
//    private void deleteListName(String name) {
//        List<Warrior> warriorsName = warriorDao.getByName(name);
//        warriorDao.deleteList(warriorsName);
//    }


}
