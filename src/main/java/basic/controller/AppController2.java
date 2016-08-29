//package basic.controller;
//
//import basic.dao.BaseSkillsDao;
//import basic.dao.WarriorDao;
//import basic.logic.WarriorListEdition;
//import basic.model.entity.Warrior;
//import org.apache.log4j.Logger;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@SessionAttributes
//@RequestMapping("/addwarrior")
//public class AppController2 {
//    private static final Logger log = Logger.getLogger(AppController2.class);
//
//    @Autowired
//    private WarriorListEdition warriorListEdition;
//
//    @Autowired
//    private BaseSkillsDao baseSkillsDao;
//
//    @Autowired
//    private WarriorDao warriorDao;
//
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @RequestMapping(method = {RequestMethod.POST}, params = "add")
//    public String addUnit(@ModelAttribute Warrior warrior, Model model) {
//        try {
//            warriorDao.save(warrior);
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            warrior.setName("Мы не можем создать пустое имя!");
//        }
//        model.addAttribute("unit", warrior.getName());
//        return "test";
//    }
//
//    @RequestMapping(method = {RequestMethod.POST}, params = "remove")
//    public String deleteUnit(@ModelAttribute Warrior warrior, Model model) {
//        try {
//            warriorDao.delete(warrior);
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            warrior.setName("Мы не можем удалить пустое имя!");
//        }
//        model.addAttribute("unit", warrior.getName());
//        return "test";
//    }
//}