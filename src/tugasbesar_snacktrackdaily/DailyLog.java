/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbesar_snacktrackdaily;

/**
 *
 * @author Anom
 */
public class DailyLog {
    private int id_Dailylog;
    private int id_user;
    private int id_konsumsi;
    private int Tanggal;
    private double Total_Kalori;
    
    public DailyLog(int id_Dailylog, int id_user, int id_konsumsi, int Tanggal) {
        this.id_Dailylog = id_Dailylog;
        this.id_user = id_user;
        this.id_konsumsi = id_konsumsi;
        this.Tanggal = Tanggal;
        this.Total_Kalori = 0.0;
    }
    
    public void tambahCatatan() {
        // Implementasi untuk menambah catatan harian
    }
    
    public void hapusCatatan() {
        // Implementasi untuk menghapus catatan
    }
    
    public void editCatatan() {
        // Implementasi untuk mengedit catatan
    }
    
    public double kalkulasiTotalKaloriHarian() {
        // Implementasi untuk menghitung total kalori harian
        return Total_Kalori;
    }
    
    // Getter dan Setter
    public int getId_Dailylog() { return id_Dailylog; }
    public void setId_Dailylog(int id_Dailylog) { this.id_Dailylog = id_Dailylog; }
    public int getId_user() { return id_user; }
    public void setId_user(int id_user) { this.id_user = id_user; }
    public int getId_konsumsi() { return id_konsumsi; }
    public void setId_konsumsi(int id_konsumsi) { this.id_konsumsi = id_konsumsi; }
    public int getTanggal() { return Tanggal; }
    public void setTanggal(int Tanggal) { this.Tanggal = Tanggal; }
    public double getTotal_Kalori() { return Total_Kalori; }
    public void setTotal_Kalori(double Total_Kalori) { this.Total_Kalori = Total_Kalori; }
}

