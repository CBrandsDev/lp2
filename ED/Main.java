public class Main {
    
    public static void main(String[] args) {
        Pilha p = new Pilha(8);
        p.inserir("Instituto");
        p.inserir("Federal");
        System.out.println(p.espiar());
        p.inserir("de");
        p.inserir("Ciencia");
        p.inserir("e");
        p.inserir("Tecnologia");
        p.inserir("salve");
        p.desempilhar();
        p.inserir("da");
        p.inserir("bahia");
        p.atualizar("Bahia");
        p.imprimir();

    }
}

