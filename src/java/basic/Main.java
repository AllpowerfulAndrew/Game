package basic;

import basic.armor.Armor;
import basic.armor.ArmorMaterial;
import basic.armor.ArmorType;
import basic.unit.Warrior;
import basic.weapon.Weapon;
import basic.weapon.WeaponType;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int strength = 2;
        int agility = 2;
        int concentariton = 1;
        boolean isMale = true;
        String sex;
        String name = "Паренёк";
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("Вводите характеристики: Силу, Ловкость, Концентрацию, пол(м/ж), имя.");
//        strength = Integer.parseInt(reader.readLine());
//        agility = Integer.parseInt(reader.readLine());
//        concentariton = Integer.parseInt(reader.readLine());
//        sex = reader.readLine();
//        name = reader.readLine();
//
//        if (sex.equals("м")) {
//            isMale = true;
//        }

        Weapon knife = new Weapon(WeaponType.KNIFE, 1.5, 200);
        Armor helm = new Armor(ArmorType.HELM, ArmorMaterial.CLOTH, 2, 200);

        Warrior warrior = new Warrior(strength, agility, concentariton, isMale, "Шива");
        warrior.setWeapon(knife);
        warrior.setArmors(helm);

        System.out.println(
                "Имя:          " + warrior.getBaseCharacteristic().getName() +
            "\n\nСила:         " + warrior.getBaseCharacteristic().getStrength() +
              "\nЛовкость:     " + warrior.getBaseCharacteristic().getAgility() +
              "\nКонцентрация: " + warrior.getBaseCharacteristic().getConcentration() +
              "\nПол:          " + warrior.getBaseCharacteristic().getSex() +
            "\n\nЗдоровье:     " + warrior.getBaseCharacteristic().getHealth() +
              "\nВыносливость: " + warrior.getBaseCharacteristic().getStamina() +
            "\n\nУрон оружием: " + warrior.getBaseCharacteristic().getWeaponDamage() +
              "\n" +
              "\nШлем:         ");
        System.out.println();
    }
}
