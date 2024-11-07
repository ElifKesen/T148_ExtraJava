package day05;

import java.util.Scanner;

public class ATM {
    static Scanner scan=new Scanner(System.in);
    static String kartno="123456";
    static String sifre="1234";
    static double bakiye=30000;




    public static void main(String[] args) {
        /*
             ATM EKRANI VE ISLEMLER
        -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
           eger herhangi birini yanlis girerse tekrar girmesini isteyin.
        -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
        -Menu listesinde;
               Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
               islemleri olacaktır.
        -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
        -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
            eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
       - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
         */

        giris();
    }

    public static void giris(){

        System.out.println("\t\t\t****************JAVABANK'A HOSGELDINIZ**************\n"+
                "Güvenliginiz icin sifrenizi kimseyle paylasmayiniz\n"+
                "***********************\n");

        System.out.println("Kart numaranizi giriniz");
        String KkartNo= scan.nextLine();

        System.out.println("Sifrenizi giriniz");
        String KSifre= scan.nextLine();

        KkartNo=KkartNo.replaceAll("//s","");

        if (KkartNo.equals(kartno)&&KSifre.equals(sifre)){
            menu();
        }else {
            System.out.println("hatali giris yaptiniz, yeniden deneyiniz");
            giris();
        }
    }

    public static void menu(){
        System.out.println("Yapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");

        int secim= scan.nextInt();

        switch (secim){
            case 1:{
                bakiyesorgulama();
                break;
            } case 2:{
                System.out.println("Yatiracaginiz para miktarini giriniz");
                double miktar=scan.nextDouble();
                parayatirma(miktar);
                break;
            } case 3:{
                System.out.println("Cekeceginiz para miktarini giriniz");
                double miktar=scan.nextDouble();
                paracekme(miktar);
                break;
            } case 4:{
                paragonderme();
                break;
            } case 5:{
                sifredegistirme();
                break;

            } case 6:{
                System.out.println("Bankamizi tercih ettiginiz icin tesekkür ederiz");
                System.exit(0);
            } default:{
                System.out.println("Menude olmayan bir islem tercih edilemez, tekrar deneyiniz");
                menu();
            }
        }

    }

    public static void sifredegistirme() {
        System.out.println("Mevcut sifrenizi giriniz");
        String ksifre=scan.nextLine();
        if (ksifre.equals(sifre)){
            System.out.println("Yeni sifrenizi giriniz:");
            String yenisifre=scan.nextLine();
           // System.out.println("Sifreniz güncellendi");
           // menu();

            //sifrenin 4 rakam olmasi gerekiyorsa;
            if (yenisifre.length()==4){
                sifre=yenisifre;
                System.out.println("Sifreniz güncellendi");
                menu();
            }else {
                System.out.println("4 rakamli sifre yazmaniz gerekmektedir");
                sifredegistirme();
            }
        }else {
            System.out.println("Sifreniz eslesmedi, yeniden deneyiniz");
            sifredegistirme();
        }






    }

    private static void paragonderme() {
        scan.nextLine();
        System.out.println("IBAN No giriniz (TR ile baslamali ve 10 karakter uzunlugunda olmalidir) ");
        String iban= scan.nextLine().toUpperCase().replaceAll("\\s","");

        if (iban.startsWith("TR")&&iban.length()==10){
            System.out.println("Göndereceginiz miktari giriniz");
            double miktar= scan.nextDouble();

            if (miktar<=bakiye){
                bakiye-=miktar;
                System.out.println("Para gönderme isleminiz basarili");
                bakiyesorgulama();
            }else {
                System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
                menu();
            }
        }else {
            System.out.println("Gecerli bir iban girmelisiniz, tekrar deneyiniz");
            paragonderme();
        }

    }

    private static void paracekme(double miktar) {
        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyesorgulama();
        }else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
            //double yenimiktar= scan.nextDouble();
            //paracekme(yenimiktar);
            paracekme(scan.nextDouble());
        }
    }

    private static void parayatirma(double miktar) {
        bakiye+=miktar;
        bakiyesorgulama();
    }

    public static void bakiyesorgulama() {
        System.out.println("Bakiyeniz: "+bakiye);
        menu();
    }


}
