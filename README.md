# Checkpoint Design Patterns
## Sistema de Biblioteca

Este é um simples sistema de biblioteca, feito em Java que permite o registro de livros, empréstimo de livros aos alunos e devolução dos mesmos. A implementação utiliza o seguinte design pattern:

### Observer Pattern

O Observer Pattern é utilizado para permitir que os alunos recebam notificações quando um livro é emprestado ou devolvido. Ele permite que objetos (alunos) se inscrevam para serem notificados quando ocorrem mudanças no estado de outros objetos (livros).

### Onde foi implementado

- A interface `LivroObserver` define os métodos `livroEmprestado` e `livroDevolvido`, que são chamados quando um livro é emprestado ou devolvido.

- A classe `Aluno` implementa a interface `LivroObserver` e define como um aluno deve reagir às notificações sobre empréstimo e devolução de livros.

- Na classe `Biblioteca`, métodos como `emprestarLivro` e `devolverLivro` notificam automaticamente os observadores (alunos) quando um livro é emprestado ou devolvido, respectivamente.

- A classe `Livro` mantém uma lista de observadores (alunos) e notifica-os quando um evento ocorre.
