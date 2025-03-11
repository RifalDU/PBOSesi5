/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalreviewmaterisesi5;

/**
 *
 * @author komputer 35
 */
public class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(int jumlahPintu, String namaPemilik, String nomorPlat, String jenisKendaraan) {
        super(namaPemilik, nomorPlat, jenisKendaraan);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    
    @Override
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu Kendaraan: " + getJumlahPintu());
    }
}
