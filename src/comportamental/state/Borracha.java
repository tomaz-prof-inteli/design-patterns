package comportamental.state;

import static _utils.ES.*;

public class Borracha implements Ferramenta {
    @Override
    public void mouseDown() {
        print("Ícone da Borracha");
    }

    @Override
    public void mouseUp() {
        print("Apagar algo");
    }
}
