package org.example.model;

public class Cliente {
    private int Numero;
    private String Agencia;
    private String Nome;
    private Double Saldo;


    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }


    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Numero=" + Numero +
                ", Agencia='" + Agencia + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }
}
