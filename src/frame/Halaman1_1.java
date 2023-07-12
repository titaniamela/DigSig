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
        SaveKey = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DiTure");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(490, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(222, 230, 253));

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 7, 119));
        jLabel7.setText("Kunci Publik");

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 8, 121));
        jLabel8.setText("Kunci Privat");

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 7, 119));
        jLabel6.setText("Pasangan Kunci");

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

        SaveKey.setBackground(new java.awt.Color(79, 82, 255));
        SaveKey.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        SaveKey.setForeground(new java.awt.Color(220, 228, 252));
        SaveKey.setText("Simpan Kunci");
        SaveKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveKeyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 1, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 7, 119));
        jLabel2.setText("Bilangan Prima Random");
        jLabel2.setAutoscrolls(true);

        bilP.setEditable(false);
        bilP.setBackground(new java.awt.Color(231, 238, 254));
        bilP.setForeground(new java.awt.Color(17, 7, 119));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 7, 119));
        jLabel3.setText("p");

        bilQ.setEditable(false);
        bilQ.setBackground(new java.awt.Color(231, 238, 254));
        bilQ.setForeground(new java.awt.Color(17, 7, 119));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 7, 119));
        jLabel4.setText("q");

        bilE.setEditable(false);
        bilE.setBackground(new java.awt.Color(231, 238, 254));
        bilE.setForeground(new java.awt.Color(17, 7, 119));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 7, 119));
        jLabel5.setText("e");

        KPrivat.setBackground(new java.awt.Color(231, 238, 254));
        KPrivat.setColumns(20);
        KPrivat.setForeground(new java.awt.Color(18, 8, 121));
        KPrivat.setLineWrap(true);
        KPrivat.setRows(5);
        jScrollPane1.setViewportView(KPrivat);

        KPublik.setBackground(new java.awt.Color(231, 238, 254));
        KPublik.setColumns(20);
        KPublik.setForeground(new java.awt.Color(18, 8, 121));
        KPublik.setLineWrap(true);
        KPublik.setRows(5);
        jScrollPane2.setViewportView(KPublik);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(GetKey, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(bilE, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bilQ, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(bilP, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SaveKey, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(GetKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bilP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bilQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bilE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel8)
                        .addGap(431, 431, 431))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SaveKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(360, 360, 360))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveKeyActionPerformed
        if(KPublik.getText().isEmpty() || KPrivat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Klik Buat Kunci terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
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
                    JOptionPane.showMessageDialog(this, "Nama file tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
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
    // End of variables declaration//GEN-END:variables
}
