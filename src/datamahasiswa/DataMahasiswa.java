/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Ikhsan
 */
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner input = new Scanner(System.in);
        ArrayList<mhs> data1 = new ArrayList<>();
        
        while ( true){
            System.out.println("Menu Operasi List Data Mahasiswa");
            System.out.println("Pilih Menu");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tambah Data Mahsiswa");
            System.out.println("3. Cari Data Mahsiswa");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Menu : ");
            
            int menu = input.nextInt();
            input.nextLine();
            if (menu == 1){
                if (data1.isEmpty()){
                    System.out.println("Data Kosong");
                } else {
                    System.out.println("Data Seluruh Mahasiswa");
                    data1.forEach((n) -> System.out.println("Nim :"+n.nim +"\n"
                            +" Nama :"+ n.nama +"\n"
                            +" Tgl Lahir :" + n.tanggalLahir +"\n"
                            +" Gender :" + n.namagender)); 
                    System.out.println("Banyak Data Terekam:"+data1.size());
                    
                   
                // a = data, fungsi a sebagai pengganti data//
                }
                
            }
            else if (menu == 2){
                System.out.print("NIM : ");
                String nim = input.nextLine();
                System.out.print("Nama : ");
                String nama = input.nextLine();
                System.out.print("Tanggal Lahir (dd/mm/yyyy): ");
                String tgl = input.nextLine();
                System.out.print("Gender (Input '0' untuk Laki-laki dan '1' untuk Perempuan) : ");
                int gender = input.nextInt();
                data1.add(new mhs(nim,nama,tgl,gender));
            }
            else if (menu == 3){
                System.out.println("1. Berdasarkan NIM");
                System.out.println("2. Berdasarkan Gender");
                System.out.println("Masukan Pilihan: ");
                int cari = input.nextInt();
                input.nextLine();
                ArrayList<mhs> data2 = new ArrayList<>(data1);
                //Array list ini akan selalu diperbaharui ketika masuk menu 3//
                if (cari == 1){
                    System.out.print("NIM : ");
                    String nim = input.nextLine();
                    data2.removeIf(b -> !b.nim.equals(nim));
                } else if(cari == 2){
                    System.out.print("Gender (Masukan 0 untuk Pria, 1 untuk Perempuan) : ");
                    int gender = input.nextInt();
                    data2.removeIf(b -> b.gender != gender);
                }
                if (data2.isEmpty()){
                    System.out.println("Data Kosong");
                } else {
                    data2.forEach((n) -> System.out.println("Nim :"+n.nim +"\n"
                            +" Nama :"+ n.nama +"\n"
                            +" Tgl Lahir :" + n.tanggalLahir +"\n"
                            +" Gender :" + n.namagender)); 
                // n = data2, fungsi n sebagai pengganti nama data2//
                }
            }
            else if (menu == 4){
                System.out.print("NIM : ");
                String nim = input.nextLine();
                data1.removeIf(a -> a.nim.equals(nim));
                System.out.print("Data Mahasiswa Sekarang");
                data1.forEach((n) -> System.out.println("Nim :"+n.nim +"\n"
                            +" Nama :"+ n.nama +"\n"
                            +" Tgl Lahir :" + n.tanggalLahir +"\n"
                            +" Gender :" + n.namagender)); 
                
            }
            if (menu == 5){
                System.exit(0);
            System.out.println("Terimaksih Sudah Mencoba");
            }           
        }
    }
    
}

