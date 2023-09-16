package org.example.service;

import org.example.model.Cliente;

import java.util.Random;
import java.util.Scanner;

public class OperacaoBancaria {
 private Cliente cliente;

 public void criarConta(String nome, double saldo){
     cliente = new Cliente();
     cliente.setNome(nome);
     cliente.setSaldo(saldo);

 }

 public String informarConta(){

     Random gerador = new Random();


     int numeroConta = gerador.nextInt(1000,9999);
     int agenciaConta= gerador.nextInt(100,999);
     int digitoAgencia= gerador.nextInt(1,9);

     String agenciaCriada= agenciaConta +"-" + digitoAgencia;


     String nome = cliente.getNome();
     cliente.setAgencia(agenciaCriada);
     cliente.setNumero(numeroConta);

     return  "Olá "+ nome + " bem-vindo a sua conta Bancaria, sua agencia é "+ cliente.getAgencia() + " e seu numero é "+ cliente.getNumero();
 }


 public boolean acessoConta(String agencia, int numero) {
     String agenciaConta = cliente.getAgencia();
     int numeroConta = cliente.getNumero();


     if (agenciaConta.equalsIgnoreCase(agencia) && numeroConta == numero) {

         return true;

     }else {
         return false;
     }


 }

    public double caixaEletronico(){
        double saldo = cliente.getSaldo();
        return saldo;
    }

}
