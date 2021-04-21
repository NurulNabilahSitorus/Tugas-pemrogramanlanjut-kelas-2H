package org.algoritme.tugas;

import java.util.Scanner;


// membuat class sebagai template
class JenjangPendidikan{
    int a;
}

class TahunMasuk{
    int b;
}

class Fakultas{
    int c;
}

class Jurusan{
    int d;
}

class JenisKelamin{
    int e;
}

class NomorUrutMahasiswa{
    int f;
}


public class NIM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = input.nextLine();

        // instansiasi / membuat object dari class JenjangPendidikan
        JenjangPendidikan jenjangpendidikan1 = new JenjangPendidikan();

        System.out.print("Masukkan Digit ke-1 dari NIM : ");
        jenjangpendidikan1.a = input.nextInt();

        if (jenjangpendidikan1.a == 1){
            System.out.println("Jenjang Pendidikan : " + "S1" + " " + "(Sarjana)");
        }
        else if (jenjangpendidikan1.a == 2){
            System.out.println("Jenjang Pendidikan : " + "S2" + " " + "(Magister)");
        }
        else if (jenjangpendidikan1.a == 3){
            System.out.println("Jenjang Pendidikan : " + "S3" + " " + "(Doktor)");
        }
        else {
            System.out.println("UNKNOWN");
        }

        // instansiasi / membuat object dari class TahunMasuk
        TahunMasuk tahunmasuk1 = new TahunMasuk();

        System.out.print("Masukkan Digit ke-2 dan ke-3 dari NIM : ");
        tahunmasuk1.b = input.nextInt();

        System.out.println( "Tahun Masuk : " + "20" + tahunmasuk1.b);

        // instansiasi / membuat object dari class Fakultas
        Fakultas fakultas1 = new Fakultas();

        System.out.print("Masukkan Digit ke-4 dari NIM : ");
        fakultas1.c = input.nextInt();

        if (fakultas1.c == 1){
            System.out.println("Fakultas : " + "Tarbiyah dan Keguruan");
        }
        else if (fakultas1.c == 2){
            System.out.println("Fakultas : " + "Syari’ah dan Hukum");
        }
        else if (fakultas1.c == 3){
            System.out.println("Fakultas : " + "Ushuluddin");
        }
        else if (fakultas1.c == 4){
            System.out.println("Fakultas : " + "Dakwah dan Komunikasi");
        }
        else if (fakultas1.c == 5){
            System.out.println("Fakultas : " + "Sains dan Teknologi");
        }
        else if (fakultas1.c == 6){
            System.out.println("Fakultas : " + "Psikologi");
        }
        else if (fakultas1.c == 7){
            System.out.println("Fakultas : " + "Ekonomi dan Ilmu Sosial");
        }
        else if (fakultas1.c == 8){
            System.out.println("Fakultas : " + "Pertanian dan Peternakan");
        }
        else {
            System.out.println("UNKNOWN");
        }

        // instansiasi / membuat object dari class Jurusan
        Jurusan jurusan1 = new Jurusan();

        System.out.print("Masukkan Digit ke-5 dan ke-6 dari NIM : ");
        jurusan1.d = input.nextInt();

        if (jurusan1.d == 1){
            System.out.println("Jurusan : " + "Teknik Informatika");
        }
        else if (jurusan1.d == 2){
            System.out.println("Jurusan : " + "Teknik Industri");
        }
        else if (jurusan1.d == 3){
            System.out.println("Jurusan : " + "Sistem Informasi");
        }
        else if (jurusan1.d == 4){
            System.out.println("Jurusan : " + "Matematika");
        }
        else if (jurusan1.d == 5){
            System.out.println("Jurusan : " + "Teknik Elektro");
        }
        else {
            System.out.println("UNKNOWN");
        }

        // instansiasi / membuat object dari class JenisKelamin
        JenisKelamin jeniskelamin1 = new JenisKelamin();

        System.out.print("Masukkan Digit ke-7 dari NIM : ");
        jeniskelamin1.e = input.nextInt();

        if (jeniskelamin1.e == 1){
            System.out.println("Jenis Kelamin : " + "Laki-laki");
        }
        else if (jeniskelamin1.e == 2){
            System.out.println("Jenis Kelamin : " + "Perempuan");
        }
        else {
            System.out.println("UNKNOWN");
        }

        // instansiasi / membuat object dari class NomorUrutMahasiswa
        NomorUrutMahasiswa nomorurutmahasiswa1 = new NomorUrutMahasiswa();

        System.out.print("Masukkan Digit ke-8, ke-9, ke-10, dan ke-11 dari NIM : ");
        nomorurutmahasiswa1.f = input.nextInt();

        System.out.println( "Nomor Urut Mahasiswa : " + nomorurutmahasiswa1.f);
    }
}
