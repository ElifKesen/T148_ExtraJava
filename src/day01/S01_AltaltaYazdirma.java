package day01;

public class S01_AltaltaYazdirma {
    public static void main(String[] args) {
        /*
    12345 sayisinin herbir basamagini konsolda altalta yazdirin.
    input: 12345
    output: 1
            2
            3
            4
            5
     */
        int sayi=34328;
        int birlerbasamagi=sayi%10; //5
        int onlarbasamagi=(sayi/10)%10;//1234 olarak aldik sayiyi
        int yuzlerbasamagi=(sayi/100)%10;
        int binlerbasamagi=(sayi/1000)%10;
        int onbinlerbasamagi=(sayi/10000)%10;
        System.out.println(onbinlerbasamagi+"\n"+binlerbasamagi+"\n"+yuzlerbasamagi+"\n"+onlarbasamagi+"\n"+birlerbasamagi);

    }

}
