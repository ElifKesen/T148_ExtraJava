package day01;

import java.util.Scanner;

public class Cansu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Günde kac bardak cay iciyorsunuz?");
        double bardak=scan.nextDouble();

        System.out.println("her bardak icin kac küp seker kullaniyorsunuz?");
        double seker= scan.nextDouble();


        if (bardak<= 0 && seker <=0){
            System.out.println("Bu degerler için hesaplama yapılamaz :)");

        } else if(bardak >0 && seker >0){

            double yilliksekertuketimi=(bardak*seker*2.77)*365/1000;
            double kirkyilliksekertuketimi=yilliksekertuketimi*40;

            System.out.println("Yillik seker tüketiminiz: "+yilliksekertuketimi);
            System.out.println("Kirkyillik seker tüketiminiz: "+kirkyilliksekertuketimi);


        }
    }
}
