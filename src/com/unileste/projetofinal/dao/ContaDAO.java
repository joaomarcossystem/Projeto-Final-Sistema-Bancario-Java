package com.unileste.projetofinal.dao;

import com.unileste.projetofinal.entidades.Conta;

import java.util.List;

public interface ContaDAO {
    void inserir(Conta conta);
    void atualizar(Conta conta);
    void excluir(String numero);
    Conta buscarPorNumero(String numero);
    List<Conta> listarTodos();
    List<Conta> listarPorCliente(String cpf);
}