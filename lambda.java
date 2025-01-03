import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {

    public static void main(String[] args) {

        List<Jogo> jogos = new ArrayList<>();
        jogos.add(new Jogo("The Legend of Zelda: Breath of the Wild", "Nintendo", 299.99));
        jogos.add(new Jogo("Super Mario Odyssey", "Nintendo", 249.99));
        jogos.add(new Jogo("Mario Kart 8 Deluxe", "Nintendo", 199.99));
        jogos.add(new Jogo("Elden Ring", "Bandai Namco", 349.99));
        jogos.add(new Jogo("Pokémon Scarlet", "Nintendo", 289.99));
        jogos.add(new Jogo("Hollow Knight", "Team Cherry", 79.99));

        List<Jogo> jogosNintendo = jogos.stream()
                .filter(jogo -> "Nintendo".equalsIgnoreCase(jogo.getDistribuidora()))
                .collect(Collectors.toList());

        System.out.println("Jogos da Nintendo:");
        jogosNintendo.forEach(System.out::println);

        List<Jogo> jogosOrdenados = jogosNintendo.stream()
                .sorted(Comparator.comparing(Jogo::getPreco))
                .collect(Collectors.toList());

        System.out.println("\nJogos da Nintendo ordenados por preço:");
        jogosOrdenados.forEach(System.out::println);
    }
}

class Jogo {
    private String titulo;
    private String distribuidora;
    private double preco;

    public Jogo(String titulo, String distribuidora, double preco) {
        this.titulo = titulo;
        this.distribuidora = distribuidora;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "título='" + titulo + '\'' +
                ", distribuidora='" + distribuidora + '\'' +
                ", preço=" + preco +
                '}';
    }
}
