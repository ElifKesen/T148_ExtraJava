package day07;

import java.util.Scanner;

public class Menu {
    static Scanner scan= new Scanner(System.in);

    static void menu(){
        System.out.println("Sekil hesaplama programina hosgeldiniz!!!\n"+
                "Alanini ve cevresini hesaplamak istediginiz seklin numarasini giriniz:\n"
        +"1.CEMBER\n"
        +"2.DIKDORTGEN\n"
        +"3.KARE\n"
        +"4.CIKIS\n"
        +"SECIMINIZ: ");

        char secim= scan.next().charAt(0);

        switch (secim){
            case '1':{
                cemberbilgileri();
                break;
            } case '2':{
                dikdortgenbilgileri();
                break;
            } case '3':{
                karebilgileri();
                break;
            } case '4':{
                System.out.println("Sistemden cikiliyor");
                break;
            } default:
                System.out.println("Gecersiz giris");
                menu();
                break;
        }


    }

    private static void karebilgileri() {
        System.out.println("Karenin kenarini giriniz");
        double karekenar= scan.nextDouble();

        Kare kare=new Kare(karekenar,karekenar);
        System.out.println(kare);
        menu();

    }

    private static void dikdortgenbilgileri() {
        System.out.println("Uzunkenari giriniz");
        double uzunkenar= scan.nextDouble();
        System.out.println("Kisakenari giriniz");
        double kisakenar= scan.nextDouble();

        Dikdortgen dikdortgen=new Dikdortgen(uzunkenar,kisakenar);
        System.out.println(dikdortgen);
        menu();

    }

    private static void cemberbilgileri() {
        System.out.println("Cewmberin yaricapini giriniz");
        double yaricap= scan.nextDouble();
        Cember cember=new Cember(yaricap);
        System.out.println(cember);
        menu();
    }

}
