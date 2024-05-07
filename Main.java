
public class Main {
public static void main(String[] args) {
    // Criando um livro
    Livro livro = new Livro("Blade Runner", "Philip K. Dick", 1968);

    // Emprestando e devolvendo o livro
    livro.emprestar();
    livro.devolver();

    // Verificando se o livro está emprestado
    System.out.println("O livro está emprestado? " + livro.estaEmprestado());

    // Obtendo informações do livro
    livro.getInfo();
}
}