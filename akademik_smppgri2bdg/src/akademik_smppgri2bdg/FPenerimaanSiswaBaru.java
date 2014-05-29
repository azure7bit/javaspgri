package akademik_smppgri2bdg;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class FPenerimaanSiswaBaru extends javax.swing.JFrame {
    public DefaultTableModel tabModel;
    Connection conn;
    
    public FPenerimaanSiswaBaru() {
        initComponents();
        setJTable();
        NIS();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDataSiswa = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        txtNamaSiswa = new javax.swing.JTextField();
        txtTempatLahirSiswa = new javax.swing.JTextField();
        CBJKSiswa = new javax.swing.JComboBox();
        CBAgamaSiswa = new javax.swing.JComboBox();
        txtNoTelpSiswa = new javax.swing.JTextField();
        txtAnakKe = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtSaudara = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtBeratSiswa = new javax.swing.JTextField();
        txtTinggiSiswa = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtAlamatSiswa = new javax.swing.JTextField();
        dateLahirSiswa = new com.toedter.calendar.JDateChooser();
        CBKewarganegaraanSiswa = new javax.swing.JComboBox();
        CBGolonganDarahSiswa = new javax.swing.JComboBox();
        PanelWaliSiswa = new javax.swing.JPanel();
        CheckWali = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtNamaWali = new javax.swing.JTextField();
        CBPendidikanWali = new javax.swing.JComboBox();
        txtPekerjaanWali = new javax.swing.JTextField();
        txtHubunganWali = new javax.swing.JTextField();
        txtNoTelpWali = new javax.swing.JTextField();
        PanelTabelSiswa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TSiswa = new javax.swing.JTable();
        PanelPencarianSiswa = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        CBCariSiswa = new javax.swing.JComboBox();
        txtCariSiswa = new javax.swing.JTextField();
        BCariSiswa = new javax.swing.JButton();
        PanelButtonSiswa = new javax.swing.JPanel();
        BTambah = new javax.swing.JButton();
        BEdit = new javax.swing.JButton();
        BSimpan = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BBatal = new javax.swing.JButton();
        BCetakSiswa = new javax.swing.JButton();
        BKeluar = new javax.swing.JButton();
        PanelDataOrangTua = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNamaAyah = new javax.swing.JTextField();
        CBPendidikanAyah = new javax.swing.JComboBox();
        txtPekerjaanAyah = new javax.swing.JTextField();
        txtNamaIbu = new javax.swing.JTextField();
        txtPekerjaanIbu = new javax.swing.JTextField();
        CBPendidikanIbu = new javax.swing.JComboBox();
        txtNoTelpOrtu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("From Penerimaan Siswa Baru");

        PanelDataSiswa.setBackground(new java.awt.Color(204, 204, 255));
        PanelDataSiswa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATA SISWA :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        PanelDataSiswa.setEnabled(false);

        jLabel3.setText("NIS");

        jLabel4.setText("Nama");

        jLabel10.setText("Tempat, Tanggal Lahir");

        jLabel11.setText("Jenis Kelamin");

        jLabel12.setText("Agama");

        jLabel13.setText("Kewarganegaraan");

        jLabel17.setText("No. Telp. Siswa");

        jLabel20.setText("Anak ke");

        jLabel21.setText("Berat Badan");

        jLabel22.setText("Tinggi Badan");

        jLabel23.setText("Golongan Darah");

        jLabel26.setText("Alamat");

        txtNIS.setEnabled(false);

        txtNamaSiswa.setEnabled(false);
        txtNamaSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaSiswaKeyTyped(evt);
            }
        });

        txtTempatLahirSiswa.setEnabled(false);
        txtTempatLahirSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTempatLahirSiswaKeyTyped(evt);
            }
        });

        CBJKSiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "Laki-Laki", "Perempuan" }));
        CBJKSiswa.setEnabled(false);

        CBAgamaSiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "Islam", "Kristen", "Hindu", "Budha", "Lainnya" }));
        CBAgamaSiswa.setEnabled(false);

        txtNoTelpSiswa.setEnabled(false);
        txtNoTelpSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoTelpSiswaKeyTyped(evt);
            }
        });

        txtAnakKe.setEnabled(false);
        txtAnakKe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnakKeKeyTyped(evt);
            }
        });

        jLabel27.setText("dari");

        txtSaudara.setEnabled(false);
        txtSaudara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaudaraKeyTyped(evt);
            }
        });

        jLabel30.setText("bersaudara");

        txtBeratSiswa.setEnabled(false);
        txtBeratSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBeratSiswaKeyTyped(evt);
            }
        });

        txtTinggiSiswa.setEnabled(false);
        txtTinggiSiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTinggiSiswaKeyTyped(evt);
            }
        });

        jLabel35.setText("kilogram");

        jLabel36.setText("centimeter");

        txtAlamatSiswa.setEnabled(false);

        dateLahirSiswa.setDateFormatString("yyyy-MM-dd");
        dateLahirSiswa.setEnabled(false);

        CBKewarganegaraanSiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "WNI", "WNA" }));
        CBKewarganegaraanSiswa.setEnabled(false);

        CBGolonganDarahSiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "A", "B", "AB", "O" }));
        CBGolonganDarahSiswa.setEnabled(false);

        javax.swing.GroupLayout PanelDataSiswaLayout = new javax.swing.GroupLayout(PanelDataSiswa);
        PanelDataSiswa.setLayout(PanelDataSiswaLayout);
        PanelDataSiswaLayout.setHorizontalGroup(
            PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoTelpSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(txtNamaSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(txtNIS, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGroup(PanelDataSiswaLayout.createSequentialGroup()
                        .addComponent(txtAnakKe, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSaudara, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30))
                    .addGroup(PanelDataSiswaLayout.createSequentialGroup()
                        .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CBAgamaSiswa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTempatLahirSiswa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBJKSiswa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBKewarganegaraanSiswa, 0, 79, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateLahirSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addComponent(txtAlamatSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addGroup(PanelDataSiswaLayout.createSequentialGroup()
                        .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CBGolonganDarahSiswa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTinggiSiswa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBeratSiswa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35))))
                .addContainerGap())
        );
        PanelDataSiswaLayout.setVerticalGroup(
            PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataSiswaLayout.createSequentialGroup()
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDataSiswaLayout.createSequentialGroup()
                        .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTempatLahirSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(CBJKSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(CBAgamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dateLahirSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CBKewarganegaraanSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtNoTelpSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtAnakKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txtSaudara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtBeratSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtTinggiSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(CBGolonganDarahSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtAlamatSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        PanelWaliSiswa.setBackground(new java.awt.Color(204, 204, 255));
        PanelWaliSiswa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATA WALI SISWA :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        CheckWali.setText("Wali");
        CheckWali.setEnabled(false);
        CheckWali.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckWaliStateChanged(evt);
            }
        });

        jLabel16.setText("Nama Wali");

        jLabel18.setText("Pendidikan Wali");

        jLabel19.setText("Pekerjaan Wali");

        jLabel24.setText("Hubungan Wali");

        jLabel25.setText("No. Telp. Wali");

        txtNamaWali.setEnabled(false);
        txtNamaWali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaWaliKeyTyped(evt);
            }
        });

        CBPendidikanWali.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "SD", "SMP", "SMA", "D1", "D2", "D3", "S1", "S2", "S3" }));
        CBPendidikanWali.setEnabled(false);

        txtPekerjaanWali.setEnabled(false);
        txtPekerjaanWali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPekerjaanWaliKeyTyped(evt);
            }
        });

        txtHubunganWali.setEnabled(false);
        txtHubunganWali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHubunganWaliKeyTyped(evt);
            }
        });

        txtNoTelpWali.setEnabled(false);
        txtNoTelpWali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoTelpWaliKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelWaliSiswaLayout = new javax.swing.GroupLayout(PanelWaliSiswa);
        PanelWaliSiswa.setLayout(PanelWaliSiswaLayout);
        PanelWaliSiswaLayout.setHorizontalGroup(
            PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWaliSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWaliSiswaLayout.createSequentialGroup()
                        .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(CheckWali)
                            .addComponent(jLabel18))
                        .addGap(20, 20, 20)
                        .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBPendidikanWali, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaWali, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWaliSiswaLayout.createSequentialGroup()
                        .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(22, 22, 22)
                        .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPekerjaanWali, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtHubunganWali, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtNoTelpWali, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelWaliSiswaLayout.setVerticalGroup(
            PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelWaliSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CheckWali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNamaWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(CBPendidikanWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtPekerjaanWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtHubunganWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelWaliSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtNoTelpWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTabelSiswa.setBackground(new java.awt.Color(204, 204, 255));
        PanelTabelSiswa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATA TABEL SISWA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        TSiswa.setBackground(new java.awt.Color(255, 255, 204));
        TSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TSiswa);

        javax.swing.GroupLayout PanelTabelSiswaLayout = new javax.swing.GroupLayout(PanelTabelSiswa);
        PanelTabelSiswa.setLayout(PanelTabelSiswaLayout);
        PanelTabelSiswaLayout.setHorizontalGroup(
            PanelTabelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTabelSiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTabelSiswaLayout.setVerticalGroup(
            PanelTabelSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTabelSiswaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelPencarianSiswa.setBackground(new java.awt.Color(204, 204, 255));
        PanelPencarianSiswa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel28.setText("Cari Berdasarkan");

        CBCariSiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NIS", "Nama Siswa" }));

        BCariSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/search.png"))); // NOI18N
        BCariSiswa.setText("Cari");
        BCariSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariSiswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPencarianSiswaLayout = new javax.swing.GroupLayout(PanelPencarianSiswa);
        PanelPencarianSiswa.setLayout(PanelPencarianSiswaLayout);
        PanelPencarianSiswaLayout.setHorizontalGroup(
            PanelPencarianSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPencarianSiswaLayout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(6, 6, 6)
                .addComponent(CBCariSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCariSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BCariSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelPencarianSiswaLayout.setVerticalGroup(
            PanelPencarianSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPencarianSiswaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelPencarianSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(CBCariSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCariSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCariSiswa))
                .addContainerGap())
        );

        PanelButtonSiswa.setBackground(new java.awt.Color(204, 204, 255));
        PanelButtonSiswa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelButtonSiswa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/add.png"))); // NOI18N
        BTambah.setText("Tambah");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });
        PanelButtonSiswa.add(BTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        BEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit.png"))); // NOI18N
        BEdit.setText("Edit");
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });
        PanelButtonSiswa.add(BEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, -1));

        BSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save.png"))); // NOI18N
        BSimpan.setText("Simpan");
        BSimpan.setEnabled(false);
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });
        PanelButtonSiswa.add(BSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 110, -1));

        BHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        BHapus.setText("Hapus");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });
        PanelButtonSiswa.add(BHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 110, -1));

        BBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cancel.png"))); // NOI18N
        BBatal.setText("Batal");
        BBatal.setEnabled(false);
        BBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBatalActionPerformed(evt);
            }
        });
        PanelButtonSiswa.add(BBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 110, -1));

        BCetakSiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/print.png"))); // NOI18N
        BCetakSiswa.setText("Cetak Data Siswa");
        BCetakSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCetakSiswaActionPerformed(evt);
            }
        });
        PanelButtonSiswa.add(BCetakSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 210, -1));

        BKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/close.png"))); // NOI18N
        BKeluar.setText("Keluar");
        BKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKeluarActionPerformed(evt);
            }
        });
        PanelButtonSiswa.add(BKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 110, -1));

        PanelDataOrangTua.setBackground(new java.awt.Color(204, 204, 255));
        PanelDataOrangTua.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATA ORANGTUA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setText("Nama Ayah");

        jLabel6.setText("Pendidikan Ayah");

        jLabel7.setText("Pekerjaan Ayah");

        jLabel8.setText("Nama Ibu");

        jLabel9.setText("Pendidikan Ibu");

        jLabel14.setText("Pekerjaan Ibu");

        jLabel15.setText("No. Telp. Ortu");

        txtNamaAyah.setEnabled(false);
        txtNamaAyah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaAyahKeyTyped(evt);
            }
        });

        CBPendidikanAyah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "SD", "SMP", "SMA", "D1", "D2", "D3", "S1", "S2", "S3" }));
        CBPendidikanAyah.setEnabled(false);

        txtPekerjaanAyah.setEnabled(false);
        txtPekerjaanAyah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPekerjaanAyahKeyTyped(evt);
            }
        });

        txtNamaIbu.setEnabled(false);
        txtNamaIbu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaIbuKeyTyped(evt);
            }
        });

        txtPekerjaanIbu.setEnabled(false);
        txtPekerjaanIbu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPekerjaanIbuKeyTyped(evt);
            }
        });

        CBPendidikanIbu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "SD", "SMP", "SMA", "D1", "D2", "D3", "S1", "S2", "S3" }));
        CBPendidikanIbu.setEnabled(false);

        txtNoTelpOrtu.setEnabled(false);
        txtNoTelpOrtu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoTelpOrtuKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelDataOrangTuaLayout = new javax.swing.GroupLayout(PanelDataOrangTua);
        PanelDataOrangTua.setLayout(PanelDataOrangTuaLayout);
        PanelDataOrangTuaLayout.setHorizontalGroup(
            PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataOrangTuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDataOrangTuaLayout.createSequentialGroup()
                        .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBPendidikanAyah, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaAyah, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                    .addGroup(PanelDataOrangTuaLayout.createSequentialGroup()
                        .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBPendidikanIbu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaIbu, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtPekerjaanAyah, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(PanelDataOrangTuaLayout.createSequentialGroup()
                        .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(25, 25, 25)
                        .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoTelpOrtu, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtPekerjaanIbu, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelDataOrangTuaLayout.setVerticalGroup(
            PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDataOrangTuaLayout.createSequentialGroup()
                .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNamaAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(CBPendidikanAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPekerjaanAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNamaIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CBPendidikanIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPekerjaanIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelDataOrangTuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNoTelpOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelButtonSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelDataSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelDataOrangTua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelWaliSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelTabelSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelPencarianSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelButtonSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(PanelTabelSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PanelPencarianSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(PanelDataOrangTua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PanelWaliSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PanelDataSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        // TODO add your handling code here:
        NIS();
        txtNIS.setEnabled(false);
        txtNamaSiswa.setEnabled(true);
        txtTempatLahirSiswa.setEnabled(true);
        dateLahirSiswa.setEnabled(true);
        CBJKSiswa.setEnabled(true);
        CBAgamaSiswa.setEnabled(true);
        CBKewarganegaraanSiswa.setEnabled(true);
        txtNoTelpSiswa.setEnabled(true);
        txtAnakKe.setEnabled(true);
        txtSaudara.setEnabled(true);
        txtBeratSiswa.setEnabled(true);
        txtTinggiSiswa.setEnabled(true);
        CBGolonganDarahSiswa.setEnabled(true);
        txtAlamatSiswa.setEnabled(true);

        txtNamaAyah.setEnabled(true);
        CBPendidikanAyah.setEnabled(true);
        txtPekerjaanAyah.setEnabled(true);
        txtNamaIbu.setEnabled(true);
        CBPendidikanIbu.setEnabled(true);
        txtPekerjaanIbu.setEnabled(true);
        txtNoTelpOrtu.setEnabled(true);

        CheckWali.setEnabled(true);

        txtNamaWali.setEnabled(false);
        CBPendidikanWali.setEnabled(false);
        txtPekerjaanWali.setEnabled(false);
        txtHubunganWali.setEnabled(false);
        txtNoTelpWali.setEnabled(false);

        BSimpan.setText("Simpan");

        BTambah.setEnabled(false);
        BSimpan.setEnabled(true);
        BEdit.setEnabled(false);
        BBatal.setEnabled(true);
        BHapus.setEnabled(false);
        BKeluar.setEnabled(false);

    }//GEN-LAST:event_BTambahActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        // TODO add your handling code here:
        txtNIS.setEnabled(false);
        txtNamaSiswa.setEnabled(true);
        txtTempatLahirSiswa.setEnabled(true);
        dateLahirSiswa.setEnabled(true);
        CBJKSiswa.setEnabled(true);
        CBAgamaSiswa.setEnabled(true);
        CBKewarganegaraanSiswa.setEnabled(true);
        txtNoTelpSiswa.setEnabled(true);
        txtAnakKe.setEnabled(true);
        txtSaudara.setEnabled(true);
        txtBeratSiswa.setEnabled(true);
        txtTinggiSiswa.setEnabled(true);
        CBGolonganDarahSiswa.setEnabled(true);
        txtAlamatSiswa.setEnabled(true);

        txtNamaAyah.setEnabled(true);
        CBPendidikanAyah.setEnabled(true);
        txtPekerjaanAyah.setEnabled(true);
        txtNamaIbu.setEnabled(true);
        CBPendidikanIbu.setEnabled(true);
        txtPekerjaanIbu.setEnabled(true);
        txtNoTelpOrtu.setEnabled(true);

        CheckWali.setEnabled(true);

        txtNamaWali.setEnabled(true);
        CBPendidikanWali.setEnabled(true);
        txtPekerjaanWali.setEnabled(true);
        txtHubunganWali.setEnabled(true);
        txtNoTelpWali.setEnabled(true);

        BSimpan.setText("Update");

        BTambah.setEnabled(false);
        BSimpan.setEnabled(true);
        BEdit.setEnabled(false);
        BBatal.setEnabled(true);
        BHapus.setEnabled(false);
        BKeluar.setEnabled(false);

        
        ambilData_dari_JTable();
    }//GEN-LAST:event_BEditActionPerformed

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        // TODO add your handling code here:
        if(txtNamaSiswa.getText().isEmpty() ||
           txtTempatLahirSiswa.getText().isEmpty() ||
           dateLahirSiswa.getDateFormatString().isEmpty() ||
           CBJKSiswa.getSelectedItem().equals("--Pilih--") ||
           CBAgamaSiswa.getSelectedItem().equals("--Pilih--") ||
           CBKewarganegaraanSiswa.getSelectedItem().equals("--Pilih--") ||
           txtNoTelpSiswa.getText().isEmpty() ||
           txtAnakKe.getText().isEmpty() ||
           txtSaudara.getText().isEmpty() ||
           txtBeratSiswa.getText().isEmpty() ||
           txtTinggiSiswa.getText().isEmpty() ||
           CBGolonganDarahSiswa.getSelectedItem().equals("--Pilih--") ||
           txtAlamatSiswa.getText().isEmpty() ||
           txtNamaAyah.getText().toString().isEmpty() ||
           CBPendidikanAyah.getSelectedItem().equals("--Pilih--") ||
           txtPekerjaanAyah.getText().isEmpty() ||
           txtNamaIbu.getText().toString().isEmpty() ||
           CBPendidikanIbu.getSelectedItem().equals("--Pilih--") ||
           txtPekerjaanIbu.getText().isEmpty() ||
           txtNoTelpOrtu.getText().isEmpty() )
           {
            JOptionPane.showMessageDialog(this,"Data Tidak Lengkap!!");

           } else
             if(BSimpan.getText().equalsIgnoreCase("Simpan"))
                simpanData();
             else
                rubahData();

        txtNIS.setText("");
        txtNamaSiswa.setText("");
        txtTempatLahirSiswa.setText("");
        dateLahirSiswa.setDateFormatString("");
        CBJKSiswa.setSelectedItem("--Pilih--");
        CBAgamaSiswa.setSelectedItem("--Pilih--");
        CBKewarganegaraanSiswa.setSelectedItem("--Pilih--");
        txtNoTelpSiswa.setText("");
        txtAnakKe.setText("");
        txtSaudara.setText("");
        txtBeratSiswa.setText("");
        txtTinggiSiswa.setText("");
        CBGolonganDarahSiswa.setSelectedItem("--Pilih--");
        txtAlamatSiswa.setText("");

        txtNamaAyah.setText("");
        CBPendidikanAyah.setSelectedItem("--Pilih--");
        txtPekerjaanAyah.setText("");
        txtNamaIbu.setText("");
        CBPendidikanIbu.setSelectedItem("--Pilih--");
        txtPekerjaanIbu.setText("");
        txtNoTelpOrtu.setText("");

        CheckWali.setSelected(false);

        txtNamaWali.setText("");
        CBPendidikanWali.setSelectedItem("");
        txtPekerjaanWali.setText("");
        txtHubunganWali.setText("");
        txtNoTelpWali.setText("");

        txtNIS.setEnabled(false);
        txtNamaSiswa.setEnabled(true);
        txtTempatLahirSiswa.setEnabled(true);
        dateLahirSiswa.setEnabled(true);
        CBJKSiswa.setEnabled(true);
        CBAgamaSiswa.setEnabled(true);
        CBKewarganegaraanSiswa.setEnabled(true);
        txtNoTelpSiswa.setEnabled(true);
        txtAnakKe.setEnabled(true);
        txtSaudara.setEnabled(true);
        txtBeratSiswa.setEnabled(true);
        txtTinggiSiswa.setEnabled(true);
        CBGolonganDarahSiswa.setEnabled(true);
        txtAlamatSiswa.setEnabled(true);

        txtNamaAyah.setEnabled(true);
        CBPendidikanAyah.setEnabled(true);
        txtPekerjaanAyah.setEnabled(true);
        txtNamaIbu.setEnabled(true);
        CBPendidikanIbu.setEnabled(true);
        txtPekerjaanIbu.setEnabled(true);
        txtNoTelpOrtu.setEnabled(true);

        CheckWali.setEnabled(true);

        txtNamaWali.setEnabled(true);
        CBPendidikanWali.setEnabled(true);
        txtPekerjaanWali.setEnabled(true);
        txtHubunganWali.setEnabled(true);
        txtNoTelpWali.setEnabled(true);

        txtNIS.setEnabled(false);
        txtNamaSiswa.setEnabled(false);
        txtTempatLahirSiswa.setEnabled(false);
        dateLahirSiswa.setEnabled(false);
        CBJKSiswa.setEnabled(false);
        CBAgamaSiswa.setEnabled(false);
        CBKewarganegaraanSiswa.setEnabled(false);
        txtNoTelpSiswa.setEnabled(false);
        txtAnakKe.setEnabled(false);
        txtSaudara.setEnabled(false);
        txtBeratSiswa.setEnabled(false);
        txtTinggiSiswa.setEnabled(false);
        CBGolonganDarahSiswa.setEnabled(false);
        txtAlamatSiswa.setEnabled(false);

        txtNamaAyah.setEnabled(false);
        CBPendidikanAyah.setEnabled(false);
        txtPekerjaanAyah.setEnabled(false);
        txtNamaIbu.setEnabled(false);
        CBPendidikanIbu.setEnabled(false);
        txtPekerjaanIbu.setEnabled(false);
        txtNoTelpOrtu.setEnabled(false);

        CheckWali.setSelected(false);

        txtNamaWali.setEnabled(false);
        CBPendidikanWali.setEnabled(false);
        txtPekerjaanWali.setEnabled(false);
        txtHubunganWali.setEnabled(false);
        txtNoTelpWali.setEnabled(false);

        BTambah.setEnabled(true);
        BSimpan.setEnabled(false);
        BEdit.setEnabled(true);
        BBatal.setEnabled(false);
        BHapus.setEnabled(true);
        BKeluar.setEnabled(true);
        
    }//GEN-LAST:event_BSimpanActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        // TODO add your handling code here:
        hapus_Data();
}//GEN-LAST:event_BHapusActionPerformed

    private void BBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBatalActionPerformed
        // TODO add your handling code here:
        txtNIS.setText("");
        txtNamaSiswa.setText("");
        txtTempatLahirSiswa.setText("");
        dateLahirSiswa.setDateFormatString("");
        CBJKSiswa.setSelectedItem("--Pilih--");
        CBAgamaSiswa.setSelectedItem("--Pilih--");
        CBKewarganegaraanSiswa.setSelectedItem("--Pilih--");
        txtNoTelpSiswa.setText("");
        txtAnakKe.setText("");
        txtSaudara.setText("");
        txtBeratSiswa.setText("");
        txtTinggiSiswa.setText("");
        CBGolonganDarahSiswa.setSelectedItem("--Pilih--");
        txtAlamatSiswa.setText("");

        txtNamaAyah.setText("");
        CBPendidikanAyah.setSelectedItem("--Pilih--");
        txtPekerjaanAyah.setText("");
        txtNamaIbu.setText("");
        CBPendidikanIbu.setSelectedItem("--Pilih--");
        txtPekerjaanIbu.setText("");
        txtNoTelpOrtu.setText("");

        CheckWali.setSelected(false);

        txtNamaWali.setText("");
        CBPendidikanWali.setSelectedItem("");
        txtPekerjaanWali.setText("");
        txtHubunganWali.setText("");
        txtNoTelpWali.setText("");

        txtNIS.setEnabled(false);
        txtNamaSiswa.setEnabled(false);
        txtTempatLahirSiswa.setEnabled(false);
        dateLahirSiswa.setEnabled(false);
        CBJKSiswa.setEnabled(false);
        CBAgamaSiswa.setEnabled(false);
        CBKewarganegaraanSiswa.setEnabled(false);
        txtNoTelpSiswa.setEnabled(false);
        txtAnakKe.setEnabled(false);
        txtSaudara.setEnabled(false);
        txtBeratSiswa.setEnabled(false);
        txtTinggiSiswa.setEnabled(false);
        CBGolonganDarahSiswa.setEnabled(false);
        txtAlamatSiswa.setEnabled(false);

        txtNamaAyah.setEnabled(false);
        CBPendidikanAyah.setEnabled(false);
        txtPekerjaanAyah.setEnabled(false);
        txtNamaIbu.setEnabled(false);
        CBPendidikanIbu.setEnabled(false);
        txtPekerjaanIbu.setEnabled(false);
        txtNoTelpOrtu.setEnabled(false);

        CheckWali.setEnabled(false);

        txtNamaWali.setEnabled(false);
        CBPendidikanWali.setEnabled(false);
        txtPekerjaanWali.setEnabled(false);
        txtHubunganWali.setEnabled(false);
        txtNoTelpWali.setEnabled(false);

        BTambah.setEnabled(true);
        BSimpan.setEnabled(false);
        BEdit.setEnabled(true);
        BBatal.setEnabled(false);
        BHapus.setEnabled(true);
        BKeluar.setEnabled(true);
    }//GEN-LAST:event_BBatalActionPerformed

    private void BKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
}//GEN-LAST:event_BKeluarActionPerformed

    private void CheckWaliStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckWaliStateChanged
        // TODO add your handling code here:
        if (CheckWali.isSelected()){
            txtNamaWali.setEnabled(true);
            CBPendidikanWali.setEnabled(true);
            txtPekerjaanWali.setEnabled(true);
            txtHubunganWali.setEnabled(true);
            txtNoTelpWali.setEnabled(true);
        } else {
            txtNamaWali.setEnabled(false);
            txtNamaWali.setText("");
            CBPendidikanWali.setEnabled(false);
            CBPendidikanWali.setSelectedIndex(0);
            txtPekerjaanWali.setEnabled(false);
            txtPekerjaanWali.setText("");
            txtHubunganWali.setEnabled(false);
            txtHubunganWali.setText("");
            txtNoTelpWali.setEnabled(false);
            txtNoTelpWali.setText("");
        }
    }//GEN-LAST:event_CheckWaliStateChanged

    private void txtNamaSiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaSiswaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtNamaSiswa.getText().length() < 50
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNamaSiswaKeyTyped

    private void txtTempatLahirSiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempatLahirSiswaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtTempatLahirSiswa.getText().length() < 25
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTempatLahirSiswaKeyTyped

    private void txtNoTelpSiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelpSiswaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && txtNoTelpSiswa.getText().length() < 15
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNoTelpSiswaKeyTyped

    private void txtAnakKeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnakKeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && txtAnakKe.getText().length() < 2
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAnakKeKeyTyped

    private void txtSaudaraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaudaraKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && txtSaudara.getText().length() < 2
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSaudaraKeyTyped

    private void txtBeratSiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBeratSiswaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && txtBeratSiswa.getText().length() < 3
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtBeratSiswaKeyTyped

    private void txtTinggiSiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTinggiSiswaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && txtTinggiSiswa.getText().length() < 3
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTinggiSiswaKeyTyped

    private void txtNamaAyahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaAyahKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtNamaAyah.getText().length() < 50
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNamaAyahKeyTyped

    private void txtNamaIbuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaIbuKeyTyped
        // TODO add your handling code here:
       char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtNamaIbu.getText().length() < 50
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNamaIbuKeyTyped

    private void txtPekerjaanAyahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPekerjaanAyahKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtPekerjaanAyah.getText().length() < 30
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPekerjaanAyahKeyTyped

    private void txtPekerjaanIbuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPekerjaanIbuKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtPekerjaanIbu.getText().length() < 30
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPekerjaanIbuKeyTyped

    private void txtNoTelpOrtuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelpOrtuKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && txtNoTelpOrtu.getText().length() < 15
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNoTelpOrtuKeyTyped

    private void txtNamaWaliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaWaliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtNamaWali.getText().length() < 50
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNamaWaliKeyTyped

    private void txtPekerjaanWaliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPekerjaanWaliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtPekerjaanWali.getText().length() < 30
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPekerjaanWaliKeyTyped

    private void txtHubunganWaliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHubunganWaliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9') && txtHubunganWali.getText().length() < 30
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtHubunganWaliKeyTyped

    private void txtNoTelpWaliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoTelpWaliKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') && txtNoTelpWali.getText().length() < 15
            || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNoTelpWaliKeyTyped

    private void BCariSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariSiswaActionPerformed
        // TODO add your handling code here:
        String sql;
        int pilih = CBCariSiswa.getSelectedIndex();
        String cari = txtCariSiswa.getText();
    try {
        conn.close();
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:akademik_smppgri2bdg");
        if(pilih==0)
        sql ="Select * from siswa WHERE nis ='" +txtCariSiswa.getText() + "'";
        else
        sql ="Select * from siswa WHERE nama_siswa Like '%" +txtCariSiswa.getText() + "%'";

        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs =st.executeQuery();

        hapusIsiJTable();
        int no=0;
        while (rs.next()) {
            no++;
             String nis = rs.getString("nis");
             String nama_siswa = rs.getString("nama_siswa");
             String tempat_lahir_siswa = rs.getString("tempat_lahir_siswa");
             String tanggal_lahir_siswa = rs.getString("tanggal_lahir_siswa");
             String jk_siswa = rs.getString("jk_siswa");
             String agama_siswa = rs.getString("agama_siswa");
             String kewarganegaraan_siswa = rs.getString("kewarganegaraan_siswa");
             String no_telp_siswa = rs.getString("no_telp_siswa");
             String anak_ke = rs.getString("anak_ke");
             String saudara = rs.getString("saudara");
             String berat_siswa = rs.getString("berat_siswa");
             String tinggi_siswa = rs.getString("tinggi_siswa");
             String golongan_darah_siswa = rs.getString("golongan_darah_siswa");
             String alamat_siswa = rs.getString("alamat_siswa");

             String nama_ayah = rs.getString("nama_ayah");
             String pendidikan_ayah = rs.getString("pendidikan_ayah");
             String pekerjaan_ayah = rs.getString("pekerjaan_ayah");
             String nama_ibu = rs.getString("nama_ibu");
             String pendidikan_ibu = rs.getString("pendidikan_ibu");
             String pekerjaan_ibu = rs.getString("pekerjaan_ibu");
             String no_telp_ortu = rs.getString("no_telp_ortu");

             String nama_wali=rs.getString("nama_wali");
             String pendidikan_wali=rs.getString("pendidikan_wali");
             String pekerjaan_wali=rs.getString("pekerjaan_wali");
             String hubungan_wali=rs.getString("hubungan_wali");
             String no_telp_wali=rs.getString("no_telp_wali");
             Object [] data = {no,nis,nama_siswa,tempat_lahir_siswa,tanggal_lahir_siswa,
                               jk_siswa,agama_siswa,kewarganegaraan_siswa,no_telp_siswa,anak_ke,
                               saudara,berat_siswa,tinggi_siswa,golongan_darah_siswa,alamat_siswa,
                               nama_ayah,pendidikan_ayah,pekerjaan_ayah,nama_ibu,pendidikan_ibu,
                               pekerjaan_ibu,no_telp_ortu,nama_wali,pendidikan_wali,pekerjaan_wali,
                               hubungan_wali,no_telp_wali};
             tabModel.addRow(data);
        }

         if(tabModel.getRowCount()>0)
           JOptionPane.showMessageDialog(this,"Data Ditemukan ");
        else
            JOptionPane.showMessageDialog(this,"Data Tidak Ditemukan.. ");

      }
      catch (ClassNotFoundException se) {}
      catch (SQLException se) {}

    }//GEN-LAST:event_BCariSiswaActionPerformed

    private void BCetakSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCetakSiswaActionPerformed
        // TODO add your handling code here:
       int row=TSiswa.getSelectedRow();
       String nis = TSiswa.getValueAt(row, 1).toString();


           String reportSource;
           String reportDest;

           Map<String,Object> param=new HashMap<String,Object>();

           try{
               param.put("nis", nis);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:akademik_smppgri2bdg";
            conn=DriverManager.getConnection(url, "root","");

            reportSource=System.getProperty("user.dir")+"/Laporan/Laporan Data Siswa.jrxml";
            reportDest=System.getProperty("user.dir")+"/Laporan/Laporan Data Siswa.html";

            JasperReport jasperReport=JasperCompileManager.compileReport(reportSource);

            JasperPrint jasperPrint=JasperFillManager.fillReport(jasperReport,param,conn);

            JasperExportManager.exportReportToHtmlFile(jasperPrint,reportDest);

            JasperViewer.viewReport(jasperPrint,false);
           }catch(Exception e){
             System.out.println(e);
            }
    }//GEN-LAST:event_BCetakSiswaActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPenerimaanSiswaBaru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBatal;
    private javax.swing.JButton BCariSiswa;
    private javax.swing.JButton BCetakSiswa;
    private javax.swing.JButton BEdit;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BKeluar;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JComboBox CBAgamaSiswa;
    private javax.swing.JComboBox CBCariSiswa;
    private javax.swing.JComboBox CBGolonganDarahSiswa;
    private javax.swing.JComboBox CBJKSiswa;
    private javax.swing.JComboBox CBKewarganegaraanSiswa;
    private javax.swing.JComboBox CBPendidikanAyah;
    private javax.swing.JComboBox CBPendidikanIbu;
    private javax.swing.JComboBox CBPendidikanWali;
    private javax.swing.JCheckBox CheckWali;
    private javax.swing.JPanel PanelButtonSiswa;
    private javax.swing.JPanel PanelDataOrangTua;
    private javax.swing.JPanel PanelDataSiswa;
    private javax.swing.JPanel PanelPencarianSiswa;
    private javax.swing.JPanel PanelTabelSiswa;
    private javax.swing.JPanel PanelWaliSiswa;
    private javax.swing.JTable TSiswa;
    private com.toedter.calendar.JDateChooser dateLahirSiswa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlamatSiswa;
    private javax.swing.JTextField txtAnakKe;
    private javax.swing.JTextField txtBeratSiswa;
    private javax.swing.JTextField txtCariSiswa;
    private javax.swing.JTextField txtHubunganWali;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNamaAyah;
    private javax.swing.JTextField txtNamaIbu;
    private javax.swing.JTextField txtNamaSiswa;
    private javax.swing.JTextField txtNamaWali;
    private javax.swing.JTextField txtNoTelpOrtu;
    private javax.swing.JTextField txtNoTelpSiswa;
    private javax.swing.JTextField txtNoTelpWali;
    private javax.swing.JTextField txtPekerjaanAyah;
    private javax.swing.JTextField txtPekerjaanIbu;
    private javax.swing.JTextField txtPekerjaanWali;
    private javax.swing.JTextField txtSaudara;
    private javax.swing.JTextField txtTempatLahirSiswa;
    private javax.swing.JTextField txtTinggiSiswa;
    // End of variables declaration//GEN-END:variables

    private void getData(){

  try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        
        conn=DriverManager.getConnection("jdbc:odbc:akademik_smppgri2bdg");
        
        String sql="Select * from siswa order by nis";
        PreparedStatement st=conn.prepareStatement(sql);
        
        ResultSet rs=st.executeQuery();

        String nis,nama_siswa,tempat_lahir_siswa,tanggal_lahir_siswa,
               jk_siswa,agama_siswa,kewarganegaraan_siswa,no_telp_siswa,anak_ke,
               saudara,berat_siswa,tinggi_siswa,golongan_darah_siswa,alamat_siswa,
               nama_ayah,pendidikan_ayah,pekerjaan_ayah,nama_ibu,pendidikan_ibu,
               pekerjaan_ibu,no_telp_ortu,nama_wali,pendidikan_wali,pekerjaan_wali,
               hubungan_wali,no_telp_wali;
        int no=0;
        while(rs.next()){
         no=no+1;
         nis=rs.getString("nis");
         nama_siswa=rs.getString("nama_siswa");
         tempat_lahir_siswa=rs.getString("tempat_lahir_siswa");
         tanggal_lahir_siswa=rs.getString("tanggal_lahir_siswa");
         jk_siswa=rs.getString("jk_siswa");
         agama_siswa=rs.getString("agama_siswa");
         kewarganegaraan_siswa=rs.getString("kewarganegaraan_siswa");
         no_telp_siswa=rs.getString("no_telp_siswa");
         anak_ke=rs.getString("anak_ke");
         saudara=rs.getString("saudara");
         berat_siswa=rs.getString("berat_siswa");
         tinggi_siswa=rs.getString("tinggi_siswa");
         golongan_darah_siswa=rs.getString("golongan_darah_siswa");
         alamat_siswa=rs.getString("alamat_siswa");

         nama_ayah=rs.getString("nama_ayah");
         pendidikan_ayah=rs.getString("pendidikan_ayah");
         pekerjaan_ayah=rs.getString("pekerjaan_ayah");
         nama_ibu=rs.getString("nama_ibu");
         pendidikan_ibu=rs.getString("pendidikan_ibu");
         pekerjaan_ibu=rs.getString("pekerjaan_ibu");
         no_telp_ortu=rs.getString("no_telp_ortu");

         nama_wali=rs.getString("nama_wali");
         pendidikan_wali=rs.getString("pendidikan_wali");
         pekerjaan_wali=rs.getString("pekerjaan_wali");
         hubungan_wali=rs.getString("hubungan_wali");
         no_telp_wali=rs.getString("no_telp_wali");
         Object [] Data = {no,nis,nama_siswa,tempat_lahir_siswa,tanggal_lahir_siswa,
                           jk_siswa,agama_siswa,kewarganegaraan_siswa,no_telp_siswa,anak_ke,
                           saudara,berat_siswa,tinggi_siswa,golongan_darah_siswa,alamat_siswa,
                           nama_ayah,pendidikan_ayah,pekerjaan_ayah,nama_ibu,pendidikan_ibu,
                           pekerjaan_ibu,no_telp_ortu,nama_wali,pendidikan_wali,pekerjaan_wali,
                           hubungan_wali,no_telp_wali};
         tabModel.addRow(Data);
        }
          
          st.close();
          conn.close();
    }
    catch (ClassNotFoundException cnfe) { 
           System.out.println("Class Driver tidak ditemukan.. : " + cnfe);
           System.exit(0);
    }
    catch (SQLException sqle) { 
           System.out.println("Proses Query Gagal = " + sqle);
           System.exit(0);
    }
    catch(Exception e){
           System.out.println("Koneksi Access Gagal " +e.getMessage());
           System.exit(0);
    }

    } 

private void setJTable(){
    String [] JudulKolom={"No","NIS","Nama Siswa","Tempat Lahir","Tanggal Lahir",
                          "Jenis Kelamin","Agama","Kewarganegaraan","No Telp","Anak Ke",
                          "Saudara","Berat Badan","Tinggi Badan","Golongan Darah","Alamat",
                          "Nama Ayah","Pendidikan Ayah","Pekerjaan Ayah","Nama Ibu","Pendidikan Ibu",
                          "Pekerjaan Ibu","No. Telp","Nama Wali","Pendidikan Wali","Pekerjaan Wali",
                          "Hubungan Wali","No Telp Wali" };
    tabModel = new DefaultTableModel(null, JudulKolom){
                  boolean[] canEdit = new boolean [] { false, false, false, false, false,
                                                       false, false, false, false, false,
                                                       false, false, false, false, false,
                                                       false, false, false, false, false,
                                                       false, false, false, false, false,
                                                       false, false };
                  @Override
                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                   return canEdit [columnIndex];
                  }
              };
    TSiswa.setModel(tabModel);
    TSiswa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    TSiswa.getColumnModel().getColumn(0).setPreferredWidth(30);
    TSiswa.getColumnModel().getColumn(1).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(2).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(3).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(4).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(5).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(6).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(7).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(8).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(9).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(10).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(11).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(12).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(13).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(14).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(15).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(16).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(17).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(18).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(19).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(20).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(21).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(22).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(23).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(24).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(25).setPreferredWidth(100);
    TSiswa.getColumnModel().getColumn(26).setPreferredWidth(100);
    

    getData();
}

void ambilData_dari_JTable() {
    int row = TSiswa.getSelectedRow();

    String nis = tabModel.getValueAt(row, 1).toString();
    String nama_siswa = tabModel.getValueAt(row, 2).toString();
    String tempat_lahir_siswa = tabModel.getValueAt(row, 3).toString();
    String tanggal_lahir_siswa = tabModel.getValueAt(row, 4).toString();
    String jk_siswa = tabModel.getValueAt(row, 5).toString();
    String agama_siswa = tabModel.getValueAt(row, 6).toString();
    String kewarganegaraan_siswa = tabModel.getValueAt(row, 7).toString();
    String no_telp_siswa = tabModel.getValueAt(row, 8).toString();
    String anak_ke = tabModel.getValueAt(row, 9).toString();
    String saudara = tabModel.getValueAt(row, 10).toString();
    String berat_siswa = tabModel.getValueAt(row, 11).toString();
    String tinggi_siswa = tabModel.getValueAt(row, 12).toString();
    String golongan_darah_siswa = tabModel.getValueAt(row, 13).toString();
    String alamat_siswa = tabModel.getValueAt(row, 14).toString();

    String nama_ayah = tabModel.getValueAt(row, 15).toString();
    String pendidikan_ayah = tabModel.getValueAt(row, 16).toString();
    String pekerjaan_ayah = tabModel.getValueAt(row, 17).toString();
    String nama_ibu = tabModel.getValueAt(row, 18).toString();
    String pendidikan_ibu = tabModel.getValueAt(row, 19).toString();
    String pekerjaan_ibu = tabModel.getValueAt(row, 20).toString();
    String no_telp_ortu = tabModel.getValueAt(row, 21).toString();

    String nama_wali = tabModel.getValueAt(row, 22).toString();
    String pendidikan_wali = tabModel.getValueAt(row, 23).toString();
    String pekerjaan_wali = tabModel.getValueAt(row, 24).toString();
    String hubungan_wali = tabModel.getValueAt(row, 25).toString();
    String no_telp_wali = tabModel.getValueAt(row, 26).toString();

    txtNIS.setText(nis);
    txtNamaSiswa.setText(nama_siswa);
    txtTempatLahirSiswa.setText(tempat_lahir_siswa);
    dateLahirSiswa.setDateFormatString(tanggal_lahir_siswa);
    CBJKSiswa.setSelectedItem(jk_siswa);
    CBAgamaSiswa.setSelectedItem(agama_siswa);
    CBKewarganegaraanSiswa.setSelectedItem(kewarganegaraan_siswa);
    txtNoTelpSiswa.setText(no_telp_siswa);
    txtAnakKe.setText(anak_ke);
    txtSaudara.setText(saudara);
    txtBeratSiswa.setText(berat_siswa);
    txtTinggiSiswa.setText(tinggi_siswa);
    CBGolonganDarahSiswa.setSelectedItem(golongan_darah_siswa);
    txtAlamatSiswa.setText(alamat_siswa);

    txtNamaAyah.setText(nama_ayah);
    CBPendidikanAyah.setSelectedItem(pendidikan_ayah);
    txtPekerjaanAyah.setText(pekerjaan_ayah);
    txtNamaIbu.setText(nama_ibu);
    CBPendidikanIbu.setSelectedItem(pendidikan_ibu);
    txtPekerjaanIbu.setText(pekerjaan_ibu);
    txtNoTelpOrtu.setText(no_telp_ortu);

    txtNamaWali.setText(nama_wali);
    CBPendidikanWali.setSelectedItem(pendidikan_wali);
    txtPekerjaanWali.setText(pekerjaan_wali);
    txtHubunganWali.setText(hubungan_wali);
    txtNoTelpWali.setText(no_telp_wali);

    }

public void hapusIsiJTable() {
    int row = tabModel.getRowCount();
    for (int i = 0; i < row; i++) {
      tabModel.removeRow(0);
    }
  }

public void tampilDataKeJTable() {
    hapusIsiJTable();
    try {
        conn.close();
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:akademik_smppgri2bdg");
        String sql="Select * from siswa";
        PreparedStatement st=conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        String nis,nama_siswa,tempat_lahir_siswa,tanggal_lahir_siswa,
               jk_siswa,agama_siswa,kewarganegaraan_siswa,no_telp_siswa,anak_ke,
               saudara,berat_siswa,tinggi_siswa,golongan_darah_siswa,alamat_siswa,
               nama_ayah,pendidikan_ayah,pekerjaan_ayah,nama_ibu,pendidikan_ibu,
               pekerjaan_ibu,no_telp_ortu,nama_wali,pendidikan_wali,pekerjaan_wali,
               hubungan_wali,no_telp_wali;
        int no=0;
        while(rs.next()){
         no=no+1;
         nis=rs.getString("nis");
         nama_siswa=rs.getString("nama_siswa");
         tempat_lahir_siswa=rs.getString("tempat_lahir_siswa");
         tanggal_lahir_siswa=rs.getString("tanggal_lahir_siswa");
         jk_siswa=rs.getString("jk_siswa");
         agama_siswa=rs.getString("agama_siswa");
         kewarganegaraan_siswa=rs.getString("kewarganegaraan_siswa");
         no_telp_siswa=rs.getString("no_telp_siswa");
         anak_ke=rs.getString("anak_ke");
         saudara=rs.getString("saudara");
         berat_siswa=rs.getString("berat_siswa");
         tinggi_siswa=rs.getString("tinggi_siswa");
         golongan_darah_siswa=rs.getString("golongan_darah_siswa");
         alamat_siswa=rs.getString("alamat_siswa");

         nama_ayah=rs.getString("nama_ayah");
         pendidikan_ayah=rs.getString("pendidikan_ayah");
         pekerjaan_ayah=rs.getString("pekerjaan_ayah");
         nama_ibu=rs.getString("nama_ibu");
         pendidikan_ibu=rs.getString("pendidikan_ibu");
         pekerjaan_ibu=rs.getString("pekerjaan_ibu");
         no_telp_ortu=rs.getString("no_telp_ortu");

         nama_wali=rs.getString("nama_wali");
         pendidikan_wali=rs.getString("pendidikan_wali");
         pekerjaan_wali=rs.getString("pekerjaan_wali");
         hubungan_wali=rs.getString("hubungan_wali");
         no_telp_wali=rs.getString("no_telp_wali");
         Object Data[]={no,nis,nama_siswa,tempat_lahir_siswa,tanggal_lahir_siswa,
                        jk_siswa,agama_siswa,kewarganegaraan_siswa,no_telp_siswa,anak_ke,
                        saudara,berat_siswa,tinggi_siswa,golongan_darah_siswa,alamat_siswa,
                        nama_ayah,pendidikan_ayah,pekerjaan_ayah,nama_ibu,pendidikan_ibu,
                        pekerjaan_ibu,no_telp_ortu,nama_wali,pendidikan_wali,pekerjaan_wali,
                        hubungan_wali,no_telp_wali};
         tabModel.addRow(Data);
      }
  }
    catch (Exception e) {}
}

public void rubahData() {
    
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Mengubah Data\n Dengan NIS = '" + txtNIS.getText() +
        "'", "Konfirmasi ",JOptionPane.YES_NO_OPTION);
    
    if (ok == 0) {
      try {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:akademik_smppgri2bdg");
        String sql ="UPDATE siswa SET nama_siswa = ?,tempat_lahir_siswa = ?,tanggal_lahir_siswa = ?,jk_siswa = ?,agama_siswa = ?,kewarganegaraan_siswa = ?,no_telp_siswa = ?,anak_ke = ?,saudara = ?,berat_siswa = ?,tinggi_siswa = ?,golongan_darah_siswa = ?,alamat_siswa = ?,nama_ayah = ?,pendidikan_ayah = ?,pekerjaan_ayah = ?,nama_ibu = ?,pendidikan_ibu = ?,pekerjaan_ibu = ?,no_telp_ortu = ?, nama_wali = ?,pendidikan_wali = ?,pekerjaan_wali = ?,hubungan_wali = ?,no_telp_wali = ? WHERE nis = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        try {
          st.setString(1, txtNamaSiswa.getText());
          st.setString(2, txtTempatLahirSiswa.getText());
          st.setString(3, String.valueOf(dateLahirSiswa.getDate()));
          st.setString(4, String.valueOf(CBJKSiswa.getSelectedItem()));
          st.setString(5, String.valueOf(CBAgamaSiswa.getSelectedItem()));
          st.setString(6, String.valueOf(CBKewarganegaraanSiswa.getSelectedItem()));
          st.setString(7, txtNoTelpSiswa.getText());
          st.setString(8, txtAnakKe.getText());
          st.setString(9, txtSaudara.getText());
          st.setString(10, txtBeratSiswa.getText());
          st.setString(11, txtTinggiSiswa.getText());
          st.setString(12, String.valueOf(CBGolonganDarahSiswa.getSelectedItem()));
          st.setString(13, txtAlamatSiswa.getText());

          st.setString(14, txtNamaAyah.getText());
          st.setString(15, String.valueOf(CBPendidikanAyah.getSelectedItem()));
          st.setString(16, txtPekerjaanAyah.getText());
          st.setString(17, txtNamaIbu.getText());
          st.setString(18, String.valueOf(CBPendidikanIbu.getSelectedItem()));
          st.setString(19, txtPekerjaanIbu.getText());
          st.setString(20, txtNoTelpOrtu.getText());

          st.setString(21, txtNamaWali.getText());
          st.setString(22, String.valueOf(CBPendidikanWali.getSelectedItem()));
          st.setString(23, txtPekerjaanWali.getText());
          st.setString(24, txtHubunganWali.getText());
          st.setString(25, txtNoTelpOrtu.getText());
          st.setString(26, txtNIS.getText());
          st.executeUpdate();

        tampilDataKeJTable();

        txtNIS.setText("");
        txtNamaSiswa.setText("");
        txtTempatLahirSiswa.setText("");
        dateLahirSiswa.setDateFormatString("");
        CBJKSiswa.setSelectedItem("");
        CBAgamaSiswa.setSelectedItem("");
        CBKewarganegaraanSiswa.setSelectedItem("");
        txtNoTelpSiswa.setText("");
        txtAnakKe.setText("");
        txtSaudara.setText("");
        txtBeratSiswa.setText("");
        txtTinggiSiswa.setText("");
        CBGolonganDarahSiswa.setSelectedItem("");
        txtAlamatSiswa.setText("");

        txtNamaAyah.setText("");
        CBPendidikanAyah.setSelectedItem("");
        txtPekerjaanAyah.setText("");
        txtNamaIbu.setText("");
        CBPendidikanIbu.setSelectedItem("");
        txtPekerjaanIbu.setText("");
        txtNoTelpOrtu.setText("");

        txtNamaWali.setText("");
        CBPendidikanWali.setSelectedItem("");
        txtPekerjaanWali.setText("");
        txtHubunganWali.setText("");
        txtNoTelpOrtu.setText("");
        } catch (SQLException se) { }
      } catch (ClassNotFoundException se) {}
      catch (SQLException se) {}
    }

  }

public void simpanData(){
String tgllahir = "dd-MM-yyyy";
    SimpleDateFormat format = new SimpleDateFormat(tgllahir);
     try{
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn=DriverManager.getConnection("jdbc:odbc:akademik_smppgri2bdg");
            String sql="Insert into siswa values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st=conn.prepareStatement(sql);
                st.setString(1, txtNIS.getText());
                st.setString(2, txtNamaSiswa.getText());
                st.setString(3, txtTempatLahirSiswa.getText());
                st.setString(4, String.valueOf(format.format(dateLahirSiswa.getDate())));
                st.setString(5, String.valueOf(CBJKSiswa.getSelectedItem()));
                st.setString(6, String.valueOf(CBAgamaSiswa.getSelectedItem()));
                st.setString(7, String.valueOf(CBKewarganegaraanSiswa.getSelectedItem()));
                st.setString(8, txtNoTelpSiswa.getText());
                st.setString(9, txtAnakKe.getText());
                st.setString(10, txtSaudara.getText());
                st.setString(11, txtBeratSiswa.getText());
                st.setString(12, txtTinggiSiswa.getText());
                st.setString(13, String.valueOf(CBGolonganDarahSiswa.getSelectedItem()));

                st.setString(14, txtAlamatSiswa.getText());
                st.setString(15, txtNamaAyah.getText());
                st.setString(16, String.valueOf(CBPendidikanAyah.getSelectedItem()));
                st.setString(17, txtPekerjaanAyah.getText());
                st.setString(18, txtNamaIbu.getText());
                st.setString(19, String.valueOf(CBPendidikanIbu.getSelectedItem()));
                st.setString(20, txtPekerjaanIbu.getText());
                st.setString(21, txtNoTelpOrtu.getText());
                if (CBPendidikanWali.getSelectedIndex()==0)
                {
                st.setString(23, "");
                }
                else {
                st.setString(23, String.valueOf(CBPendidikanWali.getSelectedItem()));
                }
                st.setString(22, txtNamaWali.getText());
                st.setString(23, String.valueOf(CBPendidikanWali.getSelectedItem()));
                st.setString(24, txtPekerjaanWali.getText());
                st.setString(25, txtHubunganWali.getText());
                st.setString(26, txtNoTelpWali.getText());
            int rs=st.executeUpdate();

            if(rs>0){
            JOptionPane.showMessageDialog(this,"Input Berhasil");
      	    tampilDataKeJTable();
            }
            st.close();
            conn.close();
        }
        catch (ClassNotFoundException cnfe) {
           System.out.println("Class Driver tidak ditemukan.. : " + cnfe);
        }
        catch (SQLException sqle) {
           System.out.println("Input  Gagal = " + sqle.getMessage());
        }
        catch(Exception e){
           System.out.println("Koneksi Gagal " +e.getMessage());
        }
  }

public void hapus_Data() {
    ambilData_dari_JTable();
    int ok = JOptionPane.showConfirmDialog(this,
        "Anda Yakin Ingin Menghapus Data\nDengan nis = '" + txtNIS.getText() +
        "'", "Konfirmasi Menghapus Data",JOptionPane.YES_NO_OPTION);
    if (ok == 0) {
      try {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       conn=DriverManager.getConnection("jdbc:odbc:akademik_smppgri2bdg");
        String sql = "DELETE FROM siswa WHERE nis = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, txtNIS.getText());
        int rs=st.executeUpdate();
        if(rs>0){
        tampilDataKeJTable();
        JOptionPane.showMessageDialog(this,"Data Sudah dihapus");
        }
        txtNIS.setText("");
        txtNamaSiswa.setText("");
        txtTempatLahirSiswa.setText("");
        dateLahirSiswa.setDateFormatString("");
        CBJKSiswa.setSelectedItem("--Pilih--");
        CBAgamaSiswa.setSelectedItem("--Pilih--");
        CBKewarganegaraanSiswa.setSelectedItem("--Pilih--");
        txtNoTelpSiswa.setText("");
        txtAnakKe.setText("");
        txtSaudara.setText("");
        txtBeratSiswa.setText("");
        txtTinggiSiswa.setText("");
        CBGolonganDarahSiswa.setSelectedItem("--Pilih--");
        txtAlamatSiswa.setText("");

        txtNamaAyah.setText("");
        CBPendidikanAyah.setSelectedItem("--Pilih--");
        txtPekerjaanAyah.setText("");
        txtNamaIbu.setText("");
        CBPendidikanIbu.setSelectedItem("--Pilih--");
        txtPekerjaanIbu.setText("");
        txtNoTelpOrtu.setText("");

        txtNamaWali.setText("");
        CBPendidikanWali.setSelectedItem("--Pilih--");
        txtPekerjaanWali.setText("");
        txtHubunganWali.setText("");
        txtNoTelpOrtu.setText("");
        } catch (Exception se) {
         JOptionPane.showMessageDialog(this,"Gagal Hapus Data.. ");
       }
    }
  }

private void NIS(){

        try{

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            conn=DriverManager.getConnection("jdbc:odbc:akademik_smppgri2bdg");
            String sql="select * from siswa order by nis";
            PreparedStatement st=conn.prepareStatement(sql);
            ResultSet rs=st.executeQuery();
            while(rs.next()){

            String no;

            no = rs.getString(1);


                int n = Integer.parseInt(no.substring(7,9))+1;
                String nomor="0";
                for(int i = 1; i <= 2 - String.valueOf(n).length();i++)
                {
                    nomor = nomor + "0";
                }
                nomor = "121310" + nomor + String.valueOf(n);
                txtNIS.setText(nomor);
            }

            st.close();
            conn.close();
        }
        catch (ClassNotFoundException cnfe) {
           System.out.println("Class Driver tidak ditemukan.. : " + cnfe);
        }
        catch (SQLException sqle) {
           System.out.println("Input  Gagal = " + sqle.getMessage());
        }
        catch(Exception e){
           System.out.println("Koneksi Gagal " +e.getMessage());
        }

    }
}
