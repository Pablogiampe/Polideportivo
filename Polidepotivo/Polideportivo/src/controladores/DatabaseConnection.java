package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/polideportivo";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static DatabaseConnection instance;
    
    private Connection connection;
    
    // Constructor privado para el patrón Singleton
    private DatabaseConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            JOptionPane.showMessageDialog(null, "Se conectó a la base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos.");
        }
    }
    
    // Método para obtener la instancia única de la conexión
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    // Método para obtener la conexión
    public Connection getConnection() {
        return connection;
    }
    
    // Método principal para probar la conexión
    public static void main(String[] args) {
        // Obtener la instancia de DatabaseConnection
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        
        // Comprobar si la conexión es válida
        if (dbConnection.getConnection() != null) {
            System.out.println("La conexión a la base de datos fue exitosa.");
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }
    }
}
