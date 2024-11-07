package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S03_SicaklikGostergesiArayList {
    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    // "e" girildiğinde veri girişi sonlandırılsın.
    // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> gununSicakliklari = new ArrayList<>();

        System.out.println("Sicaklik degerlerini giriniz, veri girisini sonlandirmak icin e'ye basiniz");
        while (true) {
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("e")) {
                System.out.println("Veri girisi sonlandirildi");
                break;
            } else if (input.matches("-?\\d+(\\.\\d+)?")) {
                double girilenSicaklik = Double.parseDouble(input);
                gununSicakliklari.add(girilenSicaklik);
            } else {
                System.out.println("Gecersiz veri girisi!!!");
            }
        }

        if (!gununSicakliklari.isEmpty()) {
            Collections.sort(gununSicakliklari);
            System.out.println("Girilen deger sayisi" + gununSicakliklari.size());
            System.out.println("Girilen en dusuk sicaklik degeri: " + gununSicakliklari.get(0));
            System.out.println("Girilen en yuksek sicaklik degeri: " + gununSicakliklari.get(gununSicakliklari.size() - 1));

        } else {
            System.out.println("Liste bos, hic deger girilmedi");

        }

    }
}
