package ProjetoPessoas;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public void receberAumento(float aum) {
		this.salario += aum;
	}
	

}
