public interface Empilhavel {
    // Metodos principais
    public void inserir(String dado);    // c
    public String espiar();              // r
    public void atualizar(String dado);  // u
    public String desempilhar();         // d
    // Metodos auxiliares
    public boolean estaVazia();
    public boolean estaCheia();
    public String imprimir();

}
