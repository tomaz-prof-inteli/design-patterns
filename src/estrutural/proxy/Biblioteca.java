package estrutural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName) {
        ebooks.get(fileName).mostrar(); // not real world code...
    }
}
