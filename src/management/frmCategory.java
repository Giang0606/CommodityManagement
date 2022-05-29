/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;

import DSA.Category;
import DSA.CategoryDSA;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giang
 */
public class frmCategory extends javax.swing.JFrame {

    CategoryDSA dsCa = new CategoryDSA();

    public frmCategory() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLPCategory = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbCategory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFid = new javax.swing.JTextField();
        jTFname = new javax.swing.JTextField();
        jTFproducer = new javax.swing.JTextField();
        jTFprice = new javax.swing.JTextField();
        jTFdvt = new javax.swing.JTextField();
        jTFnum = new javax.swing.JTextField();
        jBtReset = new javax.swing.JButton();
        jBtUpdate = new javax.swing.JButton();
        jBtDel = new javax.swing.JButton();
        jBtSearch = new javax.swing.JButton();
        jBtAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý hàng hóa");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLPCategory.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        jTbCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Nhà sản xuất", "Giá bán", "ĐVT", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbCategoryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTbCategory);

        jLabel1.setText("Mã sản phẩm");

        jLabel2.setText("Tên sản phẩm");

        jLabel3.setText("Nhà sản xuất");

        jLabel4.setText("Giá bán");

        jLabel5.setText("Đơn vị tính");

        jLabel6.setText("Số lượng");

        jBtReset.setText("Làm mới");
        jBtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtResetActionPerformed(evt);
            }
        });

        jBtUpdate.setText("Sửa");
        jBtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtUpdateActionPerformed(evt);
            }
        });

        jBtDel.setText("Xóa");
        jBtDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtDelActionPerformed(evt);
            }
        });

        jBtSearch.setText("Tìm kiếm");
        jBtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSearchActionPerformed(evt);
            }
        });

        jBtAdd.setText("Thêm");
        jBtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAddActionPerformed(evt);
            }
        });

        jLPCategory.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jTFid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jTFname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jTFproducer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jTFprice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jTFdvt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jTFnum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jBtReset, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jBtUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jBtDel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jBtSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPCategory.setLayer(jBtAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPCategoryLayout = new javax.swing.GroupLayout(jLPCategory);
        jLPCategory.setLayout(jLPCategoryLayout);
        jLPCategoryLayout.setHorizontalGroup(
            jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jLPCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFid, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(jTFname)
                        .addComponent(jTFproducer))
                    .addGroup(jLPCategoryLayout.createSequentialGroup()
                        .addComponent(jBtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jBtUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jBtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFprice)
                        .addComponent(jTFdvt)
                        .addComponent(jTFnum, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                    .addGroup(jLPCategoryLayout.createSequentialGroup()
                        .addComponent(jBtSearch)
                        .addGap(47, 47, 47)
                        .addComponent(jBtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jLPCategoryLayout.setVerticalGroup(
            jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPCategoryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jTFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jTFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFdvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jTFproducer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtAdd)
                            .addComponent(jBtUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jBtDel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtSearch)
                        .addComponent(jBtReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLPCategory, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLPCategory)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showTb() {
        DefaultTableModel tb = (DefaultTableModel) jTbCategory.getModel();
        tb.setRowCount(0);
        for (int i = 0; i < dsCa.lsCa.size(); i++) {
            Object[] row = new Object[6];
            row[0] = dsCa.lsCa.get(i).getId();
            row[1] = dsCa.lsCa.get(i).getName();
            row[2] = dsCa.lsCa.get(i).getProducer();
            row[3] = dsCa.lsCa.get(i).getPrice();
            row[4] = dsCa.lsCa.get(i).getDvt();
            row[5] = dsCa.lsCa.get(i).getNumber();
            tb.addRow(row);
        }
    }

    public void resetForm() {
        jTFid.setText("");
        jTFname.setText("");
        jTFproducer.setText("");
        jTFprice.setText("");
        jTFdvt.setText("");
        jTFnum.setText("");
    }

    public Category getModel() throws ParseException {
        Category c = new Category();
        c.setId(jTFid.getText());
        c.setName(jTFname.getText());
        c.setProducer(jTFproducer.getText());
        c.setPrice(Integer.parseInt(jTFprice.getText()));
        c.setDvt(jTFdvt.getText());
        c.setNumber(Integer.parseInt(jTFnum.getText()));
        return c;
    }

    public void setModel(Category c) {
        jTFid.setText(c.getId());
        jTFname.setText(c.getName());
        jTFproducer.setText(c.getProducer());
        jTFprice.setText(String.valueOf(c.getPrice()));
        jTFdvt.setText(c.getDvt());
        jTFnum.setText(String.valueOf(c.getNumber()));
    }

    public boolean checkValidForm() {
        if (jTFid.getText().equals("") || jTFname.getText().equals("")
                || jTFproducer.getText().equals("") || jTFprice.getText().equals("")
                || jTFdvt.getText().equals("") || jTFnum.getText().equals("")) {
            return false;
        } else if (checkText.checkAllNum(jTFprice.getText()) == false
                || checkText.checkAllNum(jTFnum.getText()) == false) {
            return false;
        }
        return true;
    }

    private void jBtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtResetActionPerformed
        resetForm();
    }//GEN-LAST:event_jBtResetActionPerformed

    private void jBtDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtDelActionPerformed
        if (jTFid.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Nhập mã sản phẩm để xóa");
        } else if (dsCa.del(jTFid.getText()) > 0) {
            JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
            showTb();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy sản phẩm để xóa");
        }
    }//GEN-LAST:event_jBtDelActionPerformed

    private void jBtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAddActionPerformed
        if (checkValidForm()) {
            Category c;
            try {
                c = getModel();
                if (dsCa.add(c) > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Lưu thành công");
                    showTb();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lưu không thành công");
                }
            } catch (ParseException ex) {
                Logger.getLogger(frmCategory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Chưa nhập đầy đủ thông tin hoặc chưa đúng định dạng");
        }
    }//GEN-LAST:event_jBtAddActionPerformed

    private void jBtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSearchActionPerformed
        if (jTFid.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Nhập mã sản phẩm để tìm");
        } else {
            Category c = dsCa.findByID(jTFid.getText());
            if (c != null) {
                setModel(c);
                showTb();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy sản phẩm có mã "
                        + jTFid.getText());
            }
        }
    }//GEN-LAST:event_jBtSearchActionPerformed

    private void jBtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtUpdateActionPerformed
        if (!checkValidForm()) {
            JOptionPane.showMessageDialog(rootPane, "Nhập thông tin để cập nhật");
        } else {
            try {
                Category c = getModel();
                if (dsCa.update(c) > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
                    showTb();
                } else {
                    JOptionPane.showConfirmDialog(rootPane, "Không thể cập nhật sản phẩm");
                }
            } catch (ParseException ex) {
                Logger.getLogger(frmCategory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBtUpdateActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void jTbCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbCategoryMouseClicked
        int point = jTbCategory.rowAtPoint(evt.getPoint());
        Category c = dsCa.lsCa.get(point);
        setModel(c);
    }//GEN-LAST:event_jTbCategoryMouseClicked

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
            java.util.logging.Logger.getLogger(frmCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtAdd;
    private javax.swing.JButton jBtDel;
    private javax.swing.JButton jBtReset;
    private javax.swing.JButton jBtSearch;
    private javax.swing.JButton jBtUpdate;
    private javax.swing.JLayeredPane jLPCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFdvt;
    private javax.swing.JTextField jTFid;
    private javax.swing.JTextField jTFname;
    private javax.swing.JTextField jTFnum;
    private javax.swing.JTextField jTFprice;
    private javax.swing.JTextField jTFproducer;
    private javax.swing.JTable jTbCategory;
    // End of variables declaration//GEN-END:variables

}
