import java.util.Scanner;

class CadernetaPoupanca {
    private String titular;
    private String cpf;
    private double depositoInicial;
    private double rendimentoAcumulado;
    
    public CadernetaPoupanca(String titular, String cpf, double DInicial) {
        this.titular = titular;
        this.cpf = cpf;
        depositoInicial = DInicial;
        this.rendimentoAcumulado = 0;
    }
    public CadernetaPoupanca() {
        return;
    }

    public String getTitular() {
        return titular;
    }

    public String getCpf() {
        return cpf;
    }

    public double getDeposito() {
        return depositoInicial;
    } 

    public double getRendimento() {
        return rendimentoAcumulado;
    }

    public double atualizarRendimento(double prTaxa) {
        double saldoAtual = getSaldo();
        double rendimentoMensal = saldoAtual * (prTaxa / 100);
        rendimentoAcumulado += rendimentoMensal;
        return rendimentoAcumulado;
    }

    public double getSaldo() {
        return depositoInicial + rendimentoAcumulado;
    }

    public double getTaxaMensal() {
        if(depositoInicial == 0) {
            return 0;
        }
        return (rendimentoAcumulado / depositoInicial) * 100;
    
    }

    public void acessar() {
        limparTela();
        System.out.println("__________________________________________");
        System.out.println("|"+getTitular());
        System.out.println("|Cpf: "+getCpf());
        System.out.println("|Deposito Inicial: R$ "+getDeposito());
        System.out.println("|Saldo: R$ "+getSaldo());
        System.out.println("|Taxa acumulada: "+getTaxaMensal());
        System.out.println("__________________________________________");
    }
    public void limparTela() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public int getOpcao(){
            Scanner sc = new Scanner(System.in);
            limparTela();
            System.out.println("___________________________________");
            System.out.println("|Bem vindo                        |");
            System.out.println("|                                 |");
            System.out.println("|1 - Atualizar rendimento         |");
            System.out.println("|Listar caderneta por:            |");
            System.out.println("|   2 - Nome                      |");
            System.out.println("|   3 - Cpf                       |");
            System.out.println("|4 - Sair                         |");
            System.out.println("|                                 |");
            System.out.println("|Selecione uma opção:             |");
            System.out.println("|_________________________________|");
            int opcao    = sc.nextInt();
            return opcao;
    }


    
    

}