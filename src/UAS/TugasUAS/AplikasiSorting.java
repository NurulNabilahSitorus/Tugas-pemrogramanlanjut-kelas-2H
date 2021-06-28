package UAS.TugasUAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class AplikasiSorting {
    private JTextField textField;   // sebuah konstruktor JTextField dari form aplikasi java GUI yang hanya bisa diakses di dalam class AplikasiSorting
    private JButton OKButton;   // sebuah konstruktor JButton dari form aplikasi java GUI yang hanya bisa diakses di dalam class AplikasiSorting
    private JButton deleteButton;   // sebuah konstruktor JButton dari form aplikasi java GUI hanya bisa diakses di dalam class AplikasiSorting
    private JButton exitButton; // sebuah konstruktor JButton dari form aplikasi java GUI yang hanya bisa diakses di dalam class AplikasiSorting
    private JPanel nolPanel;    // sebuah konstruktor JPanel dari form aplikasi java GUI yang hanya bisa diakses di dalam class AplikasiSorting
    private JLabel hasilJLabel; // sebuah konstruktor JLabel dari form aplikasi java GUI yang hanya bisa diakses di dalam class AplikasiSorting


    public AplikasiSorting() {  // sebuah method khusus yang berisi objek-objek yang akan dieksekusi
        OKButton.addActionListener(new ActionListener() {   // sebuah interaksi yang dilakukan pada tombol di aplikasi untuk menjalankan proses dan menampilkan hasilnya setelah menekan tombolnya
            @Override   // kemampuan sebuah kode program untuk membuat subclass di dalam class AplikasiSorting
            public void actionPerformed(ActionEvent e) {    // sebuah method yang dapat diakses oleh objek lain, tetapi tidak dapat mengembalikan nilai

                String angka =  textField.getText();    // proses mendeklarasi dan menginisialisasi variabel sekaligus dan mengambil data dari textfield pada form java GUI

                String[] arrStr = angka.split(" ", 0);  // menukarkan variabel angka menjadi variabel arrStr

                int[] arrInt = new int[arrStr.length];  // membuat array yang baru

                for (int m = 0; m < arrInt.length; m++) // memeriksa kondisi, lalu mengeksekusi variabel arrInt
                {
                    arrInt[m] = Integer.parseInt(arrStr[m]);    // mengkonversikan variabel arrInt ke dalam bentuk data Int
                }

                // Algoritme Sort dengan menggunakan Bubble Sort
                int n = arrInt.length;  // mendeklarasikan dan menukarkan arrInt.length tadi ke variabel n untuk dieksekusi di algoritma sort

                for (int i = 0; i < n-1; i++) {     // memeriksa kondisi terlebih dahulu, lalu mengeksekusi program untuk mengulangi semua kodingan sebanyak jumlah data yang diinput
                    for (int j = 0; j < n-i-1; j++) {   // memeriksa kondisi terlebih dahulu, lalu mengeksekusi program yang akan diurutkan datanya dalam bentuk int
                        if (arrInt[j] > arrInt[j+1]) {  // program akan membandingkan data ke-j dengan data ke-(j+1) guna mengurutkan data secara ascending

                            // swap arr[j+1] and arr[j]
                            int baru = arrInt[j]; // menukarkan variabel j tadi ke variabel baru
                            arrInt[j] = arrInt[j+1];    // menukarkan variabel (j+1) ke variabel j
                            arrInt[j+1] = baru; // menukarkan variabel yang baru ke variabel (j+1)
                        }
                    }
                }

                // konversi array ke string
                String string = Arrays.toString(arrInt);    // hasil yang telah dieksekusi tadi dikonversi ke bentuk data string
                // Hasil
                hasilJLabel.setText(string);    // hasil output pada program ini akan tampil di form java GUI
            }
        });

        deleteButton.addActionListener(new ActionListener() {   // sebuah interaksi yang dilakukan pada tombol di aplikasi untuk membersihkan atau menghapus hasil output dan juga me-reset data terakhir yang telah diinput setelah menekan tombolnya
            @Override
            public void actionPerformed(ActionEvent e) {    // sebuah method yang dapat diakses oleh objek lain, tetapi tidak dapat mengembalikan nilai
                textField.setText("");  // program akan menjalankan perintah untuk mengosongkan data yang telah diinput
                hasilJLabel.setText("");    // program akan menjalankan perintah untuk mengosongkan hasil output
                textField.requestFocus();   // jika sudah diproses, maka kode tersebut akan mengarahkan kursor ke posisi textField
            }
        });

        exitButton.addActionListener(new ActionListener() { // sebuah interaksi yang dilakukan pada tombol di aplikasi untuk akan keluar dari aplikasi tersebut setelah menekan tombolnya
            @Override   // kemampuan sebuah kode program untuk membuat subclass di dalam class AplikasiSorting
            public void actionPerformed(ActionEvent e) {    // sebuah method yang dapat diakses oleh objek lain, tetapi tidak dapat mengembalikan nilai

                System.exit(0); // sebuah parameter exit, jika dijalankan program eksekusi berjalan baik

            }
        });
    }

    public JPanel getNolPanel() {   // sebuah method khusus yang berisi objek-objek yang akan dieksekusi

        return nolPanel;    // mengembalikan nolPanel ke objek lain
    }

}