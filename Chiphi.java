/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CuaHang;

import CuaHang.DatabaseHelper;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import mysql.testconnect;

/**
 *
 * @author ADMIN
 */
public class Chiphi extends javax.swing.JFrame {
ArrayList<DataChiphi> list =new ArrayList<DataChiphi>();
int current=0;
String url = "jdbc:mysql://127.0.0.1:3306/qlthuchi";
            String user = "root";  // Tên người dùng MySQL
           String password = "dinhvan.63"; 
     
    
    public Chiphi() {
        initComponents();
       LoadDataToArray();
        LoadDataArrayListToTable();
     // String cauLenhSQL="SELECT * FROM qlthuchi.chiphi";
     //  ResultSet rs = (ResultSet) testconnect.ThucThiLenhSelect(cauLenhSQL);
     //  System.out.println(rs.getString("tenchiphi"));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMain = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idchiphi = new javax.swing.JTextField();
        tenchiphi = new javax.swing.JTextField();
        sotien = new javax.swing.JTextField();
        ngaychi = new javax.swing.JTextField();
        them = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tableMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Chi Phi", "Tên Chi Phí", "Số Tiền", "Ngày Chi"
            }
        ));
        jScrollPane1.setViewportView(tableMain);

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id chi phí");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên chi phí");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Số tiền");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ngày chi");

        tenchiphi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenchiphiActionPerformed(evt);
            }
        });

        ngaychi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaychiActionPerformed(evt);
            }
        });

        them.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        them.setForeground(new java.awt.Color(102, 102, 0));
        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        xoa.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        xoa.setForeground(new java.awt.Color(102, 102, 0));
        xoa.setText("Xoá");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 0));
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tenchiphi, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(idchiphi))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sotien, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(ngaychi))
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(idchiphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sotien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(tenchiphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngaychi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(them)
                    .addComponent(xoa)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    private void updateTable() {
        // Lấy dữ liệu chi phí từ cơ sở dữ liệu
         DatabaseHelper dbHelper = new DatabaseHelper();
        List<DataChiphi> chiphiList = dbHelper.getAllChiphi();
        
      //  DatabaseHelper dbHelper = new DatabaseHelper();
     //   List<ChiphiModel> chiphiList = dbHelper.getAllChiPhi();

        // Lấy DefaultTableModel từ tableMain
        DefaultTableModel model = (DefaultTableModel) tableMain.getModel();

        // Xóa tất cả các dòng hiện có trong bảng
        model.setRowCount(0);
       // Iterable<Chiphi> chiPhiList = null;

        // Thêm các chi phí vào bảng
        for (DataChiphi chiPhi : chiphiList) {
            Object[] row = {chiPhi.getId(), chiPhi.getName(), chiPhi.getAmount(), chiPhi.getDate()};
            model.addRow(row);  // Thêm dữ liệu vào bảng
        }
}
  
    
    
    
    
    
    
    private void tenchiphiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenchiphiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenchiphiActionPerformed

    private void ngaychiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngaychiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngaychiActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        ///////////////////////////////////////
      String id = idchiphi.getText();   // ID chi phí
    String name = tenchiphi.getText();  // Tên chi phí
    String amount = sotien.getText();  // Số tiền
    String date = ngaychi.getText();  // Ngày chi

    // Kiểm tra nếu các trường không trống
  
if(idchiphi.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Thêm Mã ID");
    idchiphi.requestFocus();
}else if(tenchiphi.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Thêm Tên Chi Phí");
    tenchiphi.requestFocus();
}else if(sotien.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Thêm Số Tiền");
    sotien.requestFocus();
}else if(ngaychi.getText().equals("")){
    JOptionPane.showMessageDialog(null,"Thêm Ngày Chi");
    ngaychi.requestFocus();
    } else {
    // Thêm chi phí vào danh sách hiển thị (bảng)
    DefaultTableModel model = (DefaultTableModel) tableMain.getModel();
    Object[] row = {id, name, amount, date};
    model.addRow(row);  // Thêm một dòng mới vào bảng
    
    // Tạo đối tượng DatabaseHelper và kết nối tới cơ sở dữ liệu
    DatabaseHelper dbHelper = new DatabaseHelper();
   dbHelper.connect();

    // Thêm chi phí vào cơ sở dữ liệu
   // dbHelper.insertChiphi(id, name, amount, date);
 try {
            dbHelper.insertChiPhi(id, name, amount, date);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    // Cập nhật lại bảng chi phí (hiển thị lại dữ liệu từ cơ sở dữ liệu)
    updateTable();

        // Xóa thông tin sau khi thêm
        idchiphi.setText("");
        tenchiphi.setText("");
        sotien.setText("");
        ngaychi.setText("");
    }
// Đưa dữ liệu vào TableModel
           // DefaultTableModel model = new DefaultTableModel(data, columnNames);
        //    tableMain.setModel(model);
    }//GEN-LAST:event_themActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
         int row = tableMain.getSelectedRow();
    if (row >= 0) {
        // Lấy ID chi phí cần xóa từ cột ID chi phí
        String idToDelete = tableMain.getValueAt(row, 0).toString();
        
        // Tạo đối tượng DatabaseHelper và kết nối tới cơ sở dữ liệu
        DatabaseHelper dbHelper = new DatabaseHelper();
        dbHelper.deleteChiPhi(idToDelete);  // Giả sử bạn đã có phương thức deleteChiPhi()
        // Cập nhật lại bảng sau khi xóa
        updateTable();  // Cập nhật lại bảng chi phí sau khi xóa
        JOptionPane.showMessageDialog(null, "Xóa thành công!");
    } else {
        JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng cần xóa.");
    }


        
    }//GEN-LAST:event_xoaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Trang2 trang2=new Trang2();
    trang2.setVisible(true);
    trang2.setLocationRelativeTo(null);
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chiphi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chiphi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chiphi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chiphi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chiphi().setVisible(true);
            }
        });
    }
    public void LoadDataToArray(){
      Statement st = null;
        Connection con = null;
        ResultSet rs = null;

        try{
           Class.forName("com.mysql.cj.jdbc.Driver");

            // Kết nối đến cơ sở dữ liệu MySQL
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/qlthuchi", "root", "dinhvan.63");

            // Tạo đối tượng Statement để thực thi câu lệnh SQL
          //  st = con.createStatement();

            // Câu lệnh SQL để lấy dữ liệu từ bảng
            String sql = "SELECT * FROM chiphi";
            rs = (CuaHang.ResultSet) st.executeQuery(sql);

            // Xóa tất cả các phần tử trong danh sách trước khi thêm dữ liệu mới
            list.clear();

            // Duyệt qua từng dòng dữ liệu trong ResultSet và thêm vào ArrayList
            while (rs.next()) {
                // Lấy dữ liệu từ các cột trong bảng
                String getId = (String) rs.getString("idchiphi");
                String getName = (String) rs.getString("tenchiphi");
                String getAmount = (String) rs.getString("sotien");
                Date getDate = (Date) rs.getDate("ngaychi");  // Lấy giá trị ngày

                // Tạo đối tượng DataChiphi với dữ liệu từ bảng
                DataChiphi cp = new DataChiphi(getId, getName, getAmount, getDate);

                // Thêm đối tượng vào danh sách
                list.add(cp);
            }
        }
        catch(Exception ex){
          ex.printStackTrace(); 
        }
    }
        public void LoadDataArrayListToTable(){
            DefaultTableModel model = (DefaultTableModel) tableMain.getModel();
            model.setRowCount(0);
            for(DataChiphi cp : list)
            {
                model.addRow(new Object[]{cp.getidchiphi(),cp.gettenchiphi(),cp.getsotien(),cp.getngaychi()});
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idchiphi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ngaychi;
    private javax.swing.JTextField sotien;
    private javax.swing.JTable tableMain;
    private javax.swing.JTextField tenchiphi;
    private javax.swing.JButton them;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables

    Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getAmount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   // private void initComponents() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

   // private void updateTable() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }

  //  private void LoadDataToArray() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

   // private void LoadDataArrayListToTable() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }
}
