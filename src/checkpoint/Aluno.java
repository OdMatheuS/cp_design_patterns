package checkpoint;

public class Aluno implements LivroObserver {
	private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void livroEmprestado(Livro livro) {
        System.out.println(nome + " pegou emprestado o livro: " + livro.getTitulo() + "\n");
    }

    public void livroDevolvido(Livro livro) {
        System.out.println(nome + " devolveu o livro: " + livro.getTitulo() + "\n");
    }
}
