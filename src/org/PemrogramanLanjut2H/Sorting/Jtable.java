package org.PemrogramanLanjut2H.Sorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jtable {
    private JTextField textangka;
    private JButton buttonsort;
    private JTable tablehasil;
    private JPanel Panel1;
    private JTextField textangka2;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getPanel1(){
        return Panel1;
    }

    public Jtable(){
        this.initComponents();
        buttonsort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tablehasil.getModel();
                String jumlah2 = textangka2.getText();
                int jumlah = Integer.parseInt(textangka.getText());
                String angka = textangka2.getText();

                if (textangka.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(Panel1,
                            "jumlah angka tidak diketahui",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (angka.isBlank() ) {
                    JOptionPane.showMessageDialog(Panel1,
                            "Angka belum diinput",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }else{
                    model.addRow(new Object[]{jumlah2,angka});
                    //clear textfield
                    textangka.setText("");
                    textangka2.setText("");
                }
                int a = 0;
                for (int i : DataSorting.getascen(angka, jumlah)){
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : DataSorting.getdescen(angka, jumlah)){
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
    }

    private void initComponents(){
        Object[] tableColom={
                "Ascending",
                "Descending"
        };
        Object[][] initData = {

        };
        tableModel = new  DefaultTableModel(initData,tableColom);
        //set table model
        tablehasil.setModel(tableModel);
        //menampilkan sorting di setiap kolom
        tablehasil.setAutoCreateRowSorter(true);
        //hidupkan single selection
        tablehasil.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}

