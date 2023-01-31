/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Config.DbConfig;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Arga 'Ahmad Mujahidin' Herlambang
 */
public class PesanTicket extends javax.swing.JFrame {
    /**
     * Creates new form PesanTicket
     */
    Integer userid=null;
    
    Connection conn=DbConfig.getConnection();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    ArrayList<Integer> arraytype=null;
    ArrayList<Integer> arraytugas=null;
    DefaultComboBoxModel combomodel;
    
    public void showRute() {
        arraytype = new ArrayList<Integer>();
        String [] selects = {
            " "
        };
        combomodel = new DefaultComboBoxModel(selects);
        combo_rute.setModel(combomodel);
        try {
            Statement stat = conn.createStatement();
            ResultSet resu = stat.executeQuery("SELECT id_rute,tujuan,rute_awal,rute_ahir,harga FROM rute");
            while (resu.next()) {
                arraytype.add(resu.getInt("id_rute"));
                combomodel.addElement(resu.getString("tujuan")+" | "+resu.getString("rute_awal")+" - "+resu.getString("rute_ahir")+" | "+resu.getString("harga"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showPetugas() {
        arraytugas = new ArrayList<Integer>();
        String [] selects = {
            " "
        };
        combomodel = new DefaultComboBoxModel(selects);
        combo_petugas.setModel(combomodel);
        try {
            Statement stat = conn.createStatement();
            ResultSet resu = stat.executeQuery("SELECT id_petugas,nama_petugas FROM petugas");
            while (resu.next()) {
                arraytugas.add(resu.getInt("id_petugas"));
                combomodel.addElement(resu.getString("nama_petugas"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public PesanTicket(Integer uid,String nama) {
            initComponents();
            showRute();
            showPetugas();
        if (uid!=null) {
            userid=uid;
            txt_idpenumpang.setText(nama);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txt_idpenumpang = new javax.swing.JLabel();
        txt_kodepemesanan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_tempatpemesanan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_kodekursi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combo_rute = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        date_tanggalberangkat = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combo_petugas = new javax.swing.JComboBox<>();
        txt_jamcekinminute = new javax.swing.JFormattedTextField();
        txt_jamcekinhour = new javax.swing.JFormattedTextField();
        txt_jamberangkathour = new javax.swing.JFormattedTextField();
        txt_jamberangkatminute = new javax.swing.JFormattedTextField();
        combo_jamcekinampm = new javax.swing.JComboBox<>();
        combo_jamberangkatampm = new javax.swing.JComboBox<>();
        btn_Pesan = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_idpenumpang.setText("User");

        jLabel2.setText("Kode");

        jLabel4.setText("Tempat");

        jLabel5.setText("Kode Kursi");

        jLabel6.setText("Tujuan");

        combo_rute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel7.setText("Tanggal Berangkat");

        jLabel3.setText("Jam Cekin");

        jLabel8.setText("Jam Berangkat");

        jLabel9.setText("Petugas");

        combo_petugas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        txt_jamcekinminute.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("mm"))));

        txt_jamcekinhour.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h"))));

        txt_jamberangkathour.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h"))));

        txt_jamberangkatminute.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("mm"))));

        combo_jamcekinampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        combo_jamberangkatampm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        btn_Pesan.setText("Pesan");
        btn_Pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_kodepemesanan)
                            .addComponent(txt_tempatpemesanan)
                            .addComponent(txt_kodekursi, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(combo_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combo_rute, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date_tanggalberangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_jamberangkathour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_jamberangkatminute, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_jamcekinhour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_jamcekinminute, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_jamberangkatampm, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_jamcekinampm, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(320, 320, 320))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_idpenumpang))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btn_Pesan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_idpenumpang)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kodepemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_tempatpemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_kodekursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(combo_rute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_tanggalberangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_jamcekinminute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_jamcekinhour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_jamcekinampm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_jamberangkatminute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_jamberangkathour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_jamberangkatampm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(combo_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Pesan)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesanActionPerformed
        // TODO add your handling code here:
        LocalDate tgl = LocalDate.now();
        Integer jamcekin = Integer.parseInt(txt_jamcekinhour.getText());
        Integer jamberangkat = Integer.parseInt(txt_jamberangkathour.getText());
        if (combo_jamcekinampm.getSelectedItem().equals("PM")){
            jamcekin += 12;
        }
        if (combo_jamberangkatampm.getSelectedItem().equals("PM")){
            jamberangkat += 12;
        }
            
        try {
            System.out.println("asdasdaaa");
            Statement stat = conn.createStatement();
            String query = "INSERT INTO pemesanan VALUES(NULL,'"
                    +txt_kodepemesanan.getText()+"','"
                    +tgl.toString()+"','"
                    +txt_tempatpemesanan.getText()+"',"
                    +userid+",'"
                    +txt_kodekursi.getText()+"',"
                    +arraytype.get(combo_rute.getSelectedIndex()-1)+",NULL,'"
                    +formatter.format(date_tanggalberangkat.getDate())+"','"
                    +jamcekin+":"+txt_jamcekinminute.getText()+":00','"
                    +jamberangkat+":"+txt_jamberangkatminute.getText()+":00',NULL,"
                    +arraytugas.get(combo_petugas.getSelectedIndex()-1)+")";
            System.out.println(query);
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "berhasil");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_PesanActionPerformed

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
            java.util.logging.Logger.getLogger(PesanTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesanTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesanTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesanTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesanTicket(null,"").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Pesan;
    private javax.swing.JComboBox<String> combo_jamberangkatampm;
    private javax.swing.JComboBox<String> combo_jamcekinampm;
    private javax.swing.JComboBox<String> combo_petugas;
    private javax.swing.JComboBox<String> combo_rute;
    private com.toedter.calendar.JDateChooser date_tanggalberangkat;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_idpenumpang;
    private javax.swing.JFormattedTextField txt_jamberangkathour;
    private javax.swing.JFormattedTextField txt_jamberangkatminute;
    private javax.swing.JFormattedTextField txt_jamcekinhour;
    private javax.swing.JFormattedTextField txt_jamcekinminute;
    private javax.swing.JTextField txt_kodekursi;
    private javax.swing.JTextField txt_kodepemesanan;
    private javax.swing.JTextField txt_tempatpemesanan;
    // End of variables declaration//GEN-END:variables
}