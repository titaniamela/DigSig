package frame;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import sourceCode.RSA;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Shania
 */
public class Halaman1_1 extends javax.swing.JFrame {

    

    /** 
     * Creates new form Halaman1
     */
    public Halaman1_1() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        GetKey = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bilP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bilQ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bilE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KPrivat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        KPublik = new javax.swing.JTextArea();
        untukLatar1 = new assets.UntukLatar();
        SaveKey = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DiTure");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(490, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(222, 230, 253));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 7, 119));
        jLabel7.setText("Kunci Publik");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 353, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 8, 121));
        jLabel8.setText("Kunci Privat");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 428, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 7, 119));
        jLabel6.setText("Pasangan Kunci");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 287, 419, -1));

        GetKey.setBackground(new java.awt.Color(79, 82, 255));
        GetKey.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        GetKey.setForeground(new java.awt.Color(220, 228, 252));
        GetKey.setText("Buat Kunci");
        GetKey.setMaximumSize(new java.awt.Dimension(72, 22));
        GetKey.setMinimumSize(new java.awt.Dimension(72, 22));
        GetKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetKeyActionPerformed(evt);
            }
        });
        jPanel1.add(GetKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 34, 100, 30));

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 7, 119));
        jLabel2.setText("Bilangan Prima Random");
        jLabel2.setAutoscrolls(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 92, -1, -1));

        bilP.setEditable(false);
        bilP.setBackground(new java.awt.Color(231, 238, 254));
        bilP.setForeground(new java.awt.Color(17, 7, 119));
        jPanel1.add(bilP, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 135, 305, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 7, 119));
        jLabel3.setText("p");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 140, 10, -1));

        bilQ.setEditable(false);
        bilQ.setBackground(new java.awt.Color(231, 238, 254));
        bilQ.setForeground(new java.awt.Color(17, 7, 119));
        jPanel1.add(bilQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 180, 305, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 7, 119));
        jLabel4.setText("q");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 185, -1, -1));

        bilE.setEditable(false);
        bilE.setBackground(new java.awt.Color(231, 238, 254));
        bilE.setForeground(new java.awt.Color(17, 7, 119));
        jPanel1.add(bilE, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 225, 305, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 7, 119));
        jLabel5.setText("e");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 225, -1, -1));

        KPrivat.setBackground(new java.awt.Color(231, 238, 254));
        KPrivat.setColumns(20);
        KPrivat.setForeground(new java.awt.Color(18, 8, 121));
        KPrivat.setLineWrap(true);
        KPrivat.setRows(5);
        jScrollPane1.setViewportView(KPrivat);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 409, 300, 60));

        KPublik.setBackground(new java.awt.Color(231, 238, 254));
        KPublik.setColumns(20);
        KPublik.setForeground(new java.awt.Color(18, 8, 121));
        KPublik.setLineWrap(true);
        KPublik.setRows(5);
        jScrollPane2.setViewportView(KPublik);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 330, 300, 61));

        untukLatar1.setBackground(new java.awt.Color(220, 228, 252));

        SaveKey.setBackground(new java.awt.Color(79, 82, 255));
        SaveKey.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        SaveKey.setForeground(new java.awt.Color(220, 228, 252));
        SaveKey.setText("Simpan Kunci");
        SaveKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveKeyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout untukLatar1Layout = new javax.swing.GroupLayout(untukLatar1);
        untukLatar1.setLayout(untukLatar1Layout);
        untukLatar1Layout.setHorizontalGroup(
            untukLatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, untukLatar1Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(SaveKey, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        untukLatar1Layout.setVerticalGroup(
            untukLatar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, untukLatar1Layout.createSequentialGroup()
                .addContainerGap(496, Short.MAX_VALUE)
                .addComponent(SaveKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.add(untukLatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 551));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveKeyActionPerformed
        if(KPublik.getText().isEmpty() || KPrivat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Klik Buat Kunci terlebih dahulu!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Simpan Kunci");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);
        fileChooser.setCurrentDirectory(new File("C:\\Users\\Shania\\OneDrive\\Documents\\NetBeansProjects\\DigSig\\hasil\\key"));

        boolean fileSaved = false;
        while (!fileSaved) {
            int returnValue = fileChooser.showSaveDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                String publicFilePath = fileChooser.getSelectedFile().getAbsolutePath() + "_public.txt";
                String privateFilePath = fileChooser.getSelectedFile().getAbsolutePath() + "_private.txt";

                if (publicFilePath.isEmpty() || privateFilePath.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Nama file tidak sesuai!", "Gagal", JOptionPane.ERROR_MESSAGE);
                    fileSaved = false;
                    continue;
                }

                File publicFile = new File(publicFilePath);
                File privateFile = new File(privateFilePath);

                if (publicFile.exists() || privateFile.exists()) {
                    int overwriteOption = JOptionPane.showConfirmDialog(this, "Nama file sudah ada. Apakah Anda ingin menimpanya?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (overwriteOption == JOptionPane.NO_OPTION) {
                        continue;
                    }
                }

                try (FileWriter publicWriter = new FileWriter(publicFilePath)) {
                    publicWriter.write("Public key (e,n): " + KPublik.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try (FileWriter privateWriter = new FileWriter(privateFilePath)) {
                    privateWriter.write("Private key (d,n): " + KPrivat.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                JOptionPane.showMessageDialog(this, "Kunci telah disimpan", "Info", JOptionPane.INFORMATION_MESSAGE);
                fileSaved = true;

                Hal2 hal2 = new Hal2();
                hal2.setVisible(true);
                this.setVisible(false);
            }else {
                JOptionPane.showMessageDialog(this, "Simpan kunci dibatalkan", "Info", JOptionPane.INFORMATION_MESSAGE);
                fileSaved = true;
            }
        }
    }//GEN-LAST:event_SaveKeyActionPerformed

    private void GetKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetKeyActionPerformed
        try {
            RSA.generateKeys();
        } catch (NoSuchAlgorithmException | IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_GetKeyActionPerformed

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
            java.util.logging.Logger.getLogger(Halaman1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Halaman1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Halaman1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Halaman1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Halaman1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetKey;
    public static javax.swing.JTextArea KPrivat;
    public static javax.swing.JTextArea KPublik;
    private javax.swing.JButton SaveKey;
    public static javax.swing.JTextField bilE;
    public static javax.swing.JTextField bilP;
    public static javax.swing.JTextField bilQ;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private assets.UntukLatar untukLatar1;
    // End of variables declaration//GEN-END:variables
}
