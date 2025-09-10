package comportamental.memento;

public class EditorEstado {
    private final String conteudo;
    private final int tamanhoFonte;

    public EditorEstado(String conteudo, int tamanhoFonte) {
        this.conteudo = conteudo;
        this.tamanhoFonte = tamanhoFonte;
    }

    public String getContent() {
        return conteudo;
    }

	public int getTamanhoFonte() {
		return tamanhoFonte;
	}
    
}
