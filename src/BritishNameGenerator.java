public class BritishNameGenerator {
    public static String nameGenerator() {
        String[][] prefix = {
        {"Ash", "Bex", "Nor", "Win", "Strat"},
        {"King", "Queen", "Ox", "Cam", "Man"},
        {"New", "Old", "South", "North", "East"},
        {"Can", "Wil", "Roch", "Har", "York"},
        {"Grim", "West", "Upper", "Lower", "Chester"}
    };
        String[][] sufix = {
        {"ford", "mouth", "bridge", "field", "port"},
        {"ton", "bury", "stead", "worth", "well"},
        {"chester", "minster", "haven", "borough", "croft"},
        {"wick", "ham", "hurst", "by", "don"},
        {"gate", "leigh", "mere", "pool", "town"}
    };

        int pL = (int)(Math.random() * 5);
        int pW = (int)(Math.random() * 5);
        int sL = (int)(Math.random() * 5);
        int sW = (int)(Math.random() * 5);


        String prefixString = prefix[pL][pW];
        String suffixString = sufix[sL][sW];
        String townName = prefixString + suffixString;
        return townName;
    }
    public static void main(String[] args) {
    System.out.println(BritishNameGenerator.nameGenerator());
    }
}