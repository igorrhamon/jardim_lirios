public class Flor {
    
    
    private String cor;
    private int valor;
    private int id;

    public int getId() {
        return id;
    }

    public Flor(String cor, int valor, int id) {
        this.cor = cor;
        this.valor = valor;
        this.id = id;
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
