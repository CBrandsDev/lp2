import java.util.Scanner;

public class CadernetaPoupancaUtil {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        CadernetaPoupanca[] cadernetas = new CadernetaPoupanca[7];
        CadernetaPoupanca Cp = new CadernetaPoupanca();
        cadernetas[1] = new CadernetaPoupanca("Calil", 20, 500);
        cadernetas[2] = new CadernetaPoupanca("Camila", 9, 125);
        cadernetas[3] = new CadernetaPoupanca("Dante", 17, 50);
        cadernetas[4] = new CadernetaPoupanca("Maia", 13, 1000);
        cadernetas[5] = new CadernetaPoupanca("Cath", 21, 634);
        cadernetas[6] = new CadernetaPoupanca("Joao", 9, 70000);

            while(cadernetas[0] == null) {
                try {
                    String nome;
                    int aniversario;
                    double deposito;
                    System.out.println("Informe os dados da 7ª caderneta");
                    System.out.println("Nome do titular: ");
                    nome = sc.nextLine();
                    System.out.print("Cpf: ");
                    aniversario = sc.nextInt();
                    System.out.print("Valor do depósito inicial: ");
                    deposito = sc.nextDouble();
                    sc.nextLine();
                    cadernetas[0] = new CadernetaPoupanca(nome, aniversario, deposito);
                    Cp.limparTela();
                } catch(Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                    System.out.println("Tente novamente.");
                    sc.nextLine();
                }
            }    
        boolean continuar = true;

        while(continuar == true) {
                    Cp.menu();
                    int opcao = sc.nextInt();
                    sc.nextLine();
                    String nomeTitular;
                    int aniversario;
                    double depositoInicial;
                    
                    switch (opcao) {
                        case (1):
                            try {
                                System.out.println("Informe seus dados");
                                System.out.println("Nome do titular: ");
                                nomeTitular = sc.nextLine();
                                System.out.print("Dia de seu aniversario: ");
                                aniversario = sc.nextInt();
                                System.out.print("Valor do depósito inicial: ");
                                depositoInicial = sc.nextDouble();
                                sc.nextLine();
                                for(int i = 0; i < cadernetas.length; i++) {
                                    if(cadernetas[i] == null) {
                                        cadernetas[i] = new CadernetaPoupanca(nomeTitular, aniversario, depositoInicial);
                                        cadernetas[i].start();
                                        break;
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e.getMessage() + " Tente novamente!");
                            }
                            System.out.println("___________________________________");
                            System.out.println("|Caderneta cadastrada!!___________|");
                            System.out.println("|                                 |");
                            Cp.menu();
                            opcao = sc.nextInt();
                            break;
                        case(2):
                        Cp.limparTela();
                        System.out.print("Informe o nome cadastrado do titular: ");
                        nomeTitular = sc.nextLine();
                        try {
                            for(int i = 0; i < cadernetas.length; i++) {
                                if(cadernetas[i] != null && cadernetas[i].getTitular().equals(nomeTitular)) {
                                    System.out.println("Saldo antes da atualização: R$ " + cadernetas[i].getSaldo());
                                    System.out.print("Informe a taxa de rendimento (%): ");
                                    double prTaxa = sc.nextDouble();
                                    sc.nextLine();  
                                    double rendimento = cadernetas[i].atualizarRendimento(prTaxa);
                                    System.out.println("___________________________________");
                                    System.out.println("|Redimento: R$"+rendimento+"");
                                    cadernetas[i].acessar();
                                    break;
                                    }   
                                }
                            } catch (Exception e) {
                                System.out.println("Erro: " + e.getMessage());
                                System.out.println("Tente novamente.");
                                sc.nextLine();
                            }
                        break;    
                        case(3):
                            Cp.limparTela();
                            System.out.print("Informe o nome cadastrado do titular: ");
                            nomeTitular = sc.nextLine();
                            try {
                                for(int i = 0; i < cadernetas.length; i++) {
                                    if(cadernetas[i].getTitular() == nomeTitular) {
                                        cadernetas[i].acessar(); 
                                        break;   
                                    }
                                } 
                            } catch (Exception e) {
                                    System.out.println("Erro: " + e.getMessage());
                                    System.out.println("Tente novamente.");
                                    sc.nextLine();
                                }
                            break;
                        case(4):
                            Cp.limparTela();
                            System.out.print("Informe o aniversario do titular: ");
                            aniversario = sc.nextInt();
                            try {
                                boolean achou = false;
                                while (!achou) {
                                    for(int i = 0; i < cadernetas.length; i++) {
                                        if(cadernetas[i].getAniversario() == aniversario) {
                                            cadernetas[i].acessar();
                                            achou = true;  
                                            break;
                                            } else {
                                                achou = false;
                                            }   
                                        }    
                                    }
                                    break;
                                
                                } catch (Exception e) {
                                    System.out.println("Erro: " + e.getMessage());
                                    System.out.println("Tente novamente.");
                                    sc.nextLine();
                                }
                                break;
                        case(5):
                            Cp.limparTela();
                            System.out.println("Ate mais!!");    
                            continuar = false;
                            break;
                        default:
                            System.out.println("Selecione uma opção valida!!");
                            Cp.menu();
                            break;
                } 
                
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
        // public static CadernetaPoupanca encontrarPoAniversario(CadernetaPoupanca[] cadernetas, int aniversario) {
        //     for (CadernetaPoupanca caderneta : cadernetas) {
        //         if (caderneta.getAniversario() == aniversario) {
        //         return caderneta;
        //         } else {
        //             System.out.println("Nenhuma caderneta encontrada");
        //         }
        //     }
        //     return null;
        // }  
}
