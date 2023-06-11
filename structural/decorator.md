Decorator Pattern is a structural design pattern that attaches new behaviors to objects by 
placing objects inside wrapper objects (decorator) that contain the behaviors.

Java’s IO classes, such as BufferedInputStream, LineNumberInputStream, etc., that add functionality 
(such as buffering and line numbering) to InputStream objects are the examples of decorator pattern.

```agsl
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a FileInputStream
            FileInputStream fis = new FileInputStream("test.txt");

            // Decorate the FileInputStream with BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Read from the file via BufferedInputStream
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```