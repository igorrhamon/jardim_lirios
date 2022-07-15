import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Campo {
    private Flor floresVermelhas;   
    private Flor floresAmarelas;
    private Flor floresAzuis;
    
    

    public Campo(int qtdVermelhas, int qtdAmarelas, int qtdAzuis) {
        
        this.floresVermelhas = new Flor("vermelho", qtdVermelhas, 1);
        this.floresAmarelas = new Flor("amarelo", qtdAmarelas, 2);
        this.floresAzuis = new Flor("azul", qtdAzuis, 3);
        
        
    }
    
    public Flor getFlorVermelha() {
        return this.floresVermelhas;
    }

    public Flor getFlorAmarela() {
        return this.floresAmarelas;
    }

    public Flor getFlorAzul() {
        return this.floresAzuis;
    }

    public int getTotalFlores() {
        return this.floresVermelhas.getQuantidade() + this.floresAmarelas.getQuantidade() + this.floresAzuis.getQuantidade();
    }

    public Stream<Flor> getFlores() {
        
        return Stream.of(this.floresVermelhas, this.floresAmarelas, this.floresAzuis);
    }
}
