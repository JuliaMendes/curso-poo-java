package Aula013;

public class Cachorro extends Lobo {
	@Override
	public void emitirSom() {
		System.out.println("Au, au, au");
	}
	
	public void reagir(String frase) {
		if (frase == "Toma comida" || frase == "Cheguei") {
			System.out.println("Abanar ou latir");
		} else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar o rabo");
		} else if (hora >= 18){
			System.out.println("Ignorar");
			
		} else {
			System.out.println("Abanar e latir");
		}
	}
	
	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
			this.emitirSom();
		}
	}
	
	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.err.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
}
