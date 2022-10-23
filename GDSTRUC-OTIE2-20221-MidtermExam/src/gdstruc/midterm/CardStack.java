package gdstruc.midterm;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class CardStack {
    private LinkedList<Card> stack;
    private LinkedList<Card> pile;
    public CardStack(){
        stack = new LinkedList<Card>();
        pile = new LinkedList<Card>();
    }
    public void push(Card card){
        stack.push(card);
    }
    public void discard(Card card) {
        pile.push(card);
    }
    public void getPile(Card card) {
        pile.pop();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public Card drawCard(){
        return stack.pop();
    }
    public Card topCard(){
        return stack.peek();
    }
    public void printStack(){
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Printing stack:");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public int getCommand(){
        Random rand = new Random();
        int upperbound = 3;
        int commandNum = rand.nextInt(upperbound);
        return commandNum;
    }
    public void commandName(){
        if (getCommand() == 0){

            Random rand = new Random();
            for (int i = 0; i < rand.nextInt(6); i++){
                drawCard();
                System.out.println("You drew " + (i + 1) + " cards.");
                for(int j = 0; j <= i; ++j){
                    System.out.println(drawCard());
                }
            }
        }
        else if(getCommand() == 1){
            Random rand = new Random();
            for (int i = 0; i < rand.nextInt(6); i++){
                discard(stack.pop());
                System.out.println("You discarded " + (i + 1) + " cards.");
                for(int j = 0; j <= i; ++j) {
                    System.out.println(stack.pop());
                }
            }
        }
        else if(getCommand() == 2){
            Random rand = new Random();
            for (int i = 0; i < rand.nextInt(6); i++){
                pile.pop();
                System.out.println("You retrieved " + (i + 1) + " cards from the pile.");
                for(int j = 0; j <= i; ++j) {
                    System.out.println(pile.pop());
                }
            }
        }
    }
}
