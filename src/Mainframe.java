
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Krisna Putra F
 */
public class Mainframe extends javax.swing.JFrame {

    /**
     * Creates new form Mainframe
     */
    public Mainframe() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        np = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ap = new javax.swing.JTextField();
        ns = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        npol = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tk = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("K RENT ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 0, 90, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Lama Peminjaman");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 310, 110, 15);
        getContentPane().add(lp);
        lp.setBounds(310, 300, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nama Peminjam");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 70, 100, 15);
        getContentPane().add(np);
        np.setBounds(310, 60, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Alamat Peminjam");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 110, 110, 15);
        getContentPane().add(ap);
        ap.setBounds(310, 100, 110, 30);
        getContentPane().add(ns);
        ns.setBounds(310, 140, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("No Struk");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 150, 110, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("No Polisi");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 190, 110, 15);
        getContentPane().add(npol);
        npol.setBounds(310, 180, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Tanggal Pinjam");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 230, 110, 15);
        getContentPane().add(tp);
        tp.setBounds(310, 220, 110, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tanggal Kembali");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 270, 110, 15);
        getContentPane().add(tk);
        tk.setBounds(310, 260, 110, 30);

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 310, 73, 23);

        tabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Alamat", "No Struk", "No Polisi", "Pinjam", "Kembali", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 350, 690, 160);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 520, 100, 23);

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 310, 73, 23);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(230, 520, 73, 23);

        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(360, 520, 73, 23);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(580, 520, 51, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 640);

        setSize(new java.awt.Dimension(710, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        np.setText("");ap.setText("");ns.setText("");npol.setText("");tp.setText("");tk.setText("");lp.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        selectData();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int lp1 = Integer.parseInt(lp.getText());
        int hari = 20000;
         String harga = String.valueOf(lp1*hari);
        
         
        
        if("".equals(np.getText()) || "".equals(ap.getText()) || "".equals(ns.getText()) || "".equals(npol.getText()) || "".equals(tp.getText()) || "".equals(tk.getText()) || "".equals(harga))
        {
            JOptionPane.showMessageDialog(this, "Harap lengkapi Data","Tidak Valid", JOptionPane.WARNING_MESSAGE);
        }     
        else
        {
            String SQL = "INSERT INTO peminjaman (nama,alamat,no_struk,no_polisi,tgl_pinjam,tgl_kembali,harga) " + "VALUES('"+np.getText()+"','"+ap.getText() + "','" + ns.getText() + "','" + np.getText() + "','" + tp.getText()+"','" + tk.getText()+"','" + harga+"')";

            int status = KoneksiDB.execute(SQL);

            if(status ==1)
            {
                JOptionPane.showMessageDialog(this,"Data Berhasill ditambahkan","Sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }

            else
            {
                JOptionPane.showMessageDialog(this,"Data gagal ditambahkan, Masukkan Inputan dengan Benar","Gagal", JOptionPane.WARNING_MESSAGE);
            }
;
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int baris = tabel.getSelectedRow();

        if(baris != -1)
        {
            String nama = tabel.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM peminjaman WHERE nama='"+nama+"'";

            int status = KoneksiDB.execute(SQL);

            if (status == 1)
            {
                JOptionPane.showMessageDialog(this, "Data Berhasil di hapus","Sukses",JOptionPane.INFORMATION_MESSAGE);
            }

            else
            {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }

        else
        {
            JOptionPane.showMessageDialog(this,"Pilih Baris Data Terlebih Dahulu","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       MessageFormat header = new MessageFormat("Data Peminjam K RENT");
       MessageFormat footer = new MessageFormat("Page{0, number, integer}      ");
       
       try{
           tabel.print(JTable.PrintMode.FIT_WIDTH, header, footer, true,null,true,null);
          }
       catch (java.awt.print.PrinterException e)
       {System.err.format("Cannot print %s%n", e.getMessage());    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lp;
    private javax.swing.JTextField np;
    private javax.swing.JTextField npol;
    private javax.swing.JTextField ns;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tk;
    private javax.swing.JTextField tp;
    // End of variables declaration//GEN-END:variables

    private void selectData() 
    {
    
        String kolom[] = {"Nama","Alamat","No Struk","No Polisi","Pinjam","Kembali","Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        
        String SQL = "SELECT * FROM peminjaman";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        
        try
        {
            while(rs.next())
            {
                String nama = rs.getString(1);
                String alamat = rs.getString(2);
                String no_struk = rs.getString(3);                
                String no_polisi = rs.getString(4);
                String tgl_pinjam = rs.getString(5);
                String tgl_kembali = rs.getString(6);
                String harga = rs.getString(7);
                String data[] = {nama,alamat,no_struk,no_polisi,tgl_pinjam,tgl_kembali,harga};
                dtm.addRow(data);
            }             
        }
        
        catch(SQLException ex)
        {
            Logger.getLogger(Mainframe.class.getName()).log(Level.SEVERE,null, ex);
        }
            
            tabel.setModel(dtm);
    }
}
