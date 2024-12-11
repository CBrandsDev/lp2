package Prova_2_unidade_v2;
import java.util.*;

import Prova_2_unidade.CadernetaPoupanca;

public class CoberturaVacinalUtil {
    public static void main(String[] args) {
        clear();
        Scanner sc = new Scanner(System.in);
        List<CoberturaVacinal> listaMunicipios = new ArrayList<>();
        int quantidade = 10;
        int index = 1;
        int opcao;
        boolean boot = true;

        while(boot) {
            menu();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    if (index > quantidade) {
                        System.out.println("Maximo de cadastro de municipios atingido!");
                    } else {
                        clear();
                        System.out.println("Qual o nome do municio do " + index + "° cadastro?");
                        String municipio = sc.nextLine();
                        System.out.println("Qual o estado? (XX)");
                        String estado = sc.nextLine();
                        System.out.println("Qual a quantidade de habitantes apitos a serem imunizados?");
                        int habitantes = sc.nextInt();
                        sc.nextLine();
                        listaMunicipios.add(new CoberturaVacinal(municipio, estado, habitantes));
                        index++;
                        clear();
                        }
                    break;
            
                default:
                    break;
            }
        }




    }

    public static void menu() {
        System.out.println("_______________________________________________________");
        System.out.println("|      BEM VINDO AO SISTEMA DE COBERTURA VACINAL      |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|  SELECIONE UMA OPÇÃO:                               |");
        System.out.println("|     1 - CADASTRAR UM MUNICIPIO                      |");
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
