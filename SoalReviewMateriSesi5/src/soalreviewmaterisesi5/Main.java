/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalreviewmaterisesi5;

import java.util.Scanner;

/**
 *
 * @author komputer 35
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil(4, "Rifal", "BA5432SE", "Mobil");
        Motor motor = new Motor(true, "Dhiya", "B2221LD", "Motor");
       
        
        System.out.println("=== Informasi Kendaraan ===");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("===========================");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Pilihan Informasi");
        int kode = sc.nextInt();
        
        if(kode==1) {
            System.out.println("Masukkan Nama Pemilik :");
                String name = sc.next();
                System.out.println("Masukkan Nomor Plat :");
                String nomor = sc.next();
                System.out.println("Masukkan Jenis Kendaraan :");
                String jenis = sc.next();
        }
        
        if(kode==2) {
            System.out.println("Masukkan Nama Pemilik :");
                String name = sc.next();
                System.out.println("Masukkan Nomor Plat :");
                String nomor = sc.next();
                System.out.println("Masukkan Jenis Kendaraan :");
                String jenis = sc.next();
        }
        
        mobil.infoKendaraan();
        motor.infoKendaraan();
        
        System.out.println("\nServiceKendaraan");
        mobil.serviceKendaraan();
        motor.serviceKendaraan("Rem");
    }
    
}
