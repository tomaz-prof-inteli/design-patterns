package estrutural.proxy;

import static _utils.ES.*;

public class EbookReal implements Ebook {
    private String fileName;

    public EbookReal(String fileName) {
        this.fileName = fileName;
        carregar();
    }

    private void carregar() {
        print("carregando o ebook " + this.fileName);
    }

    @Override
    public void mostrar() {
        print("mostrando o ebook " + this.fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }

}
