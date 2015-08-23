package br.com.fabricadeprogramador.persistenca.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fabricaweb", "root", "admin123");
		} catch (SQLException e) {
			//Relançando a exception
			throw new RuntimeException(e);
		}
	}

}
