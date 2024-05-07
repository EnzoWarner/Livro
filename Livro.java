public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false; // Inicialmente, o livro não está emprestado
    }

    // Método para emprestar o livro
    public void emprestar() {
        if (!emprestado) {
            System.out.println("Emprestando o livro: " + titulo);
            emprestado = true;
        } else {
            System.out.println("O livro " + titulo + " já está emprestado.");
        }
    }

    // Método para devolver o livro
    public void devolver() {
        if (emprestado) {
            System.out.println("Devolvendo o livro: " + titulo);
            emprestado = false;
        } else {
            System.out.println("O livro " + titulo + " já está disponível na biblioteca.");
        }
    }

    // Método para verificar se o livro está emprestado
    public boolean estaEmprestado() {
        return emprestado;
    }

    // Método para obter informações do livro
    public void getInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Status: " + (emprestado ? "Emprestado" : "Disponível"));
    }
}
