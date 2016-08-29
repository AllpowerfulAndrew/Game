package basic.controller;

import basic.dao.BaseSkillsDao;
import basic.dao.WarriorDao;
import basic.logic.WarriorListEdition;
import basic.model.entity.BaseSkills;
import basic.model.entity.Warrior;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes
public class AppController {
    private static final Logger log = Logger.getLogger(AppController.class);


    @Autowired
    private WarriorListEdition warriorListEdition;

    @Autowired
    private BaseSkillsDao baseSkillsDao;

    @Autowired
    private WarriorDao warriorDao;

    @Autowired
    private SessionFactory sessionFactory;

//    @RequestMapping("/")
//    public String hello(Model model) {
//        model.addAttribute("warrior", (Warrior)warriorDao.getById(1));
//        return "hello";
//    }

    @RequestMapping("/")
    public String warrior(Model model) {
//        model.addAttribute("crypt", new BCryptPasswordEncoder().encode("user"));
//        List<Warrior> lw = warriorDao.getAll();
//        model.addAttribute("warrior", lw);
        return "hello";
    }

    @ModelAttribute("unitadd")
    public BaseSkills formBackingObject() {
        return new BaseSkills();
    }

    @RequestMapping("/warrior")
    public String unit(Model model) {
        List<Warrior> lu = warriorDao.getAll();
        model.addAttribute("warrior", new Warrior());
        model.addAttribute("unit_list", lu);
        return "warrior";
    }


    @RequestMapping(value = "/addwarrior", method = {RequestMethod.POST}, params = "add")
    public String addUnit(@ModelAttribute Warrior warrior, Model model) {
        try {
            warriorDao.save(warrior);
        } catch (NullPointerException e) {
            e.printStackTrace();
            warrior.setName("Мы не можем создать пустое имя!");
        }
        model.addAttribute("unit", warrior.getName());
        return "test";
    }

    @RequestMapping(value = "/addwarrior", method = {RequestMethod.POST}, params = "remove")
    public String deleteUnit(@ModelAttribute Warrior warrior, Model model) {
        try {
            warriorDao.delete(warrior);
        } catch (NullPointerException e) {
            e.printStackTrace();
            warrior.setName("Мы не можем удалить пустое имя!");
        }
        model.addAttribute("unit", warrior.getName());
        return "test";
    }


    //    @RequestMapping(value = "/addwarrior")
//    public String addUnit(@RequestParam("name") String name,
//                          @RequestParam(required = false, name = "id") int id, Model model) {
////        int id = Integer.valueOf(ids);
//        log.info(id + name);
//        try {
//            Warrior warrior = warriorListEdition.add(id, name);
//            warriorDao.save(warrior);
//        } catch (NoWarriorNameException e) {
//            e.printStackTrace();
//            name = "Мы не можем создать пустое имя!";
//        }
//        model.addAttribute("unit", name);
//        return "test";
//    }

//    @RequestMapping(value = "/deletewarrior", method = {RequestMethod.POST})
//    public String deleteUnit(@RequestParam(defaultValue = "0", name = "ids") String ids,
//                             @RequestParam("name") String name, Model model) {
//        int id = Integer.valueOf(ids);
//        try {
//            Warrior warrior = warriorListEdition.delete(id, name);
//            warriorDao.delete(warrior);
//        } catch (NoWarriorNameException e) {
//            e.printStackTrace();
//            name = "Мы не можем удалить пустое имя!";
//        }
//        model.addAttribute("unit", name);
//        return "test";
//    }

//    @RequestMapping(value = "/addunit", method = { RequestMethod.POST })
//    public String addUnit1(@ModelAttribute("unitadd") Unit unit, Model model) {
////    public String addUnit(Model model) {
////        Unit unit = formBackingObject();
//        model.addAttribute("unitadd", unit.getName());
//        return "test";
//    }

//    @RequestMapping("/auth/list")
//    public String magician(Model model) {
//        List<Warrior> lw = warriorDao.getAll();
//        model.addAttribute("warrior", lw);
//        List<Magician> lm = magicianDao.getAll();
//        model.addAttribute("magician", lm);
//        return "list";
//    }
}