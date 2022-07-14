public class Flor {
    private static int numero;
    
    private String cor;
    private int valor;
    private int id;

    public int getId() {
        return id;
    }

    public Flor(String cor, int valor) {
        this.cor = cor;
        this.valor = valor;
        this.id = numero++;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public int getValor() {
        return this.valor;
    }
    
    @Override
    public String toString() {
        return "Flor [id=" + id + ", cor=" + cor + ", valor=" + valor + "]";
    }
}
