package estrutural.proxy;

import static _utils.ES.*;

public class ProxyEbook implements Ebook {
    private String fileName;
    private EbookReal ebook;

    public ProxyEbook(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void mostrar() {
        if(ebook == null) {
            ebook = new EbookReal(fileName);
        }
        print("logando que o ebook foi mostrado...");
        ebook.mostrar();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
