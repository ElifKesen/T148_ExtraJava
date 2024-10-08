package day01;

import java.util.Scanner;

public class ZeynepHasret {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Gunde kac bardak cay iciyorsunuz?");
        double bardak = scan.nextDouble();


        // bardak degeri negatif girilirse
        while (bardak <0) {
            System.out.println("Negatif deger ile hesaplama yapilamaz.\nGunde kac bardak cay iciyorsunuz?");
            bardak = scan.nextDouble();
        }

        System.out.println("Her bardak icin kac adet kup seker kullaniyorsunuz?");
        double seker = scan.nextDouble();


        // seker degeri negatif girilirse
        while (seker < 0) {
            System.out.println("Negatif deger ile hesaplama yapilamaz.\nHer bardak icin kac adet kup seker kullaniyorsunuz?");
            seker = scan.nextDouble();
        }


        // seker kullanmayanlar icin
        if (seker == 0) {
            System.out.println("Aferin, boyle devam et :)");
        }

        // seker kullananlar icin
        if (seker > 0) {
            double yillikSekerTuketimi = (bardak * seker * 2.77) * 365 / 1000;
            double kirkYillikSekerTuketimi = yillikSekerTuketimi * 40;

            System.out.println("Yillik seker tuketiminiz : " + yillikSekerTuketimi);
            System.out.println("Kirk yillik seker tuketiminiz : " + kirkYillikSekerTuketimi);
        }

    }
}
