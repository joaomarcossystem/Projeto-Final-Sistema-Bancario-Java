package com.unileste.projetofinal.entidades;

import com.unileste.projetofinal.utilitarios.SaldoInsuficienteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Conta {

    private String numero;
    protected double saldo;
    private Cliente proprietario;
    private List<String> historicoTransacoes;

    public Conta(String numero, Cliente proprietario) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("Número da conta inválido.");
        }
        if (proprietario == null) {
            throw new IllegalArgumentException("Proprietário inválido.");
        }

        this.numero = numero;
        this.saldo = 0.0;
        this.proprietario = proprietario;
        this.historicoTransacoes = new ArrayList<>();

        proprietario.adicionarConta(this);
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public List<String> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    protected void adicionarTransacao(String descricao) {
        historicoTransacoes.add(descricao);
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public abstract void transferir(Conta destino, double valor) throws SaldoInsuficienteException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return numero.equals(conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", proprietario=" + proprietario.getNome() +
                '}';
    }
}
