package gdstruc.module5;

public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(25, "Pikachu", 1);
        Player celebi = new Player(251, "Celebi", 2);
        Player hitmonchan = new Player(107, "Hitmonchan", 3);
        Player mankey = new Player(56, "Mankey", 4);
        Player starmie = new Player(175, "Starmie", 4);

        SimpleHashtable hashtable = new SimpleHashtable();

        // add initial players
        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(hitmonchan.getUserName(), hitmonchan);
        hashtable.put(starmie.getUserName(), starmie);

        // print the contents of the hashtable before removing
        hashtable.printHashtable();

        // remove a value based on key
        System.out.println(hashtable.remove("Mankey"));
        hashtable.printHashtable();
    }
}