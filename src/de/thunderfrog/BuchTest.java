package de.thunderfrog;

public class BuchTest {
    /*
     * Hier sollen Buch-Instanzen erzeugt werden
     */
    public static void main(String[] args) {
        //Die statische Variable existiert auch OHNE Buchinstanz!
        System.out.println(Buch.buchanzahl);
        Buch hdr = new Buch("Der Herr der Ringe","J.R.R. Tolkien",17.99);
        hdr.ausgeben();
        System.out.println(Buch.buchanzahl);
        Buch koch = new Buch("Spaß mit Nudeln","Peter Nudler",9.99);
        koch.ausgeben();
        System.out.println(Buch.buchanzahl);

        Buch java = new Buch("Java ist auch eine Insel", "Christian Ullenboom");
        java.ausgeben();
        System.out.println(Buch.buchanzahl);
        hdr.ausgeben();
    }
}