package checkpoint;

public class Principal {
	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();

		Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "978-85-08-00123-1", 3);
		Livro livro2 = new Livro("1984", "George Orwell", "978-45-23-67890-7", 2);

		biblioteca.adicionarLivro(livro1);
		biblioteca.adicionarLivro(livro2);

		Aluno aluno1 = new Aluno("Alice");
		Aluno aluno2 = new Aluno("Bob");

		biblioteca.addObserver(aluno1);
		biblioteca.addObserver(aluno2);

		biblioteca.emprestarLivro(livro1);
		biblioteca.emprestarLivro(livro2);

		biblioteca.devolverLivro(livro1);
		biblioteca.devolverLivro(livro2);

		biblioteca.removeObserver(aluno2);

		biblioteca.emprestarLivro(livro1);

	}
}
