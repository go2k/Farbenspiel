package com.sabel;

import javax.swing.*;

public class Fenster extends JFrame{

    private JButton jbtnRot;
    private JButton jbtnGelb;
    private JButton jbtnBlau;
    private JPanel jPanel;

    public  Fenster(){
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

        jbtnGelb = new JButton("Gelb");
        jPanel.add(jbtnGelb);

        jbtnRot = new JButton("Rot");
        jPanel.add(jbtnRot);

        this.add(jPanel);

    }

}
