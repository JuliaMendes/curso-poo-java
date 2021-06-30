package Aula011;

public class Aula011 {
	public static void main(String[] args) {	
		/*Visitante v1 = new Visitante();
		v1.setNome("Júlia");
		v1.setIdade(22);
		v1.setSexo("F");
		System.out.println(v1.toString());*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Fernando");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
	}

}
