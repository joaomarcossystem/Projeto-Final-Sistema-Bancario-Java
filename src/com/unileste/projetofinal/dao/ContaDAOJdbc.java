package com.unileste.projetofinal.dao;

import com.unileste.projetofinal.entidades.*;
import com.unileste.projetofinal.utilitarios.SaldoInsuficienteException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContaDAOJdbc implements ContaDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/bd_contas?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    @Override
    public void inserir(Conta conta) {
        String sql = "INSERT INTO contas (numero, saldo, proprietario_cpf, tipo, limite_cheque_especial, taxa_rendimento_mensal) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, conta.getNumero());
            pstmt.setDouble(2, conta.getSaldo());
            pstmt.setString(3, conta.getProprietario().getCpf());
            if (conta instanceof ContaCorrente) {
                pstmt.setString(4, "CORRENTE");
                pstmt.setDouble(5, ((ContaCorrente) conta).getLimiteChequeEspecial());
                pstmt.setNull(6, Types.DOUBLE);
            } else if (conta instanceof ContaPoupanca) {
                pstmt.setString(4, "POUPANCA");
                pstmt.setNull(5, Types.DOUBLE);
                pstmt.setDouble(6, 0.005);  // Taxa hardcoded, como na classe original
            } else {
                throw new IllegalArgumentException("Tipo de conta inválido.");
            }
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir conta: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Conta conta) {
        String sql = "UPDATE contas SET saldo = ?, limite_cheque_especial = ?, taxa_rendimento_mensal = ? WHERE numero = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, conta.getSaldo());
            if (conta instanceof ContaCorrente) {
                pstmt.setDouble(2, ((ContaCorrente) conta).getLimiteChequeEspecial());
                pstmt.setNull(3, Types.DOUBLE);
            } else if (conta instanceof ContaPoupanca) {
                pstmt.setNull(2, Types.DOUBLE);
                pstmt.setDouble(3, 0.005);  // Taxa hardcoded
            } else {
                throw new IllegalArgumentException("Tipo de conta inválido.");
            }
            pstmt.setString(4, conta.getNumero());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar conta: " + e.getMessage());
        }
    }

    @Override
    public void excluir(String numero) {
        String sql = "DELETE FROM contas WHERE numero = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, numero);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir conta: " + e.getMessage());
        }
    }

    @Override
    public Conta buscarPorNumero(String numero) {
        String sql = "SELECT * FROM contas WHERE numero = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, numero);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String tipo = rs.getString("tipo");
                double saldo = rs.getDouble("saldo");
                String cpf = rs.getString("proprietario_cpf");
                ClienteDAO clienteDAO = new ClienteDAOJdbc();
                Cliente proprietario = clienteDAO.buscarPorCpf(cpf);
                if (proprietario == null) {
                    throw new RuntimeException("Proprietário não encontrado para a conta.");
                }
                if ("CORRENTE".equals(tipo)) {
                    double limite = rs.getDouble("limite_cheque_especial");
                    return new ContaCorrente(numero, proprietario, saldo, limite);
                } else if ("POUPANCA".equals(tipo)) {
                    return new ContaPoupanca(numero, proprietario, saldo);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar conta: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Conta> listarTodos() {
        List<Conta> contas = new ArrayList<>();
        String sql = "SELECT numero FROM contas";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Conta conta = buscarPorNumero(rs.getString("numero"));
                if (conta != null) {
                    contas.add(conta);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar contas: " + e.getMessage());
        }
        return contas;
    }

    @Override
    public List<Conta> listarPorCliente(String cpf) {
        List<Conta> contas = new ArrayList<>();
        String sql = "SELECT numero FROM contas WHERE proprietario_cpf = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cpf);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Conta conta = buscarPorNumero(rs.getString("numero"));
                if (conta != null) {
                    contas.add(conta);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar contas por cliente: " + e.getMessage());
        }
        return contas;
    }

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
