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
public class DataPhithu {
      private String idphithu;
    private String tenphithu;
    private String sotienthu;
    private Date ngaythu;

    // Constructor, getters và setters
    public DataPhithu (String idthu, String namethu, String amountthu, String datethu ) {
        this.idphithu = idthu;
        this.tenphithu = namethu;
        this.sotienthu = amountthu;
          try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.ngaythu = dateFormat.parse(datethu); // Chuyển đổi chuỗi ngày thành đối tượng Date
        } catch (Exception e) {
            e.printStackTrace(); // Xử lý lỗi khi chuyển đổi
        }
    
    
    }

    public DataPhithu(String idthu, String namethu, String amountthu, java.sql.Date datethu) {
          throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() { return idphithu; }
    public String getName() { return tenphithu; }
    public String getAmount() { return sotienthu; }
    public Date getDate() { return ngaythu; }

    // Phương thức main để kiểm tra lớp DataChiphi
    public static void main(String[] args) {
        // Tạo đối tượng DataChiphi với các tham số mẫu
        DataChiphi chiPhi = new DataChiphi("CP003", "Chi phí văn phòng", "500000", "2025-01-08");

        // Hiển thị thông tin chi phí
        System.out.println("ID Phí Thu: " + chiPhi.getId());
        System.out.println("Tên Phí Thu: " + chiPhi.getName());
        System.out.println("Số Tiền Thu: " + chiPhi.getAmount());
        System.out.println("Ngày Thu: " + chiPhi.getDate());
    }

}
