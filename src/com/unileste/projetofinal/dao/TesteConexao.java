
package com.unileste.projetofinal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class TesteConexao {
        private static final String URL = "jdbc:mysql://localhost:3306/bd_contas?useSSL=false&serverTimezone=UTC";
        private static final String USER = "root";
        private static final String PASSWORD = ""; // coloque a senha se tiver
        public static Connection getConnection() throws SQLException {
    // ESSA LINHA FORÇA O CARREGAMENTO DO DRIVER (resolve no Java 24)
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        throw new RuntimeException("Driver MySQL não encontrado!", e);
    }
    
    return DriverManager.getConnection(URL, USER, PASSWORD);
}
}


