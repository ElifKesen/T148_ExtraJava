package day04;

import java.util.Scanner;

public class S02_SicaklikGostergesi2 {
    // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
    // "e" girildiğinde veri girişi sonlandırılsın.
    // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double maxsicaklik=Double.MIN_VALUE;
        double minsicaklik=Double.MAX_VALUE;

        System.out.println("Sicaklik degerlerini giriniz, veri girisini sonlandirmak icin e'ye basiniz");
        while (true) {
            String input = scan.nextLine();
            if (input.equals("e")) {
                System.out.println("Veri girisi sonlandirildi.");
                break;
            } else if (!input.matches("-?\\d+(\\.\\d+)?")) {
                System.out.println("Gecersiz giris. Lütfen sadece e giriniz");
                continue;
            }
            /*
                -?    negatif degerdeki sayilar icin
                \\d   0-9 arasi rakamlar icin
                +    basamak kazandirmak icin
                \\.\\d+  ondalikli kisim icin
                 */

            double sicaklik=Double.parseDouble(input);
            if (sicaklik>maxsicaklik){
                maxsicaklik=sicaklik;
            }
            if (sicaklik<minsicaklik){
                minsicaklik=sicaklik;
            }
        }
        System.out.println("Günün en yuksek sicaklik degeri: " + maxsicaklik);
        System.out.println("Gunun en dusuk sicaklik degeri; "+ minsicaklik);

    }
}
