/**
 * This example is generated with ChatGPT by OpenAI for the Memento Design Pattern
 * as a part of coursework.
 *
 * The Memento pattern provides a way to restore an object to its previous state.
 * This is an example of a simple text editor with undo functionality.
 * 
 * The text editor (Originator) will produce snapshots of its state (Mementos), 
 * which will be managed by a history object (Caretaker).
 *
 * Out:
 *     Initial state
 *     Updated state
 *     Initial state
 */
public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator texteditor = new Originator();

        texteditor.setState("Initial state");
        caretaker.save(texteditor);
        System.out.println(texteditor);

        texteditor.setState("Updated state"); // Caretaker doesn't save this state since we're not updating the state further
        System.out.println(texteditor);

        caretaker.undo(texteditor);
        System.out.println(texteditor);
    }
}