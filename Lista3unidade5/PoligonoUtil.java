package Lista3unidade5;

import java.util.*;

import Lista3unidade5.Poligono;

public class PoligonoUtil {
    public static void main(String[] args) {
        Poligono[] poligonos = new Poligono[10];
        Random random = new Random();
        int index = 0;
        while (index < 2) {
            int tamanho = random.nextInt(9) + 1;
            poligonos[index] = new Poligono(tamanho, tamanho, tamanho);
            index++;
        }
        while (index < 4) {
            int tamanho = random.nextInt(9) + 1;
            poligonos[index] = new Poligono(tamanho, tamanho, tamanho, tamanho);
            index++;
        }
        while (index < 6) {
            int tamanho = random.nextInt(9) + 1;
            poligonos[index] = new Poligono(tamanho, tamanho, tamanho, tamanho, tamanho);
            index++;
        }
        while (index < 8) {
            int tamanho = random.nextInt(9) + 1;
            poligonos[index] = new Poligono(tamanho, tamanho, tamanho, tamanho, tamanho, tamanho);
            index++;
        }
        while (index < 10) {
            int tamanho = random.nextInt(9) + 1;
            poligonos[index] = new Poligono(tamanho, tamanho, tamanho, tamanho, tamanho, tamanho, tamanho);
            index++;
        }
        
        Scanner sc = new Scanner(System.in);
        boolean exec = true;
        while(exec == true) {
            clean();
            menu();
            int encerrar = 0;
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                clean();
                    for(int i = 0; i < poligonos.length; i++) {
                        System.out.println("===========================================================");
                        System.out.println(poligonos[i].getPerimetro());
                    }
                    System.out.println("===========================================================");
                    System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
                    encerrar = sc.nextInt();
                    if(encerrar == 1) {
                        clean();
                        System.out.println("A aplicação foi encerrada com sucesso!");
                        exec = false;
                    } else {
                        break;
                    }
                case 2:
                clean();
                int maior = 0;
                        for(int i = 0; i < poligonos.length; i++) {
                            if(poligonos[i].getPerimetro() > maior) {
                                maior = poligonos[i].getPerimetro();
                            }
                        }                   
                        System.out.println("O maior perimetro é de: " + maior);
                        System.out.println("===========================================================");
                    System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
                    encerrar = sc.nextInt();
                    if(encerrar == 1) {
                        clean();
                        System.out.println("A aplicação foi encerrada com sucesso!");
                        exec = false;
                    } else {
                        break;
                    }
                case 3:
                clean();
                int menor = 100;
                        for(int i = 0; i < poligonos.length; i++) {
                            if(poligonos[i].getPerimetro() < menor) {
                                menor = poligonos[i].getPerimetro();
                            }
                        }                   
                        System.out.println("O menor perimetro é de: " + menor);
                        System.out.println("===========================================================");
                        System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
                        encerrar = sc.nextInt();
                        if(encerrar == 1) {
                            clean();
                            System.out.println("A aplicação foi encerrada com sucesso!");
                            exec = false;
                        } else {
                        break;
                    }
                    case 4:
                    clean();
                    System.out.println("===========================================================");
                    System.out.println("Digite a quantidade de lados do poligono: ");
                    int qtdLados = sc.nextInt();
                    while (qtdLados < 3 || qtdLados > 7) {
                        System.out.println("Quantidade invalida, digite entre 3 e 7");
                        qtdLados = sc.nextInt();
                    }

                    System.out.println("Polígonos com " + qtdLados + " lados:");
                    boolean encontrado = false;
                
                    for (int i = 0; i < poligonos.length; i++) {
                        int numLados = (int) Arrays.stream(poligonos[i].getComprimentoLados()).filter(lado -> lado > 0).count();
                
                        if (numLados == qtdLados) {
                            System.out.println(poligonos[i]);
                            encontrado = true;
                        }
                    }
                
                    if (!encontrado) {
                        System.out.println("Nenhum polígono encontrado com " + qtdLados + " lados.");
                    }
                
                    System.out.println("===========================================================");
                    System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
                    encerrar = sc.nextInt();
                
                    if (encerrar == 1) {
                        clean();
                        System.out.println("A aplicação foi encerrada com sucesso!");
                        exec = false;
                    }
                    break;
                case 5:
                clean();
                System.out.println("===========================================================");
                System.out.println("Percentual de cada tipo de polígono registrado:");
                int triangulos = 0, quadrados = 0, pentagonos = 0, hexagonos = 0, heptagonos = 0;
                int totalPoligonos = poligonos.length;
                for (Poligono poligono : poligonos) {
                    String classificacao = poligono.getClassificacao();
                    
                    switch (classificacao) {
                        case "Triângulo": triangulos++; break;
                        case "Quadrado": quadrados++; break;
                        case "Pentágono": pentagonos++; break;
                        case "Hexágono": hexagonos++; break;
                        case "Heptágono": heptagonos++; break;
                    }
                }

                double percentualTriangulos = (double) triangulos / totalPoligonos * 100;
                double percentualQuadrados = (double) quadrados / totalPoligonos * 100;
                double percentualPentagonos = (double) pentagonos / totalPoligonos * 100;
                double percentualHexagonos = (double) hexagonos / totalPoligonos * 100;
                double percentualHeptagonos = (double) heptagonos / totalPoligonos * 100;

                System.out.printf("Triângulos: %.2f%% (%d)\n", percentualTriangulos, triangulos);
                System.out.printf("Quadrados: %.2f%% (%d)\n", percentualQuadrados, quadrados);
                System.out.printf("Pentágonos: %.2f%% (%d)\n", percentualPentagonos, pentagonos);
                System.out.printf("Hexágonos: %.2f%% (%d)\n", percentualHexagonos, hexagonos);
                System.out.printf("Heptágonos: %.2f%% (%d)\n", percentualHeptagonos, heptagonos);
                
                System.out.println("===========================================================");
                System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
                encerrar = sc.nextInt();

                if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
                break;
                case 6:
                clean();
                System.out.println("A aplicação foi encerrada com sucesso!");
                exec = false;
                    break;
            
                default:
                System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("_______________________________________________________");
        System.out.println("|                      POLIGONOS                      |");
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

    public static void clean() {
        for(int i = 0; i < 15; i++) {
            System.out.println("");
        }
    }
}
