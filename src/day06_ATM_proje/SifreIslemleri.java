package day06_ATM_proje;

public class SifreIslemleri {
    public static void sifredegistirme() {
        GirisIslemleri.scan.nextLine();
        System.out.println("Mevcut sifrenizi giriniz");
        String ksifre = GirisIslemleri.scan.nextLine();
        if (ksifre.equals(GirisIslemleri.sifre)) {
            System.out.println("Yeni sifrenizi giriniz:");
            String yenisifre = GirisIslemleri.scan.nextLine();
            // System.out.println("Sifreniz güncellendi");
            // menu();

            //sifrenin 4 rakam olmasi gerekiyorsa;
            if (yenisifre.length() == 4) {
                GirisIslemleri.sifre = yenisifre;
                System.out.println("Sifreniz güncellendi");
                MenuIslemleri.menu();
            } else {
                System.out.println("4 rakamli sifre yazmaniz gerekmektedir");
                sifredegistirme();
            }
        } else {
            System.out.println("Sifreniz eslesmedi, yeniden deneyiniz");
            sifredegistirme();
        }
    }
}
