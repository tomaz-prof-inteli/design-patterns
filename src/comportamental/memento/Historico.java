package comportamental.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class Historico {
    private Deque<EditorEstado> estados = new ArrayDeque<>();
    
    public void push(EditorEstado estado) {
        estados.push(estado);
    }

    public EditorEstado pop() {
    	if (estados.size() == 0) {
    		return null;
    	}
        return estados.pop();
    }
}
