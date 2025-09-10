package comportamental.memento;

public class Editor {
    private String conteudo;
    private int tamanhoFonte;

    public EditorEstado criarEstado() {
        return new EditorEstado(conteudo, tamanhoFonte);
    }

    public void restaurar(EditorEstado estado) {
        conteudo = estado.getContent();
        tamanhoFonte = estado.getTamanhoFonte();
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

	public void setTamanhoFonte(int tamanhoFonte) {
		this.tamanhoFonte = tamanhoFonte;
	}

	@Override
	public String toString() {
		return "conteudo=" + conteudo + "\ntamanhoFonte=" + tamanhoFonte;
	}

}
