package day01;

import java.util.Scanner;

public class HamzaK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Günde kaç bardak çay içtiğinizi giriniz: ");
        int bardak = scanner.nextInt();
        System.out.print("Çayınıza attığınız küp şeker miktarını giriniz: ");
        double seker = scanner.nextDouble();
        if ( seker == 0 && bardak > 0 ) System.out.println("Aferin, böyle devam et :)");
        else if (seker > 0 && bardak > 0){
            double yillikSekerTuketim = (bardak * seker * 2.77) * 365 / 1000;
            double kirkYillikSekerTuketim = yillikSekerTuketim * 40;
            System.out.println("Yıllık şeker tüketimi (KG): " + yillikSekerTuketim);
            System.out.println("Kırk yıllık şeker tüketimi (KG): " + kirkYillikSekerTuketim);
        }
        else {
            while ( !(seker > 0 && bardak > 0) ) {
                System.out.println("Girilen değerler hatalı tekrar giriniz.");
                System.out.print("Lütfen uygun bardak miktarı giriniz: ");
                bardak = scanner.nextInt();
                System.out.print("Lütfen uygun şeker miktarı giriniz: ");
                seker = scanner.nextInt();
                if (seker > 0 && bardak > 0){
                    double yillikSekerTuketim = (bardak * seker * 2.77) * 365 / 1000;
                    double kirkYillikSekerTuketim = yillikSekerTuketim * 40;
                    System.out.println("Yıllık şeker tüketimi (KG): " + yillikSekerTuketim);
                    System.out.println("Kırk yıllık şeker tüketimi (KG): " + kirkYillikSekerTuketim);
                }
            }
        }
    }

}
