import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Campo {
    private Flor[] flores;
    
    
    public Flor[] getFlores() {
        return flores;
    }

    public Campo(int qtdVermelhas, int qtdAmarelas, int qtdAzuis) {
        int contador = 0;
        flores = new Flor[qtdVermelhas + qtdAmarelas + qtdAzuis];
        
        for (int i = 0; i < qtdVermelhas; i++) {
            flores[contador] = new Flor("vermelho", 1);
            contador++;
        }
        
        for (int i = 0; i < qtdAmarelas; i++) {
            flores[contador] = new Flor("amarelo", 2);
            contador++;
        }
        
        for (int i = 0; i < qtdAzuis; i++) {
            flores[contador] = new Flor("azul", 3);
            contador++;
        }
        
    }
    
    public Stream<Flor> getFloresStream() {
        Stream<Flor> stream = Stream.of(flores);
        return stream;
    }

    public int getTotalFlores() {
        return flores.length;
    }
    // Imprime todas as flores
    public void imprimeFlores() {
        for (Flor flor : flores) {
            System.out.println(flor);
        }
    }

}
