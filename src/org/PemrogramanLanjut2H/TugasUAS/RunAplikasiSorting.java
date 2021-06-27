package org.PemrogramanLanjut2H.TugasUAS;

import javax.swing.*;


public class RunAplikasiSorting {
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

        JFrame jframe = new JFrame("Aplikasi Sortir Angka");
        jframe.setIconImage(imageIcon.getImage());
        jframe.setBounds(100, 100, 600, 400);
        jframe.setContentPane(new AplikasiSorting().getNolPanel());
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

    }
}
