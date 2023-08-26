package checkpoint;

public interface LivroObserver {
	void livroEmprestado(Livro livro);

	void livroDevolvido(Livro livro);
}
