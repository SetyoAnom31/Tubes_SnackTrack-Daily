/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbesar_snacktrackdaily;

/**
 *
 * @author Anom
 */
public class Rekomendasi {
    private int id_rekomendasi;
    private int id_user;
    private int id_Dailylog;
    private int Tanggal;
    
    public Rekomendasi(int id_rekomendasi, int id_user, int id_Dailylog, int Tanggal) {
        this.id_rekomendasi = id_rekomendasi;
        this.id_user = id_user;
        this.id_Dailylog = id_Dailylog;
        this.Tanggal = Tanggal;
    }
    
    public void getRekomendasi() {
        // Implementasi untuk mendapatkan rekomendasi
    }
    
    public void tampilkanRekomendasi() {
        // Implementasi untuk menampilkan rekomendasi
    }
    
    // Getter dan Setter
    public int getId_rekomendasi() { return id_rekomendasi; }
    public void setId_rekomendasi(int id_rekomendasi) { this.id_rekomendasi = id_rekomendasi; }
    public int getId_user() { return id_user; }
    public void setId_user(int id_user) { this.id_user = id_user; }
    public int getId_Dailylog() { return id_Dailylog; }
    public void setId_Dailylog(int id_Dailylog) { this.id_Dailylog = id_Dailylog; }
    public int getTanggal() { return Tanggal; }
    public void setTanggal(int Tanggal) { this.Tanggal = Tanggal; }
}
