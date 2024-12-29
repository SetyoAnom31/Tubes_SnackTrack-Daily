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

    public User(String Nama_User, String Email, String Password) throws ValidasiInputException {
        if (Nama_User == null || Nama_User.isEmpty()) {
            throw new ValidasiInputException("Nama user tidak boleh kosong");
        }
        if (Email == null || Email.isEmpty() || !Email.contains("@")) {
            throw new ValidasiInputException("Email tidak valid");
        }
        if (Password == null || Password.length() < 6) {
            throw new ValidasiInputException("Password harus memiliki setidaknya 6 karakter");
        }

        this.Nama_User = Nama_User;
        this.Email = Email;
        this.Password = Password;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama_User() {
        return Nama_User;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }
}
