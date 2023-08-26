package checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<>();
    private List<LivroObserver> observers = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(Livro livro) {
        livro.emprestar();
        notifyObserversLivroEmprestado(livro);
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        notifyObserversLivroDevolvido(livro);
    }

    public void addObserver(LivroObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LivroObserver observer) {
        observers.remove(observer);
    }

    private void notifyObserversLivroEmprestado(Livro livro) {
        for (LivroObserver observer : observers) {
            observer.livroEmprestado(livro);
        }
    }

    private void notifyObserversLivroDevolvido(Livro livro) {
        for (LivroObserver observer : observers) {
            observer.livroDevolvido(livro);
        }
    }

}
