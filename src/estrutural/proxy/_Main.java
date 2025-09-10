package estrutural.proxy;

import static _utils.ES.*;

public class _Main {

    public static void main(String[] args) {
        String[] fileNames = {"a.txt", "b.txt", "c.txt"};
        
        String menu = "(1) Biblioteca com Ebooks";
        menu += "\n(2) Biblioteca com Proxy para Ebooks";
        
        var biblioteca = new Biblioteca();

        String opcao = input(menu);
        
        switch(opcao) {
        case "1":
            for (var fileName : fileNames)
                biblioteca.add(new EbookReal(fileName));
            break;
        case "2":
            for (var fileName : fileNames)
                biblioteca.add(new ProxyEbook(fileName));
            break;
        default:
        	print("Opção inválida!");
        }
        
        print("Você escolheu a opção " + opcao + " e agora vou abrir os livros!");
        for (var fileName: fileNames) 
        	biblioteca.openEbook(fileName);
    }
}
