Código Main.java:
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899, 39.90);
        livro.emprestar();
        livro.devolver();
        livro.aplicarDesconto(10);
    }
}