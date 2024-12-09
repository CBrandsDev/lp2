import java.util.Scanner;

public class ThreadCaderneta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Informe o nome do titular: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Informe o aniversario do titular: ");
        int niverTitular = sc.nextInt();
        sc.nextLine();

        CadernetaPoupanca[] cadernetas = new CadernetaPoupanca[3];
        for (int i = 0; i < cadernetas.length; i++) {
            System.out.print("Informe o valor do depósito inicial da caderneta " + (i + 1) + ": ");
            double depositoInicial = sc.nextDouble();
            sc.nextLine();

            cadernetas[i] = new CadernetaPoupanca(nomeTitular, niverTitular, depositoInicial);
            cadernetas[i].start();
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Consultar saldo da caderneta 1");
            System.out.println("2. Consultar saldo da caderneta 2");
            System.out.println("3. Consultar saldo da caderneta 3");
            System.out.println("0. Encerrar o programa");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    synchronized (System.out) {
                                System.out.println("");
                                System.out.println("===========================================");
                                System.out.println("Redimento de: " + cadernetas[0].getTitular() + ":");
                                System.out.println("Deposito inicial: " +cadernetas[0].getDeposito());
                                System.out.printf("Taxa acumulada: %.4f%%\n", +cadernetas[0].getTaxaMensal());
                                System.out.printf("Saldo total: R$ %.2f\n", cadernetas[0].getSaldo());
                                System.out.println("===========================================");
                                System.out.println("");
                    }
                    break;
                case 2:
                    synchronized (System.out) {
                        System.out.println("");
                                System.out.println("===========================================");
                                System.out.println("Redimento de: " + cadernetas[1].getTitular() + ":");
                                System.out.println("Deposito inicial: " +cadernetas[1].getDeposito());
                                System.out.printf("Taxa acumulada: %.4f%%\n", +cadernetas[1].getTaxaMensal());
                                System.out.printf("Saldo total: R$ %.2f\n", cadernetas[1].getSaldo());
                                System.out.println("===========================================");
                                System.out.println("");
                    }
                    break;
                case 3:
                    synchronized (System.out) {
                        System.out.println("");
                                System.out.println("===========================================");
                                System.out.println("Redimento de: " + cadernetas[2].getTitular() + ":");
                                System.out.println("Deposito inicial: " +cadernetas[2].getDeposito());
                                System.out.printf("Taxa acumulada: %.4f%%\n", +cadernetas[2].getTaxaMensal());
                                System.out.printf("Saldo total: R$ %.2f\n", cadernetas[2].getSaldo());
                                System.out.println("===========================================");
                                System.out.println("");
                    }
                    break;
                case 0:
                    for (CadernetaPoupanca caderneta : cadernetas) {
                        caderneta.pararExecução();
                    }
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}

