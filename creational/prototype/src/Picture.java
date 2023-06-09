public class Picture implements File {
    private String filename;

    public Picture(String filename) {
        this.filename = filename;
    }

    @Override
    public void draw() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void paste() {
        System.out.println("Pasted " + filename);
    }

    @Override
    public Picture copy() throws CloneNotSupportedException {
        System.out.println(filename + " is copied to the clipboard");
        return new Picture(filename);
    }
}