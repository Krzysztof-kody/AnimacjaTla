package com.company;

public class Watek extends Thread{
    Laczenie m;
    AminowaneTlo t;
    public Watek(Laczenie m, AminowaneTlo t){
        this.m = m;
        this.t = t;
    }
    public void run(){
        while(true){
            m.dx++;
            if(m.dx + 100 > 698)
                m.dx = 0;
            t.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
