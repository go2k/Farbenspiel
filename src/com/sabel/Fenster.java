package com.sabel;

import javax.swing.*;

public class Fenster extends JFrame{

    JButton jbtnRot;
    JButton jbtnGruen;
    JButton jbtnBlau;
    JPanel jPanel;

    public void Fenster(){
        this.setTitle("Farbenauswahl");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        this.setSize(300,300);
        this.setVisible(true);

    }

    private void initComponents(){
        jPanel = new JPanel();
        jbtnBlau = new JButton();
        jbtnBlau.setText("Blau");
        jPanel.add(jbtnBlau);

        jbtnGruen = new JButton("Grün");
        jPanel.add(jbtnGruen);

        jbtnRot = new JButton("Rot");
        jPanel.add(jbtnRot);

        this.add(jPanel);

    }

}
