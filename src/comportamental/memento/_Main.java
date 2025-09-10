package comportamental.memento;

import static _utils.ES.*;

public class _Main {
	public static void main(String[] args) {
		Editor editor = new Editor();
		Historico historico = new Historico();
		
		editor.setConteudo("Escreva seu conteúdo...");
		editor.setTamanhoFonte(12);
		
		String menu = "(1) Mostrar editor";
		menu += "\n(2) Alterar conteúdo";
		menu += "\n(3) Alterar tamanho da fonte";
		menu += "\n(4) Desfazer";
		menu += "\n(0) Sair";
		
		boolean sair = false;
		while(!sair) {
			String opcao = input(menu);
			switch(opcao) {
			case "1":
				print(editor.toString());
				break;
			case "2":
				historico.push(editor.criarEstado());
				String c = input("Novo conteúdo:");
				editor.setConteudo(c);
				break;
			case "3":
				historico.push(editor.criarEstado());
				int t = Integer.parseInt(input("Novo tamanho da fonte:"));
				editor.setTamanhoFonte(t);
				break;
			case "4":
				EditorEstado anterior = historico.pop();
				if (anterior == null) {
					print("Não há estado anterior!");
				}
				else {
					editor.restaurar(historico.pop());
				}
				break;
			case "0":
				sair = true;
				break;
			default:
				print("Opção inválida!");
			}
		}
	}
}
