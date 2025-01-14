/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuaHang;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTextField;
/**
 *
 * @author ADMIN
 */
public class PhiThuManager {
     private Connection connection;

    // Kết nối tới cơ sở dữ liệu MySQL
    public void connect() {
        String url = "jdbc:mysql://127.0.0.1:3306/qlthuchi";
        String user = "root";  // Tên người dùng MySQL
        String password = "dinhvan.63";  // Mật khẩu MySQL
        try {
            connection = java.sql.DriverManager.getConnection(url, user, password); // Sửa lại phương thức getConnection
            System.out.println("Kết nối thành công!");
        } catch (java.sql.SQLException e) {
            System.out.println("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage());
        }
    }

    
    
    // Phương thức thêm dữ liệu vào bảng phithu
    public void insertPhiThu(String idthu, String namethu, String amountthu, String datethu)throws SQLException {
        String sql = "INSERT INTO phithu (idphithu, tenphithu, sotienthu, ngaythu) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            // Set giá trị vào các tham số trong câu lệnh SQL
            statement.setString(1, idthu);    // ID chi phí
            statement.setString(2, namethu);  // Tên chi phí
            statement.setString(3, amountthu); // Số tiền
            statement.setString(4, datethu);  // Ngày chi

            // Thực thi câu lệnh INSERT
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Chi phí đã được thêm vào cơ sở dữ liệu!");
            } else {
                System.out.println("Không có dữ liệu được thêm.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        // Khởi tạo lớp quản lý PhiThu
        PhiThuManager manager = new PhiThuManager();

        // Kết nối tới cơ sở dữ liệu
        manager.connect();

        // Gọi phương thức insertPhiThu để thêm dữ liệu
        manager.insertPhiThu("PHT003", "Chi phí điện", "500000", "2025-01-13");
    }
 
        
        
}