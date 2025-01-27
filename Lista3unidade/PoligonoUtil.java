package Lista3unidade;

import java.util.Arrays;

import Lista3unidade.Poligono;

public class PoligonoUtil {
    public static void main(String[] args) {
        Poligono p1 = new Poligono(5, 5, 5);
        Poligono p2 = new Poligono(3, 3, 3, 3);
        Poligono p3 = new Poligono(4, 4, 4, 4, 4);
        Poligono p4 = new Poligono(6, 6, 6, 6, 6, 6);
        Poligono p5 = new Poligono(2, 2, 2, 2, 2, 2, 2);

        System.out.println(Arrays.toString(p2.getComprimentoLados()));
        System.out.println(p3.getPerimetro());
        System.out.println(p4.getClassificacao());
        System.out.println(p1.toString());
    }
}
