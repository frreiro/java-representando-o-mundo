
public class Aluno {
	private String nome;
	private String username;
	private Curso curso = new Curso();
	
	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getUsername(){
		return this.username;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public Curso getCurso(){
		return this.curso;
	}

	public void setCurso(Curso curso){
		this.curso = curso;
	}

}
