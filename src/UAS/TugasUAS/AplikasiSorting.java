package UAS.TugasUAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class AplikasiSorting {
    private JTextField textField;
    private JButton OKButton;
    private JButton acButton;
    private JButton exitButton;
    private JPanel nolPanel;
    private JLabel hasilJLabel;


    public AplikasiSorting() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String angka =  textField.getText();
                // ubah ke array of strings
                String[] arrStr = angka.split(" ", 0);
                // declare array of integers
                int[] arrInt = new int[arrStr.length];
                // ubah masing-masing data array menjadi integer
                for (int m = 0; m < arrInt.length; m++)
                {
                    arrInt[m] = Integer.parseInt(arrStr[m]);
                }

                // algoritme sort
                int n = arrInt.length;

                for (int i = 0; i < n-1; i++)
                {
                    for (int j = 0; j < n-i-1; j++) {
                        if (arrInt[j] > arrInt[j+1])
                        {
                            // swap arr[j+1] and arr[j]
                            int temp = arrInt[j];
                            arrInt[j] = arrInt[j+1];
                            arrInt[j+1] = temp;
                        }
                    }
                }

                // convert array to string
                String string = Arrays.toString(arrInt);
                // Hasil
                hasilJLabel.setText(string);
            }
        });

        acButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                hasilJLabel.setText("");
                textField.requestFocus();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getNolPanel() {
        return nolPanel;
    }

}