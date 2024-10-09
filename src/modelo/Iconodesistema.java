/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Iconodesistema {
    public static void setIcon(JFrame frame) {
        ImageIcon icon = new ImageIcon(frame.getClass().getResource("/icon/icon.png"));
        frame.setIconImage(icon.getImage());
    }
}
