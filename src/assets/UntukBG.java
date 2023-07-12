/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assets;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Shania
 */
public class UntukBG extends JPanel{
    private Image gambar1;
 
    public UntukBG() {
        gambar1 = new ImageIcon(getClass().getResource("/assets/bg3ganti.jpg")).getImage();
    }
 
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
 
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(gambar1, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
}
