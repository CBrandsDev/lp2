package Lista3unidade;
import java.util.Arrays;

public class Poligono {
    private int comprimentoLado1;
    private int comprimentoLado2;
    private int comprimentoLado3;
    private int comprimentoLado4;
    private int comprimentoLado5;
    private int comprimentoLado6;
    private int comprimentoLado7;
    
    public Poligono(int comprimentoLado1, int comprimentoLado2, int comprimentoLado3) {
        this.comprimentoLado1 = comprimentoLado1;
        this.comprimentoLado2 = comprimentoLado2;
        this.comprimentoLado3 = comprimentoLado3;
    }

    public Poligono(int comprimentoLado1, int comprimentoLado2, int comprimentoLado3, int comprimentoLado4) {
        this.comprimentoLado1 = comprimentoLado1;
        this.comprimentoLado2 = comprimentoLado2;
        this.comprimentoLado3 = comprimentoLado3;
        this.comprimentoLado4 = comprimentoLado4;
    }

    public Poligono(int comprimentoLado1, int comprimentoLado2, int comprimentoLado3, int comprimentoLado4,
            int comprimentoLado5) {
        this.comprimentoLado1 = comprimentoLado1;
        this.comprimentoLado2 = comprimentoLado2;
        this.comprimentoLado3 = comprimentoLado3;
        this.comprimentoLado4 = comprimentoLado4;
        this.comprimentoLado5 = comprimentoLado5;
    }

    public Poligono(int comprimentoLado1, int comprimentoLado2, int comprimentoLado3, int comprimentoLado4,
            int comprimentoLado5, int comprimentoLado6) {
        this.comprimentoLado1 = comprimentoLado1;
        this.comprimentoLado2 = comprimentoLado2;
        this.comprimentoLado3 = comprimentoLado3;
        this.comprimentoLado4 = comprimentoLado4;
        this.comprimentoLado5 = comprimentoLado5;
        this.comprimentoLado6 = comprimentoLado6;
    }

    public Poligono(int comprimentoLado1, int comprimentoLado2, int comprimentoLado3, int comprimentoLado4,
            int comprimentoLado5, int comprimentoLado6, int comprimentoLado7) {
        this.comprimentoLado1 = comprimentoLado1;
        this.comprimentoLado2 = comprimentoLado2;
        this.comprimentoLado3 = comprimentoLado3;
        this.comprimentoLado4 = comprimentoLado4;
        this.comprimentoLado5 = comprimentoLado5;
        this.comprimentoLado6 = comprimentoLado6;
        this.comprimentoLado7 = comprimentoLado7;
    }

    public int[] getComprimentoLados() {
        return new int[] {
            comprimentoLado1,comprimentoLado2,comprimentoLado3,comprimentoLado4,comprimentoLado5,comprimentoLado6,comprimentoLado7
        };
    }
    public int getPerimetro() {
        int[] numeros = getComprimentoLados();
        int soma = Arrays.stream(numeros).sum();
        return soma;
    }
    public String getClassificacao() {
        int tamanho = (int) Arrays.stream(getComprimentoLados()).filter(lado -> lado > 0).count();
        if(tamanho == 3) {
            return "Triângulo";
        } else if(tamanho == 4) {
            return "Quadrado";
        } else if(tamanho == 5) {
            return "Pentágono";
        } else if(tamanho == 6) {
            return "Hexágono";
        } else if(tamanho == 7) {
            return "Heptágono";
        }
        return "Polígono Invalido";
    }
    @Override
    public String toString() {
        
        int[] ladosValidos = Arrays.stream(getComprimentoLados()).filter(lado -> lado > 0).toArray();

        String ladosStr = "";
        for (int i = 0; i < ladosValidos.length; i++) {
            if (i == ladosValidos.length - 1 && i > 0) {
                ladosStr += " e " + ladosValidos[i];
            } else if (i == 0) {
                ladosStr += ladosValidos[i];
            } else {
                ladosStr += ", " + ladosValidos[i];
            }
        }

        return String.format("%s de lados de comprimentos %s", getClassificacao(), ladosStr);
    }
}

