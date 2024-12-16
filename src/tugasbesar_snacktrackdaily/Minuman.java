/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbesar_snacktrackdaily;

/**
 *
 * @author Anom
 */
public class Minuman {
    private int id_minuman;
    private String Nama_Minuman;
    private double Kalori_minuman;
    private String Kategori;
    
    public Minuman(int id_minuman, String Nama_Minuman, double Kalori_minuman, String Kategori) {
        this.id_minuman = id_minuman;
        this.Nama_Minuman = Nama_Minuman;
        this.Kalori_minuman = Kalori_minuman;
        this.Kategori = Kategori;
    }
    
    public void createMinuman() {
        // Implementasi untuk membuat minuman baru
    }
    
    public String getDetailMinuman() {
        return "ID: " + id_minuman + 
               "\nNama: " + Nama_Minuman + 
               "\nKalori: " + Kalori_minuman + 
               "\nKategori: " + Kategori;
    }
    
    // Getter dan Setter
    public int getId_minuman() { return id_minuman; }
    public void setId_minuman(int id_minuman) { this.id_minuman = id_minuman; }
    public String getNama_Minuman() { return Nama_Minuman; }
    public void setNama_Minuman(String Nama_Minuman) { this.Nama_Minuman = Nama_Minuman; }
    public double getKalori_minuman() { return Kalori_minuman; }
    public void setKalori_minuman(double Kalori_minuman) { this.Kalori_minuman = Kalori_minuman; }
    public String getKategori() { return Kategori; }
    public void setKategori(String Kategori) { this.Kategori = Kategori; }
}
