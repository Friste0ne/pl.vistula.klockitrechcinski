package KlockiTrechcinski;

public class KlockiTrechcinski {
    public static void main(String[] args) {
        int posiadaneKlockiTrechcinski = 75;
        int pojemnoscKazdegoPojemnika = 6;
        System.out.println("Wypełnisz "+posiadaneKlockiTrechcinski/pojemnoscKazdegoPojemnika + " pojemniki(ów) po "+pojemnoscKazdegoPojemnika+" klocków");
        System.out.println("W ostatnim pojemniku zostanie "+posiadaneKlockiTrechcinski%pojemnoscKazdegoPojemnika +
                " klocki(ów)");
    }
}
