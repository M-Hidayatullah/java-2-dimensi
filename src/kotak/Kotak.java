/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kotak;
import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
/**
 *
 * @author ASUS
 */
public class Kotak extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Kotak");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Kotak();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);  
    }
   
    public void init() {
        JPanel panel = new Panel2D();
        getContentPane().add(panel);
    }
   
    class Panel2D extends JPanel {
        public Panel2D() {
            setPreferredSize(new Dimension(1000, 500));
            setBackground(Color.LIGHT_GRAY);
        }
        public void paintComponent(Graphics g) {
            Dimension d = getSize();
            int maxX = d.width-1; int maxY = d.height-1;
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D)g;
            Color warna;
               
            //Kotak
            g2.setColor(Color.red);
            g2.fillRect(250,100,500,300);
//            g2.setColor(Color.white);
//            g2.setStroke(new BasicStroke(3.0f)); //untuk menebalkan garis
//            g2.drawRect(250,50,500,200);
        
        }
    }
}
    
    
