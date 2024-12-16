/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbesar_snacktrackdaily;

/**
 *
 * @author Anom
 */
public class Makanan {
    private int id_makanan;
    private String Nama_Makanan;
    private double Kalori_makanan;
    private String Kategori;
    
    public Makanan(int id_makanan, String Nama_Makanan, double Kalori_makanan, String Kategori) {
        this.id_makanan = id_makanan;
        this.Nama_Makanan = Nama_Makanan;
        this.Kalori_makanan = Kalori_makanan;
        this.Kategori = Kategori;
    }
    
    public void createMakanan() {
        
    }
    
    public String getDetailMakanan() {
        return "ID: " + id_makanan + 
               "\nNama: " + Nama_Makanan + 
               "\nKalori: " + Kalori_makanan + 
               "\nKategori: " + Kategori;
    }
    
    // Getter dan Setter
    public int getId_makanan() { 
        return id_makanan; 
    }
    public void setId_makanan(int id_makanan) { 
        this.id_makanan = id_makanan; 
    }
    public String getNama_Makanan() { 
        return Nama_Makanan; 
    }
    public void setNama_Makanan(String Nama_Makanan) {
        this.Nama_Makanan = Nama_Makanan; 
    }
    public double getKalori_makanan() { 
        return Kalori_makanan; 
    }
    public void setKalori_makanan(double Kalori_makanan) { 
        this.Kalori_makanan = Kalori_makanan; 
    }
    public String getKategori() { 
        return Kategori; 
    }
    public void setKategori(String Kategori) { 
        this.Kategori = Kategori; }
}
