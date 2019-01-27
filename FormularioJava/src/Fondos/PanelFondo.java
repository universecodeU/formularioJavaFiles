package Fondos;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author I.S.C. Cruz Medinilla Martin codemcmg@gmail.com
 */
public class PanelFondo extends javax.swing.JPanel {


    String nombreImagen;
    public PanelFondo(String nombreImagen) {
        this.nombreImagen=nombreImagen;
        initComponents();
        this.setSize(600, 450);
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        //Dimension tamanioFondo= getSize();
        ImageIcon imagen=new ImageIcon(getClass().getResource(nombreImagen));
        g.drawImage(imagen.getImage(), 0, 0, imagen.getIconWidth(),imagen.getIconHeight(),null);
        setOpaque(false);
        super.paintComponent(g);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
