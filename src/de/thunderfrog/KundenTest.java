package de.thunderfrog;

public class KundenTest {
    /*
     * Eine Klasse, die mit Kundenobjekten arbeitet:
     */
    public static void main(String[] args) {
        /*
         * Klassen sind Datentypen:
         */
        Kunde eins = new Kunde();
        /*
         * new erzeugt neue Objekte, hier: ein Kundenobjekt
         * Das Kundenobjekt lege ich ab in einer Variablen vom Typ Kunde
         */
        eins.vorname = "Klaus";
        eins.nachname = "Meier";
        /*
         * Jetzt habe ich Kunde eins einen Vornamen und Nachnamen gegeben
         */
        eins.kundennummer = 1;
        /*
         * Die Kundennummer ist nat�rlich vollkommen
         * unabh�ngig vom Variablennamen
         */

        /*
         * Was passiert wenn ich mein Objekt ausgeben will?
         *
         * Leider nichts schönes :(
         */
        System.out.println(eins);
        /*
         * So einfach bekommen wir nur eine unbrauchbare Objektreferenz
         *
         * Um an die Werte meiner Felder zu kommen muss ich
         * explizit die Feldnamen angeben
         */
        System.out.println(eins.vorname + " " + eins.nachname);

        /*
         * Um zu sehen wie gut es ist, dass die zusammengehörigen Werte
         * zusammen abgelegt sind, erzeuge ich noch eine zweite Instanz
         * von Kunde
         */
        Kunde karin = new Kunde();
        karin.vorname = "Karin";
        karin.nachname = "Schneider";
        karin.kundennummer = 2;
        /*
         * Die einzelnen Objekte sind vollkommen unabhängig voneinander!
         */
        System.out.println(karin.vorname+" "+karin.nachname);

        Kunde mehmet = new Kunde("�zmen","Mehmet",3);
        /*
         * So kann ich in einer Zeile meinen Kunden initialisieren
         */
        System.out.println(mehmet.vorname+" "+mehmet.nachname);
        /*
         * Jetzt mit der Methode:
         */
        eins.ausgeben();
        karin.ausgeben();
        mehmet.ausgeben();

        /*
         * Weil eine Klasse ein ganz normaler Datentyp ist
         * geht das:
         */
        Kunde[] liste = {eins,karin,mehmet, new Kunde("M�ller","Klara",4)};
        for(int i=0; i < liste.length; i++) {
            liste[i].ausgeben();
        }
    }
}