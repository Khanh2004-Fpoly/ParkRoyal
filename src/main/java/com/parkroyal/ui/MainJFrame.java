/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.parkroyal.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author HIEU HIEU
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        init();
    }
    
    void init() {
        this.setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        
        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(format.format(new Date()));
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        btnLuong = new javax.swing.JButton();
        btnTuyenDung = new javax.swing.JButton();
        btnBangCap = new javax.swing.JButton();
        btnPhongBan = new javax.swing.JButton();
        btnHopDongLaoDong = new javax.swing.JButton();
        btnPhongVan = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        lblDongHo = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản Lý Nhân Sự Khách Sạn PARKROYAL SAIGON");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1920, 987));

        pnlMenu.setBackground(new java.awt.Color(0, 255, 255));
        pnlMenu.setPreferredSize(new java.awt.Dimension(192, 669));

        btnLuong.setBackground(new java.awt.Color(0, 229, 255));
        btnLuong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/file-invoice-dollar-solid.png"))); // NOI18N
        btnLuong.setText("Lương");
        btnLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuongActionPerformed(evt);
            }
        });

        btnTuyenDung.setBackground(new java.awt.Color(0, 229, 255));
        btnTuyenDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/people-group-solid.png"))); // NOI18N
        btnTuyenDung.setText("Tuyển Dụng");
        btnTuyenDung.setToolTipText("");
        btnTuyenDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTuyenDungActionPerformed(evt);
            }
        });

        btnBangCap.setBackground(new java.awt.Color(0, 229, 255));
        btnBangCap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/training.png"))); // NOI18N
        btnBangCap.setText("Bằng Cấp");
        btnBangCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangCapActionPerformed(evt);
            }
        });

        btnPhongBan.setBackground(new java.awt.Color(0, 229, 255));
        btnPhongBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/danh-gia-hieu-suat.png"))); // NOI18N
        btnPhongBan.setText("Phòng Ban");
        btnPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongBanActionPerformed(evt);
            }
        });

        btnHopDongLaoDong.setBackground(new java.awt.Color(0, 229, 255));
        btnHopDongLaoDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/phap-ly.png"))); // NOI18N
        btnHopDongLaoDong.setText("Hợp Đồng Lao Động");
        btnHopDongLaoDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHopDongLaoDongActionPerformed(evt);
            }
        });

        btnPhongVan.setBackground(new java.awt.Color(0, 229, 255));
        btnPhongVan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/quan-he-nhan-vien.png"))); // NOI18N
        btnPhongVan.setText("Phỏng Vấn");
        btnPhongVan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongVanActionPerformed(evt);
            }
        });

        btnDoiMatKhau.setBackground(new java.awt.Color(0, 229, 255));
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/doi-mat-khau.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi Mật Khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(0, 229, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/dang-xuat.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");

        btnNhanVien.setBackground(new java.awt.Color(0, 229, 255));
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/id-card-regular.png"))); // NOI18N
        btnNhanVien.setText("Quản Lý Hồ Sơ");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        lblDongHo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDongHo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDongHo.setText("10 : 55 PM");

        btnExit.setBackground(new java.awt.Color(0, 229, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/exit.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTuyenDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBangCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPhongBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHopDongLaoDong, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(btnPhongVan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBangCap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHopDongLaoDong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTuyenDung, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPhongVan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDongHo)
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/parkroyal/icon/hotel-facade.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1269, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        new NhanVienJFrame().setVisible(true);
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exit();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        new DoiMatKhauJFrame().setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuongActionPerformed
        new LuongJFrame().setVisible(true);
    }//GEN-LAST:event_btnLuongActionPerformed

    private void btnTuyenDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTuyenDungActionPerformed
        new TuyenDungJFrame().setVisible(true);
    }//GEN-LAST:event_btnTuyenDungActionPerformed

    private void btnBangCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangCapActionPerformed
        new HocVanJFrame().setVisible(true);
    }//GEN-LAST:event_btnBangCapActionPerformed

    private void btnPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongBanActionPerformed
        new PhongBanJFrame().setVisible(true);
    }//GEN-LAST:event_btnPhongBanActionPerformed

    private void btnHopDongLaoDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHopDongLaoDongActionPerformed
        new HopDongLaoDongJFrame().setVisible(true);
    }//GEN-LAST:event_btnHopDongLaoDongActionPerformed

    private void btnPhongVanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongVanActionPerformed
        new PhongVanJFrame().setVisible(true);
    }//GEN-LAST:event_btnPhongVanActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    void exit() {
        System.exit(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBangCap;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHopDongLaoDong;
    private javax.swing.JButton btnLuong;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhongBan;
    private javax.swing.JButton btnPhongVan;
    private javax.swing.JButton btnTuyenDung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
