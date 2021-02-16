package de.thunderfrog;

/*
 * Ein anderes Beispiel zur Klassendefinition
 */

public class Buch {
    /*
     * Die Felder werden auch Instanzvariablen genannt
     */
    String titel;
    String autor;
    double preis;
    /*
     * Die Nummer soll automatisch vergeben werden
     */
    int lagernummer;
    /*
     * Es gibt auch Klassenvariablen, die sich alle Objekte der Klasse teilen
     * Diese Klassenvariablen haben das Schlüsselwort static
     */
    static int buchanzahl = 0;
    /*
     * buchanzahl soll jedesmal hochgezählt werden,
     * wenn eine buchinstanz erzeugt wird
     */


    /*
     * Die Lagernummer soll ermittelt werdem. ist kein Parameter
     */
    Buch(String titel, String autor, double preis){
        this.titel = titel;
        this.autor = autor;
        this.preis = preis;
        //buchanzahl soll jedesmal hochgezählt werden, wenn ein Buch instanziiert wird
        buchanzahl++;
        this.lagernummer = buchanzahl;
        //hier wird die Klassenvariable in die Instanzvariable kopiert
    }
    /*
     * Es gibt keinen parameterlosen Konstruktor,
     * jedes Buch soll einen Titel, Autor und einen Preis haben
     */
    void ausgeben() {
        if(preis == 0.0) {
            System.out.println(autor+", "+titel+" LN: "+lagernummer);
        } else {
            System.out.println(autor+", "+titel+": "+preis+" LN: "+lagernummer);
        };
    }

    /*
     * Jetzt noch ein Konstruktor mit nur zwei Parametern
     */
    Buch(String titel, String autor){
        this.titel = titel;
        this.autor = autor;
        buchanzahl++;
        /*
         * Bei Lagernummer muss ich this nicht angeben
         * weil es keine lokale Variable mit dem gleichen Namen gibt
         * (ich kann es angeben, muss aber nicht)
         */
        lagernummer = buchanzahl;
    }

}