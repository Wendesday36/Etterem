/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package etterem;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;


public class Rendeles extends javax.swing.JFrame {

    
    String rendeles;
    public Rendeles() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Asztalok = new javax.swing.JPanel();
        Piros = new javax.swing.JRadioButton();
        Kek = new javax.swing.JRadioButton();
        Zold = new javax.swing.JRadioButton();
        Feher = new javax.swing.JRadioButton();
        Valasztott = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstKivalaszt = new javax.swing.JList<>();
        Mentes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMenu = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fajlbaIr = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("Rendelés");

        Asztalok.setBorder(javax.swing.BorderFactory.createTitledBorder("Asztal"));

        buttonGroup1.add(Piros);
        Piros.setText("Piros");
        Piros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PirosActionPerformed(evt);
            }
        });

        buttonGroup1.add(Kek);
        Kek.setText("Kék");
        Kek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KekActionPerformed(evt);
            }
        });

        buttonGroup1.add(Zold);
        Zold.setText("Zöld");
        Zold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoldActionPerformed(evt);
            }
        });

        buttonGroup1.add(Feher);
        Feher.setText("Fehér");
        Feher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AsztalokLayout = new javax.swing.GroupLayout(Asztalok);
        Asztalok.setLayout(AsztalokLayout);
        AsztalokLayout.setHorizontalGroup(
            AsztalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsztalokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AsztalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Piros)
                    .addComponent(Kek)
                    .addComponent(Zold)
                    .addComponent(Feher))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        AsztalokLayout.setVerticalGroup(
            AsztalokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsztalokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Piros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Kek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Zold)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Feher)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        Valasztott.setBorder(javax.swing.BorderFactory.createTitledBorder("Kiválasztott étel:"));

        jScrollPane1.setViewportView(lstKivalaszt);

        javax.swing.GroupLayout ValasztottLayout = new javax.swing.GroupLayout(Valasztott);
        Valasztott.setLayout(ValasztottLayout);
        ValasztottLayout.setHorizontalGroup(
            ValasztottLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ValasztottLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ValasztottLayout.setVerticalGroup(
            ValasztottLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ValasztottLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        Mentes.setText("Mentes");
        Mentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MentesActionPerformed(evt);
            }
        });

        lstMenu.setBorder(javax.swing.BorderFactory.createTitledBorder("MENU"));
        lstMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Babgulyás                ", "Rántott Sajt             ", "Gyümölcsleves        ", "Bécsi szelet          ", "Somlói galuska" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstMenu);

        jButton1.setText("Feltölt");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Valasztott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Asztalok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mentes)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(Valasztott, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Asztalok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mentes)))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rendelés", jPanel1);
        jTabbedPane1.addTab("Étlap", jTabbedPane2);

        fajlbaIr.setText("Fájlbaírás");
        jMenuBar1.add(fajlbaIr);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PirosActionPerformed
      lstKivalaszt.clearSelection();
        lstMenu.enable();
        DefaultListModel dlm = new DefaultListModel<>();
        dlm.addElement("piros");
        lstKivalaszt.setModel(dlm);
        
    }//GEN-LAST:event_PirosActionPerformed

    private void ZoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoldActionPerformed
        lstKivalaszt.clearSelection();
        lstMenu.enable();
        DefaultListModel dlm = new DefaultListModel<>();
        dlm.addElement("Zöld");
        lstKivalaszt.setModel(dlm);
    }//GEN-LAST:event_ZoldActionPerformed

    private void MentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MentesActionPerformed
        rendeles += lstKivalaszt.getModel();
        System.out.println(rendeles);
        Path filePath = Paths.get("rendeles.txt");
        try {
            Files.writeString(filePath, rendeles);
        } catch (IOException ex) {
            Logger.getLogger(Etterem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MentesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultListModel dlm = new DefaultListModel<>();
        ListModel<String> lm = lstKivalaszt.getModel();
        for (int i = 0; i < lm.getSize(); i++) {
            dlm.add(i, lm.getElementAt(i));
        }
        String elem = lstMenu.getSelectedValue();
        dlm.addElement(elem);

        lstKivalaszt.setModel(dlm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void KekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KekActionPerformed
       lstKivalaszt.clearSelection();
        lstMenu.enable();
        DefaultListModel dlm = new DefaultListModel<>();
        dlm.addElement("Kék");
        lstKivalaszt.setModel(dlm);
        

    }//GEN-LAST:event_KekActionPerformed

    private void FeherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeherActionPerformed
        lstKivalaszt.clearSelection();
        lstMenu.enable();
        DefaultListModel dlm = new DefaultListModel<>();
        dlm.addElement("Fehér");
        lstKivalaszt.setModel(dlm);
    }//GEN-LAST:event_FeherActionPerformed
    

    
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
            java.util.logging.Logger.getLogger(Rendeles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rendeles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rendeles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rendeles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rendeles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Asztalok;
    private javax.swing.JRadioButton Feher;
    private javax.swing.JRadioButton Kek;
    private javax.swing.JButton Mentes;
    private javax.swing.JRadioButton Piros;
    private javax.swing.JPanel Valasztott;
    private javax.swing.JRadioButton Zold;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu fajlbaIr;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList<String> lstKivalaszt;
    private javax.swing.JList<String> lstMenu;
    // End of variables declaration//GEN-END:variables
}
