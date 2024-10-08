package day01;

import java.util.Scanner;

public class Rüya {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Günde kac bardak cay içiyorsunuz?");
        double bardak= scanner.nextDouble();
        if (bardak<0){
            System.out.println("Negatif degerde bir girdi girdniz, lutfen pozitif bir girdi ile tekrar deneyin");
        }else if (bardak>0){
            System.out.println("Her bardak icin kac kup seker kullaniyorsunuz?");}
        double seker= scanner.nextDouble();
        // seker kullanmayanlar icin; seker sıfır demek
        if (seker==0){
            System.out.println("Aferin, boyle devam et");
        }
        // seker kullananlar icin;
        if (seker>0){
            double yilliksekertuketimi=(bardak*seker*2.77)*365/1000;
            double kirkyilliksekertuketimi= yilliksekertuketimi*40;

            System.out.println("Yillik seker tuketimi: "+ yilliksekertuketimi);
            System.out.println("KirkYillik seker tuketimi: "+ kirkyilliksekertuketimi);}

        if (seker<0){
            System.out.println("Negatif degerde bir girdi girdniz, lutfen pozitif bir girdi ile tekrar deneyin");}
    }
}
