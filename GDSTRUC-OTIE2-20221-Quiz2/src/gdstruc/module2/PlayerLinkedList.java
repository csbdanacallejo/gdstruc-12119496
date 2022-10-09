package gdstruc.module2;

import java.util.Objects;

public class PlayerLinkedList {
    public int size;
    private PlayerNode head;
    // function to add a new player to the front of the linked list
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }
    //function to remove front element/player/head
    public void remove(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = null;
    }
    //function to mimic contains function/check list if it contains certain element with corresponding values
    public boolean contains(Player player){
        if(Objects.equals(player, 0)){
            System.out.println("This list contains that element.");
        }
        else{
            System.out.println("This list does not contain that element.");
        }
        return false;
    }
    // function to print the elements of the linked list
    public void printList() {
        System.out.print("HEAD -> ");
        PlayerNode current = head;
        int size = 0;
        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayer();
            size++;
        }
        System.out.print(" NULL\n");
        System.out.println("Size of Linked List: " + size);
    }
    public void indexOf(Player player) {
        PlayerNode current = head;
        int size = 0;
        int index = 0;
        while (current != null) {
            current = current.getNextPlayer();
            size++;
            if(Objects.equals(player, 0)){
                index++;
            }
        }
        System.out.print("Index is: " + index);
    }
}
