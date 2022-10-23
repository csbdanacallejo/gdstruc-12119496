//Callejo, Dana Andrea E., Midterm Exam
//I apologize in advice sir, I could only build the program as far as randomizing commands
//So the part where it verifies if the stack is empty and stops the program is not present
//I also could not successfully push the discarded cards to the pile stack
package gdstruc.midterm;

public class Main {
    public static void main(String[] args) {
        CardStack stack = new CardStack();
        CardStack pile = new CardStack();

        stack.push(new Card("the fool"));
        stack.push(new Card("the magician"));
        stack.push(new Card("the high priestess"));
        stack.push(new Card("the empress"));
        stack.push(new Card("the emperor"));
        stack.push(new Card("the hierophant"));
        stack.push(new Card("the lovers"));
        stack.push(new Card("the chariot"));
        stack.push(new Card("justice"));
        stack.push(new Card("the hermit"));
        stack.push(new Card("wheel of fortune"));
        stack.push(new Card("strength"));
        stack.push(new Card("the hanged man"));
        stack.push(new Card("death"));
        stack.push(new Card("temperance"));
        stack.push(new Card("the devil"));
        stack.push(new Card("the tower"));
        stack.push(new Card("the star"));
        stack.push(new Card("the moon"));
        stack.push(new Card("the sun"));
        stack.push(new Card("judgement"));
        stack.push(new Card("the world"));
        stack.push(new Card("id"));
        stack.push(new Card("super-ego"));
        stack.push(new Card("ego"));
        stack.push(new Card("mask"));
        stack.push(new Card("face"));
        stack.push(new Card("mirror"));
        stack.push(new Card("soul"));
        stack.push(new Card("shell"));

        System.out.println("You drew: " + stack.drawCard());
        stack.commandName();
    }
}