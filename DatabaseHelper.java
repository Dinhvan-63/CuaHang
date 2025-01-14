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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ADMIN
 */

public class DatabaseHelper {
     private Connection connection;
 private Connection conn;
  
    // Kết nối tới cơ sở dữ liệu MySQL
    public void connect() {
        String url = "jdbc:mysql://127.0.0.1:3306/qlthuchi";
        String user = "root";  // Tên người dùng MySQL
        String password = "dinhvan.63";  // Mật khẩu MySQL
        try {
            connection = DriverManager.getConnection(url, user, password); // Sửa lại phương thức getConnection
            System.out.println("Kết nối thành công!");
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage());
        }
    }

    
    
    
    
    
    
    // Phương thức thêm chi phí vào cơ sở dữ liệu
    public void insertChiPhi(String id, String name, String amount, String date) throws SQLException {
        String sql = "INSERT INTO chiphi (idchiphi, tenchiphi, sotien, ngaychi) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            // Set giá trị vào các tham số trong câu lệnh SQL
            statement.setString(1, id);    // ID chi phí
            statement.setString(2, name);  // Tên chi phí
            statement.setString(3, amount); // Số tiền
            statement.setString(4, date);  // Ngày chi

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

   
    
    
    // Hàm main để kiểm tra kết nối và thêm chi phí
    public static void main(String[] args) {
        // Tạo đối tượng DatabaseHelper và kết nối
        DatabaseHelper dbHelper = new DatabaseHelper();
        dbHelper.connect();

        // Thêm chi phí vào cơ sở dữ liệu
        try {
            dbHelper.insertChiPhi("12", "Nhập Quần Thun", "1000000", "8/1/2025");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    List<Chiphi> getAllChiPhi() {
      
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   // void insertChiphi(String id, String name, String amount, String date) {
     //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

    //List<DataChiphi> getAllChiphi() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }
    

    public void deleteChiPhi(String idToDelete) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    List<DataChiphi> getAllChiphi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   // void insertPhiThu(String idthu, String namethu, String amountthu, String datethu) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }

    void insertPhiThu(JTextField idphithu, JTextField tenphithu, JTextField sotienthu, JTextField ngaythu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void insertPhiThu(String string, String nhập_Quần_Thun, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet getAllPhiThu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
