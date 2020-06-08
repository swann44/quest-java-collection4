import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Comparator<Hero> comparator = new Comparator<Hero>() {
           @Override
           public int compare(Hero orig, Hero compare) {
               return orig.getName().compareTo(compare.getName());
            }
        };
        Map<Hero, Flower> party = new TreeMap<>(comparator);
        // Hulk, Thor and Scarlet Witch have a Rose
        party.put(hulk, rose);
        party.put(thor, rose);
        party.put(scarletWitch, rose);
        // Vision has a Tulip
        party.put(vision, tulip);
        // Captain America has a Lily
        party.put(captainAmerica, lily);
        // Doctor Strange and Black Widow have a Violet
        party.put(doctorStrange, violet);
        party.put(blackWidow, violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        for (Hero hero : party.keySet()) {
            Flower flower = party.get(hero);
            if (flower == begonia) {
                System.out.println(true);
                break;
            }
            System.out.println(false);
            break;
        }
        // TODO 3 : For each hero, alphabetically, print the corresponding flower
            for (Hero hero : party.keySet()) {
                Flower flower = party.get(hero);
                System.out.println(flower.getName());
        }
    }
}
