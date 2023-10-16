package jdbcDemos;

import java.sql.*;
import java.util.Scanner;

public class PartsApp {
   
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garage", "root", "Sandeep@77");
             Statement stmt = conn.createStatement()) {

            int choice;
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("Menu:");
                System.out.println("1. Add a Part");
                System.out.println("2. Update Part Details");
                System.out.println("3. Delete Part");
                System.out.println("4. View Parts");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1:
                        addPart(conn, scanner);
                        break;
                    case 2:
                        updatePart(conn, scanner);
                        break;
                    case 3:
                        deletePart(conn, scanner);
                        break;
                    case 4:
                        viewParts(conn);
                        break;
                }
            } while (choice != 5);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addPart(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Part ID: ");
        int pid = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Part Name: ");
        String pname = scanner.nextLine();

        System.out.print("Enter Color: ");
        String color = scanner.nextLine();

        try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO Parts (pid, pname, color) VALUES (?, ?, ?)")) {
            stmt.setInt(1, pid);
            stmt.setString(2, pname);
            stmt.setString(3, color);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Part added successfully.");
            } else {
                System.out.println("Failed to add the part.");
            }
        }
    }
    
    private static void viewParts(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Parts")) {
            System.out.println("Parts Table:");
            System.out.println("PID\tPName\tColor");
            while (rs.next()) {
                int pid = rs.getInt("pid");
                String pname = rs.getString("pname");
                String color = rs.getString("color");
                System.out.println(pid + "\t" + pname + "\t" + color);
            }
        }
    }

    private static void updatePart(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Part ID to update: ");
        int pid = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter new Part Name: ");
        String pname = scanner.nextLine();

        System.out.print("Enter new Color: ");
        String color = scanner.nextLine();

        try (PreparedStatement stmt = conn.prepareStatement("UPDATE Parts SET pname = ?, color = ? WHERE pid = ?")) {
            stmt.setString(1, pname);
            stmt.setString(2, color);
            stmt.setInt(3, pid);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Part details updated successfully.");
            } else {
                System.out.println("No matching part found for the given ID.");
            }
        }
    }

    private static void deletePart(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Part ID to delete: ");
        int pid = scanner.nextInt();

        try (PreparedStatement stmt = conn.prepareStatement("DELETE FROM Parts WHERE pid = ?")) {
            stmt.setInt(1, pid);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Part deleted successfully.");
            } else {
                System.out.println("No matching part found for the given ID.");
            }
        }
    }
}
