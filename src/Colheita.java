import java.util.function.BiPredicate;
import java.util.function.Predicate;




public class Colheita  {
    Campo campo;
    Flor[] floresColhidas;
    
    public Colheita(Campo campo) {
        this.campo = campo;
    }

    public void fazerColheita() {
        
        
        Predicate<Flor> filtroCorAzul = (Flor flor) -> flor.getCor().equals("azul");
        Predicate<Flor> filtroVermelho = (Flor flor) -> flor.getCor().equals("vermelho");
        Predicate<Flor> filtroAmarelo = (Flor flor) -> flor.getCor().equals("amarelo");

        Flor[] floresAzuis = campo.getFloresStream().filter(filtroCorAzul).toArray(Flor[]::new);
        
        Flor[] floresAzul = campo.getFloresStream().filter(f -> f.getCor().equals("azul")).toArray(Flor[]::new);
        // Um array com 25% das flores vermelhas
        Flor[] floresVermelhas = campo.getFloresStream().filter(filtroVermelho).limit(Math.round(campo.getTotalFlores() * 0.25)).toArray(Flor[]::new);
        // Um array com 25% das flores amarelas
        Flor[] floresAmarelas = campo.getFloresStream().filter(filtroAmarelo).limit(Math.round(campo.getTotalFlores() * 0.25)).toArray(Flor[]::new);
        //Concatenar os arrays
        Flor[] flores = new Flor[floresAzul.length + floresVermelhas.length + floresAmarelas.length];
        System.arraycopy(floresAzul, 0, flores, 0, floresAzul.length);
        System.arraycopy(floresVermelhas, 0, flores, floresAzul.length, floresVermelhas.length);
        System.arraycopy(floresAmarelas, 0, flores, floresAzul.length + floresVermelhas.length, floresAmarelas.length);

        //Desordenando o array
        for (int i = flores.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * i);
            Flor temp = flores[index];
            flores[index] = flores[i];
            flores[i] = temp;
        }
        
        this.floresColhidas = flores;
    }

    public Flor[] getFloresColhidas() {
        return this.floresColhidas;
    }
    
}
