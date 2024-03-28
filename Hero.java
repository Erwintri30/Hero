package tugas3_pemlan;

import java.util.Scanner;

public class Hero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to Gladiator's Fury");
        System.out.println("============================================");

        System.out.println("Player 1: Silahkan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n");
        System.out.println("============================================");
        System.out.print("Nama Hero: ");
        String nama1 = scn.nextLine();
        System.out.print("HP: ");
        double hp1 = scn.nextDouble();
        System.out.print("Serangan: ");
        double serangan1 = scn.nextDouble();
        System.out.print("Pertahanan: ");
        double pertahanan1 = scn.nextDouble();
        scn.nextLine();

        System.out.println("Player 2: Silahkan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!\n");
        System.out.println("============================================");
        System.out.print("Nama Hero: ");
        String nama2 = scn.nextLine();
        System.out.print("HP: ");
        double hp2 = scn.nextDouble();
        System.out.print("Serangan: ");
        double serangan2 = scn.nextDouble();
        System.out.print("Pertahanan: ");
        double pertahanan2 = scn.nextDouble();
        scn.nextLine();

        classHero hero1 = new classHero(nama1, hp1, serangan1, pertahanan1);
        classHero hero2 = new classHero(nama2, hp2, serangan2, pertahanan2);

        int round = 0;
        boolean seri = false;
        while (round < 10) {
            round++;
            System.out.println("--------------------------");
            System.out.println("Ronde " + round);
            System.out.print("Apakah " + hero1.getNama() + " ingin menggunakan kemampuan khusus? (y/n): ");
            String input = scn.nextLine();
            if (input.equalsIgnoreCase("y")) {
                hero1.kemampuan("Immunity");
            }

            System.out.print("Apakah " + hero2.getNama() + " ingin menggunakan kemampuan khusus? (y/n): ");
            input = scn.nextLine();
            if (input.equalsIgnoreCase("y")) {
                hero2.kemampuan("Immunity");
            }
            hero2.serangan(hero1);
            hero1.serangan(hero2);

            if (hero1.getHp() <= 0 || hero2.getHp() <= 0) {
                break;
            }
        }

        if (hero1.getHp() > hero2.getHp()) {
            System.out.println("Pertarungan telah usai!\n" + hero2.getNama() + " telah dikalahkan!"
                    + "\n============================================\n" + hero1.getNama() + " adalah pemenangnya");
        } else if (hero1.getHp() < hero2.getHp()) {
            System.out.println("Pertarungan telah usai!\n" + hero1.getNama() + " telah dikalahkan!"
                    + "\n============================================\n" + hero2.getNama() + " adalah pemenangnya");
        } else {
            seri = true;
        }
        if (round >= 10 && seri) {
            System.out.println("Hasil seri");
        }

    }
}
