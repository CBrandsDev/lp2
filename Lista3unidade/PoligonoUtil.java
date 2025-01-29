package Lista3unidade;

import java.util.*;

import Lista3unidade.Poligono;
import Prova_2_unidade.CadernetaPoupanca;

public class PoligonoUtil {
    public static void main(String[] args) {
        List<Poligono> poligonos = new ArrayList<>();
        Random random = new Random();
        int index = 0;
        while (index < 2) {
            int tamanho = random.nextInt(10);
            poligonos.add(new Poligono(tamanho, tamanho, tamanho));
            index++;
        }
        while (index < 4) {
            int tamanho = random.nextInt(10);
            poligonos.add(new Poligono(tamanho, tamanho, tamanho, tamanho));
            index++;
        }
        while (index < 6) {
            int tamanho = random.nextInt(10);
            poligonos.add(new Poligono(tamanho, tamanho, tamanho, tamanho, tamanho));
            index++;
        }
        while (index < 8) {
            int tamanho = random.nextInt(10);
            poligonos.add(new Poligono(tamanho, tamanho, tamanho, tamanho, tamanho, tamanho));
            index++;
        }
        while (index < 10) {
            int tamanho = random.nextInt(10);
            poligonos.add(new Poligono(tamanho, tamanho, tamanho, tamanho, tamanho, tamanho, tamanho));
            index++;
        }
        // for (CadernetaPoupanca cp : caderneta) {}

    }

    public static void menu() {
        System.out.println("_______________________________________________________");
        System.out.println("|                   POLIGONOS                         |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|  SELECIONE UMA OPÇÃO:                               |");
        System.out.println("|     1 - LISTAR POLIGONOS                            |");
        System.out.println("|     2 - LISTAR POLIGONO DE MAIOR PERIMETRO          |");
        System.out.println("|     3 - LISTAR POLIGONO DE MENOR PERIMETRO          |");
        System.out.println("|     4 - LISTAR POLIGONO POR QTD DE LADOS            |");
        System.out.println("|     5 - LISTAR PERCENTUAIS DE POLIGONOS             |");
        System.out.println("|     6 - ENCERRAR A APLICAÇÃO                        |");
        System.out.println("|_____________________________________________________|");
    }
}
