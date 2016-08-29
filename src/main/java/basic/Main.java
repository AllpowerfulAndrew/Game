//package basic;
//
//import basic.allEnums.armorAndWeapon.ArmorMaterial;
//import basic.allEnums.armorAndWeapon.ArmorType;
//import basic.allEnums.armorAndWeapon.DmgType;
//import basic.allEnums.armorAndWeapon.WeaponType;
//import basic.armor.Armor;
//import basic.unit.Warrior;
//import basic.weapon.Weapon;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//
//@Configuration
//@ComponentScan("basic")
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
//        Warrior warrior = context.getBean(Warrior.class);
//
//        Weapon sword = new Weapon(WeaponType.SWORD, 5, 300);
//        Armor helm = new Armor(ArmorType.HELM, ArmorMaterial.LAT, 3, 105);
//        Armor body = new Armor(ArmorType.BODY, ArmorMaterial.LAT, 13, 525);
////
////
////        Warrior warrior = new Warrior(14, 6, 8, true, "Шива");
//        warrior.setWeapon(sword);
//        warrior.setArmor(helm);
//        warrior.setArmor(body);
//
//        System.out.println("Имя:          " + warrior.getBaseCharacteristic().getName() +
//            "\n\nСила:         " + warrior.getBaseCharacteristic().getStrength() +
//              "\nЛовкость:     " + warrior.getBaseCharacteristic().getAgility() +
//              "\nКонцентрация: " + warrior.getBaseCharacteristic().getConcentration() +
//              "\nПол:          " + warrior.getBaseCharacteristic().getSex() +
//            "\n\nЗдоровье:     " + warrior.getBaseCharacteristic().getHealth() +
//              "\nВыносливость: " + warrior.getBaseCharacteristic().getStamina() +
//            "\n\nУрон оружием: " + warrior.getAttack().getDamageType().get(DmgType.BLUNT) + " огл. "
//                        + warrior.getAttack().getDamageType().get(DmgType.CUT) + " реж. "
//                        + warrior.getAttack().getDamageType().get(DmgType.SLASH) + " руб. "
//                        + warrior.getAttack().getDamageType().get(DmgType.PIERCING) + " кол. "
//                        + warrior.getAttack().getDamageType().get(DmgType.CRUSH) + " дроб. " +
//            "\n\nШлем:         " +
//                        "" + "");
//        System.out.println();
//    }
//}
