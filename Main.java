package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Hero hero = new Hero(); // definējam klasi
       Enemy enemy = new Enemy(); // definējam klasi

        Scanner scanner = new Scanner(System.in);


        String attack1 = enemy.attack();
        System.out.println("Choose your character");
        System.out.println("1 " + hero.her1);
        System.out.println("2 " + hero.her2);
        System.out.println("3 " + hero.her3);
        String char_choose = scanner.nextLine();

        if (char_choose.equals("1")) {
            System.out.println(enemy.en2 + "Attacked you " + hero.her1 + attack1);
            System.out.println("Hero1 health 80HP");
        } else if (char_choose.equals("2")) {
            System.out.println(enemy.en3 + "Attacked you " + hero.her2 + attack1);
            System.out.println("Hero1 health 80HP");
        } else if (char_choose.equals("3")) {
            System.out.println(enemy.en1 + "Attacked you " + hero.her3 + attack1);
            System.out.println("Hero1 health 80HP");
        } else {
            System.out.println("Wrong choice!");
        }
        System.out.println("Choose your character");
        System.out.println("1 " + enemy.en1);
        System.out.println("2 " + enemy.en2);
        System.out.println("3 " + enemy.en3);
        String char_choose_en = scanner.nextLine();

        if (char_choose_en.equals("1")) {
            System.out.println(hero.her1 + "Attacked you " + enemy.en1 + attack1);
            System.out.println("Enemy1 health 80HP");
        } else if (char_choose_en.equals("2")) {
            System.out.println(hero.her2 + "Attacked you " + enemy.en2 + attack1);
            System.out.println("Enemy2 health 80HP");
        } else if (char_choose_en.equals("3")) {
            System.out.println(hero.her3 + "Attacked you " + enemy.en3 + attack1);
            System.out.println("Enemy3 health 80HP");
        } else {
            System.out.println("Wrong choice!");
        }



    }
}
