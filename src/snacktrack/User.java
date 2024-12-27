/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snacktrack;

/**
 *
 * @author Anom
 */
public class User {
    private int id_user;
    private String Nama_User;
    private String Email;
    private String Password;
    
    public User(int id_user, String Nama_User, String Email, String Password) {
        this.id_user = id_user;
        this.Nama_User = Nama_User;
        this.Email = Email;
        this.Password = Password;
    }
}
//    public int getId_user() { return id_user; }
//    public void setId_user(int id_user) { this.id_user = id_user; }
//    public String getNama_User() { return Nama_User; }
//    public void setNama_User(String Nama_User) { this.Nama_User = Nama_User; }
//    public String getEmail() { return Email; }
//    public void setEmail(String Email) { this.Email = Email; }
//    public String getPassword() { return Password; }
//    public void setPassword(String Password) { this.Password = Password; }
//}

