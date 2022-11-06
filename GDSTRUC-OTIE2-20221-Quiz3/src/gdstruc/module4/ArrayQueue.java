package gdstruc.module4;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class ArrayQueue {
    private Player[] queue;
    private  int front;
    private  int back;

    public ArrayQueue(int capacity) {
        queue = new Player[capacity];
        front = 0;
        back = 0;
    }

    // add player at the back of the queue
    public void enqueue(Player player) {
        if (back == queue.length) {
            Player[] newQueue = new Player[queue.length * 2];
            System.arraycopy(queue, 0, newQueue, 0, queue.length);
            queue = newQueue;
        }

        queue[back] = player;
        back++;
    }

    // remove the player that is in front of the queue
    public Player dequeue() {
        if (size() == 0) {
            throw  new NoSuchElementException();
        }

        Player removedPlayer = queue[front];
        front++;

        // reset the trackers to the first element of the array
        // when array is empty
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return  removedPlayer;
    }

    // access the front player
    public Player peek() {
        if (size() == 0) {
            throw  new NoSuchElementException();
        }

        return queue[front];
    }

    // get the number of elements in queue
    public int size() {
        return back - front;
    }

    // print all the elements of the queue
    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
    public int randomPlayerNum(){
        Random rand = new Random();
        int upperbound = 8 + 1;
        int playerNum = rand.nextInt(upperbound);
        return playerNum;
    }
    public void playerInput() {
        System.out.println(randomPlayerNum());
        int gameCounter = 0;
        for(int i = 0; i <= gameCounter; i++) {
            if (gameCounter == 10) {
                System.out.println("Matches concluded. End program.");
            }
            while (gameCounter < 10) {
                System.out.println("Press ENTER to continue...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                if (randomPlayerNum() == 5) {
                    gameCounter++;
                    System.out.println("5 Players Matched.");
                    printQueue();
                    for (int j = 0; j <= 5; j++) {
                        j++;
                        dequeue();
                    }
                    System.out.println("All players have dequeued.");
                }
                while (randomPlayerNum() > 5 || randomPlayerNum() < 5) {
                    System.out.println(randomPlayerNum());
                    System.out.println("Not enough or too many players. Try again.");
                }
                    }
                }
            }
    }