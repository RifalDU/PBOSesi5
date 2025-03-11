/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalreviewmaterisesi5;

/**
 *
 * @author komputer 35
 */
public class Kendaraan {
    String namaPemilik;
    String nomorPlat;
    String jenisKendaraan;

    public Kendaraan(String namaPemilik, String nomorPlat, String jenisKendaraan) {
        this.namaPemilik = namaPemilik;
        this.nomorPlat = nomorPlat;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }
    
    public void serviceKendaraan() {
        System.out.println("Servis Kendaraan Sedang Dilakukan");
    }
    
    public void serviceKendaraan(String jenisServis) {
        System.out.println("Servis Jenis" + jenisServis + "Sedang Dilakukan");
    }
    
    public void infoKendaraan(){
        System.out.println("=== Informasi Kendaraa ===");
        System.out.println("Nama Pemilik: " + getNamaPemilik());
        System.out.println("Nomor Plat: " + getNomorPlat());
        System.out.println("Jenis Kendaraan: " + getJenisKendaraan());
    }
}
