package day01;

import java.util.Scanner;

public class EsraI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen günde kaç bardak çay içtiğinizi giriniz...:");
        double bardak=scan.nextDouble();
        if (bardak <= 0) {
            System.out.println("Lütfen geçerli bir deger giriniz..:");
        } else {
            System.out.println("Her bardak için kaç küp şeker kullanıyorsunuz..:");
        }
        double seker = scan.nextDouble();
        double yillikseker = bardak * seker * 365;
        double kirkyillilseker = yillikseker * 40;
        System.out.println( "Yillik seker tuketimi..:"+ yillikseker);
        System.out.println("kirk yillik seker tuketimi..:"+ kirkyillilseker);

    }
}
