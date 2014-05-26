/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FUtama.java
 *
 * Created on Apr 7, 2013, 1:13:51 PM
 */

package akademik_smppgri2bdg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author yan
 */
public class FUtama extends javax.swing.JFrame {
    Connection conn;
    /** Creates new form FUtama */
    public FUtama()
    {
       initComponents();   
        File.setVisible(false);
        DataInput.setVisible(false);
        Akademik.setVisible(false);
        Laporan.setVisible(false);
        PanelLogin.setVisible(true);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        BLogin = new javax.swing.JButton();
        BKeluar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        CBJabatanUser = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        MenuUtama = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        Logout = new javax.swing.JMenuItem();
        Keluar = new javax.swing.JMenuItem();
        DataInput = new javax.swing.JMenu();
        InputGuru = new javax.swing.JMenuItem();
        InputMatpel = new javax.swing.JMenuItem();
        InputUser = new javax.swing.JMenuItem();
        Akademik = new javax.swing.JMenu();
        Registrasi = new javax.swing.JMenuItem();
        PembagianKelas = new javax.swing.JMenuItem();
        PembagianWaliKelas = new javax.swing.JMenuItem();
        Penjadwalan = new javax.swing.JMenuItem();
        Penilaian = new javax.swing.JMenuItem();
        Laporan = new javax.swing.JMenu();
        LaporanSiswa = new javax.swing.JMenuItem();
        LaporanGuru = new javax.swing.JMenuItem();
        LaporanMatpel = new javax.swing.JMenuItem();
        LaporanKelas = new javax.swing.JMenuItem();
        LaporanWaliKelas = new javax.swing.JMenuItem();
        LaporanJadwal = new javax.swing.JMenuItem();
        LaporanNilai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEM INFORMASI AKADEMIK SMP PGRI 2 BANDUNG");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SISTEM INFORMASI AKADEMIK");
        PanelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 290, -1));

        jLabel2.setText("SMP PGRI 2 BANDUNG");
        PanelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel3.setText("Jln. Ciumbuleuit Atas No. 48");
        PanelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 340, -1));

        jLabel5.setText("Username");
        PanelLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 20));

        jLabel6.setText("Password");
        PanelLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 20));
        PanelLogin.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 140, -1));

        BLogin.setText("Login");
        BLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoginActionPerformed(evt);
            }
        });
        PanelLogin.add(BLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 80, -1));

        BKeluar.setText("Keluar");
        BKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKeluarActionPerformed(evt);
            }
        });
        PanelLogin.add(BKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 80, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        PanelLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 140, -1));

        jLabel7.setText("Jabatan");
        PanelLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        CBJabatanUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "Guru", "Kesiswaan", "Kepala Sekolah", "Admin" }));
        PanelLogin.add(CBJabatanUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        PanelLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, 150));
        jLabel8.getAccessibleContext().setAccessibleName("jLabel14");

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 363, 370));

        File.setText("File");
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        File.add(Logout);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        File.add(Keluar);

        MenuUtama.add(File);

        DataInput.setText("Data Input");

        InputGuru.setText("Input Guru");
        InputGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputGuruActionPerformed(evt);
            }
        });
        DataInput.add(InputGuru);

        InputMatpel.setText("Input Mata Pelajaran");
        InputMatpel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputMatpelActionPerformed(evt);
            }
        });
        DataInput.add(InputMatpel);

        InputUser.setText("Input User");
        InputUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUserActionPerformed(evt);
            }
        });
        DataInput.add(InputUser);

        MenuUtama.add(DataInput);

        Akademik.setText("Akademik");

        Registrasi.setText("Registrasi Siswa");
        Registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrasiActionPerformed(evt);
            }
        });
        Akademik.add(Registrasi);

        PembagianKelas.setText("Pembagian Kelas");
        PembagianKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembagianKelasActionPerformed(evt);
            }
        });
        Akademik.add(PembagianKelas);

        PembagianWaliKelas.setText("Pembagian Wali Kelas");
        PembagianWaliKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembagianWaliKelasActionPerformed(evt);
            }
        });
        Akademik.add(PembagianWaliKelas);

        Penjadwalan.setText("Penjadwalan");
        Penjadwalan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjadwalanActionPerformed(evt);
            }
        });
        Akademik.add(Penjadwalan);

        Penilaian.setText("Penilaian");
        Penilaian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenilaianActionPerformed(evt);
            }
        });
        Akademik.add(Penilaian);

        MenuUtama.add(Akademik);

        Laporan.setText("Laporan");

        LaporanSiswa.setText("Laporan Siswa");
        LaporanSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanSiswaActionPerformed(evt);
            }
        });
        Laporan.add(LaporanSiswa);

        LaporanGuru.setText("Laporan Guru");
        LaporanGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanGuruActionPerformed(evt);
            }
        });
        Laporan.add(LaporanGuru);

        LaporanMatpel.setText("Laporan Mata Pelajaran");
        LaporanMatpel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanMatpelActionPerformed(evt);
            }
        });
        Laporan.add(LaporanMatpel);

        LaporanKelas.setText("Laporan Kelas");
        LaporanKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanKelasActionPerformed(evt);
            }
        });
        Laporan.add(LaporanKelas);

        LaporanWaliKelas.setText("Laporan Wali Kelas");
        LaporanWaliKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanWaliKelasActionPerformed(evt);
            }
        });
        Laporan.add(LaporanWaliKelas);

        LaporanJadwal.setText("Laporan Jadwal");
        LaporanJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanJadwalActionPerformed(evt);
            }
        });
        Laporan.add(LaporanJadwal);

        LaporanNilai.setText("Laporan Nilai");
        LaporanNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanNilaiActionPerformed(evt);
            }
        });
        Laporan.add(LaporanNilai);

        MenuUtama.add(Laporan);

        setJMenuBar(MenuUtama);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        CBJabatanUser.setSelectedItem("--Pilih--");
        txtUsername.setText("");
        txtPassword.setText("");
        
        File.setVisible(false);
        DataInput.setVisible(false);
        Akademik.setVisible(false);
        Laporan.setVisible(false);
        PanelLogin.setVisible(true);
}//GEN-LAST:event_LogoutActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileActionPerformed

    private void InputGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputGuruActionPerformed
        // TODO add your handling code here:
        FInputDataGuru fguru=new FInputDataGuru();
        fguru.setLocationRelativeTo(this);
        fguru.setVisible(true);
}//GEN-LAST:event_InputGuruActionPerformed

    private void PembagianKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembagianKelasActionPerformed
        // TODO add your handling code here:
        FPembagianKelas fkelas=new FPembagianKelas();
        fkelas.setLocationRelativeTo(this);
        fkelas.setVisible(true);
}//GEN-LAST:event_PembagianKelasActionPerformed

    private void PenjadwalanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjadwalanActionPerformed
        // TODO add your handling code here:
        FPenjadwalan fjadwal=new FPenjadwalan();
        fjadwal.setLocationRelativeTo(this);
        fjadwal.setVisible(true);
}//GEN-LAST:event_PenjadwalanActionPerformed

    private void BLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoginActionPerformed
        // TODO add your handling code here:
        String sql;
        String username=txtUsername.getText();
        String password=new String(txtPassword.getPassword());
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn=DriverManager.getConnection("jdbc:odbc:akademik_smppgri2bdg");
            sql ="Select * from user WHERE username ='" +txtUsername.getText() + "'";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs =st.executeQuery();
            if (rs.next()) {
                String pass = rs.getString("password");
                String jabatan = rs.getString("jabatan");
                if (password.equals(pass) && jabatan.equals(CBJabatanUser.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(this, "Login Berhasil..");
                    if(jabatan.equals("Guru")){
                        
                        File.setVisible(true);
                        DataInput.setVisible(false);
                        Akademik.setVisible(true);
                            Registrasi.setVisible(false);
                            PembagianKelas.setVisible(false);
                            PembagianWaliKelas.setVisible(false);
                            Penjadwalan.setVisible(false);
                            Penilaian.setVisible(true);
                        Laporan.setVisible(true);
                            LaporanSiswa.setVisible(false);
                            LaporanGuru.setVisible(true);
                            LaporanMatpel.setVisible(false);
                            LaporanKelas.setVisible(true);
                            LaporanWaliKelas.setVisible(true);
                            LaporanJadwal.setVisible(true);
                            LaporanNilai.setVisible(true);

                        PanelLogin.setVisible(false);
                      } else if(jabatan.equals("Kesiswaan")) {
                        File.setVisible(true);
                        DataInput.setVisible(true);
                            InputGuru.setVisible(true);
                            InputMatpel.setVisible(true);
                            InputUser.setVisible(false);
                        Akademik.setVisible(true);
                            Registrasi.setVisible(true);
                            PembagianKelas.setVisible(true);
                            PembagianWaliKelas.setVisible(true);
                            Penjadwalan.setVisible(true);
                            Penilaian.setVisible(false);
                        Laporan.setVisible(true);
                            LaporanSiswa.setVisible(true);
                            LaporanGuru.setVisible(true);
                            LaporanMatpel.setVisible(true);
                            LaporanKelas.setVisible(true);
                            LaporanWaliKelas.setVisible(true);
                            LaporanJadwal.setVisible(true);
                            LaporanNilai.setVisible(false);

                        PanelLogin.setVisible(false);
                      } else if(jabatan.equals("Kepala Sekolah")) {
                        File.setVisible(true);
                        DataInput.setVisible(false);
                        Akademik.setVisible(false);
                        Laporan.setVisible(true);
                            LaporanSiswa.setVisible(true);
                            LaporanGuru.setVisible(true);
                            LaporanMatpel.setVisible(true);
                            LaporanKelas.setVisible(true);
                            LaporanWaliKelas.setVisible(true);
                            LaporanJadwal.setVisible(false);
                            LaporanNilai.setVisible(true);

                        PanelLogin.setVisible(false);
                      } else if(jabatan.equals("Admin")){
                        File.setVisible(true);

                        DataInput.setVisible(true);
                            InputGuru.setVisible(false);
                            InputMatpel.setVisible(false);
                            InputUser.setVisible(true);
                        Akademik.setVisible(false);
                        Laporan.setVisible(false);

                        PanelLogin.setVisible(false);
                    } else{
                        File.setVisible(true);
                        DataInput.setVisible(true);
                        Akademik.setVisible(true);
                        Laporan.setVisible(true);

                        PanelLogin.setVisible(false);
                    }
                    config c = new config();
                    c.put(rs.getString("nama_guru"),rs.getString("kode_mata_pelajaran") ,rs.getString("nama_mata_pelajaran"));
                } else
                    JOptionPane.showMessageDialog(this, "Ada Kesalahan pada Jabatan/Username/Password");
            } else
                JOptionPane.showMessageDialog(this, "Ada Kesalahan pada Jabatan/Username/Password");
        } catch (Exception e) {JOptionPane.showMessageDialog(this,e.getMessage());
        }


    }//GEN-LAST:event_BLoginActionPerformed

    private void BKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
}//GEN-LAST:event_BKeluarActionPerformed

    private void MenuDataInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDataInputActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_MenuDataInputActionPerformed

    private void InputMatpelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputMatpelActionPerformed
        // TODO add your handling code here:
        FInputDataMataPelajaran fmatpel=new FInputDataMataPelajaran();
        fmatpel.setLocationRelativeTo(this);
        fmatpel.setVisible(true);
}//GEN-LAST:event_InputMatpelActionPerformed

    private void InputUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUserActionPerformed
        // TODO add your handling code here:
        FInputDataUser fuser=new FInputDataUser();
        fuser.setLocationRelativeTo(this);
        fuser.setVisible(true);
}//GEN-LAST:event_InputUserActionPerformed

    private void PembagianWaliKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembagianWaliKelasActionPerformed
        // TODO add your handling code here:
        FPembagianWaliKelas fwkelas=new FPembagianWaliKelas();
        fwkelas.setLocationRelativeTo(this);
        fwkelas.setVisible(true);
}//GEN-LAST:event_PembagianWaliKelasActionPerformed

    private void PenilaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenilaianActionPerformed
        // TODO add your handling code here:
        FPenilaian fnilai=new FPenilaian();
        fnilai.setLocationRelativeTo(this);
        fnilai.setVisible(true);
    }//GEN-LAST:event_PenilaianActionPerformed

    private void LaporanSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanSiswaActionPerformed
        // TODO add your handling code here:
           String reportSource;
           String reportDest;

           Map<String,Object> param=new HashMap<String,Object>();

           try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:akademik_smppgri2bdg";
            conn=DriverManager.getConnection(url, "root","");

            reportSource=System.getProperty("user.dir")+"/Laporan/Laporan Siswa.jrxml";
            reportDest=System.getProperty("user.dir")+"/Laporan/Laporan Siswa.html";

            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,param,conn);

            JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

            JasperViewer.viewReport(jasperPrint,false);
           }catch(Exception e){
             System.out.println(e);
            }
    }//GEN-LAST:event_LaporanSiswaActionPerformed

    private void LaporanGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanGuruActionPerformed
        // TODO add your handling code here:
        String reportSource;
           String reportDest;

           Map<String,Object> param=new HashMap<String,Object>();

           try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:akademik_smppgri2bdg";
            conn=DriverManager.getConnection(url, "root","");

            reportSource=System.getProperty("user.dir")+"/Laporan/Laporan Guru.jrxml";
            reportDest=System.getProperty("user.dir")+"/Laporan/Laporan Guru.html";

            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,param,conn);

            JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

            JasperViewer.viewReport(jasperPrint,false);
           }catch(Exception e){
             System.out.println(e);
            }
    }//GEN-LAST:event_LaporanGuruActionPerformed

    private void LaporanMatpelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanMatpelActionPerformed
        // TODO add your handling code here:
        String reportSource;
           String reportDest;

           Map<String,Object> param=new HashMap<String,Object>();

           try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:akademik_smppgri2bdg";
            conn=DriverManager.getConnection(url, "root","");

            reportSource=System.getProperty("user.dir")+"/Laporan/Laporan Mata Pelajaran.jrxml";
            reportDest=System.getProperty("user.dir")+"/Laporan/Laporan Mata Pelajaran.html";

            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,param,conn);

            JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

            JasperViewer.viewReport(jasperPrint,false);
           }catch(Exception e){
             System.out.println(e);
            }
    }//GEN-LAST:event_LaporanMatpelActionPerformed

    private void LaporanKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanKelasActionPerformed
        // TODO add your handling code here:
         String reportSource;
           String reportDest;

           Map<String,Object> param=new HashMap<String,Object>();

           try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:akademik_smppgri2bdg";
            conn=DriverManager.getConnection(url, "root","");

            reportSource=System.getProperty("user.dir")+"/Laporan/Laporan Kelas.jrxml";
            reportDest=System.getProperty("user.dir")+"/Laporan/Laporan Kelas.html";

            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,param,conn);

            JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

            JasperViewer.viewReport(jasperPrint,false);
           }catch(Exception e){
             System.out.println(e);
            }
    }//GEN-LAST:event_LaporanKelasActionPerformed

    private void LaporanWaliKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanWaliKelasActionPerformed
        // TODO add your handling code here:
         String reportSource;
           String reportDest;

           Map<String,Object> param=new HashMap<String,Object>();

           try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:akademik_smppgri2bdg";
            conn=DriverManager.getConnection(url, "root","");

            reportSource=System.getProperty("user.dir")+"/Laporan/Laporan Wali Kelas.jrxml";
            reportDest=System.getProperty("user.dir")+"/Laporan/Laporan Wali Kelas.html";

            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,param,conn);

            JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

            JasperViewer.viewReport(jasperPrint,false);
           }catch(Exception e){
             System.out.println(e);
            }
    }//GEN-LAST:event_LaporanWaliKelasActionPerformed

    private void LaporanNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanNilaiActionPerformed
        // TODO add your handling code here:
         String reportSource;
           String reportDest;

           Map<String,Object> param=new HashMap<String,Object>();

           try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:akademik_smppgri2bdg";
            conn=DriverManager.getConnection(url, "root","");

            reportSource=System.getProperty("user.dir")+"/Laporan/Laporan Nilai.jrxml";
            reportDest=System.getProperty("user.dir")+"/Laporan/Laporan Nilai.html";

            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,param,conn);

            JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

            JasperViewer.viewReport(jasperPrint,false);
           }catch(Exception e){
             System.out.println(e);
            }
    }//GEN-LAST:event_LaporanNilaiActionPerformed

    private void RegistrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrasiActionPerformed
        // TODO add your handling code here:
        FPenerimaanSiswaBaru fsiswa=new FPenerimaanSiswaBaru();
        fsiswa.setLocationRelativeTo(this);
        fsiswa.setVisible(true);
    }//GEN-LAST:event_RegistrasiActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void LaporanJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanJadwalActionPerformed
        // TODO add your handling code here:
String reportSource;
           String reportDest;

           Map<String,Object> param=new HashMap<String,Object>();

           try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:akademik_smppgri2bdg";
            conn=DriverManager.getConnection(url, "root","");

            reportSource=System.getProperty("user.dir")+"/Laporan/Laporan Jadwal.jrxml";
            reportDest=System.getProperty("user.dir")+"/Laporan/Laporan Jadwal.html";

            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,param,conn);

            JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

            JasperViewer.viewReport(jasperPrint,false);
           }catch(Exception e){
             System.out.println(e);
            }
    }//GEN-LAST:event_LaporanJadwalActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FUtama futama = new FUtama();
                futama.setLocation(455, 0);
                futama.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Akademik;
    private javax.swing.JButton BKeluar;
    private javax.swing.JButton BLogin;
    private javax.swing.JComboBox CBJabatanUser;
    private javax.swing.JMenu DataInput;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem InputGuru;
    private javax.swing.JMenuItem InputMatpel;
    private javax.swing.JMenuItem InputUser;
    private javax.swing.JMenuItem Keluar;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenuItem LaporanGuru;
    private javax.swing.JMenuItem LaporanJadwal;
    private javax.swing.JMenuItem LaporanKelas;
    private javax.swing.JMenuItem LaporanMatpel;
    private javax.swing.JMenuItem LaporanNilai;
    private javax.swing.JMenuItem LaporanSiswa;
    private javax.swing.JMenuItem LaporanWaliKelas;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenuBar MenuUtama;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JMenuItem PembagianKelas;
    private javax.swing.JMenuItem PembagianWaliKelas;
    private javax.swing.JMenuItem Penilaian;
    private javax.swing.JMenuItem Penjadwalan;
    private javax.swing.JMenuItem Registrasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}