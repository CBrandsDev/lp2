import java.util.Scanner;

class CadernetaPoupanca extends Thread {
    private String titular;
    private int aniversario;
    private double depositoInicial;
    private double rendimentoAcumulado;
    private boolean executando;
    
    public CadernetaPoupanca(String titular, int aniversario, double DInicial) throws Exception{
        this.titular = titular;
        this.aniversario = aniversario;
        if(aniversario < 1 || aniversario > 30) {
            throw new Exception("Insira uma data valida: (1 - 31)");
        }
        depositoInicial = DInicial;
        if(depositoInicial <= 0) {
            throw new Exception("Insira uma quantia valida para depositar");
        }
        this.rendimentoAcumulado = 0;
        this.executando = true;
    }
    public CadernetaPoupanca() {
        this.executando = false;
    }

    public String getTitular() {
        return titular;
    }

    public int getAniversario() {
        return aniversario;
    }

    public double getDeposito() {
        return depositoInicial;
    } 

    public double getRendimento() {
        return rendimentoAcumulado;
    }
    public double getSaldo() {
        return depositoInicial + rendimentoAcumulado;
    }
    public void pararExecução() {
        this.executando = false;
    }

    public double atualizarRendimento(double prTaxa) throws Exception {
        if (prTaxa <= 0) {
            throw new Exception("A taxa de rendimento deve ser maior que 0");
        }
        double saldoAtual = getSaldo();
        double rendimentoMensal = saldoAtual * (prTaxa / 100);
        rendimentoAcumulado += rendimentoMensal;
        return rendimentoAcumulado;
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
        System.out.println("|Aniversario: "+getAniversario());
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


    @Override
    public void run() {
        java.util.Random gerador = new java.util.Random();
        while (executando) {
            
            double taxaAleatoria = gerador.nextDouble(0.5, 1.0);

            try {
                atualizarRendimento(taxaAleatoria);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}