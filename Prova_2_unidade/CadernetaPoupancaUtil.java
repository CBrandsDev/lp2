package Prova_2_unidade;

import java.util.*;

public class CadernetaPoupancaUtil {
    public static void main(String[] args) {
        clear();
        Scanner sc = new Scanner(System.in);
        ArrayList<CadernetaPoupanca> caderneta = new ArrayList<>();
        CadernetaPoupanca cadernetaEncontrada = null;
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
                        while (diaAniversario < 1 || diaAniversario > 31) {
                            System.out.println("Digite um dia válido (1 - 31):");
                            diaAniversario = sc.nextInt();
                            sc.nextLine();
                        }
                        System.out.println("Qual o saldo inicial da conta?");
                        double saldoInicial = sc.nextDouble();
                        sc.nextLine();

                        caderneta.add(new CadernetaPoupanca(titular, diaAniversario, saldoInicial));
                        index++;
                        clear();
                    }
                    break;

                case 2:
                    clear();
                    System.out.println("Digite o dia do aniversário que deseja consultar:");
                    int consultaDia = sc.nextInt();
                    sc.nextLine();

                    boolean encontrado = false;
                    for (CadernetaPoupanca cp : caderneta) {
                        if (cp.getDiaAniversario() == consultaDia) {
                            clear();
                            System.out.println("|Caderneta encontrada:");
                            System.out.println("|Titular: " + cp.getTitular());
                            System.out.println("|Dia de Aniversário: " + cp.getDiaAniversario());
                            System.out.println("|Saldo: " + cp.getSaldo());
                            System.out.println("|-----------------------------------------------------|");

                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nenhuma caderneta encontrada com o dia de aniversário informado.");
                    }

                    break;
                case 3:
                    clear();
                    System.out.println("Digite o titular que deseja consultar:");
                    String consultaTitular = sc.nextLine();

                    encontrado = false;
                    for (CadernetaPoupanca cp : caderneta) {
                        if (cp.getTitular().equalsIgnoreCase(consultaTitular)) {
                            clear();
                            System.out.println("|Caderneta encontrada");
                            System.out.println("|Titular: " + cp.getTitular());
                            System.out.println("|Dia de Aniversário: " + cp.getDiaAniversario());
                            System.out.println("|Saldo: " + cp.getSaldo());
                            System.out.println("|-----------------------------------------------------|");
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nenhuma caderneta encontrada com o titular informado.");
                    }
                    break;
                case 4:
                    clear();
                    System.out.println("Digite o nome do titular da caderneta que deseja atualizar o rendimento: ");
                    String titular = sc.next();
                    for (CadernetaPoupanca cp : caderneta) {
                        if (cp.getTitular().equalsIgnoreCase(titular)) {
                            cadernetaEncontrada = cp;
                            break;
                        }
                        cadernetaEncontrada = null;
                    }
                    if (cadernetaEncontrada == null) {
                        System.out.println("Caderneta não encontrada!");
                        return;
                    }
                    clear();
                    System.out.println("|Rendimento atual: " + cadernetaEncontrada.getRendimentoAcumulado());
                    System.out.println("Digite a taxa de rendimento: ");
                    double taxaRendimento = sc.nextDouble();
                    cadernetaEncontrada.atualizarRendimento(taxaRendimento);
                    System.out.println("|Novo rendimento: " + cadernetaEncontrada.getRendimentoAcumulado());
                    System.out.println("|Rendimento atualizado com sucesso!");
                    System.out.println("|-----------------------------------------------------|");
                    break;
                case 5:
                    boot = false;
                    System.out.println("Encerrando o programa...");
                    HashSet<Integer> diasAniversario = new HashSet<Integer>();
                    ArrayDeque<String> titulares = new ArrayDeque<>();
                    for (CadernetaPoupanca cp : caderneta) {
                        if (cp.getTaxaRendimentoAcumulado() != 0) {
                            diasAniversario.add(cp.getDiaAniversario());
                        } else {
                            titulares.add(cp.getTitular());
                        }
                    }
                    System.out.println("Quantidade total de dias de aniversário com rendimentos acumulados: " + diasAniversario.size());
                    System.out.println("Titulares com rendimento acumulado igual a zero: ");
                    do {
                        System.out.println(titulares.poll());
                    } while (!titulares.isEmpty());
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
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