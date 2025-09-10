package comportamental.state;

import static _utils.ES.*;

public class Canvas {
    private Ferramenta currentTool;

    public void mouseDown() {
    	if (currentTool == null) {
    		print("Não há ferramenta selecionada!");
    		return;
    	}
        currentTool.mouseDown();
    }

    public void mouseUp() {
    	if (currentTool == null) {
    		print("Não há ferramenta selecionada!");
    		return;
    	}
        currentTool.mouseUp();
    }

    public Ferramenta getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Ferramenta currentTool) {
        this.currentTool = currentTool;
    }
}
