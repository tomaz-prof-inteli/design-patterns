package comportamental.state;

import static _utils.ES.input;
import static _utils.ES.print;

import java.util.Arrays;
import java.util.List;

public class _Main {
	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		List<Ferramenta> ferramentas = Arrays.asList(new Pincel(), new Borracha());
		
		String menu = "(1) Selecionar Pincel";
		menu += "\n(2) Selecionar Borracha";
		menu += "\n(3) Mouse down";
		menu += "\n(4) Mouse up";
		menu += "\n(0) Sair";
		
		boolean sair = false;
		
		while (!sair) {
			String opcao = input(menu);
			switch(opcao) {
			case "1": 
				canvas.setCurrentTool(ferramentas.get(0));
				break;
			case "2":
				canvas.setCurrentTool(ferramentas.get(1));
				break;
			case "3":
				canvas.mouseDown();
				break;
			case "4":
				canvas.mouseUp();
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