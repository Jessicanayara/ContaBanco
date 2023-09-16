package org.example.control;

import org.example.model.Cliente;
import org.example.service.OperacaoBancaria;

import java.util.Scanner;



public class ContaTerminal {

    private OperacaoBancaria operacao = new OperacaoBancaria();
    private Cliente cliente;

    Scanner sc= new Scanner(System.in);


    public static void main(String[] args) {
         ContaTerminal conta= new ContaTerminal();
         conta.gerencia();
         System.out.println("Para confirmar a sua conta e visualizar saldo digite as informações abaixo");
         if(conta.validandoConta()== true){
             double saldo= conta.saldoConta();
             System.out.println("O seu saldo é de R$" + saldo );
         }else{
             System.out.println("informaçoes incorretas");
         }
        
    }


    public  void gerencia(){

        System.out.println("Digite seu nome para criar a conta:");
        String nome =sc.nextLine();
        System.out.println("Insira um valor para abrir a sua conta:");
        double saldo= Double.parseDouble(sc.nextLine());
        operacao.criarConta(nome,saldo);
        String info= operacao.informarConta();
        System.out.println(info);



    }

    public boolean validandoConta(){
        System.out.println("Digite sua agencia informada:");
        String agenciaDigitada = sc.nextLine();
        System.out.println("Digite seu numero informado:");
        int numeroDigitado = Integer.parseInt(sc.nextLine());
        boolean acesso = operacao.acessoConta(agenciaDigitada,numeroDigitado);
        return acesso;

    }


    public double saldoConta() {

        double saldo = operacao.caixaEletronico();
        return saldo;


    }



}
