package Prova_2_unidade;

import java.util.*;

public class CadernetaPoupancaUtil {
    public static void main(String[] args) {

        ArrayList<CadernetaPoupanca> cadernetasLista = new ArrayList<CadernetaPoupanca>();
        Scanner sc = new Scanner(System.in);
        String titular;
        int diaAniversario;
        CadernetaPoupanca cadernetaEncontrada = null;
        boolean encerrar = false;
        int opcao;

        System.out.println("Bem vindo ao sistema de caderneta de poupança!");
        while (!encerrar) {
            menu();
            opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                System.out.println("Digite o nome do titular:");
                titular = sc.next();
                System.out.println("Digite o dia do aniversário:");
                diaAniversario = sc.nextInt();
                System.out.println("Digite o deposito inicial: ");
                double deposito = sc.nextDouble();
            }
        }
    }
}