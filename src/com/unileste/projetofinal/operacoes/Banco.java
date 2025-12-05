package com.unileste.projetofinal.operacoes;

import com.unileste.projetofinal.entidades.Cliente;
import com.unileste.projetofinal.entidades.Conta;
import com.unileste.projetofinal.entidades.ContaCorrente;
import com.unileste.projetofinal.entidades.ContaPoupanca;
import com.unileste.projetofinal.utilitarios.ClienteNaoEncontradoException;
import com.unileste.projetofinal.utilitarios.ContaNaoEncontradaException;
import com.unileste.projetofinal.utilitarios.SaldoInsuficienteException;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private String nomeBanco;
    private Map<String, Cliente> clientes;
    private Map<String, Conta> contas;
    private int proximoNumeroConta = 1;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.clientes = new HashMap<>();
        this.contas = new HashMap<>();
    }

    // ---------------- CADASTRO DE CLIENTE ----------------

    public void cadastrarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido.");
        }

        if (clientes.containsKey(cliente.getCpf())) {
            throw new IllegalArgumentException("Já existe um cliente cadastrado com este CPF.");
        }

        clientes.put(cliente.getCpf(), cliente);
    }

    // ---------------- BUSCA DE CLIENTE ----------------

    public Cliente buscarCliente(String cpf) throws ClienteNaoEncontradoException {
        Cliente c = clientes.get(cpf);
        if (c == null) {
            throw new ClienteNaoEncontradoException("Cliente não encontrado: CPF " + cpf);
        }
        return c;
    }

    // ---------------- BUSCA DE CONTA ----------------

    public Conta buscarConta(String numero) throws ContaNaoEncontradaException {
        Conta conta = contas.get(numero);
        if (conta == null) {
            throw new ContaNaoEncontradaException("Conta não encontrada: " + numero);
        }
        return conta;
    }

    // ---------------- ABERTURA DE CONTA ----------------

        public Conta abrirConta(Cliente cliente, String tipoConta, double... parametros) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido.");
        }

        String numeroConta = String.valueOf(proximoNumeroConta++);
        Conta novaConta;

        double saldoInicial = (parametros.length > 0) ? parametros[0] : 0.0;

        if (tipoConta.equalsIgnoreCase("corrente")) {

            double limite = (parametros.length > 1) ? parametros[1] : 0.0;

            novaConta = new ContaCorrente(
                    numeroConta,
                    cliente,
                    saldoInicial,
                    limite
            );

        } else if (tipoConta.equalsIgnoreCase("poupanca")) {

            novaConta = new ContaPoupanca(
                    numeroConta,
                    cliente,
                    saldoInicial
            );

        } else {
            throw new IllegalArgumentException("Tipo de conta inválido.");
        }

        contas.put(numeroConta, novaConta);
        cliente.adicionarConta(novaConta);

        return novaConta;
    }

    // ---------------- DEPÓSITO ----------------

    public void realizarDeposito(String numeroConta, double valor)
            throws ContaNaoEncontradaException {

        Conta conta = buscarConta(numeroConta);
        conta.depositar(valor);
    }

    // ---------------- SAQUE ----------------

    public void realizarSaque(String numeroConta, double valor)
            throws ContaNaoEncontradaException, SaldoInsuficienteException {

        Conta conta = buscarConta(numeroConta);
        conta.sacar(valor);
    }

    // ---------------- TRANSFERÊNCIA ----------------

    public void realizarTransferencia(String contaOrigem, String contaDestino, double valor)
            throws ContaNaoEncontradaException, SaldoInsuficienteException {

        Conta origem = buscarConta(contaOrigem);
        Conta destino = buscarConta(contaDestino);

        origem.transferir(destino, valor);
    }

    // ---------------- GETTERS ----------------

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public Map<String, Conta> getContas() {
        return contas;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }
    
    //------------- mensagem de comprovante
    
            public String gerarComprovante(String operacao, Conta origem, Conta destino, double valor) {
        StringBuilder sb = new StringBuilder();

        sb.append("=== COMPROVANTE DE ").append(operacao.toUpperCase()).append(" ===\n\n");
        sb.append("Valor: R$ ").append(valor).append("\n\n");

        if (origem != null) {
            sb.append("Conta Origem: ").append(origem.getNumero()).append("\n");
            sb.append("Titular: ").append(origem.getProprietario().getNome()).append("\n");
            sb.append("CPF: ").append(origem.getProprietario().getCpf()).append("\n");
            sb.append("Saldo Atual: ").append(origem.getSaldo()).append("\n\n");
        }

        if (destino != null) {
            sb.append("Conta Destino: ").append(destino.getNumero()).append("\n");
            sb.append("Titular: ").append(destino.getProprietario().getNome()).append("\n");
            sb.append("CPF: ").append(destino.getProprietario().getCpf()).append("\n");
            sb.append("Saldo Atual: ").append(destino.getSaldo()).append("\n");
        }

        sb.append("\nData/Hora: ").append(java.time.LocalDateTime.now()).append("\n");

        return sb.toString();
    }
}