package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double salario_base$ = 2000.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salários pretendido por você:");
        String salario_pretendido = scanner.next();
        double salario_pretendido$ = Double.parseDouble(salario_pretendido);

        if(salario_base$ > salario_pretendido$){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salario_base$ == salario_pretendido$){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        } else{
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }

    }


}