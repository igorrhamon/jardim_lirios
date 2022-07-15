public class Flor {
    
    
    private String cor;
    private int valor;
    private int quantidade;
    
    public Flor(String cor, int quantidade, int valor) {
        this.cor = cor;
        this.valor = valor;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Flor [cor=" + cor + ", quantidade=" + quantidade + ", valor=" + valor + "]";
    }
}
