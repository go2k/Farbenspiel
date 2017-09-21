package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {

    private JButton jbtnRot;
    private JButton jbtnGelb;
    private JButton jbtnBlau;
    private JPanel jPanel;

    public Fenster() {
        this.setTitle("Farbenauswahl");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        this.setSize(300, 300);
        this.setVisible(true);

    }

    private void initComponents() {
        jPanel = new JPanel();
        jPanel.setBackground(Color.pink);
        jbtnBlau = new JButton();
        jbtnBlau.setText("Blau");
        jbtnBlau.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.BLUE);
            }
        });

        jPanel.add(jbtnBlau);

        jbtnGelb = new JButton("Gelb");
        jbtnGelb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.YELLOW);
            }
        });
        jPanel.add(jbtnGelb);

        jbtnRot = new JButton("Rot");
        jbtnRot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.RED);
            }
        });
        jPanel.add(jbtnRot);

        this.add(jPanel);
    }

}
