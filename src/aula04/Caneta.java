package aula04;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, String c, float p) { //método construtor
		this.modelo = m;
		this.ponta = p;
		this.cor = c;
		this.tampar();
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.destampar = false;
	}
	
	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Ponta:" + this.ponta);
		System.out.println("Cor:" + this.cor);
		System.out.println("Tampada:" + this.tampada);
		
	}
	

}
