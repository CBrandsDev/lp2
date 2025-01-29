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
<<<<<<< HEAD:Prova/CadernetaPoupancaUtil.java
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
=======
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
                    // cadernetas[i].start();
                    cadernetaCriada = true;
>>>>>>> a4ad281128941c6df0c8bf323997ef23f170804e:Prova_1_unidade/CadernetaPoupancaUtil.java
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
<<<<<<< HEAD:Prova/CadernetaPoupancaUtil.java
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
=======
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
>>>>>>> a4ad281128941c6df0c8bf323997ef23f170804e:Prova_1_unidade/CadernetaPoupancaUtil.java
                            continuar = false;
                            break;
                        default:
                            System.out.println("Selecione uma opção valida!!");
                            Cp.menu();
                            break;
                } 
<<<<<<< HEAD:Prova/CadernetaPoupancaUtil.java
                
            }
                
        }
        
=======
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
>>>>>>> a4ad281128941c6df0c8bf323997ef23f170804e:Prova_1_unidade/CadernetaPoupancaUtil.java
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
