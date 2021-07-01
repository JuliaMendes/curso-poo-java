package ProjetoYoutube;

public class ProjetoYoutube {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML 5");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("João", 22, "M","joao01" );
		g[1] = new Gafanhoto("Sara", 24, "F","sarasantos10" );
		
		System.out.println(g[0].toString());
		
	}

}
