package de.thunderfrog;

/*
 * Unsere Packages sollen einen zweiteiligen Namen haben:
 * zuerst einen Buchstaben für die alphabetische Anordnung
 * (so dass das erste Package mit Klassen oben ist usw.)
 * dann ein Wort zum Inhalt
 *
 * Die Punkte im Packagenamen stehen dabei für Unterordner
 * im Dateisystem (a.klassen ist also als Pfad workspace/OOP/src/a/klassen)
 *
 * Zusammengehürige Klassen liegen gemeinsam in einem Package
 *
 */

/*
 * In Java definiere ich alles in Klassen. Diese Klassen sind gleichzeitig
 * auch Datentypen, die Werte enthalten, im Beispiel Daten zu einem Kunden
 */

public class Kunde {
    /*
     * Werte zu einem Kunden schreibe ich einfach in die Klasse
     * als sogenannte Felder
     */

    String vorname;
    String nachname;
    int kundennummer;

    /*
     * Damit ich nicht immer vier Zeilen Code schreiben muss
     * um einen neuen Kunden zu erstellen:
     *
     * ich schreibe einen Konstruktor
     *
     * In seiner einfachsten Form macht er gar nichts,
     * aber ich kann �bergabeparameter mit angeben
     */
    Kunde(String nachname, String vorname, int kundennummer){
        /*
         * Die �bergabeparameter haben zwar den gleichen Namen
         * wie die Felder, aber sind andere Variablen!
         * Ich muss diese �bergebenen Werte explizit in meine Felder schreiben
         */
        this.nachname = nachname;
        /*
         * Das Schl�sselwort this bezieht sich immer auf das aktuelle
         * Objekt, auf die Instanz der Klasse in der ich gerade bin.
         *
         * Eine Instanz ist ein konkretes Objekt, das aus dieser Klasse
         * entstanden ist/erzeugt wurde
         *
         * Entsprechend f�r die anderen beiden Felder:
         */
        this.vorname = vorname;
        this.kundennummer = kundennummer;
    }

    /*
     * Weil ich jetzt einen eigenen Konstruktor definiert habe
     * existiert der Default-konsturktor nicht mehr.
     *
     * Java stellt einen parameterlosen Konstruktor zur Verf�gung
     * solange ich nicht selber einen Konstruktor definiert habe -
     * das ist der sogenannte Default-Konstruktor.
     *
     * Um unseren Testcode wieder lauffähig zu machen,
     * definiere ich meinen eigenen parameterlosen Konstruktor
     */
    Kunde(){
        // Der Konstruktor muss nichts tun, darum steht hier nichts
    }

    /*
     * Als n�chstes schreiben wir eine Methode, die das Objekt ausgibt
     */
    void ausgeben() {
        System.out.println(vorname+" "+nachname+", "+kundennummer);
    }
}