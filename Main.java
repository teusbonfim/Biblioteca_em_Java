public class Main {
    public static void main(String[] args) {
        Livro[] hqs = {
            new Livro("Homem-Aranha: De Volta ao Lar", "Stan Lee & Steve Ditko", 1962, 49.90),
            new Livro("Batman: Ano Um", "Frank Miller & David Mazzucchelli", 1987, 39.90),
            new Livro("Superman: Entre a Foice e o Martelo", "Mark Millar", 2003, 59.90),
            new Livro("Vingadores: A Queda", "Brian Michael Bendis", 2004, 45.00),
            new Livro("Capitão América: O Soldado Invernal", "Ed Brubaker", 2005, 42.00),
            new Livro("X-Men: A Saga da Fênix Negra", "Chris Claremont", 1980, 47.50),
            new Livro("Demolidor: A Queda de Murdock", "Frank Miller", 1986, 55.00),
            new Livro("Lanterna Verde: A Guerra dos Anéis", "Geoff Johns", 2007, 51.00),
            new Livro("Aquaman: As Profundezas", "Geoff Johns", 2011, 35.00),
            new Livro("Mulher-Maravilha: Hiketeia", "Greg Rucka", 2002, 33.90),
            new Livro("Guardiões da Galáxia: Cosmic Avengers", "Brian Michael Bendis", 2013, 39.50)
        };

        // Emprestando todos com um loop
        for (Livro hq : hqs) {
            hq.emprestar();
        }
    }
}