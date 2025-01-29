import java.util.Scanner;

class CadernetaPoupanca extends Thread {
    private String titular;
    private int aniversario;
    private double depositoInicial;
    private double rendimentoAcumulado;
    private boolean executando;
    
<<<<<<< HEAD:Prova/CadernetaPoupanca.java
    public CadernetaPoupanca(String titular, int aniversario, double DInicial) throws Exception {
        this.titular = titular;
        this.aniversario = aniversario;
        if (aniversario < 1 || aniversario > 31) {
            throw new Exception("Deve inserir um dia valido (1 - 31)");
        }
        depositoInicial = DInicial;
        if (depositoInicial <= 0) {
            throw new Exception("Insira uma quantia valida para o deposito");
=======
    public CadernetaPoupanca(String titular, int aniversario, double DInicial) throws Exception{
        this.titular = titular;
        this.aniversario = aniversario;
        if(aniversario < 1 || aniversario > 30) {
            throw new Exception("Insira uma data valida: (1 - 31)");
        }
        depositoInicial = DInicial;
        if(depositoInicial <= 0) {
            throw new Exception("Insira uma quantia valida para depositar");
>>>>>>> a4ad281128941c6df0c8bf323997ef23f170804e:Prova_1_unidade/CadernetaPoupanca.java
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

<<<<<<< HEAD:Prova/CadernetaPoupanca.java
    public void acessar() {
        limparTela();
        System.out.println("__________________________________________");
        System.out.println("|"+getTitular());
        System.out.println("|Aniversario: "+getAniversario());
        System.out.println("|Deposito Inicial: R$ "+getDeposito());
        System.out.println("|Saldo: R$ "+getSaldo());
        System.out.println("|Taxa acumulada: "+getTaxaMensal());
        System.out.println("__________________________________________");
=======
    public void acessar() throws Exception {
        try {
            limparTela();
            System.out.println("__________________________________________");
            System.out.println("|"+getTitular());
            System.out.println("|Aniversario: "+getAniversario());
            System.out.println("|Deposito Inicial: R$ "+getDeposito());
            System.out.printf("|Taxa acumulada: %.4f%%\n", +getTaxaMensal());
            System.out.println("|Saldo total: R$ " + getSaldo());
            System.out.println("==========================================");            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Tente novamente.");
        }

>>>>>>> a4ad281128941c6df0c8bf323997ef23f170804e:Prova_1_unidade/CadernetaPoupanca.java
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

    public void menu(){
            limparTela();
            System.out.println("___________________________________");
            System.out.println("|Bem vindo ao Monkeys Bank        |");
            System.out.println("|                                 |");
<<<<<<< HEAD:Prova/CadernetaPoupanca.java
            System.out.println("|1 - Cadastrar caderneta          |");
            System.out.println("|2 - Atualizar Rendimento         |");
            System.out.println("|Procurar caderneta por:          |");
            System.out.println("|   3 - Nome                      |");
            System.out.println("|   4 - Aniversario               |");
            System.out.println("|5 - Sair                         |");
=======
            System.out.println("|1 - Atualizar rendimento         |");
            System.out.println("|Listar caderneta por:            |");
            System.out.println("|   2 - Nome                      |");
            System.out.println("|   3 - Aniversario               |");
            System.out.println("|4 - Sair                         |");
>>>>>>> a4ad281128941c6df0c8bf323997ef23f170804e:Prova_1_unidade/CadernetaPoupanca.java
            System.out.println("|                                 |");
            System.out.println("|                                 |");
            System.out.println("|Selecione uma opção:_____________|");
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