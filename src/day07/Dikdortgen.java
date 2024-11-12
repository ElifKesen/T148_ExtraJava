package day07;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunkenar, double kisakenar) {
        super(uzunkenar, kisakenar);
    }

    @Override
    public String toString() {
        return"Dikdortgenin uzunkenari=" + uzunkenar +
                ", Dikdortgenin kisakenari=" + kisakenar +
                "Dikdortgenin alani: "+alanhesaplama(uzunkenar,kisakenar)+
                "Dikdortgenin cevresi: " +cevrehesaplama(uzunkenar,kisakenar);
    }
}
