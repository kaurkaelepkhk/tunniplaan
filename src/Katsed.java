public class Katsed {
    public static void main(String[] args) {
        // loo Tund objekt
        Tund kolmasTund = new Tund();
        // lisa väärtused
        kolmasTund.tund = "4";
        kolmasTund.algus = "11:55";
        kolmasTund.lopp = "14:00";
        kolmasTund.aine = "JAVA programmeerimine";
        kolmasTund.grupp = "VS18";
        kolmasTund.opetaja = "Anna Karutina";
        kolmasTund.ruum = "Kopli A - A411 (arvutiklass)";

        // 4. tund
        // loo Tund objekt
        Tund neljasTund = new Tund();
        // lisa väärtused
        neljasTund.tund = "5";
        neljasTund.algus = "14:10";
        neljasTund.lopp = "15:40";
        neljasTund.aine = "JAVA programmeerimine";
        neljasTund.grupp = "VS18";
        neljasTund.opetaja = "Anna Karutina";
        neljasTund.ruum = "Kopli A - A411 (arvutiklass)";

        System.out.println(kolmasTund);
        System.out.println(neljasTund);

    }
} 