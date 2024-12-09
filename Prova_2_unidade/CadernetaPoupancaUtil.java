package Prova_2_unidade;

import java.util.*;

public class CadernetaPoupancaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CadernetaPoupanca> caderneta = new ArrayList<>();
        int quantidade = 7;
        int index = 1;
        int opcao;
        boolean boot = true;

        while (boot) {
            menu();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    if (index > quantidade) {
                        System.out.println("Maximo de cadastro de cadernetas atingido!");
                    } else {
                        clear();
                        System.out.println("Qual o nome do titular da " + index + "ª caderneta?");
                        String titular = sc.nextLine();

                        System.out.println("Qual o dia do aniversário da conta?");
                        int diaAniversario = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Qual o saldo inicial da conta?");
                        double saldoInicial = sc.nextDouble();
                        sc.nextLine();

                        caderneta.add(new CadernetaPoupanca(titular, diaAniversario, saldoInicial));
                        index++;
                        clear();
                    }
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("_______________________________________________________");
        System.out.println("|    BEM VINDO AO SISTEMA DE CADERNETAS DE POUPANÇA   |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|  SELECIONE UMA OPÇÃO:                               |");
        System.out.println("|     1 - CADASTRAR UMA CADERNETA                     |");
        System.out.println("|     2 - CONSULTAR CADERNETA POR ANIVERSARIO         |");
        System.out.println("|     3 - CONSULTAR CADERNETA POR NOME                |");
        System.out.println("|     4 - ATUALIZAR RENDIMENTO                        |");
        System.out.println("|     5 - ENCERRAR APLICAÇÃO                          |");
        System.out.println("|_____________________________________________________|");
    }

    public static void clear() {
        for (int i = 0; i < 20; i++) {
            System.out.println("");
        }
    }
}