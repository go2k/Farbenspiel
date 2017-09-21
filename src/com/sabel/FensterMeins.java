package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FensterMeins extends JFrame{

    private JButton jbtnRot;
    private JButton jbtnGelb;
    private JButton jbtnBlau;
    private JPanel jPanel;

    public FensterMeins(){
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
        jbtnBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.blue);
            }
        });

        jPanel.add(jbtnBlau);

        jbtnGelb = new JButton("Gelb");
        jbtnGelb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.yellow);
            }
        });
        jPanel.add(jbtnGelb);

        jbtnRot = new JButton("Rot");
        jbtnRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.red);
            }
        });
        jPanel.add(jbtnRot);

        this.add(jPanel);
    }


}
