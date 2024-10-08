package day01;

import java.util.Scanner;

public class ipek2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gunde kac bardak cay iciyorsunuz: ");
        double caySayisi = scan.nextDouble();

        if (caySayisi <= 0) {
            System.out.println("girmis oldugunuz bardak sayisiyla hesaplama yapilamaz...");
        } else {
            System.out.println("her bardak icin kac kup seker kullaniyorsunuz: ");
            double sekerSayisi = scan.nextDouble();

            if (sekerSayisi < 0) {
                System.out.println("negatif seker degeriyle hesaplama yapılamaz...");
            } else {
                if (sekerSayisi == 0) {
                    System.out.println("Aferin, böyle devam et :)");
                } else {
                    double yillikSeker = (caySayisi * sekerSayisi * 365 * 2.77) / 1000;
                    double kirkYillikSeker = yillikSeker * 40;
                    System.out.println("yillik seker tuketiminiz (kg): " + yillikSeker);
                    System.out.println("40 yillik seker tuketiminiz (kg): " + kirkYillikSeker);
                }
            }
        }
    }
}
