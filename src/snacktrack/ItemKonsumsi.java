/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snacktrack;

/**
 *
 * @author Anom
 */
public class ItemKonsumsi {
    private int id_ItemKonsumsi;
    private String nama;
    private String kategori;
    private double kalori;
    private String waktuKonsumsi;
    
    public ItemKonsumsi(int id_ItemKonsumsi, String nama, double kalori, String waktuKonsumsi) throws ValidasiException {
        
        if (nama.isEmpty()) {
            throw new ValidasiException("Nama Item masih kosong");
        }
        if (kalori <= 0) { // Memastikan kalori adalah angka positif (boleh desimal)
            throw new ValidasiException("Kalori harus berupa angka positif");
        }
        if (kategori.equals("-")) {
            throw new ValidasiException("Kategori masih kosong");
        }
        if (!waktuKonsumsi.matches("\\d{2}/\\d{2}/\\d{4}")) { // Format dd/mm/yyyy
            throw new ValidasiException("Waktu konsumsi harus dalam format dd/mm/yyyy");
        }
        this.id_ItemKonsumsi = id_ItemKonsumsi;
        this.nama = nama;
        this.kalori = kalori;
        this.kategori = kategori;
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
    public int getId_ItemKonsumsi() { 
        return id_ItemKonsumsi; 
    }
    public void setId_ItemKonsumsi(int id_ItemKonsumsi) { 
        this.id_ItemKonsumsi = id_ItemKonsumsi; 
    }
    public String getNama() { 
        return nama; 
    }
    public String getKategori() { 
        return kategori; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public double getKalori() { 
        return kalori; 
    }
    public void setKalori(double kalori) { 
        this.kalori = kalori; 
    }
    public String getWaktuKonsumsi() { 
        return waktuKonsumsi; 
    }
    public void setWaktuKonsumsi(String waktuKonsumsi) {
        this.waktuKonsumsi = waktuKonsumsi; 
    }
}

