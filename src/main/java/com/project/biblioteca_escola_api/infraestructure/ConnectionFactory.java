package com.project.biblioteca_escola_api.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection = null;

    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca_escola?useSSL=false&serverTimezone=UTC";

    private static final String USER = System.getenv("DB_USER") != null ? System.getenv("DB_USER") : "root";
    private static final String PASSWORD = System.getenv("DB_PASSWORD");

    private ConnectionFactory() {}

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                // Carrega o Driver do MySQL na memória
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("✅ Conexão segura estabelecida com o MySQL!");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Erro: Driver do MySQL não foi encontrado no projeto!", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados! Verifique suas credenciais no IntelliJ.", e);
        }
        return connection;
    }
}