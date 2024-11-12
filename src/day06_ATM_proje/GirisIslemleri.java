package day06_ATM_proje;

import java.util.Scanner;

public class GirisIslemleri {
    static Scanner scan=new Scanner(System.in);
    static String kartno="123456";
    static String sifre="1234";
    static double bakiye=30000;

    public static void giris(){

        System.out.println("Kart numaranizi giriniz");
        String KkartNo= scan.nextLine();

        System.out.println("Sifrenizi giriniz");
        String KSifre= scan.nextLine();

        KkartNo=KkartNo.replaceAll("//s","");

        if (KkartNo.equals(kartno)&&KSifre.equals(sifre)){
           MenuIslemleri.menu();
        }else {
            System.out.println("hatali giris yaptiniz, yeniden deneyiniz");
            giris();
        }
    }
}
