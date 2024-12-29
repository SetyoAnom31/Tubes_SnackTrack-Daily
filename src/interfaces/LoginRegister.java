/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import snacktrack.User;

/**
 *
 * @author Anom
 */
public interface LoginRegister {

    boolean login(String email, String password);

    boolean register(User user);
}
