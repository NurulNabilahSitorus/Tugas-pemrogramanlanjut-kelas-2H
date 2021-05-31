package org.Tugas.PemrogramanLanjut2H;

import org.Tugas.PemrogramanLanjut2H.JavaGUI.FormBiodata;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("BIODATA MAHASISWA");
        jFrame.setContentPane(new FormBiodata().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,400);
        jFrame.setVisible(true);
    }
}
