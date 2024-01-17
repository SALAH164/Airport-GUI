/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Airport_GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.sql.ResultSet;
import static Airport_GUI.Conn.connection;

/**
 *
 * @author xiiMody
 */
public class Tickets extends javax.swing.JFrame {

    /**
     * Creates new form Tickets
     */
    public Tickets() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        v3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        v5 = new javax.swing.JTextField();
        v6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        v8 = new javax.swing.JTextField();
        v9 = new javax.swing.JTextField();
        v2 = new javax.swing.JTextField();
        v4 = new javax.swing.JTextField();
        v7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(20, 39, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(232, 182, 86));
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(232, 182, 86));
        jLabel6.setText("New Ticket");
        jLabel6.setRequestFocusEnabled(false);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 48, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 182, 86));
        jLabel7.setText("Payment Method");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        v3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v3ActionPerformed(evt);
            }
        });
        jPanel1.add(v3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 280, 30));

        jButton4.setBackground(new java.awt.Color(232, 182, 86));
        jButton4.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(20, 39, 90));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 760, -1, -1));

        jButton5.setBackground(new java.awt.Color(232, 182, 86));
        jButton5.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(20, 39, 90));
        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 760, 160, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(232, 182, 86));
        jLabel9.setText("Arrival Date");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(232, 182, 86));
        jLabel10.setText("Seat Num");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(232, 182, 86));
        jLabel11.setText("Departure Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        v5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v5ActionPerformed(evt);
            }
        });
        jPanel1.add(v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 280, 30));

        v6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v6ActionPerformed(evt);
            }
        });
        jPanel1.add(v6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 280, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(232, 182, 86));
        jLabel12.setText("Airplane Type");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(232, 182, 86));
        jLabel13.setText("Airplane Registration Num");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(232, 182, 86));
        jLabel14.setText("Seat Class");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, 30));

        v8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v8ActionPerformed(evt);
            }
        });
        jPanel1.add(v8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 280, 30));

        v9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v9ActionPerformed(evt);
            }
        });
        jPanel1.add(v9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, 280, 30));

        v2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v2ActionPerformed(evt);
            }
        });
        jPanel1.add(v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 280, 30));

        v4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v4ActionPerformed(evt);
            }
        });
        jPanel1.add(v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 280, 30));

        v7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v7ActionPerformed(evt);
            }
        });
        jPanel1.add(v7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 240, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void v3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Tickets_view().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         try {
       PreparedStatement statement = connection.prepareStatement("insert into Tickets (TCPayment_Method,TCPrice,TCDeparture_Date,TCArrival_Date,TCSeat_Num,TCSeat_Class,TCAirplane_Type,TCAirplane_Registration_Num) values"
                + " ('"+v2.getText()+"','"+v3.getText()+"','"+v4.getText()+"','"+v5.getText()+"','"+v6.getText()+"','"+v7.getText()+"','"+v8.getText()+"','"+v9.getText()+"')",java.sql.Statement.RETURN_GENERATED_KEYS); 
           
        int affectedRows = statement.executeUpdate();

        if (affectedRows == 0) {
           JOptionPane.showMessageDialog(null, "Creating Airline failed" );
           return;
        }

           try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                
             JOptionPane.showMessageDialog(null, "Inserted succefully and The Airline Code is:" + generatedKeys.getLong(1));

            }
            else {
             JOptionPane.showMessageDialog(null, "Creating Airline failed" );
            }
        }
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_jButton5ActionPerformed

    private void v5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v5ActionPerformed

    private void v6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v6ActionPerformed

    private void v8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v8ActionPerformed

    private void v9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v9ActionPerformed

    private void v2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v2ActionPerformed

    private void v4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v4ActionPerformed

    private void v7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v7ActionPerformed

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
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField v2;
    private javax.swing.JTextField v3;
    private javax.swing.JTextField v4;
    private javax.swing.JTextField v5;
    private javax.swing.JTextField v6;
    private javax.swing.JTextField v7;
    private javax.swing.JTextField v8;
    private javax.swing.JTextField v9;
    // End of variables declaration//GEN-END:variables
}
