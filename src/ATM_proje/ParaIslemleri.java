package ATM_proje;

public class ParaIslemleri {
    public static void paragonderme() {
        GirisIslemleri.scan.nextLine();
        System.out.println("IBAN No giriniz (TR ile baslamali ve 10 karakter uzunlugunda olmalidir) ");
        String iban= GirisIslemleri.scan.nextLine().toUpperCase().replaceAll("\\s","");

        if (iban.startsWith("TR")&&iban.length()==10){
            System.out.println("Göndereceginiz miktari giriniz");
            double miktar= GirisIslemleri.scan.nextDouble();

            if (miktar<=GirisIslemleri.bakiye){
                GirisIslemleri.bakiye-=miktar;
                System.out.println("Para gönderme isleminiz basarili");
                BakiyeIslemleri.bakiyesorgulama();
            }else {
                System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
                MenuIslemleri.menu();
            }
        }else {
            System.out.println("Gecerli bir iban girmelisiniz, tekrar deneyiniz");
            paragonderme();
        }

    }

    public static void paracekme(double miktar) {
        if (miktar<=GirisIslemleri.bakiye){
            GirisIslemleri.bakiye-=miktar;
           BakiyeIslemleri.bakiyesorgulama();
        }else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
            //double yenimiktar= scan.nextDouble();
            //paracekme(yenimiktar);
            paracekme(GirisIslemleri.scan.nextDouble());
        }
    }

    public static void parayatirma(double miktar) {
        GirisIslemleri.bakiye+=miktar;
        BakiyeIslemleri.bakiyesorgulama();
    }

}
