import java.util.function.Predicate;




public class Colheita implements Predicate<Flor> {
    @Override
    public boolean test(Flor flor) {
        if(flor.getCor().equals("azul")) {
            return true;
        }
        return false;
    }

    
}
