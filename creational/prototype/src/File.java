public interface File extends Cloneable {
    void draw();
    void paste();
    File copy() throws CloneNotSupportedException;
}