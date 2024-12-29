/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import snacktrack.ItemKonsumsi;

/**
 *
 * @author Anom
 */
public interface TambahHapus {

    boolean tambahItem(ItemKonsumsi item);

    boolean hapusItem(int id_ItemKonsumsi);
}
