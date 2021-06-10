package org.PemrogramanLanjut2H.Sorting.tugas;

import javax.swing.*;

public class runJtable {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                UnsupportedLookAndFeelException ignored) {
        }

        /**
         * set image icon
         */

        ImageIcon imageIcon = new ImageIcon("Image/Gambar.png");
        JFrame jFrame = new JFrame("Jumlah Angka Yang Diurutkan");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setContentPane(new Jtable().getPanel1());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
