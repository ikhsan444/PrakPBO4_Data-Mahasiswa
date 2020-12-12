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
public class mhs {
    String nim,nama,tanggalLahir,namagender;
    Date tglLahir;
    int gender;
    int menu;
  
    
    public mhs(String nim, String nama, String Date , int gender){
        this.nim=nim;
        this.nama=nama;
        this.tanggalLahir=Date;
        this.gender=gender;
        this.namagender=(gender ==0)?"Laki-Laki":"Perempuan";}}
        
        
    
