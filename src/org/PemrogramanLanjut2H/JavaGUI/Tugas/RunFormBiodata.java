package org.PemrogramanLanjut2H.JavaGUI.Tugas;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FORMULIR BIODATA MAHASISWA BERDASARKAN NIM");
        jFrame.setContentPane(new FormBiodata().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,400);
        jFrame.setVisible(true);
    }
}
