package tadkp;

public class GUI extends javax.swing.JFrame {
static String masuk(){
            return "Jam Masuk Pukul 07.00 WIB";
        }
    public GUI() {
        initComponents();
        
        kelastadkp objekbaru = new kelastadkp();
        objekbaru.setSalam("Halo, Selamat Pagi!!!");
        objekbaru.setKelas("Kelas Fisika Dasar II ");
        objekbaru.setJurusan("Teknik Komputer ");
        objekbaru.setUniversitas("Diponegoro ");
        
        kolomHasil.setText(objekbaru.getSalam() + "\nSelamat Datang di " + objekbaru.getKelas() + "\n" + objekbaru.getJurusan() + "Universitas " + objekbaru.getUniversitas() + "\n" + masuk() );
        
            kolomPilgan.setText("Max 10");
            kolomEssay.setText("Max 5");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kolomHasil = new javax.swing.JTextArea();
        kolomNama = new javax.swing.JTextField();
        kolomNim = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        kolomJam = new javax.swing.JComboBox<>();
        btnReset = new javax.swing.JButton();
        kolomEssay = new javax.swing.JTextField();
        kolomPilgan = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABSENSI FISIKA DASAR II");
        setLocation(new java.awt.Point(450, 200));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        kolomHasil.setEditable(false);
        kolomHasil.setBackground(new java.awt.Color(240, 240, 240));
        kolomHasil.setColumns(20);
        kolomHasil.setRows(5);
        kolomHasil.setBorder(null);
        jScrollPane1.setViewportView(kolomHasil);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 270, 310));

        kolomNama.setBackground(new java.awt.Color(240, 240, 240));
        kolomNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kolomNama.setBorder(null);
        kolomNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomNamaActionPerformed(evt);
            }
        });
        getContentPane().add(kolomNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 200, 30));

        kolomNim.setBackground(new java.awt.Color(240, 240, 240));
        kolomNim.setBorder(null);
        kolomNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomNimActionPerformed(evt);
            }
        });
        getContentPane().add(kolomNim, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 30));

        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 80, 30));

        kolomJam.setBackground(new java.awt.Color(240, 240, 240));
        kolomJam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<07.00", "07.01 - 07.15", ">07.15", " " }));
        kolomJam.setBorder(null);
        getContentPane().add(kolomJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 200, 30));

        btnReset.setText("RESET");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 80, 30));

        kolomEssay.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(kolomEssay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 80, 30));

        kolomPilgan.setBackground(new java.awt.Color(240, 240, 240));
        getContentPane().add(kolomPilgan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 80, 30));

        btnClear.setText("Clear!");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 100, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tadkp/GUI TA.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setAutoscrolls(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kolomNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomNamaActionPerformed

    }//GEN-LAST:event_kolomNamaActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            String nama = kolomNama.getText();
            String nim = kolomNim.getText();                        
            String action = null;
            String kategori = null;
            int pilgan=Integer.parseInt(kolomPilgan.getText());
            int essay=Integer.parseInt(kolomEssay.getText());
            int nilaipilgan = pilgan*3;
            int nilaiessay = essay*4;
            int nilai=0;
            

            
            if (nilaipilgan <= 30){
                nilai = (nilaipilgan + nilaiessay)*2;
            }
            if (nilaipilgan > 30){
            nilai = 0;
            }
            if (nilaiessay <= 20){
                nilai = (nilaipilgan + nilaiessay)*2;
            }
            if (nilaiessay > 20){
            nilai = 0;
            }
            if (nilai > 100){nilai = 0;}

            int jam = kolomJam.getSelectedIndex();
            switch (jam) {
                case 0:
                    action = "Silahkan Masuk ";
                    kategori = "Adalah Anak Rajin ";
                    break;
                case 1:
                    action = "Cepat Masuk!! ";
                    kategori = " Diberi Toleransi ";
                    break;
                case 2:
                    action = "Terlambat Lebih dari Lima Belas Menit ";
                    kategori = " Telah Melebihi Batas Toleransi, \nSilahkan Pulang Saja";
                    break;
            }
            kolomHasil.setText(kolomHasil.getText()+ "\n" + "\nSaudara/i : " + nama + "\nDengan NIM : " + nim + "\n" + action + " Anda " + kategori + "\nNilai Maksimal Tugas Anda : " + nilai);
        } catch (Exception e) {
            kolomHasil.setText(kolomHasil.getText()+"\n\nSilahkan Ulangi");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

          
        kolomNama.setText("");
        kolomNim.setText("");
        kolomPilgan.setText("");
        kolomEssay.setText("");
        kolomJam.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void kolomNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomNimActionPerformed

    }//GEN-LAST:event_kolomNimActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        kolomHasil.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kolomEssay;
    private javax.swing.JTextArea kolomHasil;
    private javax.swing.JComboBox<String> kolomJam;
    private javax.swing.JTextField kolomNama;
    private javax.swing.JTextField kolomNim;
    private javax.swing.JTextField kolomPilgan;
    // End of variables declaration//GEN-END:variables
}
