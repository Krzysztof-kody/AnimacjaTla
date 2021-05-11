package com.company;

import javax.swing.*;

public class Main {
    public int dx = 0;
    public static void main(String[] args) {
        Main m = new Main();
        AminowaneTlo tlo = new AminowaneTlo(m);
        Watek w1 = new Watek(m, tlo);


        JFrame ramka = new JFrame("animowaneTlo");
        ramka.setBounds(200,200,200,200);
        ramka.add(tlo);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setVisible(true);
        w1.start();
    }
}
