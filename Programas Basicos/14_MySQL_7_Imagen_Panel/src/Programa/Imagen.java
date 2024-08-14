package Programa;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
public class Imagen extends javax.swing.JPanel {
    private BufferedImage ruta;
    //CONSTRUCTOR
    public Imagen(int ancho, int largo, BufferedImage ruta){
        this.setSize(ancho, largo);
        this.ruta = ruta;
    }
    @Override
    public void paint(Graphics g){
        Dimension tamaño = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        Image img = new ImageIcon(ruta).getImage();
        g.drawImage(img, 0, 0, tamaño.width, tamaño.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}