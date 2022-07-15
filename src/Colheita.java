import java.util.function.Predicate;
import java.util.stream.Stream;

public class Colheita  {
    Predicate<Flor> filtroCorAzul = (Flor flor) -> flor.getCor().equals("azul");
    Predicate<Flor> filtroVermelho = (Flor flor) -> flor.getCor().equals("vermelho");
    Predicate<Flor> filtroAmarelo = (Flor flor) -> flor.getCor().equals("amarelo");
    
    private Campo campo;

    public Colheita(Campo campo) {
        this.campo = campo;
    }

    public Stream<Flor> fazerColheita(){
        


        Stream<Flor> floresAzuis = campo.getFlores().filter(filtroCorAzul);
        Stream<Flor> floresVermelhas = campo.getFlores().filter(filtroVermelho)
            // Desordenando o stream
            .map(f -> new Flor(f.getCor(), (int) (Math.round(f.getQuantidade() * 0.25)), f.getValor()))
            .sorted((Flor flor1, Flor flor2) -> (int) (Math.random() * 2) - 1)
            ;
        Stream<Flor> floresAmarelas = campo.getFlores().filter(filtroAmarelo)
            // Desordenando o stream
            .map(f -> new Flor(f.getCor(), (int) (Math.round(f.getQuantidade() * 0.25)), f.getValor()))
            .sorted((Flor flor1, Flor flor2) -> (int) (Math.random() * 2) - 1)
            ;

            
        Stream<Flor> floresColhidas = Stream.concat(floresAzuis, Stream.concat(floresVermelhas, floresAmarelas));
        return floresColhidas;
    }
}
