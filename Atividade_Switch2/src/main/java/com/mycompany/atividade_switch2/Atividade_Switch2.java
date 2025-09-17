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

        System.out.print("Digite o tipo de atendimento desejado (1: consultar saldo, 2: sacar dinheiro, 3: depositar dinheiro, 4: encerrar atendimento): ");//pergunta
        int tipoAtendimento = scanner.nextInt();//le o tipo de atendimento

        switch (tipoAtendimento) {
            case 1:
                System.out.println("Você escolheu consultar saldo.");//fala oq a pessoa escolheu
                System.out.println("Seu saldo é R$ 1.000,00.");// fala o saldo
                    System.out.println("Encerrando atendimento. Obrigado!");//encerra o atendimento
                break;
            case 2:
                System.out.println("Você escolheu sacar dinheiro.");// fala o tipo de atendimento
                System.out.print("Digite o valor que deseja sacar: R$ ");//fala o valor que deseja sacar
                double valorSaque = scanner.nextDouble();//guarda o valor
                if (valorSaque <= 1000) { //verifica o valor do saque é maior ou igual a 1.000, para não sacar um valor que ele não tem
                    System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso.");// //mostra o quando vc sacou
                    System.out.println("Seu saldo atual é R$ " + (1000 - valorSaque));//mostra o seu saldo atual
                    System.out.println("Encerrando atendimento. Obrigado!");//encerra o atendimento
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");// mostrar que o valor pedido é insuficiente
                    System.out.println("Encerrando atendimento. Obrigado!");// encerra atendimento
                }
                break;
            case 3:
                System.out.println("Você escolheu depositar dinheiro.");// escolhe o tipo de atendimento, ou seja, depositar o dinheiro
                System.out.print("Digite o valor que deseja depositar: R$ ");// digitar o valor que vc quer depositar
                double valorDeposito = scanner.nextDouble();// guarda o valor
                if (valorDeposito > 0) { //verificar se o valor é menor que zero
                    System.out.println("Depósito de R$ " + valorDeposito + " realizado com sucesso.");// mostrar o quanto vc depositou
                    System.out.println("Seu saldo atual é R$ " + (1000 + valorDeposito));// mostrar seu saldo após o deposito
                    System.out.println("Encerrando atendimento. Obrigado!");// encerrar atendimento
                } else {
                    System.out.println("Valor de depósito inválido.");// valor indisponivel para depositar
                    System.out.println("Encerrando atendimento. Obrigado!");//encerrar atendimento
                    
                }

                break;
            case 4:
                System.out.println("Encerrando atendimento. Obrigado!");// encerrar atendimento

                break;
            default:
                System.out.println("Tipo de atendimento inválido.");// mostrar caso o usuario escreva outra numero
        
                
        }

        //3.Classificador de faixa etária
        System.out.print("Digite a idade da pessoa, para classificar a faixa etária: ");//pergunta a idade
        int idade = scanner.nextInt();//guarda a idade

        int resultado;//variavel para guardar a idade

        if (idade >=0 && idade <= 12) {//verificar a idade e mudar a variavel resultado com base na escolha
         resultado = 1; //mudar o valor da variavel
        } else if (idade >= 13 && idade <= 17) {//verificar a idade e mudar a variavel resultado com base na escolha
            resultado = 2; //mudar o valor da variavel
        } else if (idade >= 18 && idade <= 59) {//verificar a idade e mudar a variavel resultado com base na escolha
            resultado = 3;//mudar o valor da variavel
        } else if (idade >= 60) {//verificar a idade e mudar a variavel resultado com base na escolha
            resultado = 4;//mudar o valor da variavel
        } else {
            resultado = 0;//mudar o valo da variavel, e para o codigo não quebrar
            
        }
            
        switch (resultado) {// switch com base na variavel do resultado, usando isso para definir oq cada case vai mostrar no terminal
            case 1:
                System.out.println("A pessoa é uma criança.");// mostra que a pessoa é uma criança
                break;
            case 2:
                 System.out.println("A pessoa é um adolescente.");// mostra que a pessoa é um adolescente
                break;
            case 3:
                 System.out.println("A pessoa é um adulto.");   //mostrar que a pessoa é um adolescente
                break;
            case 4:
                 System.out.println("A pessoa é um idoso."); //mostrar que a pessoa é um idoso   
                break;
            default: //finaliza o switch case
                break;
        }
            
            
    
    }
}

     
