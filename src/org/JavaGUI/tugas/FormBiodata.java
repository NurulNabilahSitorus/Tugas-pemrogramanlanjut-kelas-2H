package org.JavaGUI.tugas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonCek;
    private JButton buttonExit;
    private JPanel rootPanel;
    private JLabel JLabel1;
    private JLabel JLabel2;
    private JLabel JLabel3;
    private JLabel JLabel4;
    private JLabel JLabel5;
    private JLabel JLabel6;
    private JLabel JLabel7;
    private JLabel JLabel8;

    public FormBiodata() {
        buttonCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nama = textNama.getText();
                String Nim = textNim.getText();

                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(Nama);
                mhs.setNim(Nim);

                JLabel1.setText("Nama : " + mhs.getNama());
                JLabel2.setText("NIM : " + mhs.getNim());
                JLabel3.setText("Jenjang Pendidikan : " + mhs.getJenjangPendidikan());
                JLabel4.setText("Tahun Masuk : " + mhs.getTahunMasuk());
                JLabel5.setText("Fakultas : " + mhs.getFakultas());
                JLabel6.setText("Jurusan : " + mhs.getJurusan());
                JLabel7.setText("Jenis Kelamin : " + mhs.getJenisKelamin());
                JLabel8.setText("Nomor Urut : " + mhs.getNomorUrutMahasiswa());

            }
        });
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }


}
