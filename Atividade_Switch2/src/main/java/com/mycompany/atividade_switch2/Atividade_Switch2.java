/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_switch2;

/**
 *
 * @author Koragem
 */
import java.util.Scanner;
public class Atividade_Switch2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1.Calculador de Tarifas de transporte
        System.out.print("Digite o tipo de transporte (1: ônibus urbano, 2: metrô, 3: trem intermunicipal, 4: ônibus rodoviario): ");
        int tipoTransporte = scanner.nextInt();

        switch (tipoTransporte) {
            case 1:
                System.out.println("Tarifa para ônibus urbano: R$ 4,40, quantos billhetes você quer?");//mostra o preço e o número de bilhetes
                int bilhetes = scanner.nextInt();//lê o número de bilhetes
                double tarifa = 4.40; // tarifa para ônibus urbano
                double total = bilhetes * tarifa; // calcula o total
                System.out.println("Total a pagar: R$ " + total); // mostra o total
                break;
            case 2:
                System.out.println("Tarifa para metrô: R$ 5,00, quantos billhetes você quer?");//mostra o preço e o número de bilhetes
                int bilhetes2 = scanner.nextInt();//lê o número de bilhetes
                double tarifa2 = 5.00; // tarifa para metrô
                double total2 = bilhetes2 * tarifa2; // calcula o total
                System.out.println("Total a pagar: R$ " + total2); // mostra o
                break;
            case 3:
                System.out.println("Tarifa para trem intermunicipal: R$ 6,50, quantos billhetes você quer?");// mostra o preço e o número de bilhetes
                int bilhetes3 = scanner.nextInt();//lê o número de bilhetes
                double tarifa3 = 6.50; // tarifa para trem intermunicipal
                double total3 = bilhetes3 * tarifa3; // calcula o total
                System.out.println("Total a pagar: R$ " + total3); // mostra o total
                break;
            case 4:
                System.out.println("Tarifa para ônibus rodoviario: R$ 12,00,");// mostra o preço e o número de bilhetes
                int bilhetes4 = scanner.nextInt();//lê o número de bilhetes
                double tarifa4 = 12.00; // tarifa para ônibus rodoviario
                double total4 = bilhetes4 * tarifa4; // calcula o total
                System.out.println("Total a pagar: R$ " + total4); // mostra o
                break;
            default:
                System.out.println("Tipo de transporte inválido.");
        }
        
        //2.Simulador de atendimento em um banco

        System.out.print("Digite o tipo de atendimento desejado (1: consultar saldo, 2: sacar dinheiro, 3: depositar dinheiro, 4: encerrar atendimento): ");
        int tipoAtendimento = scanner.nextInt();

        switch (tipoAtendimento) {
            case 1:
                System.out.println("Você escolheu consultar saldo.");
                System.out.println("Seu saldo é R$ 1.000,00.");
                    System.out.println("Encerrando atendimento. Obrigado!");
                break;
            case 2:
                System.out.println("Você escolheu sacar dinheiro.");
                System.out.print("Digite o valor que deseja sacar: R$ ");
                double valorSaque = scanner.nextDouble();
                if (valorSaque <= 1000) {
                    System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso.");
                    System.out.println("Seu saldo atual é R$ " + (1000 - valorSaque));
                    System.out.println("Encerrando atendimento. Obrigado!");
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                    System.out.println("Encerrando atendimento. Obrigado!");
                }
                break;
            case 3:
                System.out.println("Você escolheu depositar dinheiro.");
                System.out.print("Digite o valor que deseja depositar: R$ ");
                double valorDeposito = scanner.nextDouble();
                if (valorDeposito > 0) {
                    System.out.println("Depósito de R$ " + valorDeposito + " realizado com sucesso.");
                    System.out.println("Seu saldo atual é R$ " + (1000 + valorDeposito));
                    System.out.println("Encerrando atendimento. Obrigado!");
                } else {
                    System.out.println("Valor de depósito inválido.");
                    System.out.println("Encerrando atendimento. Obrigado!");
                    
                }

                break;
            case 4:
                System.out.println("Encerrando atendimento. Obrigado!");

                break;
            default:
                System.out.println("Tipo de atendimento inválido.");
        
                
        }

        //3.Classificador de faixa etária
        System.out.print("Digite a idade da pessoa, para classificar a faixa etária");
        int idade = scanner.nextInt();

        int resultado;

        if (idade >=0 && idade <= 12) {
         resultado = 1;
        } else if (idade >= 13 && idade <= 17) {
            resultado = 2;
        } else if (idade >= 18 && idade <= 59) {
            resultado = 3;
        } else if (idade >= 60) {
            resultado = 4;
        } else {
            resultado = 0;
            
        }
            
        switch (resultado) {
            case 1:
                System.out.println("A pessoa é uma criança.");
                break;
            case 2:
                 System.out.println("A pessoa é um adolescente.");   
                break;
            case 3:
                 System.out.println("A pessoa é um adulto.");   
                break;
            case 4:
                 System.out.println("A pessoa é um idoso.");   
                break;
            default:
                break;
        }
            
            
    
    }
}

     
