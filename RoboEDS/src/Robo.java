
public class Robo {
	private int bateria;
	private String datafabrica;
	private String nome;
	public Robo(String nome, int bateria, String datafabrica) {
		this.nome = nome;
		this.bateria = bateria;
		this.datafabrica = datafabrica;    }
	public String getNome() {
		return nome;	}
	public void setNome(String nome) {
		this.nome = nome;	}
	public String getFabrica() {
		return datafabrica;	}
	public void setFabrica(String datafabrica) {
		this.datafabrica = datafabrica;  }
	public int getBateria() {
		return bateria;	}
	public void setBateria(int bateria) {
		this.bateria = bateria;   } 
	public double Soma(double n1, double n2) {
		return n1+n2;    }
	public double Subtracao(double n1, double n2) {
		return n1-n2;    }
	public double Multiplicacao(double n1, double n2) {
		return n1*n2;    } 
	public double Divisao(double n1, double n2) {
		return n1/n2;    }
}




