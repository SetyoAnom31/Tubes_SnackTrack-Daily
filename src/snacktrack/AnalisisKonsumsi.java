/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snacktrack;

/**
 *
 * @author Anom
 */
public class AnalisisKonsumsi {
    private int id_user;
    private int id_Analisis_Konsumsi;
    private int id_makanan;
    private int id_minuman;
    private String Nama_Makanan;
    private String Nama_Minuman;
    private double Kalori_makanan;
    private double Kalori_minuman;
    
    public AnalisisKonsumsi(int id_user, int id_Analisis_Konsumsi, int id_makanan, 
                           int id_minuman, String Nama_Makanan, String Nama_Minuman, 
                           double Kalori_makanan, double Kalori_minuman) {
        this.id_user = id_user;
        this.id_Analisis_Konsumsi = id_Analisis_Konsumsi;
        this.id_makanan = id_makanan;
        this.id_minuman = id_minuman;
        this.Nama_Makanan = Nama_Makanan;
        this.Nama_Minuman = Nama_Minuman;
        this.Kalori_makanan = Kalori_makanan;
        this.Kalori_minuman = Kalori_minuman;
    }
    
    public void buatAnalisisKonsumsi() {
        // Implementasi untuk membuat analisis konsumsi
    }
    
    public void hapusAnalisisKonsumsi() {
        // Implementasi untuk menghapus analisis konsumsi
    }
    
    public String getAnalisisKonsumsi() {
        // Implementasi untuk mendapatkan hasil analisis
        return "Analisis Konsumsi untuk User ID: " + id_user;
    }
    
    // Getter dan Setter
    public int getId_user() { return id_user; }
    public void setId_user(int id_user) { this.id_user = id_user; }
    public int getId_Analisis_Konsumsi() { return id_Analisis_Konsumsi; }
    public void setId_Analisis_Konsumsi(int id_Analisis_Konsumsi) { this.id_Analisis_Konsumsi = id_Analisis_Konsumsi; }
    public int getId_makanan() { return id_makanan; }
    public void setId_makanan(int id_makanan) { this.id_makanan = id_makanan; }
    public int getId_minuman() { return id_minuman; }
    public void setId_minuman(int id_minuman) { this.id_minuman = id_minuman; }
    public String getNama_Makanan() { return Nama_Makanan; }
    public void setNama_Makanan(String Nama_Makanan) { this.Nama_Makanan = Nama_Makanan; }
    public String getNama_Minuman() { return Nama_Minuman; }
    public void setNama_Minuman(String Nama_Minuman) { this.Nama_Minuman = Nama_Minuman; }
    public double getKalori_makanan() { return Kalori_makanan; }
    public void setKalori_makanan(double Kalori_makanan) { this.Kalori_makanan = Kalori_makanan; }
    public double getKalori_minuman() { return Kalori_minuman; }
    public void setKalori_minuman(double Kalori_minuman) { this.Kalori_minuman = Kalori_minuman; }
}
