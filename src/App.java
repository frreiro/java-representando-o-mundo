public class App {
    public static void main(String[] args) throws Exception {
		
		Curso calculo = new Curso();
		calculo.setQntAulas(10);
		calculo.setTitulo("Matemática Aplicada");
		
		Aluno aluno = new Aluno();

		aluno.setNome("Pedro");
		aluno.setUsername("pedrinho");
		aluno.setCurso(calculo);

		System.out.println("Aluno: "+ aluno.getNome());
		System.out.println("Username: "+ aluno.getUsername());
		System.out.println("Realizando o curso: " + aluno.getCurso().getTitulo());
    }
}
