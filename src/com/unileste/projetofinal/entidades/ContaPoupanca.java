package com.unileste.projetofinal.entidades;

import com.unileste.projetofinal.utilitarios.SaldoInsuficienteException;

public class ContaPoupanca extends Conta {

    private double taxaRendimentoMensal = 0.005; // opcional

    public ContaPoupanca(String numero, Cliente proprietario) {
        super(numero, proprietario);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Depósito inválido.");
        saldo += valor;
        adicionarTransacao("Depósito de R$ " + valor);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) throw new IllegalArgumentException("Saque inválido.");
        if (saldo < valor) throw new SaldoInsuficienteException("Saldo insuficiente.");
        saldo -= valor;
        adicionarTransacao("Saque de R$ " + valor);
    }

    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor);
        destino.depositar(valor);
        adicionarTransacao("Transferência de R$ " + valor + " para conta " + destino.getNumero());
    }

    public void renderJuros() {
        saldo += saldo * taxaRendimentoMensal;
        adicionarTransacao("Rendimento aplicado.");
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "numero='" + getNumero() + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
