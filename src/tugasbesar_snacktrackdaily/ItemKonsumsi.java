/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbesar_snacktrackdaily;

/**
 *
 * @author Anom
 */
public class ItemKonsumsi {
    private int id_ItemKonsumsi;
    private String nama;
    private double kalori;
    private int waktuKonsumsi;
    
    public ItemKonsumsi(int id_ItemKonsumsi, String nama, double kalori, int waktuKonsumsi) {
        this.id_ItemKonsumsi = id_ItemKonsumsi;
        this.nama = nama;
        this.kalori = kalori;
        this.waktuKonsumsi = waktuKonsumsi;
    }
    
    public double hitungTotalKalori() {
        return kalori;
    }
    
    public void tambahItem() {
        // Implementasi untuk menambah item konsumsi
    }
    
    public void hapusItem() {
        // Implementasi untuk menghapus item konsumsi
    }
    
    // Getter dan Setter
    public int getId_ItemKonsumsi() { return id_ItemKonsumsi; }
    public void setId_ItemKonsumsi(int id_ItemKonsumsi) { this.id_ItemKonsumsi = id_ItemKonsumsi; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public double getKalori() { return kalori; }
    public void setKalori(double kalori) { this.kalori = kalori; }
    public int getWaktuKonsumsi() { return waktuKonsumsi; }
    public void setWaktuKonsumsi(int waktuKonsumsi) { this.waktuKonsumsi = waktuKonsumsi; }
}

