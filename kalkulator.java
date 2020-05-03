package com.suhandi; // change this package | Ubah Nama Package sesuai direktori kamu
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// COPYRIGHT © 2020 SuhandiProject
// Open Source.
public class kalkulator {
Scanner input = new Scanner(System.in);
 static void Mulai(){
   System.out.println("SELAMAT DATANG DI KALKULATOR SIMPLE");
   System.out.println("<============================>");
   System.out.println("1. Perkalian");
   System.out.println("2. Penjumlahan");
   System.out.println("3. Pengurangan");
   System.out.println("4. Pembagian");
   System.out.println("5. Perpangkatan");
   System.out.println("6. Pangkat & Kali");
   System.out.println("7. Menghitung Keliling Segitiga");
   System.out.println("8. Menghitung Garis Singgung (Luar)");
   System.out.println("9. Menghitung Garis Singgung (Dalam)");
   System.out.println("<============================>");
 }
 static void Tanya(){
   Scanner input = new Scanner(System.in);
   System.out.print("Masukan Pilihan Anda : ");
   int pilihan = input.nextInt();
    if (pilihan == 1){
     Perkalian();
   } else if (pilihan == 2){
     Penjumlahan();
   } else if (pilihan == 3){
     Pengurangan();
   } else if (pilihan == 4){
     Pembagian();
   } else if (pilihan == 5){
     Perpangkatan();
   } else if (pilihan == 6){
     Pangli();
   } else if (pilihan == 7){
     KelSeg();
   } else if (pilihan == 8){
     SinggungL();
   } else if (pilihan == 9){
     SinggungD();
   } else {
     System.out.println("Angka : " + pilihan + " tidak tersedia");
   }
 }
 static void Perkalian(){
   Scanner input = new Scanner(System.in);
   System.out.print("Masukan Angka Awal : ");
   int awal = input.nextInt();
   System.out.print("Masukan Angka Kedua : ");
   int dua = input.nextInt();
   int hasil = awal * dua;
   System.out.println("Hasil : " + hasil);
   Controller();
 }
 static void Controller(){
   Scanner input = new Scanner(System.in);
   System.out.println("<============================>");
   Tanya();
   
 }
 static void Penjumlahan(){
   Scanner input = new Scanner(System.in);
   System.out.print("Masukan Angka Awal : ");
   int awal = input.nextInt();
   System.out.print("Masukan Angka Kedua : ");
   int dua = input.nextInt();
   int hasil = awal + dua;
   System.out.println("Hasil : " + hasil);
   Controller();
 }
 static void Pengurangan(){
   Scanner input = new Scanner(System.in);
   System.out.print("Masukan Angka Awal : ");
   int awal = input.nextInt();
   System.out.print("Masukan Angka Kedua : ");
   int dua = input.nextInt();
   int hasil = awal - dua;
   System.out.println("Hasil : " + hasil);
   Controller();
 }
 static void Pembagian(){
   Scanner input = new Scanner(System.in);
   System.out.print("Masukan Angka Awal : ");
   int awal = input.nextInt();
   System.out.print("Masukan Angka Kedua : ");
   int dua = input.nextInt();
   int hasil = awal / dua;
   System.out.println("Hasil : " + hasil);
   Controller();
 }
 static void Perpangkatan(){
   Scanner input = new Scanner(System.in);
   System.out.print("Masukan Angka Awal : ");
   int awal = input.nextInt();
   System.out.print("Masukan Angka Pangkat : ");
   int dua = input.nextInt();
   int hasil = (int)Math.pow(awal, dua);
   System.out.println("Hasil " + awal + " pangkat " + dua + " Adalah : " + hasil);
   Controller();
 }
 static void Pangli(){
   Scanner input = new Scanner(System.in);
   System.out.print("Masukan Angka Awal : ");
   int awal = input.nextInt();
   System.out.print("Masukan Angka Pangkat : ");
   int dua = input.nextInt();
   System.out.print("Kalikan Dengan Angka : ");
   int tiga = input.nextInt();
   int hasil = (int)Math.pow(awal, dua);
   int akhir = hasil * tiga;
   System.out.println("Hasil Perhitungan Dari " + awal + " pangkat " + dua + " Adalah : " + hasil);
   System.out.println("Dikali dengan : " + tiga + " Hasilnya : " + akhir);
   Controller();
 }
 static void KelSeg(){
   Scanner input = new Scanner(System.in);
   System.out.println("-------------");
   System.out.println("Perhatian Ketiga Titik Sudut Anggaplah");
   System.out.println("Sebuah Huruf diketiga Sudut tersebut");
   System.out.println("Diubah menjadi A, B, C");
   System.out.println("-------------");
   System.out.print("Masukan Angka Titik A : ");
   int a = input.nextInt();
   System.out.print("Masukan Angka Titik B : ");
   int b = input.nextInt();
   System.out.print("Masukan Angka Titik C : ");
   int c = input.nextInt();
   int hasil = a + b + c;
   System.out.println("Titik A : " + a + " Titik B : " + b + "Titik C : " + c);
   System.out.println("Rumus : K = a + b + c'");
   System.out.println(" K = " + a + " + " + b + " + " + c);
   System.out.println("Hasilnya K = " + hasil);
   Controller();
 }
 static void SinggungL(){
   Scanner input = new Scanner(System.in);
   System.out.println("-----------------");
   System.out.println("Perhatikan kedua lingkaran disoal mu!");
   System.out.println("Dalam setiap lingkaran dinamakan 1 huruf");
   System.out.println("Contoh Lingkaran A dan Lingkaran B");
   System.out.println("Jika nama lingkaran disoalmu berbeda dengan contoh");
   System.out.println("Anggap saja huruf dilingkaranmu itu A & B");
   System.out.println("Titik pusat antar lingkaran adalah angka yang berada ditenga² lingkaran!");
   System.out.println("-----------------");
   System.out.print("Masukan Jumlah titik pusat Lingkaran A : ");
   int a = input.nextInt();
   System.out.print("Masukan Jumlah titik pusat Lingkaran B : ");
   int b = input.nextInt();
   System.out.print("Masukan Jarak Antar Lingkaran A - B : ");
   int c = input.nextInt();
   System.out.println("Perhatikan!");
   System.out.println(" r = jari-jari | Rumus : AB = √AB² - (rA - rB)²");
   System.out.println("AB = √" + c + "² - (r" + a + " - r" + b + ")²");
   int pangkat = 2;
   int pusatPang = (int)Math.pow(c, pangkat);
   int exs = a - b;
   System.out.println("AB = √" + pusatPang + " - " + exs + "²" );
   int exsp = (int)Math.pow(exs, pangkat);
   System.out.println("AB = √" + pusatPang + " - " + exsp);
   int point = pusatPang - exsp;
   int hasil = (int)Math.sqrt(point);
   System.out.println("AB = √" + point);
   System.out.println("AB = " + hasil + "cm");
   System.out.println("<============================>");
   Controller();
 }
  // Fungsi Hitung Garis Singgung Persekutuan Dalam
 static void SinggungD(){
   Scanner input = new Scanner(System.in);
   System.out.println("-----------------");
   System.out.println("Perhatikan kedua lingkaran disoal mu!");
   System.out.println("Dalam setiap lingkaran dinamakan 1 huruf");
   System.out.println("Contoh Lingkaran A dan Lingkaran B");
   System.out.println("Jika nama lingkaran disoalmu berbeda dengan contoh");
   System.out.println("Anggap saja huruf dilingkaranmu itu A & B");
   System.out.println("Titik pusat antar lingkaran adalah angka yang berada ditenga² lingkaran!");
   System.out.println("-----------------");
   System.out.print("Masukan Jumlah titik pusat Lingkaran A : ");
   int a = input.nextInt();
   System.out.print("Masukan Jumlah titik pusat Lingkaran B : ");
   int b = input.nextInt();
   System.out.print("Masukan Jarak Antar Lingkaran A - B : ");
   int c = input.nextInt();
   System.out.println("Perhatikan!");
   System.out.println(" r = jari-jari | Rumus : AB = √AB² - (rA + rB)²");
   System.out.println("AB = √" + c + "² - (r" + a + " + r" + b + ")²");
   int pangkat = 2;
   int pusatPang = (int)Math.pow(c, pangkat);
   int exs = a + b;
   System.out.println("AB = √" + pusatPang + " + " + exs + "²" );
   int exsp = (int)Math.pow(exs, pangkat);
   System.out.println("AB = √" + pusatPang + " - " + exsp);
   int point = pusatPang - exsp;
   int hasil = (int)Math.sqrt(point);
   System.out.println("AB = √" + point);
   System.out.println("AB = " + hasil + "cm");
   System.out.println("<============================>");
   Controller();
 }
 // Memulai Program
 public static void main(String[] args){
   Mulai();
   Tanya();
 }
}
