package JDBC;

import java.sql.*;
import java.util.Scanner;
 
public class DatabaseDemo {
    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplier", "root", "Aamir@489");
            System.out.println("Connection Established...");
 
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);
 
            boolean exit = false;
 
            while (!exit) {
                System.out.println("1. Insert Record");
                System.out.println("2. Delete Record");
                System.out.println("3. Display Records");
                System.out.println("4. Update Record");
                System.out.println("5. Exit");
                System.out.print("Enter your choice (1/2/3/4/5): ");
                int choice = scanner.nextInt();
 
                switch (choice) {
                    case 1:
                        // Insert a new record
                        System.out.print("Enter the part ID: ");
                        int p_id = scanner.nextInt();
                        System.out.print("Enter the part name: ");
                        String p_name = scanner.next();
                        System.out.print("Enter the part color: ");
                        String color = scanner.next();
 
                        Statement s = con.createStatement();
                        int res = s.executeUpdate("insert into parts(pid, pname, color) values(" + p_id + ", '" + p_name + "', '" + color + "')");
                        System.out.println(res + " record(s) inserted.");
                        break;
 
                    case 2:
                        // Delete a record
                        System.out.print("Enter the part ID to delete: ");
                        int deleteId = scanner.nextInt();
 
                        s = con.createStatement();
                        res = s.executeUpdate("delete from parts where pid = " + deleteId);
                        System.out.println(res + " record(s) deleted.");
                        break;
 
                    case 3:
                        // Display records
                        s = con.createStatement();
                        ResultSet resultSet = s.executeQuery("select * from parts");
                        System.out.println("Part ID | Part Name | Part Color");
                        while (resultSet.next()) {
                            int partId = resultSet.getInt("pid");
                            String partName = resultSet.getString("pname");
                            String partColor = resultSet.getString("color");
                            System.out.println(partId + " | " + partName + " | " + partColor);
                        }
                        break;
 
                    case 4:
                        // Update a record
                        System.out.print("Enter the part ID to update: ");
                        int updateId = scanner.nextInt();
 
                        System.out.println("1. Update Part Name");
                        System.out.println("2. Update Part Color");
                        System.out.print("Enter the attribute to update (1/2): ");
                        int attributeChoice = scanner.nextInt();
 
                        s = con.createStatement();
 
                        if (attributeChoice == 1) {
                            System.out.print("Enter the new part name: ");
                            String newPartName = scanner.next();
                            res = s.executeUpdate("update parts set pname = '" + newPartName + "' where pid = " + updateId);
                            System.out.println(res + " record(s) updated.");
                        } else if (attributeChoice == 2) {
                            System.out.print("Enter the new part color: ");
                            String newColor = scanner.next();
                            res = s.executeUpdate("update parts set color = '" + newColor + "' where pid = " + updateId);
                            System.out.println(res + " record(s) updated.");
                        } else {
                            System.out.println("Invalid attribute choice.");
                        }
                        break;
 
                    case 5:
                        // Exit the program
                        exit = true;
                        System.out.println("Exited.....");
                        break;
 
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
 
            // Close the scanner and the database connection when you're done
            scanner.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


