-- =============================================
-- Sistema Bancário - Projeto Final Unileste
-- Banco de dados MySQL - Arquivo para importação rápida
-- =============================================

DROP DATABASE IF EXISTS bd_contas;
CREATE DATABASE bd_contas CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE bd_contas;

-- Tabela de clientes
CREATE TABLE clientes (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(200)
) ENGINE=InnoDB;

-- Tabela de contas
CREATE TABLE contas (
    numero VARCHAR(20) PRIMARY KEY,
    tipo ENUM('CORRENTE', 'POUPANCA') NOT NULL,
    saldo DOUBLE NOT NULL DEFAULT 0.0,
    proprietario_cpf VARCHAR(11) NOT NULL,
    limite_cheque_especial DOUBLE DEFAULT NULL,
    taxa_rendimento_mensal DOUBLE DEFAULT NULL,
    FOREIGN KEY (proprietario_cpf) REFERENCES clientes(cpf) ON DELETE CASCADE
) ENGINE=InnoDB;

-- Tabela de transações (histórico)
CREATE TABLE transacoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    conta_numero VARCHAR(20) NOT NULL,
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,
    descricao VARCHAR(255) NOT NULL,
    valor DOUBLE NOT NULL,
    tipo_transacao ENUM('DEPOSITO', 'SAQUE', 'TRANSFERENCIA_ENVIADA', 'TRANSFERENCIA_RECEBIDA', 'RENDIMENTO') NOT NULL,
    FOREIGN KEY (conta_numero) REFERENCES contas(numero) ON DELETE CASCADE
) ENGINE=InnoDB;

-- =============================================
-- DADOS DE TESTE
-- =============================================

INSERT INTO clientes (cpf, nome, endereco) VALUES
('11122233344', 'Ana Clara Silva', 'Rua das Acácias, 100 - Fabriciano'),
('55566677788', 'Pedro Henrique Costa', 'Av. Brasil, 500 - Ipatinga'),
('99988877766', 'Mariana Oliveira', 'Rua Central, 200 - Timóteo');

INSERT INTO contas (numero, tipo, saldo, proprietario_cpf, limite_cheque_especial) VALUES
('CC-1001', 'CORRENTE', 2500.00, '11122233344', 1500.00),
('CP-2001', 'POUPANCA', 8500.00, '11122233344', NULL),
('CC-1002', 'CORRENTE', 1200.00, '55566677788', 800.00),
('CP-2002', 'POUPANCA', 4300.00, '99988877766', NULL);

INSERT INTO transacoes (conta_numero, descricao, valor, tipo_transacao) VALUES
('CC-1001', 'Depósito inicial', 2500.00, 'DEPOSITO'),
('CP-2001', 'Depósito inicial', 8500.00, 'DEPOSITO'),
('CC-1001', 'Transferência recebida de Pedro', 300.00, 'TRANSFERENCIA_RECEBIDA'),
('CC-1002', 'Transferência enviada para Ana', -300.00, 'TRANSFERENCIA_ENVIADA');