public class Flor {
    
    
    private String cor;
    private int valor;


    public Flor(String cor, int valor) {
        this.cor = cor;
        this.valor = valor;
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
        return "Flor [cor=" + cor + ", valor=" + valor +"]";
        
    }
}
