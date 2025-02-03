package Lista3unidade7;

import java.util.Random;
import java.util.Scanner;

import Lista3unidade7.Ponto;

public class PontoUtil {
   public static void main(String[] args) {
      Ponto[] pontos = new Ponto[5];
      Random random = new Random();
      for (int i = 0; i < 5; i++) {
         int x = random.nextInt(21) - 10;
         int y = random.nextInt(21) - 10;
         pontos[i] = new Ponto(x, y);
      }

      Scanner sc = new Scanner(System.in);
      boolean exec = true;
      while (exec == true) {
         clean();
         menu();
         int encerrar;
         int opcao = sc.nextInt();
         switch (opcao) {
            case 1:
            int ver1 = 0;
            for(int i = 0; i < pontos.length; i++) {
               if(pontos[i].getQuadrante() == 1) {
                  ver1++;
               }
            }
            if(ver1 == 0) {
               System.out.println("Nenhum ponto foi encontrado no 1° quadrante.");
               System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
               encerrar = sc.nextInt();

               if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
            } else {
               System.out.println("Foram encontrados " +ver1+ " ponto(s) no 1° quadrante");
               System.out.println("Pontos: ");
               for(int i = 0; i < pontos.length; i++) {
                  int quadrante = pontos[i].getQuadrante();
                  if(quadrante == 1) {
                     System.out.println("P"+i+pontos[i].toString());
                  }
               }
               System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
               encerrar = sc.nextInt();

               if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
            }
               
               break;
            case 2:
            int ver2 = 0;
            for(int i = 0; i < pontos.length; i++) {
               if(pontos[i].getQuadrante() == 2) {
                  ver2++;
               }
            }
            if(ver2 == 0) {
               System.out.println("Nenhum ponto foi encontrado no 2° quadrante.");
               System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
               encerrar = sc.nextInt();

               if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
            } else {
               System.out.println("Foram encontrados " +ver2+ " ponto(s) no 2° quadrante");
               System.out.println("Pontos: ");
               for(int i = 0; i < pontos.length; i++) {
                  int quadrante = pontos[i].getQuadrante();
                  if(quadrante == 2) {
                     System.out.println("P"+i+pontos[i].toString());
                  }
               }
               System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
               encerrar = sc.nextInt();

               if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
            }
               break;
            case 3:
            int ver3 = 0;
            for(int i = 0; i < pontos.length; i++) {
               if(pontos[i].getQuadrante() == 3) {
                  ver3++;
               }
            }
            if(ver3 == 0) {
               System.out.println("Nenhum ponto foi encontrado no 3° quadrante.");
               System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
               encerrar = sc.nextInt();

               if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
            } else {
               System.out.println("Foram encontrados " +ver3+ " ponto(s) no 3° quadrante");
               System.out.println("Pontos: ");
               for(int i = 0; i < pontos.length; i++) {
                  int quadrante = pontos[i].getQuadrante();
                  if(quadrante == 3) {
                     System.out.println("P"+i+pontos[i].toString());
                  }
               }
               System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
               encerrar = sc.nextInt();

               if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
            }
               break;
            case 4:
            int ver4 = 0;
            for(int i = 0; i < pontos.length; i++) {
               if(pontos[i].getQuadrante() == 4) {
                  ver4++;
               }
            }
            if(ver4 == 0) {
               System.out.println("Nenhum ponto foi encontrado no 4° quadrante.");
               System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
               encerrar = sc.nextInt();

               if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
            } else {
               System.out.println("Foram encontrados " +ver4+ " ponto(s) no 4° quadrante");
               System.out.println("Pontos: ");
               for(int i = 0; i < pontos.length; i++) {
                  int quadrante = pontos[i].getQuadrante();
                  if(quadrante == 4) {
                     System.out.println("P"+i+pontos[i].toString());
                  }
               }
               System.out.println("Deseja encerrar a aplicação? (1 - Sim / 2 - Não)");
               encerrar = sc.nextInt();

               if (encerrar == 1) {
                    clean();
                    System.out.println("A aplicação foi encerrada com sucesso!");
                    exec = false;
                }
            }
               break;
            case 5:
            clean();
            System.out.println("Lista de pontos disponíveis:");
            for (int i = 0; i < pontos.length; i++) {
                System.out.println(i + ": " + pontos[i]);
            }
            System.out.print("\nDigite o índice do primeiro ponto: ");
            int indice1 = sc.nextInt();
            System.out.print("\nDigite o índice do segundo ponto: ");
            int indice2 = sc.nextInt();
            listarDistancia(pontos, indice1, indice2);
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
               System.out.println("Aplicação encerrada con sucesso!");
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
      System.out.println("|                  PLANO CARTESIANO                   |");
      System.out.println("|-----------------------------------------------------|");
      System.out.println("|  SELECIONE UMA OPÇÃO:                               |");
      System.out.println("|     1 - LISTAR PONTOS NO 1° QUADRANTE               |");
      System.out.println("|     2 - LISTAR PONTOS NO 2° QUADRANTE               |");
      System.out.println("|     3 - LISTAR PONTOS NO 3° QUADRANTE               |");
      System.out.println("|     4 - LISTAR PONTOS NO 4° QUADRANTE               |");
      System.out.println("|     5 - CALCULAR DISTANCIA ENTRE DOIS PONTOS        |");
      System.out.println("|     6 - ENCERRAR A APLICAÇÃO                        |");
      System.out.println("|_____________________________________________________|");
   }

   public static void clean() {
      for (int i = 0; i < 15; i++) {
         System.out.println("");
      }
   }
   public static void listarDistancia(Ponto[] pontos, int indice1, int indice2) {
      if (indice1 < 0 || indice1 >= pontos.length || indice2 < 0 || indice2 >= pontos.length) {
          System.out.println("Índices inválidos! Selecione valores entre 0 e " + (pontos.length - 1));
          return;
      }
      Ponto p1 = pontos[indice1];
      Ponto p2 = pontos[indice2];
      double distancia = p1.getDistancia(p2);
      System.out.println("Distância entre " + p1 + " e " + p2 + " é: " + distancia);
  }
}
