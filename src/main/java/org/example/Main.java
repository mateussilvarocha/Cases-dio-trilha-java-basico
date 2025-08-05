package org.example;

import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {

        //        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite o salários pretendido por você:");
//        String salario_pretendido = scanner.next();
//        analisar_candidato("1200");
//        selecaoCandidato();
        imprimirSelecionados();
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length;indice++){
            System.out.println("O candidato de nº '"+ indice+1+"' é "+ candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }
    static void selecaoCandidato(){
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto","Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salario_base$ = 2000.00;

        //array ultrapssaou a quantidade de itens para verificação
        //precisa de um 'breackpoint' mais elaborado que: while(candidatosSelecionados < 5){}
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at org.example.Main.selecaoCandidato(Main.java:23)
        //	at org.example.Main.main(Main.java:14)
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){

            String candidato = candidatos[candidatosAtual];

            double salarioPretendido = valorPrentendido();

            System.out.println("O candidato "+ candidato+" Solicitou este valor de salário "+ salarioPretendido);
            if(salario_base$ >= salarioPretendido){
                System.out.println("O candidato "+ candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static void analisar_candidato(double salario_pretendido$ ){
        double salario_base$ = 2000.00;
//        double salario_pretendido$ = Double.parseDouble(string_salario_pretendido);

        if(salario_base$ > salario_pretendido$){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salario_base$ == salario_pretendido$){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        } else{
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }

    }


    static double valorPrentendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }


}