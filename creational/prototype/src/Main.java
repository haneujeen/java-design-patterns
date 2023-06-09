/**
 * This example is generated with ChatGPT from OpenAI.
 *
 * The idea of Prototype pattern is copying the object (picture) instance so avoiding the cost of instantiation.
 * Prototype creates new instance while flyweight reuses existing instance.
 */
public class Main {
    public static void main(String[] args) {
        Picture picture1 = new Picture("puppy.png");
        picture1.draw();

        try {
            Picture picture2 = picture1.copy();
            picture2.paste();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
