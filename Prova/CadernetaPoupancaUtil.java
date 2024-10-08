import java.util.Scanner;

public class CadernetaPoupancaUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CadernetaPoupanca[] cadernetas = new CadernetaPoupanca[2];
        CadernetaPoupanca Cp = new CadernetaPoupanca();
        

        for (int i = 0; i < cadernetas.length; i++) {
            String nome;
            String aniversario;
            double deposito;
            System.out.println("Informe os dados da " + (i + 1) + "ª caderneta");
            System.out.println("Nome do titular: ");
            nome = sc.nextLine();
            System.out.print("Dia do aniversário: ");
            aniversario = sc.nextLine();
            System.out.print("Valor do depósito inicial: ");
            deposito = sc.nextDouble();
            sc.nextLine();
            cadernetas[i] = new CadernetaPoupanca(nome, aniversario, deposito);
            Cp.limparTela();
        }

        boolean continuar = true;
        switch(continuar == true) {
                case opcao = 1:
                    int opcao = Cp.getOpcao();
                    Cp.limparTela();
                    System.out.print("Informe o nome do titular: ");
                    String nomeTitular = sc.nextLine();
                    CadernetaPoupanca cadernetaEncontrada = encontrarCadernetaPorNome(cadernetas, nomeTitular);
                    if (cadernetaEncontrada != null) {
                        System.out.println("Saldo antes da atualização: R$ " + cadernetaEncontrada.getSaldo());
                        System.out.print("Informe a taxa de rendimento (%): ");
                        double prTaxa = sc.nextDouble();
                        double rendimento = cadernetaEncontrada.atualizarRendimento(prTaxa);
                        System.out.println("Saldo após a atualização: R$ " + rendimento);
                    } else {
                        System.out.println("Titular não encontrado.");
                    }
                case opcao = 2:
                    Cp.limparTela();
                    System.out.print("Insira o nome de usuario cadastrado: ");
                    nomeTitular = sc.nextLine();
                    
            
                }
                
        }
        public static CadernetaPoupanca encontrarCadernetaPorNome(CadernetaPoupanca[] cadernetas, String nomeTitular) {
            for (CadernetaPoupanca caderneta : cadernetas) {
                if (caderneta.getTitular().equalsIgnoreCase(nomeTitular)) {
                    return caderneta;
                }
            }
            return null;  
    }
   
}



  // private int opcao;

        // switch (opcao) {
        // case '1':
        // Cp.limparTela();
        // System.out.print(" ______________________________");
        // System.out.print("| Informe o nome do titular: |");
        // String nomeTitular = sc.nextLine();
        // CadernetaPoupanca cadernetaEncontrada = encontrarCadernetaPorNome(cadernetas,
        // nomeTitular);
        // if (cadernetaEncontrada != null) {
        // System.out.println("Saldo antes da atualização: R$ " +
        // cadernetaEncontrada.getSaldo());
        // System.out.print("Informe a taxa de rendimento (%): ");
        // double taxa = sc.nextDouble();
        // sc.nextLine(); // Consumir a quebra de linha
        // cadernetaEncontrada.atualizarRendimento(taxa);
        // System.out.println("Saldo após a atualização: R$ " +
        // cadernetaEncontrada.getSaldo());
        // } else {
        // System.out.println("Titular não encontrado.");
        // }
        // break;

        // case '2':
        // // Listar cadernetas por dia de aniversário

        // break;

        // case '3':
        // // Listar cadernetas por nome do titular

        // break;

        // case '4':
        // // Encerrar a aplicação

        // break;
 // default:
// sc.close();

// // Método para encontrar uma caderneta por nome do titular (ignora
// maiúsculas/minúsculas)


// // Método para listar cadernetas por dia de aniversário
// public static void listarPorDiaDeAniversario(CadernetaPoupanca[] cadernetas,
// int dia) {
// boolean encontrado = false;
// System.out.println("Cadernetas com aniversário no dia " + dia + ":");
// for (CadernetaPoupanca caderneta : cadernetas) {
// if (caderneta.getDia() == dia) {
// System.out.println("Titular: " + caderneta.getTitular() + ", Saldo: R$ " +
// caderneta.getSaldo());
// encontrado = true;
// }
// }
// if (!encontrado) {
// System.out.println("Nenhuma caderneta encontrada com aniversário no dia " +
// dia);
// }
// }

// // Método para listar cadernetas por nome do titular
// public static void listarPorNomeTitular(CadernetaPoupanca[] cadernetas,
// String nomeTitular) {
// boolean encontrado = false;
// for (CadernetaPoupanca caderneta : cadernetas) {
// if (caderneta.getTitular().equalsIgnoreCase(nomeTitular)) {
// System.out.println("Titular: " + caderneta.getTitular());
// System.out.println("Dia do aniversário: " + caderneta.getDia());
// System.out.println("Depósito inicial: R$ " + caderneta.getDeposito());
// System.out.println("Saldo atual: R$ " + caderneta.getSaldo());
// encontrado = true;
// break;
// }
// }
// if (!encontrado) {
// System.out.println("Nenhuma caderneta encontrada para o titular " +
// nomeTitular);
// }
// }
