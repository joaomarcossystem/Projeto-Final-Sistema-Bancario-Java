package com.unileste.projetofinal.dao;

import com.unileste.projetofinal.entidades.Cliente;

import java.util.List;

public interface ClienteDAO {
    void inserir(Cliente cliente);
    void atualizar(Cliente cliente);
    void excluir(String cpf);
    Cliente buscarPorCpf(String cpf);
    List<Cliente> listarTodos();
}