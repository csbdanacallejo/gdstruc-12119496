package gdstruc.module4;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(7);

        // add initial players to the queue
        arrayQueue.enqueue(new Player(1, "Goku", 9001));
        arrayQueue.enqueue(new Player(2, "Vegeta", 8000));
        arrayQueue.enqueue(new Player(3, "Broly", 15000));
        arrayQueue.enqueue(new Player(4, "Anya", 10));
        arrayQueue.enqueue(new Player(5, "anya_the_destroyer", 999999));
        arrayQueue.enqueue(new Player(6, "psychic-pink", 1900));
        arrayQueue.enqueue(new Player(7, "forger.a", 50000));

        arrayQueue.playerInput();
    }
}