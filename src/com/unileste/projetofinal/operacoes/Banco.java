package com.unileste.projetofinal.operacoes;

import com.unileste.projetofinal.dao.ClienteDAO;
import com.unileste.projetofinal.dao.ClienteDAOJdbc;
import com.unileste.projetofinal.dao.ContaDAO;
import com.unileste.projetofinal.dao.ContaDAOJdbc;
import com.unileste.projetofinal.entidades.Cliente;
import com.unileste.projetofinal.entidades.Conta;
import com.unileste.projetofinal.entidades.ContaCorrente;
import com.unileste.projetofinal.entidades.ContaPoupanca;
import com.unileste.projetofinal.utilitarios.ClienteNaoEncontradoException;
import com.unileste.projetofinal.utilitarios.ContaNaoEncontradaException;
import com.unileste.projetofinal.utilitarios.SaldoInsuficienteException;

import java.util.List;

public class Banco {

    private String nomeBanco;
    // Substituimos os HashMaps pelos DAOs
    private ClienteDAO clienteDAO;
    private ContaDAO contaDAO;
    private int proximoNumeroConta = 1; // Em um sistema real, isso viria do banco (AUTO_INCREMENT)

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        // Inicializa a conexão com o banco de dados
        this.clienteDAO = new ClienteDAOJdbc();
        this.contaDAO = new ContaDAOJdbc();

        // Ajuste técnico: Descobrir o próximo número de conta baseado no total existente
        // (Simples aproximação para evitar duplicação no teste)
        this.proximoNumeroConta = contaDAO.listarTodos().size() + 1;
    }

    // ---------------- CADASTRO DE CLIENTE ----------------

    public void cadastrarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente inválido.");
        }
        // Verifica no banco se já existe
        Cliente existente = clienteDAO.buscarPorCpf(cliente.getCpf());
        if (existente != null) {
            throw new IllegalArgumentException("Já existe um cliente cadastrado com este CPF.");
        }

        // Salva no banco de dados MySQL
        clienteDAO.inserir(cliente);
    }

    // ---------------- BUSCA DE CLIENTE ----------------

    public Cliente buscarCliente(String cpf) throws ClienteNaoEncontradoException {
        Cliente c = clienteDAO.buscarPorCpf(cpf); // Busca no MySQL
        if (c == null) {
            throw new ClienteNaoEncontradoException("Cliente não encontrado: CPF " + cpf);
        }
        return c;
    }

    // ---------------- BUSCA DE CONTA ----------------

    public Conta buscarConta(String numero) throws ContaNaoEncontradaException {
        Conta conta = contaDAO.buscarPorNumero(numero); // Busca no MySQL
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

        String numeroConta = String.valueOf(System.currentTimeMillis() % 10000); // Gera numero aleatório simples
        Conta novaConta;

        double saldoInicial = (parametros.length > 0) ? parametros[0] : 0.0;

        if (tipoConta.equalsIgnoreCase("corrente")) {
            double limite = (parametros.length > 1) ? parametros[1] : 0.0;
            novaConta = new ContaCorrente(numeroConta, cliente, saldoInicial, limite);
        } else if (tipoConta.equalsIgnoreCase("poupanca")) {
            novaConta = new ContaPoupanca(numeroConta, cliente, saldoInicial);
        } else {
            throw new IllegalArgumentException("Tipo de conta inválido.");
        }

        // Salva a conta no MySQL
        contaDAO.inserir(novaConta);

        return novaConta;
    }

    // ---------------- DEPÓSITO ----------------

    public void realizarDeposito(String numeroConta, double valor) throws ContaNaoEncontradaException {
        Conta conta = buscarConta(numeroConta); // Busca do banco
        conta.depositar(valor); // Atualiza o objeto na memória
        contaDAO.atualizar(conta); // ATUALIZA o saldo no MySQL
    }

    // ---------------- SAQUE ----------------

    public void realizarSaque(String numeroConta, double valor) throws ContaNaoEncontradaException, SaldoInsuficienteException {
        Conta conta = buscarConta(numeroConta); // Busca
        conta.sacar(valor); // Memória
        contaDAO.atualizar(conta); // Banco (Update)
    }

    // ---------------- TRANSFERÊNCIA ----------------

    public void realizarTransferencia(String contaOrigem, String contaDestino, double valor) throws ContaNaoEncontradaException, SaldoInsuficienteException {
        Conta origem = buscarConta(contaOrigem);
        Conta destino = buscarConta(contaDestino);

        origem.transferir(destino, valor); // Faz a lógica de saldo na memória

        // Salva os novos saldos das duas contas no Banco
        contaDAO.atualizar(origem);
        contaDAO.atualizar(destino);
    }

    // Método auxiliar para gerar comprovante (Manteve igual)
    public String gerarComprovante(String operacao, Conta origem, Conta destino, double valor) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== COMPROVANTE DE ").append(operacao.toUpperCase()).append(" ===\n\n");
        sb.append("Valor: R$ ").append(valor).append("\n\n");
        if (origem != null) {
            sb.append("Conta Origem: ").append(origem.getNumero()).append("\n");
            sb.append("Titular: ").append(origem.getProprietario().getNome()).append("\n");
        }
        if (destino != null) {
            sb.append("Conta Destino: ").append(destino.getNumero()).append("\n");
            sb.append("Titular: ").append(destino.getProprietario().getNome()).append("\n");
        }
        return sb.toString();
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarTodos();
    }

    public List<Conta> listarContas() {
        return contaDAO.listarTodos();
    }
}