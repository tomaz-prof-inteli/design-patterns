package comportamental.state;

import static _utils.ES.*;

public class Pincel implements  Ferramenta {
    @Override
    public void mouseDown() {
        print("Ícone do Pincel");
    }

    @Override
    public void mouseUp() {
        print("Desenhar");
    }
}
