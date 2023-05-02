package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DbManager {
	
	public static Connection db;
	public static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            String hashedPassword = bytesToHex(hash);
            return hashedPassword;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password: " + e.getMessage());
        }
    }
    
    public static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }
    
	public static Connection DbInit() {
        String url = "jdbc:mysql://localhost:3306/moderned";
        String username = "root";
        String password = "";
//        if(db!=null) return db;
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to database!");
//            db = conn;
            return conn;
        } catch (SQLException e) {
            System.err.println("Failed to connect to database: " + e.getMessage());
        }
       
        return null;
    }
	
	public static void addUser(String email, String name, String password, String phone, int age) {
		
		String url = "jdbc:mysql://localhost:3306/moderned";
        String username = "root";
        String pass = "";
        try (Connection conn = DriverManager.getConnection(url, username, pass)) {
            System.out.println("Connected to database!");
            
            String sql = "INSERT INTO users (email, name, password, phone, age) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            String hashedPassword = hashPassword(password);
            stmt.setString(1, email);
            stmt.setString(2, name);
            stmt.setString(3, hashedPassword);
            stmt.setString(4, phone);
            stmt.setInt(5, age);
            
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
            
        } catch (SQLException e) {
            System.err.println("Failed to connect to database: " + e.getMessage());
        }
		
	}
	
	public static void userLogin(String email, String passwordToCheck) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String url = "jdbc:mysql://localhost:3306/moderned";
        String username = "root";
        String password = "";
        
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to database!");
            
            String sql = "SELECT * FROM users WHERE email = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String storedPasswordHash = rs.getString("password");
                if (verifyPassword(passwordToCheck, storedPasswordHash)) {
                    System.out.println("Login successful!");
            		
            		String sql2 = "SELECT * FROM users WHERE email = ?";
                    PreparedStatement stmt2 = conn.prepareStatement(sql2);
                    stmt2.setString(1, email);
                    ResultSet rs2 = stmt2.executeQuery();
                    
                    if (rs2.next()) {
                    	LoginController.ID = rs2.getInt(1);
	            		LoginController.EMAIL = rs2.getString(2);
	            		LoginController.NAME = rs2.getString(3);
	            		LoginController.AGE = rs2.getInt(6);
	            		LoginController.PHONE = rs2.getString(5);
	            		
	            		LoginController.LOGGED = true;
                    }
            		
                } else {
                    System.out.println("Invalid password.");
                    alert.setContentText("Invalid password.");
            		alert.show();
                }
            } else {
                System.out.println("No user found with that email address.");
                alert.setContentText("No user found with that email address.");
        		alert.show();
            }
            
        } catch (SQLException e) {
            System.err.println("Failed to connect to database: " + e.getMessage());
            alert.setContentText("Failed to connect to database.");
    		alert.show();
        }
    }
    
    public static boolean verifyPassword(String password, String storedPasswordHash) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            String hashedPassword = bytesToHex(hash);
            return hashedPassword.equals(storedPasswordHash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error verifying password: " + e.getMessage());
        }
    }
    
    public static void deleteAccount(int userId, ActionEvent event, Object o) throws SQLException, IOException {
    	String url = "jdbc:mysql://localhost:3306/moderned";
        String username = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql2 = "DELETE FROM course_registeration WHERE userID = " + userId;
        PreparedStatement stmt2 = conn.prepareStatement(sql2);
        String sql = "DELETE FROM users WHERE id = " + userId;
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt2.execute();
        stmt.execute();
    }
}
