package estrutural.bridge;

import static _utils.ES.*;

public class _Main {

	public static void main(String[] args) {
		Device dispositivo = new SamsungTV();
		RemoteControl controle = null;
		String menu = "(1) Controle simples";
		menu += "\n(2) Controle avançado";
		String opcao = input(menu);
		switch(opcao) {
		case "1":
			controle = new RemoteControl(dispositivo);
			break;
		case "2":
			controle = new AdvancedRemoteControl(dispositivo);
			break;
		}
		controle.turnOn();
		if (controle instanceof AdvancedRemoteControl) {
			((AdvancedRemoteControl) controle).setChannel(5);
		}
	}

}
