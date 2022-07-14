import java.util.function.Predicate;

public class App {
    /*
     * Tem 100 vermelhos, 50 amarelos e 25 azuis, todos bem misturadas, produzindo um efeito bem colorido.
     * Assuma que o lírio vermelho é o número 1, o amarelo o número 2 e o azul será o número 3.
     * Inicialize um stream com as sequências onde cada número representa uma flor e misture tudo.
     * Faça a colheita de todas as flores azuis e de 25% das outras flores.
     * Apresente o total de flores que sobram no jardim.
     */
    public static void main(String[] args) throws Exception {
        

        Campo campo = new Campo(100, 50, 25);
        
        Colheita colheita = new Colheita();
        Flor[] floresColhidas = campo.getFloresStream()
        .filter(
            f -> f.getCor().equals("azul")
        )
        
        .toArray(Flor[]::new);
        

        for (Flor flor : floresColhidas) {
            System.out.println(flor);
        }
        
    }
}
