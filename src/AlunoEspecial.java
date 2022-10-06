
public class AlunoEspecial extends Aluno {

	public AlunoEspecial(String nome) {
		super(nome);
	}
	 @Override
	public String pegaSituacao() {
		if (this.media >= 7) {
			return "Aprovado !";
		}
		return "Aluno em avaliação pelo conselho!";
	}
	 @Override
	 public void perguntaNotas() {
		 super.perguntaNotas();
	 }
	 
}
