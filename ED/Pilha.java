public class Pilha implements Empilhavel {

    private int ponteiroTopo;
    private Object[] dados;

    public Pilha(int tamanho) {
        ponteiroTopo = -1;
        dados = new Object[tamanho];
    }

    public Pilha() {
        this(10);
    }

    @Override
    public void inserir(String dado){
        if(!estaCheia()) {
            ponteiroTopo++;
            dados[ponteiroTopo] = dado;
        } else {
            System.out.println("A pilha está cheia");
        }
    }
    @Override
    public String espiar() {
        String dadoTopo = null;
        if(!estaVazia()) {
            dados[ponteiroTopo] = dadoTopo;
        } else {
            System.out.println("A pilha está vazia");
        }
        return dadoTopo;
    }
    @Override   
    public void atualizar(String dado) {
        if(!estaVazia()) {
            dados[ponteiroTopo] = dado;
        } else {
            System.out.println("A pilha está vazia");
        }
    }
    @Override  
    public String desempilhar() {
        String dadoTopo = null;
        if(!estaVazia()) {
            dados[ponteiroTopo] = dadoTopo;
            ponteiroTopo--;
        } else {
            System.out.println("A pilha está vazia");
        }
        return dadoTopo;
    }         
    // Metodos auxiliares
    @Override
    public boolean estaVazia() {
        return ponteiroTopo == -1;
    }
    @Override
    public boolean estaCheia() {
        return ponteiroTopo == dados.length - 1;
    }
    @Override
    public String imprimir() {
        StringBuilder resultado = new StringBuilder("[");
        
        for (int i = ponteiroTopo; i >= 0; i--) {  // Laço de ponteiroTopo até 0
            if (i == 0) {
                resultado.append(dados[i]);  // Não adiciona vírgula no último elemento
            } else {
                resultado.append(dados[i]).append(", ");  // Adiciona vírgula e espaço entre os elementos
            }
        }
        
        resultado.append("]");
        return resultado.toString();  // Retorna a String formatada
    }  
}