package exerc09;

public class ProjetoLivro {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 22,"M");
		p[1] = new Pessoa("Maria", 42,"F");
		p[2] = new Pessoa("Stela", 28,"F");
		
		l[0] = new Livro("Aprendendo Java", "José Silveira", 300, p[0]);
		l[1] = new Livro("POO para Iniciantes", "Victória Smith", 284, p[2]);
		l[2] = new Livro("JS Intermediário", "Paulo Santos", 400, p[1]);
		
		
		l[0].abrir();
		l[0].folhear(150);
		System.out.println(l[0].detalhes());
	}

}
