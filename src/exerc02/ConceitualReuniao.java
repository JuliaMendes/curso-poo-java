package exerc02;

public class ConceitualReuniao {
	
	String nomeEmpresa;
	String local;
	int participantes;
	float tempo;
	boolean confirmada;
	
	void status() {
		System.out.println("Nome empresa: " + this.nomeEmpresa);
		System.out.println("Local: " + this.local);
		System.out.println("Número de participantes: " + this.participantes);
		System.out.println("Tempo total: " + this.tempo);
		System.out.println("Reunião pode acontecer?: " + this.confirmada);
		
		
	}
	
	void comecar() {
		if(this.confirmada == true) {
			System.out.println("Reunião pode começar");
		} else {
			System.out.println("Reunião não foi confirmada");
		}
	}
	
	
	void confirmada() {
		this.confirmada = false;
	}
	
	

}
