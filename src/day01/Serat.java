package day01;

import java.util.Scanner;

public class Serat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Günde kaç bardak çay içtiğinizi giriniz:");
        double bardak = input.nextDouble();

        if (bardak>0){

            System.out.print("Her bardak için kaç adet küp şeker kullandığınızı giriniz:");
            double seker = input.nextDouble();
            if (seker==0){
                System.out.println("Aferin, böyle devam et.");
            }
            else if (seker>0){

                double yillik = 365*((bardak*seker*2.77)/1000);
                System.out.println("Yıllık şeker tüketimi:"+yillik+"kg");
                double kirkyillik = 40*365*((bardak*seker*2.77)/1000);
                System.out.println("Kırk Yıllık şeker tüketimi:"+kirkyillik+"kg");

            }
            else {
                System.out.println("Yanlış değerler girdiniz.");
            }
        }
        else {
            System.out.println("Yanlış bardak değeri girdiniz.");
        }
    }
}
