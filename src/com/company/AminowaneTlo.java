package com.company;

import javax.swing.*;
import java.awt.*;

public class AminowaneTlo extends JPanel {
    ImageIcon img;
    Laczenie m;
    public AminowaneTlo(Laczenie m){
        img = new ImageIcon("img.jpg");
        this.m = m;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(img.getImage(), 0,0,100, 50, 0+m.dx,150,100+m.dx, 200, null);
    }

}
