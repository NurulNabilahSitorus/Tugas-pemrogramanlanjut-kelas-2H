package UAS.TugasUAS;

import javax.swing.*;


public class RunAplikasiSorting {   // kelas atau method yang dapat diakses dari kelas manapun
    public static void main(String[] args) {    // perintah untuk menjalankan program java

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                UnsupportedLookAndFeelException ignored) {
        }

        /**
         * set image icon
         */
        ImageIcon imageIcon = new ImageIcon("Image/Gambar.png");    // membuat image icon baru dari file pada form JFrame

        JFrame jframe = new JFrame("Aplikasi Sortir Angka");    // membuat form JFrame dengan judul "Aplikasi Sortir Angka" di aplikasinya
        jframe.setIconImage(imageIcon.getImage());  // membuat ikon pada form JFrame dari gambar yang dimuat dari file
        jframe.setLayout(null); // menentukan jenis layout apa yang akan ditampilkan
        jframe.setBounds(100, 100, 600, 400);   // mengatur posisi form JFrame dengan perintah setBounds() karena layout yang digunakan adalah null layout
        jframe.setContentPane(new AplikasiSorting().getNolPanel()); // tempat menyimpan semua text, tombol, atau gambar yang diinginkan untuk ditampilkan
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // menjalankan form JFrame untuk menutup keseluruhan aplikasi apabila kita menutup aplikasinya
        jframe.setLocationRelativeTo(null); // membuat form JFrame berada di tengah layar
        jframe.setSize(600, 400);   // membuat ukuran form JFrame yang diinginkan untuk ditampilkan dilayar
        jframe.setVisible(true);    // mengatur output agar dapat ditampilkan

    }
}
