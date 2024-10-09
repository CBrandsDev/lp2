import java.util.Scanner;

public class CadernetaPoupancaUtil {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        CadernetaPoupanca[] cadernetas = new CadernetaPoupanca[2];
        CadernetaPoupanca Cp = new CadernetaPoupanca();
        

        for (int i = 0; i < cadernetas.length; i++) {
            boolean cadernetaCriada = false;
            while(!cadernetaCriada) {
                try {
                    String nome;
                    int aniversario;
                    double deposito;
                    Cp.limparTela();
                    System.out.println("Informe os dados da " + (i + 1) + "ª caderneta");
                    System.out.println("Nome do titular: ");
                    nome = sc.nextLine();
                    System.out.print("Aniversario: \n");
                    aniversario = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Valor do depósito inicial: \n");
                    deposito = sc.nextDouble();
                    sc.nextLine();
                    cadernetas[i] = new CadernetaPoupanca(nome, aniversario, deposito);
                    Cp.limparTela();
                    cadernetas[i].start();
                    cadernetaCriada = true;
                } catch(Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                    System.out.println("Tente novamente.");
                    sc.nextLine();
                }
            }
        }

        
        boolean continuar = true;
        int opcao = Cp.getOpcao();

        while(continuar == true) {
                if(opcao == 1) {
                    System.out.print("Informe o nome do titular: ");
                    String nomeTitular = sc.nextLine();
                    CadernetaPoupanca cadernetaEncontrada = encontrarCadernetaPorNome(cadernetas, nomeTitular);
                    if (cadernetaEncontrada != null) {
                        System.out.println("Saldo antes da atualização: R$ " + cadernetaEncontrada.getSaldo());
                        boolean taxaValida = false;
                        while(!taxaValida) {
                            try {
                                System.out.print("Informe a taxa de rendimento (%): ");
                                double prTaxa = sc.nextDouble();
                                sc.nextLine();  
                                double rendimento = cadernetaEncontrada.atualizarRendimento(prTaxa);
                                Cp.limparTela();
                                System.out.println("Saldo adicionado após a atualização: R$ " + rendimento);
                                System.out.println("Saldo total: R$ " + cadernetaEncontrada.getSaldo());
                                taxaValida = true;
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                                System.out.println("Tente novamente.");
                                sc.nextLine();
                            }
                        }
                            System.out.println("1- Deseja atualizar o rendimento novamente?");
                            System.out.println("2- Voltar pro menu inicial");
                            System.out.println("0- Sair");
                            int opcao2 = sc.nextInt();
                            sc.nextLine();
                            if(opcao2 == 0) {
                                for(int i = 0; i < cadernetas.length; i++) {
                                    cadernetas[i].pararExecução();
                                }
                                Cp.limparTela();
                                System.out.println("Programa finalizado");
                                continuar = false;
                            } else if (opcao2 == 2) {
                                opcao = 9;
                            }   
        
                        } else {
                            System.out.println("Titular não encontrado.");
                        }
                }
                    
                else if(opcao == 2) {
                    System.out.print("Informe o nome cadastrado do titular: ");
                    String nomeTitular = sc.nextLine();
                    CadernetaPoupanca cadernetaEncontrada = encontrarCadernetaPorNome(cadernetas, nomeTitular);
                    if(cadernetaEncontrada != null) {
                        cadernetaEncontrada.acessar();
                        System.out.println("|1 - Voltar para o menu");
                        System.out.println("|0 - Sair");
                        int opcao3 = sc.nextInt();
                        if (opcao3 == 1)  {
                            opcao = 9;
                        } else if (opcao3 == 0) {
                            for(int i = 0; i < cadernetas.length; i++) {
                                cadernetas[i].pararExecução();
                            }
                            Cp.limparTela();
                            System.out.println("Programa finalizado");
                            continuar = false;
                        } else {
                            opcao = 9;
                        }
                    }
                } 
                else if(opcao == 3){
                    System.out.print("Informe o aniversario cadastrado do titular: ");
                    int niverTitular = sc.nextInt();
                    CadernetaPoupanca cadernetaEncontrada = encontrarPorNiver(cadernetas, niverTitular);
                    if(cadernetaEncontrada != null) {
                        cadernetaEncontrada.acessar();
                        System.out.println("|1 - Voltar para o menu");
                        System.out.println("|0 - Sair");
                        int opcao3 = sc.nextInt();
                        if (opcao3 == 1)  {
                            opcao = 9;
                        } else if (opcao3 == 0) {
                            for(int i = 0; i < cadernetas.length; i++) {
                                cadernetas[i].pararExecução();
                            }
                            Cp.limparTela();
                            System.out.println("Programa finalizado");
                            continuar = false;
                        } else {
                            opcao = 9;
                        }
                    }
                } 
                else if(opcao == 4) {
                    for(int i = 0; i < cadernetas.length; i++) {
                        cadernetas[i].pararExecução();
                    }
                    Cp.limparTela();
                    System.out.println("Programa finalizado");
                    continuar = false;
                } 
                else if (opcao <= 9 && opcao >= 5) {
                    opcao = Cp.getOpcao();
                } else {
                    break;
                }
            }
                
        }
        public static CadernetaPoupanca encontrarPorNiver(CadernetaPoupanca[] cadernetas, int aniversario) {
            for (CadernetaPoupanca caderneta : cadernetas) {
                if (caderneta.getAniversario() == aniversario) {
                return caderneta;
                } else {
                    System.out.println("Nenhuma caderneta encontrada");
                }
            }
            return null;
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
