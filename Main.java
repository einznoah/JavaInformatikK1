import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        // erstes Datum
        Date d1 = DatumEingabe("erstes");
        // zweites Datum
        Date d2 = DatumEingabe("zweites");

        // vergleichen
        int result = d2.compareTo(d1);

        // Print
        if (result == 1) {
            System.out.println("Erste Person ist älter als die zweite");
        } else if (result == -1) {
            System.out.println("Zweite Person ist älter als die erste");
        } else {
            System.out.println("Beide Personen sind gleich alt");
        }

        // Tage zwischen den Geburtstagen
        int d1Days = (int) TimeUnit.MILLISECONDS.toDays(d1.getTime());
        int d2Days = (int) TimeUnit.MILLISECONDS.toDays(d2.getTime());
        int daysApart = Math.abs(d1Days - d2Days);
        System.out.println("Die Person haben " + daysApart + " Tage voneinander Geburtstag");
    }

    private static Date DatumEingabe(String anzahl) {
        Console console = System.console();
        System.out.println("Bitte " + anzahl + " Datum eingeben [DD-MM-YYYY]");
        String date1Raw = console.readLine();
        String[] date1Split = date1Raw.split("-");
        int day = Integer.parseInt(date1Split[0]);
        int month = Integer.parseInt(date1Split[1]);
        int year = Integer.parseInt(date1Split[2]);
        return(new Date(year, month, day));
    }
}