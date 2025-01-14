/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuaHang;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class DataChiphi {
    private String idchiphi;
    private String tenchiphi;
    private String sotien;
    private Date ngaychi;

    // Constructor, getters và setters
    public DataChiphi (String id, String name, String amount, String date) {
        this.idchiphi = id;
        this.tenchiphi = name;
        this.sotien = amount;
          try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.ngaychi = dateFormat.parse(date); // Chuyển đổi chuỗi ngày thành đối tượng Date
        } catch (Exception e) {
            e.printStackTrace(); // Xử lý lỗi khi chuyển đổi
        }
    
    
    }

    DataChiphi(String id, String name, String amount, java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() { return idchiphi; }
    public String getName() { return tenchiphi; }
    public String getAmount() { return sotien; }
    public Date getDate() { return ngaychi; }



    // Phương thức main để kiểm tra lớp DataChiphi
    public static void main(String[] args) {
        // Tạo đối tượng DataChiphi với các tham số mẫu
        DataChiphi chiPhi = new DataChiphi("CP001", "Chi phí văn phòng", "500000", "2025-01-08");

        // Hiển thị thông tin chi phí
        System.out.println("ID Chi phí: " + chiPhi.getId());
        System.out.println("Tên Chi phí: " + chiPhi.getName());
        System.out.println("Số tiền: " + chiPhi.getAmount());
        System.out.println("Ngày chi: " + chiPhi.getDate());
    }

    Object getidchiphi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object gettenchiphi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getsotien() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getngaychi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


