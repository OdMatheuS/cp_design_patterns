package checkpoint;

public class Livro {

	private String titulo;
	private String autor;
	private String isbn;
	private int quantidadeDisponivel;

	public Livro(String titulo, String autor, String isbn, int quantidadeDisponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void emprestar() {
		if (quantidadeDisponivel > 0) {
			quantidadeDisponivel--;
			System.out.println("Livro emprestado: " + titulo);
		} else {
			System.out.println("Livro indisponível no momento: " + titulo);
		}
	}

	public void devolver() {
		quantidadeDisponivel++;
		System.out.println("Livro devolvido: " + titulo);
	}

}
