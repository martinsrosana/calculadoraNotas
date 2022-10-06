import java.util.Scanner;

public class Aluno {
	protected double nota1 = 0;
	protected double nota2 = 0;
	protected double media = 0 ;
	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}// getters

	public String getNome() {
		return this.nome;
	}
	public double getMedia() {
		return this.media;
	}
	
	public void perguntaNotas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primeira nota: ");
		this.nota1 = scanner.nextDouble();
		System.out.println("Segunda nota: ");
		this.nota2 = scanner.nextDouble();
			
		
	} //método
	public void calculaMedia () {
		this.media = ( this.nota1 + this.nota2) / 2;	
	}
	// método
	public String pegaSituacao () {
		if ( this.media >= 7) {
			return "Aprovado!";
		}
		if (this.media >= 5) {
			return "Em recuperação" ;
		}
		return "Reprovado";
	}
}
