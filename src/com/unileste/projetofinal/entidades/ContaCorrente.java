package com.unileste.projetofinal.entidades;

import com.unileste.projetofinal.utilitarios.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String numero, Cliente proprietario, double limiteChequeEspecial) {
        super(numero, proprietario);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
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

        if (saldo + limiteChequeEspecial < valor) {
            throw new SaldoInsuficienteException("Saldo + cheque especial insuficiente.");
        }

        saldo -= valor;
        adicionarTransacao("Saque de R$ " + valor);
    }

    @Override
    public void transferir(Conta destino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor);
        destino.depositar(valor);
        adicionarTransacao("Transferência de R$ " + valor + " para conta " + destino.getNumero());
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero='" + getNumero() + '\'' +
                ", saldo=" + saldo +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }
}
