//Callejo, Dana Andrea E. OTIE2 (I sincerely apologize for how messy this is sir)
package gdstruc.module2;
public class Main {
    public static void main(String[] args) {
        // add players to the ArrayList
        Player goku = new Player(1, "Goku", 9001);
        Player vegeta = new Player(2, "Vegeta", 9000);
        Player broly = new Player(3, "Broly", 20000);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);
        linkedList.addToFront(broly);

        // add one more player
        Player yamcha = new Player(10, "Yamcha", 500);
        linkedList.addToFront(yamcha);

        //removes the first element
        linkedList.remove(yamcha);
        //adds the previously deleted nodes (which were removed upon deleting the head)
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);
        linkedList.addToFront(broly);
        // print the elements of the starting from the head
        linkedList.printList();
        linkedList.contains(new Player(10, "Yamcha", 500));
        linkedList.indexOf(broly);
    }
}